package com.pzv.dataload.service.dana.aftermarket;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.pzv.dataload.model.dana.aftermarket.customermaster.LoadCustomerMasterRequest;
import com.pzv.dataload.model.dana.aftermarket.customermaster.LoadCustomerMasterResponse;


@Endpoint
public class LoadCustomerMasterService implements LoadCustomerMaster {
	private static final Logger LOG = LoggerFactory.getLogger(LoadCustomerMasterService.class);
	
	@PayloadRoot(localPart=LOADCUSTOMERS_REQ_QNAME,namespace=NAMESPACE_URI)
	@Override
	public @ResponsePayload LoadCustomerMasterResponse loadCustomers(@RequestPayload LoadCustomerMasterRequest request) {
		
		LoadCustomerMasterResponse response = new LoadCustomerMasterResponse();
		long totalReceived = Objects.nonNull(request.getCustomers()) && !request.getCustomers().isEmpty()?request.getCustomers().size():0;
		response.setTotalCustomersReceived(totalReceived);
		response.setTotalCustomersLoaded(totalReceived);
		
		LOG.info("LoadCustomerMasterRequest\n{}",request);
		LOG.info("LoadCustomerMasterResponse\n{}",response);
		
		return response;
	}

}
