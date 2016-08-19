package com.pzv.dataload.service.dana.aftermarket;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.pzv.dataload.model.dana.aftermarket.vendor.LoadVendorsRequest;
import com.pzv.dataload.model.dana.aftermarket.vendor.LoadVendorsResponse;

@Endpoint
public class LoadVendorService implements LoadVendor {
	private static final Logger LOG = LoggerFactory.getLogger(LoadVendorService.class);
	
	@PayloadRoot(localPart=LOADVENDOR_REQ_QNAME,namespace=NAMESPACE_URI)
	@Override
	public @ResponsePayload LoadVendorsResponse loadVendors(@RequestPayload LoadVendorsRequest request) {
		LoadVendorsResponse response = new LoadVendorsResponse();
		long totalRecv = Objects.nonNull(request.getVendors()) && !request.getVendors().isEmpty() ? request.getVendors().size():0;
		
		response.setTotalVendorsLoaded(totalRecv);
		response.setTotalVendorsReceived(totalRecv);
		
		LOG.info("LoadVendorsRequest\n{}",request);
		LOG.info("LoadVendorsResponse\n{}",response);
		
		return response ;
	}

}
