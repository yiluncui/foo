/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.io.Serializable;

/**
 * <p>
 * Contains information about a Cache Cluster.
 * </p>
 */
public class CacheCluster implements Serializable {

    /**
     * Specifies a user-supplied identifier. This is the unique key that
     * identifies a Cache Cluster.
     */
    private String cacheClusterId;

    /**
     * Specifies a user-supplied identifier. This is the unique key that
     * identifies a Cache Cluster.
     */
    private Endpoint configurationEndpoint;

    /**
     * Provides the landing page to download the latest ElastiCache client
     * library.
     */
    private String clientDownloadLandingPage;

    /**
     * Specifies the name of the compute and memory capacity node type for
     * the Cache Cluster.
     */
    private String cacheNodeType;

    /**
     * Provides the name of the cache engine to be used for this Cache
     * Cluster.
     */
    private String engine;

    /**
     * Provides the cache engine version of the cache engine to be used for
     * this Cache Cluster.
     */
    private String engineVersion;

    /**
     * Specifies the current state of this Cache Cluster.
     */
    private String cacheClusterStatus;

    /**
     * Specifies the number of Cache Nodes the Cache Cluster contains.
     */
    private Integer numCacheNodes;

    /**
     * Specifies the name of the Availability Zone the Cache Cluster is
     * located in.
     */
    private String preferredAvailabilityZone;

    /**
     * Provides the date and time the Cache Cluster was created.
     */
    private java.util.Date cacheClusterCreateTime;

    /**
     * Specifies the weekly time range (in UTC) during which system
     * maintenance can occur.
     */
    private String preferredMaintenanceWindow;

    /**
     * Specifies that changes to the Cache Cluster are pending. This element
     * is only included when changes are pending. Specific changes are
     * identified by sub-elements.
     */
    private PendingModifiedValues pendingModifiedValues;

    /**
     * Specifies the notification details the Cache Cluster contains.
     */
    private NotificationConfiguration notificationConfiguration;

    /**
     * Provides the list of Cache Security Group elements containing
     * <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     * sub-elements.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroupMembership> cacheSecurityGroups;

    /**
     * Provides the status of the Cache Parameter Group assigned to the Cache
     * Cluster.
     */
    private CacheParameterGroupStatus cacheParameterGroup;

    /**
     * Specifies the name of the Cache Subnet Group associated with the Cache
     * Cluster.
     */
    private String cacheSubnetGroupName;

    /**
     * Specifies the list of Cache Nodes the Cache Cluster contains.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CacheNode> cacheNodes;

    /**
     * Indicates that minor version patches are applied automatically.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * Specifies the VPC Security Groups associated with the Cache Cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupMembership> securityGroups;

    /**
     * Specifies a user-supplied identifier. This is the unique key that
     * identifies a Cache Cluster.
     *
     * @return Specifies a user-supplied identifier. This is the unique key that
     *         identifies a Cache Cluster.
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }
    
    /**
     * Specifies a user-supplied identifier. This is the unique key that
     * identifies a Cache Cluster.
     *
     * @param cacheClusterId Specifies a user-supplied identifier. This is the unique key that
     *         identifies a Cache Cluster.
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }
    
    /**
     * Specifies a user-supplied identifier. This is the unique key that
     * identifies a Cache Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterId Specifies a user-supplied identifier. This is the unique key that
     *         identifies a Cache Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }
    
    
    /**
     * Specifies a user-supplied identifier. This is the unique key that
     * identifies a Cache Cluster.
     *
     * @return Specifies a user-supplied identifier. This is the unique key that
     *         identifies a Cache Cluster.
     */
    public Endpoint getConfigurationEndpoint() {
        return configurationEndpoint;
    }
    
    /**
     * Specifies a user-supplied identifier. This is the unique key that
     * identifies a Cache Cluster.
     *
     * @param configurationEndpoint Specifies a user-supplied identifier. This is the unique key that
     *         identifies a Cache Cluster.
     */
    public void setConfigurationEndpoint(Endpoint configurationEndpoint) {
        this.configurationEndpoint = configurationEndpoint;
    }
    
    /**
     * Specifies a user-supplied identifier. This is the unique key that
     * identifies a Cache Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param configurationEndpoint Specifies a user-supplied identifier. This is the unique key that
     *         identifies a Cache Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withConfigurationEndpoint(Endpoint configurationEndpoint) {
        this.configurationEndpoint = configurationEndpoint;
        return this;
    }
    
    
    /**
     * Provides the landing page to download the latest ElastiCache client
     * library.
     *
     * @return Provides the landing page to download the latest ElastiCache client
     *         library.
     */
    public String getClientDownloadLandingPage() {
        return clientDownloadLandingPage;
    }
    
    /**
     * Provides the landing page to download the latest ElastiCache client
     * library.
     *
     * @param clientDownloadLandingPage Provides the landing page to download the latest ElastiCache client
     *         library.
     */
    public void setClientDownloadLandingPage(String clientDownloadLandingPage) {
        this.clientDownloadLandingPage = clientDownloadLandingPage;
    }
    
    /**
     * Provides the landing page to download the latest ElastiCache client
     * library.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientDownloadLandingPage Provides the landing page to download the latest ElastiCache client
     *         library.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withClientDownloadLandingPage(String clientDownloadLandingPage) {
        this.clientDownloadLandingPage = clientDownloadLandingPage;
        return this;
    }
    
    
    /**
     * Specifies the name of the compute and memory capacity node type for
     * the Cache Cluster.
     *
     * @return Specifies the name of the compute and memory capacity node type for
     *         the Cache Cluster.
     */
    public String getCacheNodeType() {
        return cacheNodeType;
    }
    
    /**
     * Specifies the name of the compute and memory capacity node type for
     * the Cache Cluster.
     *
     * @param cacheNodeType Specifies the name of the compute and memory capacity node type for
     *         the Cache Cluster.
     */
    public void setCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
    }
    
    /**
     * Specifies the name of the compute and memory capacity node type for
     * the Cache Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeType Specifies the name of the compute and memory capacity node type for
     *         the Cache Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheNodeType(String cacheNodeType) {
        this.cacheNodeType = cacheNodeType;
        return this;
    }
    
    
    /**
     * Provides the name of the cache engine to be used for this Cache
     * Cluster.
     *
     * @return Provides the name of the cache engine to be used for this Cache
     *         Cluster.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * Provides the name of the cache engine to be used for this Cache
     * Cluster.
     *
     * @param engine Provides the name of the cache engine to be used for this Cache
     *         Cluster.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * Provides the name of the cache engine to be used for this Cache
     * Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine Provides the name of the cache engine to be used for this Cache
     *         Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withEngine(String engine) {
        this.engine = engine;
        return this;
    }
    
    
    /**
     * Provides the cache engine version of the cache engine to be used for
     * this Cache Cluster.
     *
     * @return Provides the cache engine version of the cache engine to be used for
     *         this Cache Cluster.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * Provides the cache engine version of the cache engine to be used for
     * this Cache Cluster.
     *
     * @param engineVersion Provides the cache engine version of the cache engine to be used for
     *         this Cache Cluster.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * Provides the cache engine version of the cache engine to be used for
     * this Cache Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion Provides the cache engine version of the cache engine to be used for
     *         this Cache Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    
    
    /**
     * Specifies the current state of this Cache Cluster.
     *
     * @return Specifies the current state of this Cache Cluster.
     */
    public String getCacheClusterStatus() {
        return cacheClusterStatus;
    }
    
    /**
     * Specifies the current state of this Cache Cluster.
     *
     * @param cacheClusterStatus Specifies the current state of this Cache Cluster.
     */
    public void setCacheClusterStatus(String cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus;
    }
    
    /**
     * Specifies the current state of this Cache Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterStatus Specifies the current state of this Cache Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheClusterStatus(String cacheClusterStatus) {
        this.cacheClusterStatus = cacheClusterStatus;
        return this;
    }
    
    
    /**
     * Specifies the number of Cache Nodes the Cache Cluster contains.
     *
     * @return Specifies the number of Cache Nodes the Cache Cluster contains.
     */
    public Integer getNumCacheNodes() {
        return numCacheNodes;
    }
    
    /**
     * Specifies the number of Cache Nodes the Cache Cluster contains.
     *
     * @param numCacheNodes Specifies the number of Cache Nodes the Cache Cluster contains.
     */
    public void setNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
    }
    
    /**
     * Specifies the number of Cache Nodes the Cache Cluster contains.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numCacheNodes Specifies the number of Cache Nodes the Cache Cluster contains.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withNumCacheNodes(Integer numCacheNodes) {
        this.numCacheNodes = numCacheNodes;
        return this;
    }
    
    
    /**
     * Specifies the name of the Availability Zone the Cache Cluster is
     * located in.
     *
     * @return Specifies the name of the Availability Zone the Cache Cluster is
     *         located in.
     */
    public String getPreferredAvailabilityZone() {
        return preferredAvailabilityZone;
    }
    
    /**
     * Specifies the name of the Availability Zone the Cache Cluster is
     * located in.
     *
     * @param preferredAvailabilityZone Specifies the name of the Availability Zone the Cache Cluster is
     *         located in.
     */
    public void setPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
    }
    
    /**
     * Specifies the name of the Availability Zone the Cache Cluster is
     * located in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredAvailabilityZone Specifies the name of the Availability Zone the Cache Cluster is
     *         located in.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withPreferredAvailabilityZone(String preferredAvailabilityZone) {
        this.preferredAvailabilityZone = preferredAvailabilityZone;
        return this;
    }
    
    
    /**
     * Provides the date and time the Cache Cluster was created.
     *
     * @return Provides the date and time the Cache Cluster was created.
     */
    public java.util.Date getCacheClusterCreateTime() {
        return cacheClusterCreateTime;
    }
    
    /**
     * Provides the date and time the Cache Cluster was created.
     *
     * @param cacheClusterCreateTime Provides the date and time the Cache Cluster was created.
     */
    public void setCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        this.cacheClusterCreateTime = cacheClusterCreateTime;
    }
    
    /**
     * Provides the date and time the Cache Cluster was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheClusterCreateTime Provides the date and time the Cache Cluster was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheClusterCreateTime(java.util.Date cacheClusterCreateTime) {
        this.cacheClusterCreateTime = cacheClusterCreateTime;
        return this;
    }
    
    
    /**
     * Specifies the weekly time range (in UTC) during which system
     * maintenance can occur.
     *
     * @return Specifies the weekly time range (in UTC) during which system
     *         maintenance can occur.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * Specifies the weekly time range (in UTC) during which system
     * maintenance can occur.
     *
     * @param preferredMaintenanceWindow Specifies the weekly time range (in UTC) during which system
     *         maintenance can occur.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * Specifies the weekly time range (in UTC) during which system
     * maintenance can occur.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow Specifies the weekly time range (in UTC) during which system
     *         maintenance can occur.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }
    
    
    /**
     * Specifies that changes to the Cache Cluster are pending. This element
     * is only included when changes are pending. Specific changes are
     * identified by sub-elements.
     *
     * @return Specifies that changes to the Cache Cluster are pending. This element
     *         is only included when changes are pending. Specific changes are
     *         identified by sub-elements.
     */
    public PendingModifiedValues getPendingModifiedValues() {
        return pendingModifiedValues;
    }
    
    /**
     * Specifies that changes to the Cache Cluster are pending. This element
     * is only included when changes are pending. Specific changes are
     * identified by sub-elements.
     *
     * @param pendingModifiedValues Specifies that changes to the Cache Cluster are pending. This element
     *         is only included when changes are pending. Specific changes are
     *         identified by sub-elements.
     */
    public void setPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }
    
    /**
     * Specifies that changes to the Cache Cluster are pending. This element
     * is only included when changes are pending. Specific changes are
     * identified by sub-elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pendingModifiedValues Specifies that changes to the Cache Cluster are pending. This element
     *         is only included when changes are pending. Specific changes are
     *         identified by sub-elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
        return this;
    }
    
    
    /**
     * Specifies the notification details the Cache Cluster contains.
     *
     * @return Specifies the notification details the Cache Cluster contains.
     */
    public NotificationConfiguration getNotificationConfiguration() {
        return notificationConfiguration;
    }
    
    /**
     * Specifies the notification details the Cache Cluster contains.
     *
     * @param notificationConfiguration Specifies the notification details the Cache Cluster contains.
     */
    public void setNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
    }
    
    /**
     * Specifies the notification details the Cache Cluster contains.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param notificationConfiguration Specifies the notification details the Cache Cluster contains.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withNotificationConfiguration(NotificationConfiguration notificationConfiguration) {
        this.notificationConfiguration = notificationConfiguration;
        return this;
    }
    
    
    /**
     * Provides the list of Cache Security Group elements containing
     * <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     * sub-elements.
     *
     * @return Provides the list of Cache Security Group elements containing
     *         <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     *         sub-elements.
     */
    public java.util.List<CacheSecurityGroupMembership> getCacheSecurityGroups() {
        
        if (cacheSecurityGroups == null) {
              cacheSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroupMembership>();
              cacheSecurityGroups.setAutoConstruct(true);
        }
        return cacheSecurityGroups;
    }
    
    /**
     * Provides the list of Cache Security Group elements containing
     * <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     * sub-elements.
     *
     * @param cacheSecurityGroups Provides the list of Cache Security Group elements containing
     *         <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     *         sub-elements.
     */
    public void setCacheSecurityGroups(java.util.Collection<CacheSecurityGroupMembership> cacheSecurityGroups) {
        if (cacheSecurityGroups == null) {
            this.cacheSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroupMembership> cacheSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroupMembership>(cacheSecurityGroups.size());
        cacheSecurityGroupsCopy.addAll(cacheSecurityGroups);
        this.cacheSecurityGroups = cacheSecurityGroupsCopy;
    }
    
    /**
     * Provides the list of Cache Security Group elements containing
     * <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     * sub-elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroups Provides the list of Cache Security Group elements containing
     *         <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     *         sub-elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheSecurityGroups(CacheSecurityGroupMembership... cacheSecurityGroups) {
        if (getCacheSecurityGroups() == null) setCacheSecurityGroups(new java.util.ArrayList<CacheSecurityGroupMembership>(cacheSecurityGroups.length));
        for (CacheSecurityGroupMembership value : cacheSecurityGroups) {
            getCacheSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * Provides the list of Cache Security Group elements containing
     * <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     * sub-elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroups Provides the list of Cache Security Group elements containing
     *         <i>CacheSecurityGroup.Name</i> and <i>CacheSecurityGroup.Status</i>
     *         sub-elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheSecurityGroups(java.util.Collection<CacheSecurityGroupMembership> cacheSecurityGroups) {
        if (cacheSecurityGroups == null) {
            this.cacheSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroupMembership> cacheSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheSecurityGroupMembership>(cacheSecurityGroups.size());
            cacheSecurityGroupsCopy.addAll(cacheSecurityGroups);
            this.cacheSecurityGroups = cacheSecurityGroupsCopy;
        }

        return this;
    }
    
    /**
     * Provides the status of the Cache Parameter Group assigned to the Cache
     * Cluster.
     *
     * @return Provides the status of the Cache Parameter Group assigned to the Cache
     *         Cluster.
     */
    public CacheParameterGroupStatus getCacheParameterGroup() {
        return cacheParameterGroup;
    }
    
    /**
     * Provides the status of the Cache Parameter Group assigned to the Cache
     * Cluster.
     *
     * @param cacheParameterGroup Provides the status of the Cache Parameter Group assigned to the Cache
     *         Cluster.
     */
    public void setCacheParameterGroup(CacheParameterGroupStatus cacheParameterGroup) {
        this.cacheParameterGroup = cacheParameterGroup;
    }
    
    /**
     * Provides the status of the Cache Parameter Group assigned to the Cache
     * Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheParameterGroup Provides the status of the Cache Parameter Group assigned to the Cache
     *         Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheParameterGroup(CacheParameterGroupStatus cacheParameterGroup) {
        this.cacheParameterGroup = cacheParameterGroup;
        return this;
    }
    
    
    /**
     * Specifies the name of the Cache Subnet Group associated with the Cache
     * Cluster.
     *
     * @return Specifies the name of the Cache Subnet Group associated with the Cache
     *         Cluster.
     */
    public String getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }
    
    /**
     * Specifies the name of the Cache Subnet Group associated with the Cache
     * Cluster.
     *
     * @param cacheSubnetGroupName Specifies the name of the Cache Subnet Group associated with the Cache
     *         Cluster.
     */
    public void setCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }
    
    /**
     * Specifies the name of the Cache Subnet Group associated with the Cache
     * Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSubnetGroupName Specifies the name of the Cache Subnet Group associated with the Cache
     *         Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheSubnetGroupName(String cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }
    
    
    /**
     * Specifies the list of Cache Nodes the Cache Cluster contains.
     *
     * @return Specifies the list of Cache Nodes the Cache Cluster contains.
     */
    public java.util.List<CacheNode> getCacheNodes() {
        
        if (cacheNodes == null) {
              cacheNodes = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheNode>();
              cacheNodes.setAutoConstruct(true);
        }
        return cacheNodes;
    }
    
    /**
     * Specifies the list of Cache Nodes the Cache Cluster contains.
     *
     * @param cacheNodes Specifies the list of Cache Nodes the Cache Cluster contains.
     */
    public void setCacheNodes(java.util.Collection<CacheNode> cacheNodes) {
        if (cacheNodes == null) {
            this.cacheNodes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CacheNode> cacheNodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheNode>(cacheNodes.size());
        cacheNodesCopy.addAll(cacheNodes);
        this.cacheNodes = cacheNodesCopy;
    }
    
    /**
     * Specifies the list of Cache Nodes the Cache Cluster contains.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodes Specifies the list of Cache Nodes the Cache Cluster contains.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheNodes(CacheNode... cacheNodes) {
        if (getCacheNodes() == null) setCacheNodes(new java.util.ArrayList<CacheNode>(cacheNodes.length));
        for (CacheNode value : cacheNodes) {
            getCacheNodes().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the list of Cache Nodes the Cache Cluster contains.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodes Specifies the list of Cache Nodes the Cache Cluster contains.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withCacheNodes(java.util.Collection<CacheNode> cacheNodes) {
        if (cacheNodes == null) {
            this.cacheNodes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CacheNode> cacheNodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CacheNode>(cacheNodes.size());
            cacheNodesCopy.addAll(cacheNodes);
            this.cacheNodes = cacheNodesCopy;
        }

        return this;
    }
    
    /**
     * Indicates that minor version patches are applied automatically.
     *
     * @return Indicates that minor version patches are applied automatically.
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version patches are applied automatically.
     *
     * @param autoMinorVersionUpgrade Indicates that minor version patches are applied automatically.
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version patches are applied automatically.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor version patches are applied automatically.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }
    
    
    /**
     * Indicates that minor version patches are applied automatically.
     *
     * @return Indicates that minor version patches are applied automatically.
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Specifies the VPC Security Groups associated with the Cache Cluster.
     *
     * @return Specifies the VPC Security Groups associated with the Cache Cluster.
     */
    public java.util.List<SecurityGroupMembership> getSecurityGroups() {
        
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupMembership>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * Specifies the VPC Security Groups associated with the Cache Cluster.
     *
     * @param securityGroups Specifies the VPC Security Groups associated with the Cache Cluster.
     */
    public void setSecurityGroups(java.util.Collection<SecurityGroupMembership> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupMembership> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupMembership>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * Specifies the VPC Security Groups associated with the Cache Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups Specifies the VPC Security Groups associated with the Cache Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withSecurityGroups(SecurityGroupMembership... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<SecurityGroupMembership>(securityGroups.length));
        for (SecurityGroupMembership value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the VPC Security Groups associated with the Cache Cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups Specifies the VPC Security Groups associated with the Cache Cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CacheCluster withSecurityGroups(java.util.Collection<SecurityGroupMembership> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupMembership> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SecurityGroupMembership>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

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
        if (getCacheClusterId() != null) sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getConfigurationEndpoint() != null) sb.append("ConfigurationEndpoint: " + getConfigurationEndpoint() + ",");
        if (getClientDownloadLandingPage() != null) sb.append("ClientDownloadLandingPage: " + getClientDownloadLandingPage() + ",");
        if (getCacheNodeType() != null) sb.append("CacheNodeType: " + getCacheNodeType() + ",");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getCacheClusterStatus() != null) sb.append("CacheClusterStatus: " + getCacheClusterStatus() + ",");
        if (getNumCacheNodes() != null) sb.append("NumCacheNodes: " + getNumCacheNodes() + ",");
        if (getPreferredAvailabilityZone() != null) sb.append("PreferredAvailabilityZone: " + getPreferredAvailabilityZone() + ",");
        if (getCacheClusterCreateTime() != null) sb.append("CacheClusterCreateTime: " + getCacheClusterCreateTime() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPendingModifiedValues() != null) sb.append("PendingModifiedValues: " + getPendingModifiedValues() + ",");
        if (getNotificationConfiguration() != null) sb.append("NotificationConfiguration: " + getNotificationConfiguration() + ",");
        if (getCacheSecurityGroups() != null) sb.append("CacheSecurityGroups: " + getCacheSecurityGroups() + ",");
        if (getCacheParameterGroup() != null) sb.append("CacheParameterGroup: " + getCacheParameterGroup() + ",");
        if (getCacheSubnetGroupName() != null) sb.append("CacheSubnetGroupName: " + getCacheSubnetGroupName() + ",");
        if (getCacheNodes() != null) sb.append("CacheNodes: " + getCacheNodes() + ",");
        if (isAutoMinorVersionUpgrade() != null) sb.append("AutoMinorVersionUpgrade: " + isAutoMinorVersionUpgrade() + ",");
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode()); 
        hashCode = prime * hashCode + ((getConfigurationEndpoint() == null) ? 0 : getConfigurationEndpoint().hashCode()); 
        hashCode = prime * hashCode + ((getClientDownloadLandingPage() == null) ? 0 : getClientDownloadLandingPage().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodeType() == null) ? 0 : getCacheNodeType().hashCode()); 
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getCacheClusterStatus() == null) ? 0 : getCacheClusterStatus().hashCode()); 
        hashCode = prime * hashCode + ((getNumCacheNodes() == null) ? 0 : getNumCacheNodes().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredAvailabilityZone() == null) ? 0 : getPreferredAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getCacheClusterCreateTime() == null) ? 0 : getCacheClusterCreateTime().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode()); 
        hashCode = prime * hashCode + ((getNotificationConfiguration() == null) ? 0 : getNotificationConfiguration().hashCode()); 
        hashCode = prime * hashCode + ((getCacheSecurityGroups() == null) ? 0 : getCacheSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getCacheParameterGroup() == null) ? 0 : getCacheParameterGroup().hashCode()); 
        hashCode = prime * hashCode + ((getCacheSubnetGroupName() == null) ? 0 : getCacheSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getCacheNodes() == null) ? 0 : getCacheNodes().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CacheCluster == false) return false;
        CacheCluster other = (CacheCluster)obj;
        
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null) return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false) return false; 
        if (other.getConfigurationEndpoint() == null ^ this.getConfigurationEndpoint() == null) return false;
        if (other.getConfigurationEndpoint() != null && other.getConfigurationEndpoint().equals(this.getConfigurationEndpoint()) == false) return false; 
        if (other.getClientDownloadLandingPage() == null ^ this.getClientDownloadLandingPage() == null) return false;
        if (other.getClientDownloadLandingPage() != null && other.getClientDownloadLandingPage().equals(this.getClientDownloadLandingPage()) == false) return false; 
        if (other.getCacheNodeType() == null ^ this.getCacheNodeType() == null) return false;
        if (other.getCacheNodeType() != null && other.getCacheNodeType().equals(this.getCacheNodeType()) == false) return false; 
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getCacheClusterStatus() == null ^ this.getCacheClusterStatus() == null) return false;
        if (other.getCacheClusterStatus() != null && other.getCacheClusterStatus().equals(this.getCacheClusterStatus()) == false) return false; 
        if (other.getNumCacheNodes() == null ^ this.getNumCacheNodes() == null) return false;
        if (other.getNumCacheNodes() != null && other.getNumCacheNodes().equals(this.getNumCacheNodes()) == false) return false; 
        if (other.getPreferredAvailabilityZone() == null ^ this.getPreferredAvailabilityZone() == null) return false;
        if (other.getPreferredAvailabilityZone() != null && other.getPreferredAvailabilityZone().equals(this.getPreferredAvailabilityZone()) == false) return false; 
        if (other.getCacheClusterCreateTime() == null ^ this.getCacheClusterCreateTime() == null) return false;
        if (other.getCacheClusterCreateTime() != null && other.getCacheClusterCreateTime().equals(this.getCacheClusterCreateTime()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null) return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false) return false; 
        if (other.getNotificationConfiguration() == null ^ this.getNotificationConfiguration() == null) return false;
        if (other.getNotificationConfiguration() != null && other.getNotificationConfiguration().equals(this.getNotificationConfiguration()) == false) return false; 
        if (other.getCacheSecurityGroups() == null ^ this.getCacheSecurityGroups() == null) return false;
        if (other.getCacheSecurityGroups() != null && other.getCacheSecurityGroups().equals(this.getCacheSecurityGroups()) == false) return false; 
        if (other.getCacheParameterGroup() == null ^ this.getCacheParameterGroup() == null) return false;
        if (other.getCacheParameterGroup() != null && other.getCacheParameterGroup().equals(this.getCacheParameterGroup()) == false) return false; 
        if (other.getCacheSubnetGroupName() == null ^ this.getCacheSubnetGroupName() == null) return false;
        if (other.getCacheSubnetGroupName() != null && other.getCacheSubnetGroupName().equals(this.getCacheSubnetGroupName()) == false) return false; 
        if (other.getCacheNodes() == null ^ this.getCacheNodes() == null) return false;
        if (other.getCacheNodes() != null && other.getCacheNodes().equals(this.getCacheNodes()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        return true;
    }
    
}
    