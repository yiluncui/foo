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
 * The result of detaching an EBS volume from an instance.
 * </p>
 */
public class DetachVolumeResult {
        
    /**
     * The updated EBS volume attachment information after trying to detach
     * the volume from the specified instance.
     */
    private VolumeAttachment attachment;

    /**
     * The updated EBS volume attachment information after trying to detach
     * the volume from the specified instance.
     *
     * @return The updated EBS volume attachment information after trying to detach
     *         the volume from the specified instance.
     */
    public VolumeAttachment getAttachment() {
        return attachment;
    }
    
    /**
     * The updated EBS volume attachment information after trying to detach
     * the volume from the specified instance.
     *
     * @param attachment The updated EBS volume attachment information after trying to detach
     *         the volume from the specified instance.
     */
    public void setAttachment(VolumeAttachment attachment) {
        this.attachment = attachment;
    }
    
    /**
     * The updated EBS volume attachment information after trying to detach
     * the volume from the specified instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachment The updated EBS volume attachment information after trying to detach
     *         the volume from the specified instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DetachVolumeResult withAttachment(VolumeAttachment attachment) {
        this.attachment = attachment;
        return this;
    }
    
    
}
    