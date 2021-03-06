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

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The request would result in user exceeding the allowed number of
 * cluster subnet groups. For information about increasing your quota, go
 * to
 * <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/amazon-redshift-limits.html"> Limits in Amazon Redshift </a>
 * in the <i>Amazon Redshift Cluster Management Guide</i> .
 * 
 * </p>
 */        
public class ClusterSubnetGroupQuotaExceededException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructs a new ClusterSubnetGroupQuotaExceededException with the specified error
     * message.
     * 
     * @param message Describes the error encountered.
     */
    public ClusterSubnetGroupQuotaExceededException(String message) {
        super(message);
    }
    
}
    