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

/**
 * <p>
 * Contains a list of Parametes and CacheNodeTypeSpecificParameters.
 * </p>
 */
public class DescribeCacheParametersResult {

    /**
     * The marker obtained from a previous operation response.
     */
    private String marker;

    /**
     * A list of <a>Parameter</a> instances.
     */
    private java.util.List<Parameter> parameters;

    /**
     * A list of <a>CacheNodeTypeSpecificParameter</a> instances.
     */
    private java.util.List<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParameters;

    /**
     * The marker obtained from a previous operation response.
     *
     * @return The marker obtained from a previous operation response.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The marker obtained from a previous operation response.
     *
     * @param marker The marker obtained from a previous operation response.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The marker obtained from a previous operation response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The marker obtained from a previous operation response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheParametersResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * A list of <a>Parameter</a> instances.
     *
     * @return A list of <a>Parameter</a> instances.
     */
    public java.util.List<Parameter> getParameters() {
        
        if (parameters == null) {
            parameters = new java.util.ArrayList<Parameter>();
        }
        return parameters;
    }
    
    /**
     * A list of <a>Parameter</a> instances.
     *
     * @param parameters A list of <a>Parameter</a> instances.
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>();
        if (parameters != null) {
            parametersCopy.addAll(parameters);
        }
        this.parameters = parametersCopy;
    }
    
    /**
     * A list of <a>Parameter</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <a>Parameter</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheParametersResult withParameters(Parameter... parameters) {
        if (getParameters() == null) setParameters(new java.util.ArrayList<Parameter>());
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>Parameter</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <a>Parameter</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheParametersResult withParameters(java.util.Collection<Parameter> parameters) {
        java.util.List<Parameter> parametersCopy = new java.util.ArrayList<Parameter>();
        if (parameters != null) {
            parametersCopy.addAll(parameters);
        }
        this.parameters = parametersCopy;

        return this;
    }
    
    /**
     * A list of <a>CacheNodeTypeSpecificParameter</a> instances.
     *
     * @return A list of <a>CacheNodeTypeSpecificParameter</a> instances.
     */
    public java.util.List<CacheNodeTypeSpecificParameter> getCacheNodeTypeSpecificParameters() {
        
        if (cacheNodeTypeSpecificParameters == null) {
            cacheNodeTypeSpecificParameters = new java.util.ArrayList<CacheNodeTypeSpecificParameter>();
        }
        return cacheNodeTypeSpecificParameters;
    }
    
    /**
     * A list of <a>CacheNodeTypeSpecificParameter</a> instances.
     *
     * @param cacheNodeTypeSpecificParameters A list of <a>CacheNodeTypeSpecificParameter</a> instances.
     */
    public void setCacheNodeTypeSpecificParameters(java.util.Collection<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParameters) {
        java.util.List<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParametersCopy = new java.util.ArrayList<CacheNodeTypeSpecificParameter>();
        if (cacheNodeTypeSpecificParameters != null) {
            cacheNodeTypeSpecificParametersCopy.addAll(cacheNodeTypeSpecificParameters);
        }
        this.cacheNodeTypeSpecificParameters = cacheNodeTypeSpecificParametersCopy;
    }
    
    /**
     * A list of <a>CacheNodeTypeSpecificParameter</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeTypeSpecificParameters A list of <a>CacheNodeTypeSpecificParameter</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheParametersResult withCacheNodeTypeSpecificParameters(CacheNodeTypeSpecificParameter... cacheNodeTypeSpecificParameters) {
        if (getCacheNodeTypeSpecificParameters() == null) setCacheNodeTypeSpecificParameters(new java.util.ArrayList<CacheNodeTypeSpecificParameter>());
        for (CacheNodeTypeSpecificParameter value : cacheNodeTypeSpecificParameters) {
            getCacheNodeTypeSpecificParameters().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>CacheNodeTypeSpecificParameter</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeTypeSpecificParameters A list of <a>CacheNodeTypeSpecificParameter</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeCacheParametersResult withCacheNodeTypeSpecificParameters(java.util.Collection<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParameters) {
        java.util.List<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParametersCopy = new java.util.ArrayList<CacheNodeTypeSpecificParameter>();
        if (cacheNodeTypeSpecificParameters != null) {
            cacheNodeTypeSpecificParametersCopy.addAll(cacheNodeTypeSpecificParameters);
        }
        this.cacheNodeTypeSpecificParameters = cacheNodeTypeSpecificParametersCopy;

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
        sb.append("Marker: " + marker + ", ");
        sb.append("Parameters: " + parameters + ", ");
        sb.append("CacheNodeTypeSpecificParameters: " + cacheNodeTypeSpecificParameters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    