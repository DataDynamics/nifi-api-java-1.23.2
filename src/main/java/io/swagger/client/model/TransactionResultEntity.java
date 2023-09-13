/*
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.23.2
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TransactionResultEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class TransactionResultEntity {
  @SerializedName("flowFileSent")
  private Integer flowFileSent = null;

  @SerializedName("responseCode")
  private Integer responseCode = null;

  @SerializedName("message")
  private String message = null;

  public TransactionResultEntity flowFileSent(Integer flowFileSent) {
    this.flowFileSent = flowFileSent;
    return this;
  }

   /**
   * Get flowFileSent
   * @return flowFileSent
  **/
  @ApiModelProperty(value = "")
  public Integer getFlowFileSent() {
    return flowFileSent;
  }

  public void setFlowFileSent(Integer flowFileSent) {
    this.flowFileSent = flowFileSent;
  }

  public TransactionResultEntity responseCode(Integer responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  @ApiModelProperty(value = "")
  public Integer getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }

  public TransactionResultEntity message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResultEntity transactionResultEntity = (TransactionResultEntity) o;
    return Objects.equals(this.flowFileSent, transactionResultEntity.flowFileSent) &&
        Objects.equals(this.responseCode, transactionResultEntity.responseCode) &&
        Objects.equals(this.message, transactionResultEntity.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowFileSent, responseCode, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResultEntity {\n");
    
    sb.append("    flowFileSent: ").append(toIndentedString(flowFileSent)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
