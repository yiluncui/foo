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

package com.amazonaws.services.ec2.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Describe Vpcs Request Unmarshaller
 */        
public class DescribeVpcsRequestUnmarshaller implements Unmarshaller<DescribeVpcsRequest, Node> {

    public DescribeVpcsRequest unmarshall(Node node) throws Exception {
        DescribeVpcsRequest describeVpcsRequest = new DescribeVpcsRequest();
        
        
        NodeList vpcIdsNodes = XpathUtils.asNodeList("VpcId/VpcId", node);
        for (int vpcIdsIndex = 0; vpcIdsIndex < XpathUtils.nodeLength(vpcIdsNodes); ++vpcIdsIndex) {
            Node vpcIdsNode = vpcIdsNodes.item(vpcIdsIndex);
            describeVpcsRequest.getVpcIds().add(new StringUnmarshaller().unmarshall(vpcIdsNode));
            vpcIdsNode.getParentNode().removeChild(vpcIdsNode);
        }
    
        NodeList filtersNodes = XpathUtils.asNodeList("Filter/Filter", node);
        for (int filtersIndex = 0; filtersIndex < XpathUtils.nodeLength(filtersNodes); ++filtersIndex) {
            Node filtersNode = filtersNodes.item(filtersIndex);
            describeVpcsRequest.getFilters().add(new FilterUnmarshaller().unmarshall(filtersNode));
            filtersNode.getParentNode().removeChild(filtersNode);
        }
    

        return describeVpcsRequest;
    }  
}
    