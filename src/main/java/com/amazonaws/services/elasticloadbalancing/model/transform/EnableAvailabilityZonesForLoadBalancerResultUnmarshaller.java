/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import org.w3c.dom.*;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Enable Availability Zones For Load Balancer Result Unmarshaller
 */        
public class EnableAvailabilityZonesForLoadBalancerResultUnmarshaller implements Unmarshaller<EnableAvailabilityZonesForLoadBalancerResult, Node> {

    public EnableAvailabilityZonesForLoadBalancerResult unmarshall(Node node) throws Exception {
        EnableAvailabilityZonesForLoadBalancerResult enableAvailabilityZonesForLoadBalancerResult = new EnableAvailabilityZonesForLoadBalancerResult();
        
        
        NodeList availabilityZonesNodes = XpathUtils.asNodeList("AvailabilityZones/member", node);
        for (int availabilityZonesIndex = 0; availabilityZonesIndex < XpathUtils.nodeLength(availabilityZonesNodes); ++availabilityZonesIndex) {
            Node availabilityZonesNode = availabilityZonesNodes.item(availabilityZonesIndex);
            enableAvailabilityZonesForLoadBalancerResult.getAvailabilityZones().add(new StringUnmarshaller().unmarshall(availabilityZonesNode));
            availabilityZonesNode.getParentNode().removeChild(availabilityZonesNode);
        }
    

        return enableAvailabilityZonesForLoadBalancerResult;
    }  
}
    