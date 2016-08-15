package com.pzv.dataload.service.dana.aftermarket;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.pzv.dataload.model.dana.aftermarket.partmaster.LoadPartMasterRequest;
import com.pzv.dataload.model.dana.aftermarket.partmaster.LoadPartMasterResponse;

@Endpoint
public class LoadPartMasterService implements LoadPartMaster {
	private static final Logger LOG = LoggerFactory.getLogger(LoadPartMasterService.class);
	
	@PayloadRoot(localPart=LOADPARTS_REQ_QNAME,namespace=NAMESPACE_URI)
	@Override
	public @ResponsePayload LoadPartMasterResponse loadParts(@RequestPayload LoadPartMasterRequest request) {
		LoadPartMasterResponse response = new LoadPartMasterResponse();
		long totalRecv = Objects.nonNull(request.getParts()) && !request.getParts().isEmpty() ? request.getParts().size():0;
		
		response.setTotalPartsLoaded(totalRecv);
		response.setTotalPartsReceived(totalRecv);
		
		LOG.info("LoadPartMasterRequest\n{}",request);
		LOG.info("LoadPartMasterRequest\n{}",request);
		
		return response ;
	}

}
