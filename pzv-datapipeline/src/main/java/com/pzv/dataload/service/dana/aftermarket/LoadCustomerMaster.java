package com.pzv.dataload.service.dana.aftermarket;

import com.mycompany.holiday.modelcom.pzv.dataload.model.dana.aftermarket.customermaster.LoadCustomerMasterRequest;
import com.mycompany.holiday.modelcom.pzv.dataload.model.dana.aftermarket.customermaster.LoadCustomerMasterResponse;

public interface LoadCustomerMaster {
	public static final String NAMESPACE_URI="http://www.phasezeroventures.com/dana/customermaster/schemas";
	public static final String LOADCUSTOMERS_REQ_QNAME="LoadCustomerMasterRequest";
	
	public LoadCustomerMasterResponse loadCustomers(LoadCustomerMasterRequest request);
}
