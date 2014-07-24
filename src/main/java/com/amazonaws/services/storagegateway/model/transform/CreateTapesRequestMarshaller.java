/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Create Tapes Request Marshaller
 */
public class CreateTapesRequestMarshaller implements Marshaller<Request<CreateTapesRequest>, CreateTapesRequest> {

    public Request<CreateTapesRequest> marshall(CreateTapesRequest createTapesRequest) {
        if (createTapesRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateTapesRequest> request = new DefaultRequest<CreateTapesRequest>(createTapesRequest, "AWSStorageGateway");
        String target = "StorageGateway_20130630.CreateTapes";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (createTapesRequest.getGatewayARN() != null) {
                jsonWriter.key("GatewayARN").value(createTapesRequest.getGatewayARN());
            }
            if (createTapesRequest.getTapeSizeInBytes() != null) {
                jsonWriter.key("TapeSizeInBytes").value(createTapesRequest.getTapeSizeInBytes());
            }
            if (createTapesRequest.getClientToken() != null) {
                jsonWriter.key("ClientToken").value(createTapesRequest.getClientToken());
            }
            if (createTapesRequest.getNumTapesToCreate() != null) {
                jsonWriter.key("NumTapesToCreate").value(createTapesRequest.getNumTapesToCreate());
            }
            if (createTapesRequest.getTapeBarcodePrefix() != null) {
                jsonWriter.key("TapeBarcodePrefix").value(createTapesRequest.getTapeBarcodePrefix());
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
