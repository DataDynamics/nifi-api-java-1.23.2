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
 * ConnectionStatusPredictionsSnapshotDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class ConnectionStatusPredictionsSnapshotDTO {
  @SerializedName("predictedMillisUntilCountBackpressure")
  private Long predictedMillisUntilCountBackpressure = null;

  @SerializedName("predictedMillisUntilBytesBackpressure")
  private Long predictedMillisUntilBytesBackpressure = null;

  @SerializedName("predictionIntervalSeconds")
  private Integer predictionIntervalSeconds = null;

  @SerializedName("predictedCountAtNextInterval")
  private Integer predictedCountAtNextInterval = null;

  @SerializedName("predictedBytesAtNextInterval")
  private Long predictedBytesAtNextInterval = null;

  @SerializedName("predictedPercentCount")
  private Integer predictedPercentCount = null;

  @SerializedName("predictedPercentBytes")
  private Integer predictedPercentBytes = null;

  public ConnectionStatusPredictionsSnapshotDTO predictedMillisUntilCountBackpressure(Long predictedMillisUntilCountBackpressure) {
    this.predictedMillisUntilCountBackpressure = predictedMillisUntilCountBackpressure;
    return this;
  }

   /**
   * The predicted number of milliseconds before the connection will have backpressure applied, based on the queued count.
   * @return predictedMillisUntilCountBackpressure
  **/
  @ApiModelProperty(value = "The predicted number of milliseconds before the connection will have backpressure applied, based on the queued count.")
  public Long getPredictedMillisUntilCountBackpressure() {
    return predictedMillisUntilCountBackpressure;
  }

  public void setPredictedMillisUntilCountBackpressure(Long predictedMillisUntilCountBackpressure) {
    this.predictedMillisUntilCountBackpressure = predictedMillisUntilCountBackpressure;
  }

  public ConnectionStatusPredictionsSnapshotDTO predictedMillisUntilBytesBackpressure(Long predictedMillisUntilBytesBackpressure) {
    this.predictedMillisUntilBytesBackpressure = predictedMillisUntilBytesBackpressure;
    return this;
  }

   /**
   * The predicted number of milliseconds before the connection will have backpressure applied, based on the total number of bytes in the queue.
   * @return predictedMillisUntilBytesBackpressure
  **/
  @ApiModelProperty(value = "The predicted number of milliseconds before the connection will have backpressure applied, based on the total number of bytes in the queue.")
  public Long getPredictedMillisUntilBytesBackpressure() {
    return predictedMillisUntilBytesBackpressure;
  }

  public void setPredictedMillisUntilBytesBackpressure(Long predictedMillisUntilBytesBackpressure) {
    this.predictedMillisUntilBytesBackpressure = predictedMillisUntilBytesBackpressure;
  }

  public ConnectionStatusPredictionsSnapshotDTO predictionIntervalSeconds(Integer predictionIntervalSeconds) {
    this.predictionIntervalSeconds = predictionIntervalSeconds;
    return this;
  }

   /**
   * The configured interval (in seconds) for predicting connection queue count and size (and percent usage).
   * @return predictionIntervalSeconds
  **/
  @ApiModelProperty(value = "The configured interval (in seconds) for predicting connection queue count and size (and percent usage).")
  public Integer getPredictionIntervalSeconds() {
    return predictionIntervalSeconds;
  }

  public void setPredictionIntervalSeconds(Integer predictionIntervalSeconds) {
    this.predictionIntervalSeconds = predictionIntervalSeconds;
  }

  public ConnectionStatusPredictionsSnapshotDTO predictedCountAtNextInterval(Integer predictedCountAtNextInterval) {
    this.predictedCountAtNextInterval = predictedCountAtNextInterval;
    return this;
  }

   /**
   * The predicted number of queued objects at the next configured interval.
   * @return predictedCountAtNextInterval
  **/
  @ApiModelProperty(value = "The predicted number of queued objects at the next configured interval.")
  public Integer getPredictedCountAtNextInterval() {
    return predictedCountAtNextInterval;
  }

  public void setPredictedCountAtNextInterval(Integer predictedCountAtNextInterval) {
    this.predictedCountAtNextInterval = predictedCountAtNextInterval;
  }

  public ConnectionStatusPredictionsSnapshotDTO predictedBytesAtNextInterval(Long predictedBytesAtNextInterval) {
    this.predictedBytesAtNextInterval = predictedBytesAtNextInterval;
    return this;
  }

   /**
   * The predicted total number of bytes in the queue at the next configured interval.
   * @return predictedBytesAtNextInterval
  **/
  @ApiModelProperty(value = "The predicted total number of bytes in the queue at the next configured interval.")
  public Long getPredictedBytesAtNextInterval() {
    return predictedBytesAtNextInterval;
  }

  public void setPredictedBytesAtNextInterval(Long predictedBytesAtNextInterval) {
    this.predictedBytesAtNextInterval = predictedBytesAtNextInterval;
  }

  public ConnectionStatusPredictionsSnapshotDTO predictedPercentCount(Integer predictedPercentCount) {
    this.predictedPercentCount = predictedPercentCount;
    return this;
  }

   /**
   * Predicted connection percent use regarding queued flow files count and backpressure threshold if configured.
   * @return predictedPercentCount
  **/
  @ApiModelProperty(value = "Predicted connection percent use regarding queued flow files count and backpressure threshold if configured.")
  public Integer getPredictedPercentCount() {
    return predictedPercentCount;
  }

  public void setPredictedPercentCount(Integer predictedPercentCount) {
    this.predictedPercentCount = predictedPercentCount;
  }

  public ConnectionStatusPredictionsSnapshotDTO predictedPercentBytes(Integer predictedPercentBytes) {
    this.predictedPercentBytes = predictedPercentBytes;
    return this;
  }

   /**
   * Predicted connection percent use regarding queued flow files size and backpressure threshold if configured.
   * @return predictedPercentBytes
  **/
  @ApiModelProperty(value = "Predicted connection percent use regarding queued flow files size and backpressure threshold if configured.")
  public Integer getPredictedPercentBytes() {
    return predictedPercentBytes;
  }

  public void setPredictedPercentBytes(Integer predictedPercentBytes) {
    this.predictedPercentBytes = predictedPercentBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionStatusPredictionsSnapshotDTO connectionStatusPredictionsSnapshotDTO = (ConnectionStatusPredictionsSnapshotDTO) o;
    return Objects.equals(this.predictedMillisUntilCountBackpressure, connectionStatusPredictionsSnapshotDTO.predictedMillisUntilCountBackpressure) &&
        Objects.equals(this.predictedMillisUntilBytesBackpressure, connectionStatusPredictionsSnapshotDTO.predictedMillisUntilBytesBackpressure) &&
        Objects.equals(this.predictionIntervalSeconds, connectionStatusPredictionsSnapshotDTO.predictionIntervalSeconds) &&
        Objects.equals(this.predictedCountAtNextInterval, connectionStatusPredictionsSnapshotDTO.predictedCountAtNextInterval) &&
        Objects.equals(this.predictedBytesAtNextInterval, connectionStatusPredictionsSnapshotDTO.predictedBytesAtNextInterval) &&
        Objects.equals(this.predictedPercentCount, connectionStatusPredictionsSnapshotDTO.predictedPercentCount) &&
        Objects.equals(this.predictedPercentBytes, connectionStatusPredictionsSnapshotDTO.predictedPercentBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predictedMillisUntilCountBackpressure, predictedMillisUntilBytesBackpressure, predictionIntervalSeconds, predictedCountAtNextInterval, predictedBytesAtNextInterval, predictedPercentCount, predictedPercentBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionStatusPredictionsSnapshotDTO {\n");
    
    sb.append("    predictedMillisUntilCountBackpressure: ").append(toIndentedString(predictedMillisUntilCountBackpressure)).append("\n");
    sb.append("    predictedMillisUntilBytesBackpressure: ").append(toIndentedString(predictedMillisUntilBytesBackpressure)).append("\n");
    sb.append("    predictionIntervalSeconds: ").append(toIndentedString(predictionIntervalSeconds)).append("\n");
    sb.append("    predictedCountAtNextInterval: ").append(toIndentedString(predictedCountAtNextInterval)).append("\n");
    sb.append("    predictedBytesAtNextInterval: ").append(toIndentedString(predictedBytesAtNextInterval)).append("\n");
    sb.append("    predictedPercentCount: ").append(toIndentedString(predictedPercentCount)).append("\n");
    sb.append("    predictedPercentBytes: ").append(toIndentedString(predictedPercentBytes)).append("\n");
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

