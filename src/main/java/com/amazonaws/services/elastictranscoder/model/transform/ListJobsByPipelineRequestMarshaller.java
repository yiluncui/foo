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
package com.amazonaws.services.elastictranscoder.model.transform;

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
import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * List Jobs By Pipeline Request Marshaller
 */
public class ListJobsByPipelineRequestMarshaller implements Marshaller<Request<ListJobsByPipelineRequest>, ListJobsByPipelineRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "2012-09-25/jobsByPipeline/{PipelineId}?Ascending={Ascending};PageToken={PageToken}";
        Map<String, String> staticMap = new HashMap<String, String>();
        Map<String, String> dynamicMap = new HashMap<String, String>();

        int index = path.indexOf("?");
        if (index != -1) {
            String queryString = path.substring(index + 1);
            path = path.substring(0, index);

            for (String s : queryString.split("[;&]")) {
                index = s.indexOf("=");
                if (index != -1) {
                    String name = s.substring(0, index);
                    String value = s.substring(index + 1);

                    if (value.startsWith("{") && value.endsWith("}")) {
                        dynamicMap.put(value.substring(1, value.length() - 1), name);
                    } else {
                        staticMap.put(name, value);
                    }
                }
            }
        }

        RESOURCE_PATH_TEMPLATE = path;
        STATIC_QUERY_PARAMS = Collections.unmodifiableMap(staticMap);
        DYNAMIC_QUERY_PARAMS = Collections.unmodifiableMap(dynamicMap);
    }

    public Request<ListJobsByPipelineRequest> marshall(ListJobsByPipelineRequest listJobsByPipelineRequest) {
        if (listJobsByPipelineRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListJobsByPipelineRequest> request = new DefaultRequest<ListJobsByPipelineRequest>(listJobsByPipelineRequest, "AmazonElasticTranscoder");
        String target = "EtsCustomerService.ListJobsByPipeline";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.GET);
        String uriResourcePath = RESOURCE_PATH_TEMPLATE;

        if (DYNAMIC_QUERY_PARAMS.containsKey("PipelineId")) {
            String name = DYNAMIC_QUERY_PARAMS.get("PipelineId");
            String value = (listJobsByPipelineRequest.getPipelineId() == null) ? null : StringUtils.fromString(listJobsByPipelineRequest.getPipelineId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{PipelineId}", (listJobsByPipelineRequest.getPipelineId() == null) ? "" : StringUtils.fromString(listJobsByPipelineRequest.getPipelineId())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Ascending")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Ascending");
            String value = (listJobsByPipelineRequest.getAscending() == null) ? null : StringUtils.fromString(listJobsByPipelineRequest.getAscending());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Ascending}", (listJobsByPipelineRequest.getAscending() == null) ? "" : StringUtils.fromString(listJobsByPipelineRequest.getAscending())); 
        }
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("PageToken")) {
            String name = DYNAMIC_QUERY_PARAMS.get("PageToken");
            String value = (listJobsByPipelineRequest.getPageToken() == null) ? null : StringUtils.fromString(listJobsByPipelineRequest.getPageToken());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{PageToken}", (listJobsByPipelineRequest.getPageToken() == null) ? "" : StringUtils.fromString(listJobsByPipelineRequest.getPageToken())); 
        }

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));

        return request;
    }
}
