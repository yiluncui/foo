/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Cancel Conversion Task Request Marshaller
 */
public class CancelConversionTaskRequestMarshaller implements Marshaller<Request<CancelConversionTaskRequest>, CancelConversionTaskRequest> {

    public Request<CancelConversionTaskRequest> marshall(CancelConversionTaskRequest cancelConversionTaskRequest) {

        if (cancelConversionTaskRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CancelConversionTaskRequest> request = new DefaultRequest<CancelConversionTaskRequest>(cancelConversionTaskRequest, "AmazonEC2");
        request.addParameter("Action", "CancelConversionTask");
        request.addParameter("Version", "2012-07-20");

        if (cancelConversionTaskRequest.getConversionTaskId() != null) {
            request.addParameter("ConversionTaskId", StringUtils.fromString(cancelConversionTaskRequest.getConversionTaskId()));
        }
        if (cancelConversionTaskRequest.getReasonMessage() != null) {
            request.addParameter("ReasonMessage", StringUtils.fromString(cancelConversionTaskRequest.getReasonMessage()));
        }


        return request;
    }
}
