package com.pzv.dataload.service.dana.aftermarket;

import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import com.pzv.dataload.model.dana.aftermarket.customerrelationship.LoadCustomerRelationshipRequest;
import com.pzv.dataload.model.dana.aftermarket.customerrelationship.LoadCustomerRelationshipResponse;

@Endpoint
public class LoadCustomerRelationshipService implements LoadCustomerRelationship {
	private static final Logger LOG = LoggerFactory.getLogger(LoadCustomerRelationshipService.class);
	
	@PayloadRoot(localPart=LOADCUSTOMERRELATIONSHIP_REQ_QNAME,namespace=NAMESPACE_URI)
	@Override
	public LoadCustomerRelationshipResponse loadCustomerRelationships(LoadCustomerRelationshipRequest request) {
		LoadCustomerRelationshipResponse response = new LoadCustomerRelationshipResponse();
		long totalRecv = Objects.nonNull(request.getRelationships()) && !request.getRelationships().isEmpty()?request.getRelationships().size():0;
		
		response.setTotalCustomerRelationshipsLoaded(totalRecv);
		response.setTotalCustomerRelationshipsReceived(totalRecv);
		
		LOG.info("LoadCustomerRelationshipRequest\n{}",request);
		LOG.info("LoadCustomerRelationshipResponse\n{}",response);

		return response ;
	}

}
