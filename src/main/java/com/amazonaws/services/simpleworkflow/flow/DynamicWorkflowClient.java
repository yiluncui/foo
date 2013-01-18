/*
 * Copyright 2012-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;


public interface DynamicWorkflowClient extends WorkflowClient {

    <T> Promise<T> startWorkflowExecution(final Promise<Object>[] arguments,
            final StartWorkflowOptions startOptionsOverride, final Class<T> returnType, final Promise<?>... waitFor);
    
    <T> Promise<T> startWorkflowExecution(final Object[] arguments, final StartWorkflowOptions startOptionsOverride,
            final Class<T> returnType, Promise<?>... waitFor);

    void signalWorkflowExecution(String signalName, Object[] arguments, Promise<?>... waitFor);

}
