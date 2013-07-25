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
package com.amazonaws.services.simpleworkflow.model;
import java.io.Serializable;

/**
 * <p>
 * Provides details of the <code>ScheduleActivityTaskFailed</code> event.
 * </p>
 */
public class ScheduleActivityTaskFailedEventAttributes  implements Serializable  {

    /**
     * The activity type provided in the <code>ScheduleActivityTask</code>
     * decision that failed.
     */
    private ActivityType activityType;

    /**
     * The activityId provided in the <code>ScheduleActivityTask</code>
     * decision that failed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String activityId;

    /**
     * The cause of the failure to process the decision. This information is
     * generated by the system and can be useful for diagnostic purposes.
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     * failed because it lacked sufficient permissions. For details and
     * example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVITY_TYPE_DEPRECATED, ACTIVITY_TYPE_DOES_NOT_EXIST, ACTIVITY_ID_ALREADY_IN_USE, OPEN_ACTIVITIES_LIMIT_EXCEEDED, ACTIVITY_CREATION_RATE_EXCEEDED, DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_TASK_LIST_UNDEFINED, DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED, DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED, OPERATION_NOT_PERMITTED
     */
    private String cause;

    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision that resulted in the scheduling of this activity task.
     * This information can be useful for diagnosing problems by tracing back
     * the chain of events leading up to this event.
     */
    private Long decisionTaskCompletedEventId;

    /**
     * The activity type provided in the <code>ScheduleActivityTask</code>
     * decision that failed.
     *
     * @return The activity type provided in the <code>ScheduleActivityTask</code>
     *         decision that failed.
     */
    public ActivityType getActivityType() {
        return activityType;
    }
    
    /**
     * The activity type provided in the <code>ScheduleActivityTask</code>
     * decision that failed.
     *
     * @param activityType The activity type provided in the <code>ScheduleActivityTask</code>
     *         decision that failed.
     */
    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }
    
    /**
     * The activity type provided in the <code>ScheduleActivityTask</code>
     * decision that failed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityType The activity type provided in the <code>ScheduleActivityTask</code>
     *         decision that failed.
     */
    public ScheduleActivityTaskFailedEventAttributes withActivityType(ActivityType activityType) {
        this.activityType = activityType;
        return this;
    }
    
    
    /**
     * The activityId provided in the <code>ScheduleActivityTask</code>
     * decision that failed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The activityId provided in the <code>ScheduleActivityTask</code>
     *         decision that failed.
     */
    public String getActivityId() {
        return activityId;
    }
    
    /**
     * The activityId provided in the <code>ScheduleActivityTask</code>
     * decision that failed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param activityId The activityId provided in the <code>ScheduleActivityTask</code>
     *         decision that failed.
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
    
    /**
     * The activityId provided in the <code>ScheduleActivityTask</code>
     * decision that failed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param activityId The activityId provided in the <code>ScheduleActivityTask</code>
     *         decision that failed.
     */
    public ScheduleActivityTaskFailedEventAttributes withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    
    
    /**
     * The cause of the failure to process the decision. This information is
     * generated by the system and can be useful for diagnostic purposes.
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     * failed because it lacked sufficient permissions. For details and
     * example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVITY_TYPE_DEPRECATED, ACTIVITY_TYPE_DOES_NOT_EXIST, ACTIVITY_ID_ALREADY_IN_USE, OPEN_ACTIVITIES_LIMIT_EXCEEDED, ACTIVITY_CREATION_RATE_EXCEEDED, DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_TASK_LIST_UNDEFINED, DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED, DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED, OPERATION_NOT_PERMITTED
     *
     * @return The cause of the failure to process the decision. This information is
     *         generated by the system and can be useful for diagnostic purposes.
     *         <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     *         failed because it lacked sufficient permissions. For details and
     *         example IAM policies, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     *         IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     *
     * @see ScheduleActivityTaskFailedCause
     */
    public String getCause() {
        return cause;
    }
    
    /**
     * The cause of the failure to process the decision. This information is
     * generated by the system and can be useful for diagnostic purposes.
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     * failed because it lacked sufficient permissions. For details and
     * example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVITY_TYPE_DEPRECATED, ACTIVITY_TYPE_DOES_NOT_EXIST, ACTIVITY_ID_ALREADY_IN_USE, OPEN_ACTIVITIES_LIMIT_EXCEEDED, ACTIVITY_CREATION_RATE_EXCEEDED, DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_TASK_LIST_UNDEFINED, DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED, DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED, OPERATION_NOT_PERMITTED
     *
     * @param cause The cause of the failure to process the decision. This information is
     *         generated by the system and can be useful for diagnostic purposes.
     *         <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     *         failed because it lacked sufficient permissions. For details and
     *         example IAM policies, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     *         IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     *
     * @see ScheduleActivityTaskFailedCause
     */
    public void setCause(String cause) {
        this.cause = cause;
    }
    
    /**
     * The cause of the failure to process the decision. This information is
     * generated by the system and can be useful for diagnostic purposes.
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     * failed because it lacked sufficient permissions. For details and
     * example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVITY_TYPE_DEPRECATED, ACTIVITY_TYPE_DOES_NOT_EXIST, ACTIVITY_ID_ALREADY_IN_USE, OPEN_ACTIVITIES_LIMIT_EXCEEDED, ACTIVITY_CREATION_RATE_EXCEEDED, DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_TASK_LIST_UNDEFINED, DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED, DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED, OPERATION_NOT_PERMITTED
     *
     * @param cause The cause of the failure to process the decision. This information is
     *         generated by the system and can be useful for diagnostic purposes.
     *         <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     *         failed because it lacked sufficient permissions. For details and
     *         example IAM policies, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     *         IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     *
     * @see ScheduleActivityTaskFailedCause
     */
    public ScheduleActivityTaskFailedEventAttributes withCause(String cause) {
        this.cause = cause;
        return this;
    }
    
    
    /**
     * The cause of the failure to process the decision. This information is
     * generated by the system and can be useful for diagnostic purposes.
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     * failed because it lacked sufficient permissions. For details and
     * example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVITY_TYPE_DEPRECATED, ACTIVITY_TYPE_DOES_NOT_EXIST, ACTIVITY_ID_ALREADY_IN_USE, OPEN_ACTIVITIES_LIMIT_EXCEEDED, ACTIVITY_CREATION_RATE_EXCEEDED, DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_TASK_LIST_UNDEFINED, DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED, DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED, OPERATION_NOT_PERMITTED
     *
     * @param cause The cause of the failure to process the decision. This information is
     *         generated by the system and can be useful for diagnostic purposes.
     *         <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     *         failed because it lacked sufficient permissions. For details and
     *         example IAM policies, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     *         IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     *
     * @see ScheduleActivityTaskFailedCause
     */
    public void setCause(ScheduleActivityTaskFailedCause cause) {
        this.cause = cause.toString();
    }
    
    /**
     * The cause of the failure to process the decision. This information is
     * generated by the system and can be useful for diagnostic purposes.
     * <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     * failed because it lacked sufficient permissions. For details and
     * example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVITY_TYPE_DEPRECATED, ACTIVITY_TYPE_DOES_NOT_EXIST, ACTIVITY_ID_ALREADY_IN_USE, OPEN_ACTIVITIES_LIMIT_EXCEEDED, ACTIVITY_CREATION_RATE_EXCEEDED, DEFAULT_SCHEDULE_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_TASK_LIST_UNDEFINED, DEFAULT_SCHEDULE_TO_START_TIMEOUT_UNDEFINED, DEFAULT_START_TO_CLOSE_TIMEOUT_UNDEFINED, DEFAULT_HEARTBEAT_TIMEOUT_UNDEFINED, OPERATION_NOT_PERMITTED
     *
     * @param cause The cause of the failure to process the decision. This information is
     *         generated by the system and can be useful for diagnostic purposes.
     *         <note>If <b>cause</b> is set to OPERATION_NOT_PERMITTED, the decision
     *         failed because it lacked sufficient permissions. For details and
     *         example IAM policies, see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     *         IAM to Manage Access to Amazon SWF Workflows</a>.</note>
     *
     * @see ScheduleActivityTaskFailedCause
     */
    public ScheduleActivityTaskFailedEventAttributes withCause(ScheduleActivityTaskFailedCause cause) {
        this.cause = cause.toString();
        return this;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision that resulted in the scheduling of this activity task.
     * This information can be useful for diagnosing problems by tracing back
     * the chain of events leading up to this event.
     *
     * @return The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision that resulted in the scheduling of this activity task.
     *         This information can be useful for diagnosing problems by tracing back
     *         the chain of events leading up to this event.
     */
    public Long getDecisionTaskCompletedEventId() {
        return decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision that resulted in the scheduling of this activity task.
     * This information can be useful for diagnosing problems by tracing back
     * the chain of events leading up to this event.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision that resulted in the scheduling of this activity task.
     *         This information can be useful for diagnosing problems by tracing back
     *         the chain of events leading up to this event.
     */
    public void setDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
    }
    
    /**
     * The id of the <code>DecisionTaskCompleted</code> event corresponding
     * to the decision that resulted in the scheduling of this activity task.
     * This information can be useful for diagnosing problems by tracing back
     * the chain of events leading up to this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param decisionTaskCompletedEventId The id of the <code>DecisionTaskCompleted</code> event corresponding
     *         to the decision that resulted in the scheduling of this activity task.
     *         This information can be useful for diagnosing problems by tracing back
     *         the chain of events leading up to this event.
     */
    public ScheduleActivityTaskFailedEventAttributes withDecisionTaskCompletedEventId(Long decisionTaskCompletedEventId) {
        this.decisionTaskCompletedEventId = decisionTaskCompletedEventId;
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
        if (getActivityType() != null) sb.append("ActivityType: " + getActivityType() + ",");
        if (getActivityId() != null) sb.append("ActivityId: " + getActivityId() + ",");
        if (getCause() != null) sb.append("Cause: " + getCause() + ",");
        if (getDecisionTaskCompletedEventId() != null) sb.append("DecisionTaskCompletedEventId: " + getDecisionTaskCompletedEventId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getActivityType() == null) ? 0 : getActivityType().hashCode()); 
        hashCode = prime * hashCode + ((getActivityId() == null) ? 0 : getActivityId().hashCode()); 
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode()); 
        hashCode = prime * hashCode + ((getDecisionTaskCompletedEventId() == null) ? 0 : getDecisionTaskCompletedEventId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScheduleActivityTaskFailedEventAttributes == false) return false;
        ScheduleActivityTaskFailedEventAttributes other = (ScheduleActivityTaskFailedEventAttributes)obj;
        
        if (other.getActivityType() == null ^ this.getActivityType() == null) return false;
        if (other.getActivityType() != null && other.getActivityType().equals(this.getActivityType()) == false) return false; 
        if (other.getActivityId() == null ^ this.getActivityId() == null) return false;
        if (other.getActivityId() != null && other.getActivityId().equals(this.getActivityId()) == false) return false; 
        if (other.getCause() == null ^ this.getCause() == null) return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false) return false; 
        if (other.getDecisionTaskCompletedEventId() == null ^ this.getDecisionTaskCompletedEventId() == null) return false;
        if (other.getDecisionTaskCompletedEventId() != null && other.getDecisionTaskCompletedEventId().equals(this.getDecisionTaskCompletedEventId()) == false) return false; 
        return true;
    }
    
}
    