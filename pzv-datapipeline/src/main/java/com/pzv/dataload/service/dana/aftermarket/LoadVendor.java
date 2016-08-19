package com.pzv.dataload.service.dana.aftermarket;

import com.pzv.dataload.model.dana.aftermarket.vendor.LoadVendorsRequest;
import com.pzv.dataload.model.dana.aftermarket.vendor.LoadVendorsResponse;

public interface LoadVendor {
	public static final String NAMESPACE_URI ="http://www.phasezeroventures.com/dana/vendor/schemas";
	public static final String LOADVENDOR_REQ_QNAME ="LoadVendorsRequest";

	public LoadVendorsResponse loadVendors(LoadVendorsRequest request);
}
