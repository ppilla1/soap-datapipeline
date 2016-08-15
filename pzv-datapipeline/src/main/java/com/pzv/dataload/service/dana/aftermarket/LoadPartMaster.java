package com.pzv.dataload.service.dana.aftermarket;

import com.pzv.dataload.model.dana.aftermarket.partmaster.LoadPartMasterRequest;
import com.pzv.dataload.model.dana.aftermarket.partmaster.LoadPartMasterResponse;

public interface LoadPartMaster {
	public static final String NAMESPACE_URI ="http://www.phasezeroventures.com/dana/partmaster/schemas";
	public static final String LOADPARTS_REQ_QNAME ="LoadPartMasterRequest";
	
	public LoadPartMasterResponse loadParts(LoadPartMasterRequest request);
}
