/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute.models;


/**
 * Resource Id.
 */
public class VirtualMachineCaptureResult extends SubResource {
    /**
     * The properties property.
     */
    private VirtualMachineCaptureResultProperties properties;

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public VirtualMachineCaptureResultProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     */
    public void setProperties(VirtualMachineCaptureResultProperties properties) {
        this.properties = properties;
    }

}