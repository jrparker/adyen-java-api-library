/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.management.EventUrl;
import com.adyen.model.management.Key;
import com.adyen.model.management.NotificationUrl;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import com.adyen.model.management.JSON;

/**
 * Nexo
 */

public class Nexo {
  public static final String SERIALIZED_NAME_DISPLAY_URLS = "displayUrls";
  @SerializedName(SERIALIZED_NAME_DISPLAY_URLS)
  private NotificationUrl displayUrls;

  public static final String SERIALIZED_NAME_ENCRYPTION_KEY = "encryptionKey";
  @SerializedName(SERIALIZED_NAME_ENCRYPTION_KEY)
  private Key encryptionKey;

  public static final String SERIALIZED_NAME_EVENT_URLS = "eventUrls";
  @SerializedName(SERIALIZED_NAME_EVENT_URLS)
  private EventUrl eventUrls;

  public static final String SERIALIZED_NAME_NEXO_EVENT_URLS = "nexoEventUrls";
  @SerializedName(SERIALIZED_NAME_NEXO_EVENT_URLS)
  private List<String> nexoEventUrls = null;

  public Nexo() { 
  }

  public Nexo displayUrls(NotificationUrl displayUrls) {
    
    this.displayUrls = displayUrls;
    return this;
  }

   /**
   * Get displayUrls
   * @return displayUrls
  **/
  @ApiModelProperty(value = "")

  public NotificationUrl getDisplayUrls() {
    return displayUrls;
  }


  public void setDisplayUrls(NotificationUrl displayUrls) {
    this.displayUrls = displayUrls;
  }


  public Nexo encryptionKey(Key encryptionKey) {
    
    this.encryptionKey = encryptionKey;
    return this;
  }

   /**
   * Get encryptionKey
   * @return encryptionKey
  **/
  @ApiModelProperty(value = "")

  public Key getEncryptionKey() {
    return encryptionKey;
  }


  public void setEncryptionKey(Key encryptionKey) {
    this.encryptionKey = encryptionKey;
  }


  public Nexo eventUrls(EventUrl eventUrls) {
    
    this.eventUrls = eventUrls;
    return this;
  }

   /**
   * Get eventUrls
   * @return eventUrls
  **/
  @ApiModelProperty(value = "")

  public EventUrl getEventUrls() {
    return eventUrls;
  }


  public void setEventUrls(EventUrl eventUrls) {
    this.eventUrls = eventUrls;
  }


  public Nexo nexoEventUrls(List<String> nexoEventUrls) {
    
    this.nexoEventUrls = nexoEventUrls;
    return this;
  }

  public Nexo addNexoEventUrlsItem(String nexoEventUrlsItem) {
    if (this.nexoEventUrls == null) {
      this.nexoEventUrls = new ArrayList<>();
    }
    this.nexoEventUrls.add(nexoEventUrlsItem);
    return this;
  }

   /**
   * One or more URLs to send event messages to when using Terminal API.
   * @return nexoEventUrls
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "One or more URLs to send event messages to when using Terminal API.")

  public List<String> getNexoEventUrls() {
    return nexoEventUrls;
  }


  public void setNexoEventUrls(List<String> nexoEventUrls) {
    this.nexoEventUrls = nexoEventUrls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Nexo nexo = (Nexo) o;
    return Objects.equals(this.displayUrls, nexo.displayUrls) &&
        Objects.equals(this.encryptionKey, nexo.encryptionKey) &&
        Objects.equals(this.eventUrls, nexo.eventUrls) &&
        Objects.equals(this.nexoEventUrls, nexo.nexoEventUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayUrls, encryptionKey, eventUrls, nexoEventUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Nexo {\n");
    sb.append("    displayUrls: ").append(toIndentedString(displayUrls)).append("\n");
    sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
    sb.append("    eventUrls: ").append(toIndentedString(eventUrls)).append("\n");
    sb.append("    nexoEventUrls: ").append(toIndentedString(nexoEventUrls)).append("\n");
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
    openapiFields.add("displayUrls");
    openapiFields.add("encryptionKey");
    openapiFields.add("eventUrls");
    openapiFields.add("nexoEventUrls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Nexo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Nexo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Nexo is not found in the empty JSON string", Nexo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Nexo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Nexo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `displayUrls`
      if (jsonObj.getAsJsonObject("displayUrls") != null) {
        NotificationUrl.validateJsonObject(jsonObj.getAsJsonObject("displayUrls"));
      }
      // validate the optional field `encryptionKey`
      if (jsonObj.getAsJsonObject("encryptionKey") != null) {
        Key.validateJsonObject(jsonObj.getAsJsonObject("encryptionKey"));
      }
      // validate the optional field `eventUrls`
      if (jsonObj.getAsJsonObject("eventUrls") != null) {
        EventUrl.validateJsonObject(jsonObj.getAsJsonObject("eventUrls"));
      }
      // ensure the json data is an array
      if (jsonObj.get("nexoEventUrls") != null && !jsonObj.get("nexoEventUrls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `nexoEventUrls` to be an array in the JSON string but got `%s`", jsonObj.get("nexoEventUrls").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Nexo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Nexo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Nexo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Nexo.class));

       return (TypeAdapter<T>) new TypeAdapter<Nexo>() {
           @Override
           public void write(JsonWriter out, Nexo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Nexo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Nexo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Nexo
  * @throws IOException if the JSON string is invalid with respect to Nexo
  */
  public static Nexo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Nexo.class);
  }

 /**
  * Convert an instance of Nexo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

