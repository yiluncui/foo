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
package com.amazonaws.services.identitymanagement.model;

/**
 * <p>
 * The User data type contains information about a user.
 * </p>
 * <p>
 * This data type is used as a response element in the following
 * actions:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * CreateUser
 * </p>
 * </li>
 * <li> <p>
 * GetUser
 * </p>
 * </li>
 * <li> <p>
 * ListUsers
 * </p>
 * </li>
 * 
 * </ul>
 */
public class User {

    /**
     * Path to the user name. For more information about paths, see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     */
    private String path;

    /**
     * The name identifying the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The stable and unique string identifying the user. For more
     * information about IDs, see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     */
    private String userId;

    /**
     * The Amazon Resource Name (ARN) specifying the user. For more
     * information about ARNs and how to use them in policies, see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * The date when the user was created.
     */
    private java.util.Date createDate;

    /**
     * Default constructor for a new User object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public User() {}
    
    /**
     * Constructs a new User object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param path Path to the user name. For more information about paths,
     * see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * @param userName The name identifying the user.
     * @param userId The stable and unique string identifying the user. For
     * more information about IDs, see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * @param arn The Amazon Resource Name (ARN) specifying the user. For
     * more information about ARNs and how to use them in policies, see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * @param createDate The date when the user was created.
     */
    public User(String path, String userName, String userId, String arn, java.util.Date createDate) {
        this.path = path;
        this.userName = userName;
        this.userId = userId;
        this.arn = arn;
        this.createDate = createDate;
    }
    
    /**
     * Path to the user name. For more information about paths, see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @return Path to the user name. For more information about paths, see <a
     *         ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public String getPath() {
        return path;
    }
    
    /**
     * Path to the user name. For more information about paths, see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path Path to the user name. For more information about paths, see <a
     *         ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    /**
     * Path to the user name. For more information about paths, see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>(\u002F)|(\u002F[\u0021-\u007F]+\u002F)<br/>
     *
     * @param path Path to the user name. For more information about paths, see <a
     *         ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public User withPath(String path) {
        this.path = path;
        return this;
    }
    
    
    /**
     * The name identifying the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The name identifying the user.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * The name identifying the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The name identifying the user.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * The name identifying the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The name identifying the user.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public User withUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    
    /**
     * The stable and unique string identifying the user. For more
     * information about IDs, see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @return The stable and unique string identifying the user. For more
     *         information about IDs, see <a
     *         ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public String getUserId() {
        return userId;
    }
    
    /**
     * The stable and unique string identifying the user. For more
     * information about IDs, see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param userId The stable and unique string identifying the user. For more
     *         information about IDs, see <a
     *         ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    /**
     * The stable and unique string identifying the user. For more
     * information about IDs, see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 32<br/>
     * <b>Pattern: </b>[\w]*<br/>
     *
     * @param userId The stable and unique string identifying the user. For more
     *         information about IDs, see <a
     *         ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public User withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    
    /**
     * The Amazon Resource Name (ARN) specifying the user. For more
     * information about ARNs and how to use them in policies, see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN) specifying the user. For more
     *         information about ARNs and how to use them in policies, see <a
     *         ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) specifying the user. For more
     * information about ARNs and how to use them in policies, see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The Amazon Resource Name (ARN) specifying the user. For more
     *         information about ARNs and how to use them in policies, see <a
     *         ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) specifying the user. For more
     * information about ARNs and how to use them in policies, see <a
     * ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     * Identity and Access Management</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The Amazon Resource Name (ARN) specifying the user. For more
     *         information about ARNs and how to use them in policies, see <a
     *         ebservices.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS
     *         Identity and Access Management</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public User withArn(String arn) {
        this.arn = arn;
        return this;
    }
    
    
    /**
     * The date when the user was created.
     *
     * @return The date when the user was created.
     */
    public java.util.Date getCreateDate() {
        return createDate;
    }
    
    /**
     * The date when the user was created.
     *
     * @param createDate The date when the user was created.
     */
    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }
    
    /**
     * The date when the user was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createDate The date when the user was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public User withCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
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
        sb.append("Path: " + path + ", ");
        sb.append("UserName: " + userName + ", ");
        sb.append("UserId: " + userId + ", ");
        sb.append("Arn: " + arn + ", ");
        sb.append("CreateDate: " + createDate + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    