package com.pzv.dataload.service.dana.aftermarket;

import com.pzv.dataload.model.dana.aftermarket.customerrelationship.LoadCustomerRelationshipRequest;
import com.pzv.dataload.model.dana.aftermarket.customerrelationship.LoadCustomerRelationshipResponse;

public interface LoadCustomerRelationship {
	public static final String NAMESPACE_URI ="http://www.phasezeroventures.com/dana/customerrelationship/schemas";
	public static final String LOADCUSTOMERRELATIONSHIP_REQ_QNAME ="LoadCustomerRelationshipRequest";

	public LoadCustomerRelationshipResponse loadCustomerRelationships(LoadCustomerRelationshipRequest request);
}
