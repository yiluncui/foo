/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Configure Health Check Request Marshaller
 */
public class ConfigureHealthCheckRequestMarshaller implements Marshaller<Request<ConfigureHealthCheckRequest>, ConfigureHealthCheckRequest> {

    public Request<ConfigureHealthCheckRequest> marshall(ConfigureHealthCheckRequest configureHealthCheckRequest) {
        Request<ConfigureHealthCheckRequest> request = new DefaultRequest<ConfigureHealthCheckRequest>(configureHealthCheckRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "ConfigureHealthCheck");
        request.addParameter("Version", "2010-07-01");
        if (configureHealthCheckRequest != null) {
            if (configureHealthCheckRequest.getLoadBalancerName() != null) {
                request.addParameter("LoadBalancerName", StringUtils.fromString(configureHealthCheckRequest.getLoadBalancerName()));
            }
        }
        if (configureHealthCheckRequest != null) {
            HealthCheck healthCheck = configureHealthCheckRequest.getHealthCheck();
            if (healthCheck != null) {
                if (healthCheck.getTarget() != null) {
                    request.addParameter("HealthCheck.Target", StringUtils.fromString(healthCheck.getTarget()));
                }
            }
            if (healthCheck != null) {
                if (healthCheck.getInterval() != null) {
                    request.addParameter("HealthCheck.Interval", StringUtils.fromInteger(healthCheck.getInterval()));
                }
            }
            if (healthCheck != null) {
                if (healthCheck.getTimeout() != null) {
                    request.addParameter("HealthCheck.Timeout", StringUtils.fromInteger(healthCheck.getTimeout()));
                }
            }
            if (healthCheck != null) {
                if (healthCheck.getUnhealthyThreshold() != null) {
                    request.addParameter("HealthCheck.UnhealthyThreshold", StringUtils.fromInteger(healthCheck.getUnhealthyThreshold()));
                }
            }
            if (healthCheck != null) {
                if (healthCheck.getHealthyThreshold() != null) {
                    request.addParameter("HealthCheck.HealthyThreshold", StringUtils.fromInteger(healthCheck.getHealthyThreshold()));
                }
            }
        }


        return request;
    }
}
