/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleworkflow.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import org.codehaus.jackson.JsonToken;
import static org.codehaus.jackson.JsonToken.*;

/**
 * Activity Type Info JSON Unmarshaller
 */
public class ActivityTypeInfoJsonUnmarshaller implements Unmarshaller<ActivityTypeInfo, JsonUnmarshallerContext> {

    

    public ActivityTypeInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActivityTypeInfo activityTypeInfo = new ActivityTypeInfo();

        
        
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("activityType", targetDepth)) {
                    context.nextToken();
                    activityTypeInfo.setActivityType(ActivityTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    activityTypeInfo.setStatus(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    activityTypeInfo.setDescription(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    activityTypeInfo.setCreationDate(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("deprecationDate", targetDepth)) {
                    context.nextToken();
                    activityTypeInfo.setDeprecationDate(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getCurrentDepth() <= originalDepth) break;
            }
            token = context.nextToken();
        }
        
        return activityTypeInfo;
    }

    private static ActivityTypeInfoJsonUnmarshaller instance;
    public static ActivityTypeInfoJsonUnmarshaller getInstance() {
        if (instance == null) instance = new ActivityTypeInfoJsonUnmarshaller();
        return instance;
    }
}
    