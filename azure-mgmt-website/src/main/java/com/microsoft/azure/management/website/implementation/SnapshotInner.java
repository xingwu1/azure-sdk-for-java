/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.website.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A snapshot of a web app.
 */
@JsonFlatten
public class SnapshotInner extends Resource {
    /**
     * The time the snapshot was taken.
     */
    @JsonProperty(value = "properties.time")
    private DateTime time;

    /**
     * Get the time value.
     *
     * @return the time value
     */
    public DateTime time() {
        return this.time;
    }

    /**
     * Set the time value.
     *
     * @param time the time value to set
     * @return the SnapshotInner object itself.
     */
    public SnapshotInner withTime(DateTime time) {
        this.time = time;
        return this;
    }

}
