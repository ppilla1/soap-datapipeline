package com.pzv.dataload.service.dana.aftermarket;

import com.pzv.dataload.model.dana.aftermarket.rtb.LoadRTBRequest;
import com.pzv.dataload.model.dana.aftermarket.rtb.LoadRTBResponse;

public interface LoadRTB {
	public static final String NAMESPACE_URI ="http://www.phasezeroventures.com/dana/rtb/schemas";
	public static final String LOADRTB_REQ_QNAME ="LoadRTBRequest";

	public LoadRTBResponse loadRTBDetails(LoadRTBRequest request);
}
