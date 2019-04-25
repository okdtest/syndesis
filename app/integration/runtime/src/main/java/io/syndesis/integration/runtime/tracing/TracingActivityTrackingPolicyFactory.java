/*
 * Copyright (C) 2016 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.syndesis.integration.runtime.tracing;

import org.apache.camel.spi.RoutePolicy;

import io.opentracing.Tracer;
import io.syndesis.integration.runtime.ActivityTrackingPolicyFactory;

/**
 * Created by chirino on 12/7/18.
 */
public class TracingActivityTrackingPolicyFactory implements ActivityTrackingPolicyFactory {
    private final Tracer tracer;

    public TracingActivityTrackingPolicyFactory(Tracer tracer) {
        this.tracer = tracer;
    }

    @Override
    public RoutePolicy createRoutePolicy(String flowId) {
        return new TracingActivityTrackingPolicy(tracer, flowId);
    }

    @Override
    public boolean isInstance(RoutePolicy routePolicy) {
        return TracingActivityTrackingPolicy.class.isInstance(routePolicy);
    }
}
