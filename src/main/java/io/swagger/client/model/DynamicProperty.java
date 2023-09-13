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
 * DynamicProperty
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T23:19:14.614+09:00")
public class DynamicProperty {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("description")
  private String description = null;

  /**
   * The scope of the expression language support
   */
  @JsonAdapter(ExpressionLanguageScopeEnum.Adapter.class)
  public enum ExpressionLanguageScopeEnum {
    NONE("NONE"),
    
    VARIABLE_REGISTRY("VARIABLE_REGISTRY"),
    
    FLOWFILE_ATTRIBUTES("FLOWFILE_ATTRIBUTES");

    private String value;

    ExpressionLanguageScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExpressionLanguageScopeEnum fromValue(String text) {
      for (ExpressionLanguageScopeEnum b : ExpressionLanguageScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ExpressionLanguageScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExpressionLanguageScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExpressionLanguageScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ExpressionLanguageScopeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("expressionLanguageScope")
  private ExpressionLanguageScopeEnum expressionLanguageScope = null;

  public DynamicProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The description of the dynamic property name
   * @return name
  **/
  @ApiModelProperty(value = "The description of the dynamic property name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DynamicProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The description of the dynamic property value
   * @return value
  **/
  @ApiModelProperty(value = "The description of the dynamic property value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public DynamicProperty description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the dynamic property
   * @return description
  **/
  @ApiModelProperty(value = "The description of the dynamic property")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DynamicProperty expressionLanguageScope(ExpressionLanguageScopeEnum expressionLanguageScope) {
    this.expressionLanguageScope = expressionLanguageScope;
    return this;
  }

   /**
   * The scope of the expression language support
   * @return expressionLanguageScope
  **/
  @ApiModelProperty(value = "The scope of the expression language support")
  public ExpressionLanguageScopeEnum getExpressionLanguageScope() {
    return expressionLanguageScope;
  }

  public void setExpressionLanguageScope(ExpressionLanguageScopeEnum expressionLanguageScope) {
    this.expressionLanguageScope = expressionLanguageScope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicProperty dynamicProperty = (DynamicProperty) o;
    return Objects.equals(this.name, dynamicProperty.name) &&
        Objects.equals(this.value, dynamicProperty.value) &&
        Objects.equals(this.description, dynamicProperty.description) &&
        Objects.equals(this.expressionLanguageScope, dynamicProperty.expressionLanguageScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, description, expressionLanguageScope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicProperty {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expressionLanguageScope: ").append(toIndentedString(expressionLanguageScope)).append("\n");
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

