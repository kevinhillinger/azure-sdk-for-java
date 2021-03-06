/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for TrafficRoutingMethod.
 */
public final class TrafficRoutingMethod {
    /** Static value Performance for TrafficRoutingMethod. */
    public static final TrafficRoutingMethod PERFORMANCE = new TrafficRoutingMethod("Performance");

    /** Static value Priority for TrafficRoutingMethod. */
    public static final TrafficRoutingMethod PRIORITY = new TrafficRoutingMethod("Priority");

    /** Static value Weighted for TrafficRoutingMethod. */
    public static final TrafficRoutingMethod WEIGHTED = new TrafficRoutingMethod("Weighted");

    /** Static value Geographic for TrafficRoutingMethod. */
    public static final TrafficRoutingMethod GEOGRAPHIC = new TrafficRoutingMethod("Geographic");

    private String value;

    /**
     * Creates a custom value for TrafficRoutingMethod.
     * @param value the custom value
     */
    public TrafficRoutingMethod(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TrafficRoutingMethod)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        TrafficRoutingMethod rhs = (TrafficRoutingMethod) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
