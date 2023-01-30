/*
 * Adyen Recurring API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.recurring;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.recurring.Amount;
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

import com.adyen.model.recurring.JSON;

/**
 * PermitRestriction
 */

public class PermitRestriction {
  public static final String SERIALIZED_NAME_MAX_AMOUNT = "maxAmount";
  @SerializedName(SERIALIZED_NAME_MAX_AMOUNT)
  private Amount maxAmount;

  public static final String SERIALIZED_NAME_SINGLE_TRANSACTION_LIMIT = "singleTransactionLimit";
  @SerializedName(SERIALIZED_NAME_SINGLE_TRANSACTION_LIMIT)
  private Amount singleTransactionLimit;

  public static final String SERIALIZED_NAME_SINGLE_USE = "singleUse";
  @SerializedName(SERIALIZED_NAME_SINGLE_USE)
  private Boolean singleUse;

  public PermitRestriction() { 
  }

  public PermitRestriction maxAmount(Amount maxAmount) {
    
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * Get maxAmount
   * @return maxAmount
  **/

  @ApiModelProperty(value = "")

  public Amount getMaxAmount() {
    return maxAmount;
  }


  public void setMaxAmount(Amount maxAmount) {
    this.maxAmount = maxAmount;
  }


  public PermitRestriction singleTransactionLimit(Amount singleTransactionLimit) {
    
    this.singleTransactionLimit = singleTransactionLimit;
    return this;
  }

   /**
   * Get singleTransactionLimit
   * @return singleTransactionLimit
  **/

  @ApiModelProperty(value = "")

  public Amount getSingleTransactionLimit() {
    return singleTransactionLimit;
  }


  public void setSingleTransactionLimit(Amount singleTransactionLimit) {
    this.singleTransactionLimit = singleTransactionLimit;
  }


  public PermitRestriction singleUse(Boolean singleUse) {
    
    this.singleUse = singleUse;
    return this;
  }

   /**
   * Only a single payment can be made using this permit if set to true, otherwise multiple payments are allowed.
   * @return singleUse
  **/

  @ApiModelProperty(value = "Only a single payment can be made using this permit if set to true, otherwise multiple payments are allowed.")

  public Boolean getSingleUse() {
    return singleUse;
  }


  public void setSingleUse(Boolean singleUse) {
    this.singleUse = singleUse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermitRestriction permitRestriction = (PermitRestriction) o;
    return Objects.equals(this.maxAmount, permitRestriction.maxAmount) &&
        Objects.equals(this.singleTransactionLimit, permitRestriction.singleTransactionLimit) &&
        Objects.equals(this.singleUse, permitRestriction.singleUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxAmount, singleTransactionLimit, singleUse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermitRestriction {\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    singleTransactionLimit: ").append(toIndentedString(singleTransactionLimit)).append("\n");
    sb.append("    singleUse: ").append(toIndentedString(singleUse)).append("\n");
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
    openapiFields.add("maxAmount");
    openapiFields.add("singleTransactionLimit");
    openapiFields.add("singleUse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PermitRestriction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PermitRestriction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PermitRestriction is not found in the empty JSON string", PermitRestriction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PermitRestriction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PermitRestriction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `maxAmount`
      if (jsonObj.getAsJsonObject("maxAmount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("maxAmount"));
      }
      // validate the optional field `singleTransactionLimit`
      if (jsonObj.getAsJsonObject("singleTransactionLimit") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("singleTransactionLimit"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PermitRestriction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PermitRestriction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PermitRestriction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PermitRestriction.class));

       return (TypeAdapter<T>) new TypeAdapter<PermitRestriction>() {
           @Override
           public void write(JsonWriter out, PermitRestriction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PermitRestriction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PermitRestriction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PermitRestriction
  * @throws IOException if the JSON string is invalid with respect to PermitRestriction
  */
  public static PermitRestriction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PermitRestriction.class);
  }

 /**
  * Convert an instance of PermitRestriction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

