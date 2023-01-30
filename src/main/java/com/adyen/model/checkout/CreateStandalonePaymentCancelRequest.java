/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 69
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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

import com.adyen.model.checkout.JSON;

/**
 * CreateStandalonePaymentCancelRequest
 */

public class CreateStandalonePaymentCancelRequest {
  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_PAYMENT_REFERENCE = "paymentReference";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REFERENCE)
  private String paymentReference;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public CreateStandalonePaymentCancelRequest() { 
  }

  public CreateStandalonePaymentCancelRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account that is used to process the payment.
   * @return merchantAccount
  **/
  
  @ApiModelProperty(required = true, value = "The merchant account that is used to process the payment.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public CreateStandalonePaymentCancelRequest paymentReference(String paymentReference) {
    
    this.paymentReference = paymentReference;
    return this;
  }

   /**
   * The [&#x60;reference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__reqParam_reference) of the payment that you want to cancel.
   * @return paymentReference
  **/
  
  @ApiModelProperty(required = true, value = "The [`reference`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__reqParam_reference) of the payment that you want to cancel.")

  public String getPaymentReference() {
    return paymentReference;
  }


  public void setPaymentReference(String paymentReference) {
    this.paymentReference = paymentReference;
  }


  public CreateStandalonePaymentCancelRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the cancel request. Maximum length: 80 characters.
   * @return reference
  **/

  @ApiModelProperty(value = "Your reference for the cancel request. Maximum length: 80 characters.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateStandalonePaymentCancelRequest createStandalonePaymentCancelRequest = (CreateStandalonePaymentCancelRequest) o;
    return Objects.equals(this.merchantAccount, createStandalonePaymentCancelRequest.merchantAccount) &&
        Objects.equals(this.paymentReference, createStandalonePaymentCancelRequest.paymentReference) &&
        Objects.equals(this.reference, createStandalonePaymentCancelRequest.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantAccount, paymentReference, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStandalonePaymentCancelRequest {\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    paymentReference: ").append(toIndentedString(paymentReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
    openapiFields.add("merchantAccount");
    openapiFields.add("paymentReference");
    openapiFields.add("reference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("merchantAccount");
    openapiRequiredFields.add("paymentReference");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateStandalonePaymentCancelRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateStandalonePaymentCancelRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateStandalonePaymentCancelRequest is not found in the empty JSON string", CreateStandalonePaymentCancelRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateStandalonePaymentCancelRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateStandalonePaymentCancelRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateStandalonePaymentCancelRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field paymentReference
      if (jsonObj.get("paymentReference") != null && !jsonObj.get("paymentReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentReference").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateStandalonePaymentCancelRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateStandalonePaymentCancelRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateStandalonePaymentCancelRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateStandalonePaymentCancelRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateStandalonePaymentCancelRequest>() {
           @Override
           public void write(JsonWriter out, CreateStandalonePaymentCancelRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateStandalonePaymentCancelRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateStandalonePaymentCancelRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateStandalonePaymentCancelRequest
  * @throws IOException if the JSON string is invalid with respect to CreateStandalonePaymentCancelRequest
  */
  public static CreateStandalonePaymentCancelRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateStandalonePaymentCancelRequest.class);
  }

 /**
  * Convert an instance of CreateStandalonePaymentCancelRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

