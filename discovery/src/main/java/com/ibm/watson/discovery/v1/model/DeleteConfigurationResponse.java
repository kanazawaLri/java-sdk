/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.discovery.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DeleteConfigurationResponse.
 */
public class DeleteConfigurationResponse extends GenericModel {

  /**
   * Status of the configuration. A deleted configuration has the status deleted.
   */
  public interface Status {
    /** deleted. */
    String DELETED = "deleted";
  }

  @SerializedName("configuration_id")
  private String configurationId;
  private String status;
  private List<Notice> notices;

  /**
   * Gets the configurationId.
   *
   * The unique identifier for the configuration.
   *
   * @return the configurationId
   */
  public String getConfigurationId() {
    return configurationId;
  }

  /**
   * Gets the status.
   *
   * Status of the configuration. A deleted configuration has the status deleted.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the notices.
   *
   * An array of notice messages, if any.
   *
   * @return the notices
   */
  public List<Notice> getNotices() {
    return notices;
  }
}
