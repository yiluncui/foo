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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Delete Customer Gateway Request
 */
public class DeleteCustomerGatewayRequest extends AmazonWebServiceRequest {
        
    private String customerGatewayId;

    /**
     * Returns the value of the CustomerGatewayId property for this object.
     *
     * @return The value of the CustomerGatewayId property for this object.
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }
    
    /**
     * Sets the value of the CustomerGatewayId property for this object.
     *
     * @param customerGatewayId The new value for the CustomerGatewayId property for this object.
     */
    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }
    
    /**
     * Sets the value of the CustomerGatewayId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayId The new value for the CustomerGatewayId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteCustomerGatewayRequest withCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }
    
    
}
    