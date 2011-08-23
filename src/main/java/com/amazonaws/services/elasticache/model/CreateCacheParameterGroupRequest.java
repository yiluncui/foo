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
package com.amazonaws.services.elasticache.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#createCacheParameterGroup(CreateCacheParameterGroupRequest) CreateCacheParameterGroup operation}.
 * <p>
 * Creates a new Cache Parameter Group. Cache Parameter groups control
 * the parameters for a Cache Cluster.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#createCacheParameterGroup(CreateCacheParameterGroupRequest)
 */
public class CreateCacheParameterGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the Cache Parameter Group.
     */
    private String cacheParameterGroupName;

    /**
     * The name of the Cache Parameter Group Family the Cache Parameter Group
     * can be used with. <note>Currently, <i>memcached1.4</i> is the only
     * cache parameter group family supported by the service.</note>
     */
    private String cacheParameterGroupFamily;

    /**
     * The description for the Cache Parameter Group.
     */
    private String description;

    /**
     * Default constructor for a new CreateCacheParameterGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateCacheParameterGroupRequest() {}
    
    /**
     * Constructs a new CreateCacheParameterGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheParameterGroupName The name of the Cache Parameter Group.
     * @param cacheParameterGroupFamily The name of the Cache Parameter Group
     * Family the Cache Parameter Group can be used with. <note>Currently,
     * <i>memcached1.4</i> is the only cache parameter group family supported
     * by the service.</note>
     * @param description The description for the Cache Parameter Group.
     */
    public CreateCacheParameterGroupRequest(String cacheParameterGroupName, String cacheParameterGroupFamily, String description) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
        this.description = description;
    }
    
    /**
     * The name of the Cache Parameter Group.
     *
     * @return The name of the Cache Parameter Group.
     */
    public String getCacheParameterGroupName() {
        return cacheParameterGroupName;
    }
    
    /**
     * The name of the Cache Parameter Group.
     *
     * @param cacheParameterGroupName The name of the Cache Parameter Group.
     */
    public void setCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
    }
    
    /**
     * The name of the Cache Parameter Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupName The name of the Cache Parameter Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheParameterGroupRequest withCacheParameterGroupName(String cacheParameterGroupName) {
        this.cacheParameterGroupName = cacheParameterGroupName;
        return this;
    }
    
    
    /**
     * The name of the Cache Parameter Group Family the Cache Parameter Group
     * can be used with. <note>Currently, <i>memcached1.4</i> is the only
     * cache parameter group family supported by the service.</note>
     *
     * @return The name of the Cache Parameter Group Family the Cache Parameter Group
     *         can be used with. <note>Currently, <i>memcached1.4</i> is the only
     *         cache parameter group family supported by the service.</note>
     */
    public String getCacheParameterGroupFamily() {
        return cacheParameterGroupFamily;
    }
    
    /**
     * The name of the Cache Parameter Group Family the Cache Parameter Group
     * can be used with. <note>Currently, <i>memcached1.4</i> is the only
     * cache parameter group family supported by the service.</note>
     *
     * @param cacheParameterGroupFamily The name of the Cache Parameter Group Family the Cache Parameter Group
     *         can be used with. <note>Currently, <i>memcached1.4</i> is the only
     *         cache parameter group family supported by the service.</note>
     */
    public void setCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
    }
    
    /**
     * The name of the Cache Parameter Group Family the Cache Parameter Group
     * can be used with. <note>Currently, <i>memcached1.4</i> is the only
     * cache parameter group family supported by the service.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroupFamily The name of the Cache Parameter Group Family the Cache Parameter Group
     *         can be used with. <note>Currently, <i>memcached1.4</i> is the only
     *         cache parameter group family supported by the service.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheParameterGroupRequest withCacheParameterGroupFamily(String cacheParameterGroupFamily) {
        this.cacheParameterGroupFamily = cacheParameterGroupFamily;
        return this;
    }
    
    
    /**
     * The description for the Cache Parameter Group.
     *
     * @return The description for the Cache Parameter Group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description for the Cache Parameter Group.
     *
     * @param description The description for the Cache Parameter Group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description for the Cache Parameter Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description for the Cache Parameter Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCacheParameterGroupRequest withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("CacheParameterGroupName: " + cacheParameterGroupName + ", ");
        sb.append("CacheParameterGroupFamily: " + cacheParameterGroupFamily + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    