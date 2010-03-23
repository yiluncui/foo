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
package com.amazonaws.services.simpledb.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Put Attributes Request
 */
public class PutAttributesRequest extends AmazonWebServiceRequest {
        
    /**
     * The name of the domain in which to perform the operation.
     */
    private String domainName;

    /**
     * The name of the item.
     */
    private String itemName;

    /**
     * List of attributes.
     */
    private java.util.List<ReplaceableAttribute> attributes;

    /**
     * The update condition which, if specified, determines if the specified
     * attributes will be updated or not. The update condition must be
     * satisfied in order for this request to be processed and the attributes
     * to be updated.
     */
    private UpdateCondition expected;

    /**
     * The name of the domain in which to perform the operation.
     *
     * @return The name of the domain in which to perform the operation.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of the domain in which to perform the operation.
     *
     * @param domainName The name of the domain in which to perform the operation.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of the domain in which to perform the operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainName The name of the domain in which to perform the operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutAttributesRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    
    
    /**
     * The name of the item.
     *
     * @return The name of the item.
     */
    public String getItemName() {
        return itemName;
    }
    
    /**
     * The name of the item.
     *
     * @param itemName The name of the item.
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    /**
     * The name of the item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param itemName The name of the item.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutAttributesRequest withItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    
    
    /**
     * List of attributes.
     *
     * @return List of attributes.
     */
    public java.util.List<ReplaceableAttribute> getAttributes() {
        if (attributes == null) {
            attributes = new java.util.ArrayList<ReplaceableAttribute>();
        }
        return attributes;
    }
    
    /**
     * List of attributes.
     *
     * @param attributes List of attributes.
     */
    public void setAttributes(java.util.Collection<ReplaceableAttribute> attributes) {
        java.util.List<ReplaceableAttribute> attributesCopy = new java.util.ArrayList<ReplaceableAttribute>();
        if (attributes != null) {
            attributesCopy.addAll(attributes);
        }
        this.attributes = attributesCopy;
    }
    
    /**
     * List of attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes List of attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutAttributesRequest withAttributes(ReplaceableAttribute... attributes) {
        for (ReplaceableAttribute value : attributes) {
            getAttributes().add(value);
        }
        return this;
    }
    
    /**
     * List of attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes List of attributes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutAttributesRequest withAttributes(java.util.Collection<ReplaceableAttribute> attributes) {
        java.util.List<ReplaceableAttribute> attributesCopy = new java.util.ArrayList<ReplaceableAttribute>();
        if (attributes != null) {
            attributesCopy.addAll(attributes);
        }
        this.attributes = attributesCopy;

        return this;
    }
    
    /**
     * The update condition which, if specified, determines if the specified
     * attributes will be updated or not. The update condition must be
     * satisfied in order for this request to be processed and the attributes
     * to be updated.
     *
     * @return The update condition which, if specified, determines if the specified
     *         attributes will be updated or not. The update condition must be
     *         satisfied in order for this request to be processed and the attributes
     *         to be updated.
     */
    public UpdateCondition getExpected() {
        return expected;
    }
    
    /**
     * The update condition which, if specified, determines if the specified
     * attributes will be updated or not. The update condition must be
     * satisfied in order for this request to be processed and the attributes
     * to be updated.
     *
     * @param expected The update condition which, if specified, determines if the specified
     *         attributes will be updated or not. The update condition must be
     *         satisfied in order for this request to be processed and the attributes
     *         to be updated.
     */
    public void setExpected(UpdateCondition expected) {
        this.expected = expected;
    }
    
    /**
     * The update condition which, if specified, determines if the specified
     * attributes will be updated or not. The update condition must be
     * satisfied in order for this request to be processed and the attributes
     * to be updated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expected The update condition which, if specified, determines if the specified
     *         attributes will be updated or not. The update condition must be
     *         satisfied in order for this request to be processed and the attributes
     *         to be updated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PutAttributesRequest withExpected(UpdateCondition expected) {
        this.expected = expected;
        return this;
    }
    
    
}
    