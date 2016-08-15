package com.pzv.dataload.service.dana.aftermarket;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.pzv.dataload.model.dana.aftermarket.rtb.LoadRTBRequest;
import com.pzv.dataload.model.dana.aftermarket.rtb.LoadRTBResponse;

@Endpoint
public class LoadRTBService implements LoadRTB {
	private static final Logger LOG = LoggerFactory.getLogger(LoadRTBService.class);
	
	@PayloadRoot(localPart=LOADRTB_REQ_QNAME,namespace=NAMESPACE_URI)
	@Override
	public @ResponsePayload LoadRTBResponse loadRTBDetails(@RequestPayload LoadRTBRequest request) {
		LoadRTBResponse response = new LoadRTBResponse();
		long totalRecv = Objects.nonNull(request.getRtbs()) && !request.getRtbs().isEmpty() ? request.getRtbs().size():0;
		
		response.setTotalRTBDetailsLoaded(totalRecv);
		response.setTotalRTBDetailsReceived(totalRecv);
		
		LOG.info("LoadRTBRequest\n{}",request);
		LOG.info("LoadRTBResponse\n{}",response);
		
		return response ;
	}

}
