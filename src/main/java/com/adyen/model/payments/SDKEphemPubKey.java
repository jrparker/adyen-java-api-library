/*
 * Adyen Payment API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payments;

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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.payments.JSON;

/**
 * SDKEphemPubKey
 */

public class SDKEphemPubKey {
  public static final String SERIALIZED_NAME_CRV = "crv";
  @SerializedName(SERIALIZED_NAME_CRV)
  private String crv;

  public static final String SERIALIZED_NAME_KTY = "kty";
  @SerializedName(SERIALIZED_NAME_KTY)
  private String kty;

  public static final String SERIALIZED_NAME_X = "x";
  @SerializedName(SERIALIZED_NAME_X)
  private String x;

  public static final String SERIALIZED_NAME_Y = "y";
  @SerializedName(SERIALIZED_NAME_Y)
  private String y;

  public SDKEphemPubKey() { 
  }

  public SDKEphemPubKey crv(String crv) {
    
    this.crv = crv;
    return this;
  }

   /**
   * The &#x60;crv&#x60; value as received from the 3D Secure 2 SDK.
   * @return crv
  **/

  @ApiModelProperty(value = "The `crv` value as received from the 3D Secure 2 SDK.")

  public String getCrv() {
    return crv;
  }


  public void setCrv(String crv) {
    this.crv = crv;
  }


  public SDKEphemPubKey kty(String kty) {
    
    this.kty = kty;
    return this;
  }

   /**
   * The &#x60;kty&#x60; value as received from the 3D Secure 2 SDK.
   * @return kty
  **/

  @ApiModelProperty(value = "The `kty` value as received from the 3D Secure 2 SDK.")

  public String getKty() {
    return kty;
  }


  public void setKty(String kty) {
    this.kty = kty;
  }


  public SDKEphemPubKey x(String x) {
    
    this.x = x;
    return this;
  }

   /**
   * The &#x60;x&#x60; value as received from the 3D Secure 2 SDK.
   * @return x
  **/

  @ApiModelProperty(value = "The `x` value as received from the 3D Secure 2 SDK.")

  public String getX() {
    return x;
  }


  public void setX(String x) {
    this.x = x;
  }


  public SDKEphemPubKey y(String y) {
    
    this.y = y;
    return this;
  }

   /**
   * The &#x60;y&#x60; value as received from the 3D Secure 2 SDK.
   * @return y
  **/

  @ApiModelProperty(value = "The `y` value as received from the 3D Secure 2 SDK.")

  public String getY() {
    return y;
  }


  public void setY(String y) {
    this.y = y;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SDKEphemPubKey sdKEphemPubKey = (SDKEphemPubKey) o;
    return Objects.equals(this.crv, sdKEphemPubKey.crv) &&
        Objects.equals(this.kty, sdKEphemPubKey.kty) &&
        Objects.equals(this.x, sdKEphemPubKey.x) &&
        Objects.equals(this.y, sdKEphemPubKey.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crv, kty, x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SDKEphemPubKey {\n");
    sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("crv");
    openapiFields.add("kty");
    openapiFields.add("x");
    openapiFields.add("y");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SDKEphemPubKey
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SDKEphemPubKey.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SDKEphemPubKey is not found in the empty JSON string", SDKEphemPubKey.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SDKEphemPubKey.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SDKEphemPubKey` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field crv
      if (jsonObj.get("crv") != null && !jsonObj.get("crv").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crv` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crv").toString()));
      }
      // validate the optional field kty
      if (jsonObj.get("kty") != null && !jsonObj.get("kty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `kty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("kty").toString()));
      }
      // validate the optional field x
      if (jsonObj.get("x") != null && !jsonObj.get("x").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `x` to be a primitive type in the JSON string but got `%s`", jsonObj.get("x").toString()));
      }
      // validate the optional field y
      if (jsonObj.get("y") != null && !jsonObj.get("y").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `y` to be a primitive type in the JSON string but got `%s`", jsonObj.get("y").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SDKEphemPubKey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SDKEphemPubKey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SDKEphemPubKey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SDKEphemPubKey.class));

       return (TypeAdapter<T>) new TypeAdapter<SDKEphemPubKey>() {
           @Override
           public void write(JsonWriter out, SDKEphemPubKey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SDKEphemPubKey read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SDKEphemPubKey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SDKEphemPubKey
  * @throws IOException if the JSON string is invalid with respect to SDKEphemPubKey
  */
  public static SDKEphemPubKey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SDKEphemPubKey.class);
  }

 /**
  * Convert an instance of SDKEphemPubKey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

