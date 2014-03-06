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
package com.amazonaws.services.glacier.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * List Parts Request Marshaller
 */
public class ListPartsRequestMarshaller implements Marshaller<Request<ListPartsRequest>, ListPartsRequest> {

    public Request<ListPartsRequest> marshall(ListPartsRequest listPartsRequest) {
    if (listPartsRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<ListPartsRequest> request = new DefaultRequest<ListPartsRequest>(listPartsRequest, "AmazonGlacier");
        String target = "Glacier.ListParts";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}?marker={marker};limit={limit}"; 
        uriResourcePath = uriResourcePath.replace("{accountId}", (listPartsRequest.getAccountId() == null) ? "" : StringUtils.fromString(listPartsRequest.getAccountId())); 
        uriResourcePath = uriResourcePath.replace("{vaultName}", (listPartsRequest.getVaultName() == null) ? "" : StringUtils.fromString(listPartsRequest.getVaultName())); 
        uriResourcePath = uriResourcePath.replace("{uploadId}", (listPartsRequest.getUploadId() == null) ? "" : StringUtils.fromString(listPartsRequest.getUploadId())); 
        uriResourcePath = uriResourcePath.replace("{marker}", (listPartsRequest.getMarker() == null) ? "" : StringUtils.fromString(listPartsRequest.getMarker())); 
        uriResourcePath = uriResourcePath.replace("{limit}", (listPartsRequest.getLimit() == null) ? "" : StringUtils.fromString(listPartsRequest.getLimit())); 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));

        return request;
    }
}
