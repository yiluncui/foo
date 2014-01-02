/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeHsmClientCertificates(DescribeHsmClientCertificatesRequest) DescribeHsmClientCertificates operation}.
 * <p>
 * Returns information about the specified HSM client certificate. If no certificate ID is specified, returns information about all the HSM certificates
 * owned by your AWS customer account.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeHsmClientCertificates(DescribeHsmClientCertificatesRequest)
 */
public class DescribeHsmClientCertificatesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of a specific HSM client certificate for which you want
     * information. If no identifier is specified, information is returned
     * for all HSM client certificates associated with Amazon Redshift
     * clusters owned by your AWS customer account.
     */
    private String hsmClientCertificateIdentifier;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     * maximum 100.
     */
    private Integer maxRecords;

    /**
     * An optional marker returned from a previous
     * <b>DescribeOrderableClusterOptions</b> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * The identifier of a specific HSM client certificate for which you want
     * information. If no identifier is specified, information is returned
     * for all HSM client certificates associated with Amazon Redshift
     * clusters owned by your AWS customer account.
     *
     * @return The identifier of a specific HSM client certificate for which you want
     *         information. If no identifier is specified, information is returned
     *         for all HSM client certificates associated with Amazon Redshift
     *         clusters owned by your AWS customer account.
     */
    public String getHsmClientCertificateIdentifier() {
        return hsmClientCertificateIdentifier;
    }
    
    /**
     * The identifier of a specific HSM client certificate for which you want
     * information. If no identifier is specified, information is returned
     * for all HSM client certificates associated with Amazon Redshift
     * clusters owned by your AWS customer account.
     *
     * @param hsmClientCertificateIdentifier The identifier of a specific HSM client certificate for which you want
     *         information. If no identifier is specified, information is returned
     *         for all HSM client certificates associated with Amazon Redshift
     *         clusters owned by your AWS customer account.
     */
    public void setHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
    }
    
    /**
     * The identifier of a specific HSM client certificate for which you want
     * information. If no identifier is specified, information is returned
     * for all HSM client certificates associated with Amazon Redshift
     * clusters owned by your AWS customer account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hsmClientCertificateIdentifier The identifier of a specific HSM client certificate for which you want
     *         information. If no identifier is specified, information is returned
     *         for all HSM client certificates associated with Amazon Redshift
     *         clusters owned by your AWS customer account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeHsmClientCertificatesRequest withHsmClientCertificateIdentifier(String hsmClientCertificateIdentifier) {
        this.hsmClientCertificateIdentifier = hsmClientCertificateIdentifier;
        return this;
    }

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     * maximum 100.
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     *         maximum 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     * maximum 100.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     *         maximum 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results may
     * be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     * maximum 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results may
     *         be retrieved. <p>Default: <code>100</code> <p>Constraints: minimum 20,
     *         maximum 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeHsmClientCertificatesRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional marker returned from a previous
     * <b>DescribeOrderableClusterOptions</b> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     *
     * @return An optional marker returned from a previous
     *         <b>DescribeOrderableClusterOptions</b> request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker returned from a previous
     * <b>DescribeOrderableClusterOptions</b> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     *
     * @param marker An optional marker returned from a previous
     *         <b>DescribeOrderableClusterOptions</b> request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker returned from a previous
     * <b>DescribeOrderableClusterOptions</b> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker returned from a previous
     *         <b>DescribeOrderableClusterOptions</b> request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeHsmClientCertificatesRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getHsmClientCertificateIdentifier() != null) sb.append("HsmClientCertificateIdentifier: " + getHsmClientCertificateIdentifier() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHsmClientCertificateIdentifier() == null) ? 0 : getHsmClientCertificateIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeHsmClientCertificatesRequest == false) return false;
        DescribeHsmClientCertificatesRequest other = (DescribeHsmClientCertificatesRequest)obj;
        
        if (other.getHsmClientCertificateIdentifier() == null ^ this.getHsmClientCertificateIdentifier() == null) return false;
        if (other.getHsmClientCertificateIdentifier() != null && other.getHsmClientCertificateIdentifier().equals(this.getHsmClientCertificateIdentifier()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    