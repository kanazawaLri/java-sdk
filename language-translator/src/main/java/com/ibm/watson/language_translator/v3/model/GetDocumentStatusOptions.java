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
package com.ibm.watson.language_translator.v3.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.Validator;

/**
 * The getDocumentStatus options.
 */
public class GetDocumentStatusOptions extends GenericModel {

  private String documentId;

  /**
   * Builder.
   */
  public static class Builder {
    private String documentId;

    private Builder(GetDocumentStatusOptions getDocumentStatusOptions) {
      this.documentId = getDocumentStatusOptions.documentId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param documentId the documentId
     */
    public Builder(String documentId) {
      this.documentId = documentId;
    }

    /**
     * Builds a GetDocumentStatusOptions.
     *
     * @return the getDocumentStatusOptions
     */
    public GetDocumentStatusOptions build() {
      return new GetDocumentStatusOptions(this);
    }

    /**
     * Set the documentId.
     *
     * @param documentId the documentId
     * @return the GetDocumentStatusOptions builder
     */
    public Builder documentId(String documentId) {
      this.documentId = documentId;
      return this;
    }
  }

  private GetDocumentStatusOptions(Builder builder) {
    Validator.notEmpty(builder.documentId, "documentId cannot be empty");
    documentId = builder.documentId;
  }

  /**
   * New builder.
   *
   * @return a GetDocumentStatusOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the documentId.
   *
   * The document ID of the document.
   *
   * @return the documentId
   */
  public String documentId() {
    return documentId;
  }
}
