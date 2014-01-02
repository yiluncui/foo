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

package com.amazonaws.services.elastictranscoder.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Cancel Job Result JSON Unmarshaller
 */
public class CancelJobResultJsonUnmarshaller implements Unmarshaller<CancelJobResult, JsonUnmarshallerContext> {

    public CancelJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CancelJobResult cancelJobResult = new CancelJobResult();

        return cancelJobResult;
    }

    private static CancelJobResultJsonUnmarshaller instance;
    public static CancelJobResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new CancelJobResultJsonUnmarshaller();
        return instance;
    }
}
    