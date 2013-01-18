/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datapipeline.model.transform;


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
import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Query Objects Request Marshaller
 */
public class QueryObjectsRequestMarshaller implements Marshaller<Request<QueryObjectsRequest>, QueryObjectsRequest> {

    

    public Request<QueryObjectsRequest> marshall(QueryObjectsRequest queryObjectsRequest) {
    if (queryObjectsRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<QueryObjectsRequest> request = new DefaultRequest<QueryObjectsRequest>(queryObjectsRequest, "DataPipeline");
        String target = "DataPipeline.QueryObjects";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.1");

        
        request.setHttpMethod(HttpMethodName.POST);


        String uriResourcePath = ""; 

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


        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          
            
          jsonWriter.object();
          
            if (queryObjectsRequest.getPipelineId() != null) {
                jsonWriter.key("pipelineId").value(queryObjectsRequest.getPipelineId());
            }
            Query query = queryObjectsRequest.getQuery();
            if (query != null) {

                jsonWriter.key("query");
                jsonWriter.object();


                java.util.List<Selector> selectorsList = query.getSelectors();
                if (selectorsList != null && selectorsList.size() > 0) {

                    jsonWriter.key("selectors");
                    jsonWriter.array();

                    for (Selector selectorsListValue : selectorsList) {
                        if (selectorsListValue != null) {
                            jsonWriter.object();
                            if (selectorsListValue.getFieldName() != null) {
                                jsonWriter.key("fieldName").value(selectorsListValue.getFieldName());
                            }
                            Operator operator = selectorsListValue.getOperator();
                            if (operator != null) {

                                jsonWriter.key("operator");
                                jsonWriter.object();

                                if (operator.getType() != null) {
                                    jsonWriter.key("type").value(operator.getType());
                                }

                                java.util.List<String> valuesList = operator.getValues();
                                if (valuesList != null && valuesList.size() > 0) {

                                    jsonWriter.key("values");
                                    jsonWriter.array();

                                    for (String valuesListValue : valuesList) {
                                        if (valuesListValue != null) {
                                            jsonWriter.value(valuesListValue);
                                        }
                                    }
                                    jsonWriter.endArray();
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endObject();
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
            }
            if (queryObjectsRequest.getSphere() != null) {
                jsonWriter.key("sphere").value(queryObjectsRequest.getSphere());
            }
            if (queryObjectsRequest.getMarker() != null) {
                jsonWriter.key("marker").value(queryObjectsRequest.getMarker());
            }
            if (queryObjectsRequest.getLimit() != null) {
                jsonWriter.key("limit").value(queryObjectsRequest.getLimit());
            }

          jsonWriter.endObject();
          

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes("UTF-8");
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        

        return request;
    }

    private String getString(String s) {
        if (s == null) return "";
        return s;
    }
}
