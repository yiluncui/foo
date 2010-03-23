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

/**
 * <p>
 * The result of calling the ConfirmProductInstance operation.
 * </p>
 */
public class ConfirmProductInstanceResult {
        
    /**
     * The instance owner's account ID. Only present if the product code is
     * attached to the instance.
     */
    private String ownerId;

    /**
     * The instance owner's account ID. Only present if the product code is
     * attached to the instance.
     *
     * @return The instance owner's account ID. Only present if the product code is
     *         attached to the instance.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * The instance owner's account ID. Only present if the product code is
     * attached to the instance.
     *
     * @param ownerId The instance owner's account ID. Only present if the product code is
     *         attached to the instance.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * The instance owner's account ID. Only present if the product code is
     * attached to the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId The instance owner's account ID. Only present if the product code is
     *         attached to the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ConfirmProductInstanceResult withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    
    
}
    