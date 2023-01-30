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

import com.adyen.model.management.JSON;

/**
 * ReceiptPrinting
 */

public class ReceiptPrinting {
  public static final String SERIALIZED_NAME_MERCHANT_APPROVED = "merchantApproved";
  @SerializedName(SERIALIZED_NAME_MERCHANT_APPROVED)
  private Boolean merchantApproved;

  public static final String SERIALIZED_NAME_MERCHANT_CANCELLED = "merchantCancelled";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CANCELLED)
  private Boolean merchantCancelled;

  public static final String SERIALIZED_NAME_MERCHANT_CAPTURE_APPROVED = "merchantCaptureApproved";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CAPTURE_APPROVED)
  private Boolean merchantCaptureApproved;

  public static final String SERIALIZED_NAME_MERCHANT_CAPTURE_REFUSED = "merchantCaptureRefused";
  @SerializedName(SERIALIZED_NAME_MERCHANT_CAPTURE_REFUSED)
  private Boolean merchantCaptureRefused;

  public static final String SERIALIZED_NAME_MERCHANT_REFUND_APPROVED = "merchantRefundApproved";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFUND_APPROVED)
  private Boolean merchantRefundApproved;

  public static final String SERIALIZED_NAME_MERCHANT_REFUND_REFUSED = "merchantRefundRefused";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFUND_REFUSED)
  private Boolean merchantRefundRefused;

  public static final String SERIALIZED_NAME_MERCHANT_REFUSED = "merchantRefused";
  @SerializedName(SERIALIZED_NAME_MERCHANT_REFUSED)
  private Boolean merchantRefused;

  public static final String SERIALIZED_NAME_MERCHANT_VOID = "merchantVoid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_VOID)
  private Boolean merchantVoid;

  public static final String SERIALIZED_NAME_SHOPPER_APPROVED = "shopperApproved";
  @SerializedName(SERIALIZED_NAME_SHOPPER_APPROVED)
  private Boolean shopperApproved;

  public static final String SERIALIZED_NAME_SHOPPER_CANCELLED = "shopperCancelled";
  @SerializedName(SERIALIZED_NAME_SHOPPER_CANCELLED)
  private Boolean shopperCancelled;

  public static final String SERIALIZED_NAME_SHOPPER_CAPTURE_APPROVED = "shopperCaptureApproved";
  @SerializedName(SERIALIZED_NAME_SHOPPER_CAPTURE_APPROVED)
  private Boolean shopperCaptureApproved;

  public static final String SERIALIZED_NAME_SHOPPER_CAPTURE_REFUSED = "shopperCaptureRefused";
  @SerializedName(SERIALIZED_NAME_SHOPPER_CAPTURE_REFUSED)
  private Boolean shopperCaptureRefused;

  public static final String SERIALIZED_NAME_SHOPPER_REFUND_APPROVED = "shopperRefundApproved";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFUND_APPROVED)
  private Boolean shopperRefundApproved;

  public static final String SERIALIZED_NAME_SHOPPER_REFUND_REFUSED = "shopperRefundRefused";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFUND_REFUSED)
  private Boolean shopperRefundRefused;

  public static final String SERIALIZED_NAME_SHOPPER_REFUSED = "shopperRefused";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFUSED)
  private Boolean shopperRefused;

  public static final String SERIALIZED_NAME_SHOPPER_VOID = "shopperVoid";
  @SerializedName(SERIALIZED_NAME_SHOPPER_VOID)
  private Boolean shopperVoid;

  public ReceiptPrinting() { 
  }

  public ReceiptPrinting merchantApproved(Boolean merchantApproved) {
    
    this.merchantApproved = merchantApproved;
    return this;
  }

   /**
   * Print a merchant receipt when the payment is approved.
   * @return merchantApproved
  **/
  
  @ApiModelProperty(value = "Print a merchant receipt when the payment is approved.")

  public Boolean getMerchantApproved() {
    return merchantApproved;
  }


  public void setMerchantApproved(Boolean merchantApproved) {
    this.merchantApproved = merchantApproved;
  }


  public ReceiptPrinting merchantCancelled(Boolean merchantCancelled) {
    
    this.merchantCancelled = merchantCancelled;
    return this;
  }

   /**
   * Print a merchant receipt when the transaction is cancelled.
   * @return merchantCancelled
  **/
  
  @ApiModelProperty(value = "Print a merchant receipt when the transaction is cancelled.")

  public Boolean getMerchantCancelled() {
    return merchantCancelled;
  }


  public void setMerchantCancelled(Boolean merchantCancelled) {
    this.merchantCancelled = merchantCancelled;
  }


  public ReceiptPrinting merchantCaptureApproved(Boolean merchantCaptureApproved) {
    
    this.merchantCaptureApproved = merchantCaptureApproved;
    return this;
  }

   /**
   * Print a merchant receipt when capturing the payment is approved.
   * @return merchantCaptureApproved
  **/
  
  @ApiModelProperty(value = "Print a merchant receipt when capturing the payment is approved.")

  public Boolean getMerchantCaptureApproved() {
    return merchantCaptureApproved;
  }


  public void setMerchantCaptureApproved(Boolean merchantCaptureApproved) {
    this.merchantCaptureApproved = merchantCaptureApproved;
  }


  public ReceiptPrinting merchantCaptureRefused(Boolean merchantCaptureRefused) {
    
    this.merchantCaptureRefused = merchantCaptureRefused;
    return this;
  }

   /**
   * Print a merchant receipt when capturing the payment is refused.
   * @return merchantCaptureRefused
  **/
  
  @ApiModelProperty(value = "Print a merchant receipt when capturing the payment is refused.")

  public Boolean getMerchantCaptureRefused() {
    return merchantCaptureRefused;
  }


  public void setMerchantCaptureRefused(Boolean merchantCaptureRefused) {
    this.merchantCaptureRefused = merchantCaptureRefused;
  }


  public ReceiptPrinting merchantRefundApproved(Boolean merchantRefundApproved) {
    
    this.merchantRefundApproved = merchantRefundApproved;
    return this;
  }

   /**
   * Print a merchant receipt when the refund is approved.
   * @return merchantRefundApproved
  **/
  
  @ApiModelProperty(value = "Print a merchant receipt when the refund is approved.")

  public Boolean getMerchantRefundApproved() {
    return merchantRefundApproved;
  }


  public void setMerchantRefundApproved(Boolean merchantRefundApproved) {
    this.merchantRefundApproved = merchantRefundApproved;
  }


  public ReceiptPrinting merchantRefundRefused(Boolean merchantRefundRefused) {
    
    this.merchantRefundRefused = merchantRefundRefused;
    return this;
  }

   /**
   * Print a merchant receipt when the refund is refused.
   * @return merchantRefundRefused
  **/
  
  @ApiModelProperty(value = "Print a merchant receipt when the refund is refused.")

  public Boolean getMerchantRefundRefused() {
    return merchantRefundRefused;
  }


  public void setMerchantRefundRefused(Boolean merchantRefundRefused) {
    this.merchantRefundRefused = merchantRefundRefused;
  }


  public ReceiptPrinting merchantRefused(Boolean merchantRefused) {
    
    this.merchantRefused = merchantRefused;
    return this;
  }

   /**
   * Print a merchant receipt when the payment is refused.
   * @return merchantRefused
  **/
  
  @ApiModelProperty(value = "Print a merchant receipt when the payment is refused.")

  public Boolean getMerchantRefused() {
    return merchantRefused;
  }


  public void setMerchantRefused(Boolean merchantRefused) {
    this.merchantRefused = merchantRefused;
  }


  public ReceiptPrinting merchantVoid(Boolean merchantVoid) {
    
    this.merchantVoid = merchantVoid;
    return this;
  }

   /**
   * Print a merchant receipt when a previous transaction is voided.
   * @return merchantVoid
  **/
  
  @ApiModelProperty(value = "Print a merchant receipt when a previous transaction is voided.")

  public Boolean getMerchantVoid() {
    return merchantVoid;
  }


  public void setMerchantVoid(Boolean merchantVoid) {
    this.merchantVoid = merchantVoid;
  }


  public ReceiptPrinting shopperApproved(Boolean shopperApproved) {
    
    this.shopperApproved = shopperApproved;
    return this;
  }

   /**
   * Print a shopper receipt when the payment is approved.
   * @return shopperApproved
  **/
  
  @ApiModelProperty(value = "Print a shopper receipt when the payment is approved.")

  public Boolean getShopperApproved() {
    return shopperApproved;
  }


  public void setShopperApproved(Boolean shopperApproved) {
    this.shopperApproved = shopperApproved;
  }


  public ReceiptPrinting shopperCancelled(Boolean shopperCancelled) {
    
    this.shopperCancelled = shopperCancelled;
    return this;
  }

   /**
   * Print a shopper receipt when the transaction is cancelled.
   * @return shopperCancelled
  **/
  
  @ApiModelProperty(value = "Print a shopper receipt when the transaction is cancelled.")

  public Boolean getShopperCancelled() {
    return shopperCancelled;
  }


  public void setShopperCancelled(Boolean shopperCancelled) {
    this.shopperCancelled = shopperCancelled;
  }


  public ReceiptPrinting shopperCaptureApproved(Boolean shopperCaptureApproved) {
    
    this.shopperCaptureApproved = shopperCaptureApproved;
    return this;
  }

   /**
   * Print a shopper receipt when capturing the payment is approved.
   * @return shopperCaptureApproved
  **/
  
  @ApiModelProperty(value = "Print a shopper receipt when capturing the payment is approved.")

  public Boolean getShopperCaptureApproved() {
    return shopperCaptureApproved;
  }


  public void setShopperCaptureApproved(Boolean shopperCaptureApproved) {
    this.shopperCaptureApproved = shopperCaptureApproved;
  }


  public ReceiptPrinting shopperCaptureRefused(Boolean shopperCaptureRefused) {
    
    this.shopperCaptureRefused = shopperCaptureRefused;
    return this;
  }

   /**
   * Print a shopper receipt when capturing the payment is refused.
   * @return shopperCaptureRefused
  **/
  
  @ApiModelProperty(value = "Print a shopper receipt when capturing the payment is refused.")

  public Boolean getShopperCaptureRefused() {
    return shopperCaptureRefused;
  }


  public void setShopperCaptureRefused(Boolean shopperCaptureRefused) {
    this.shopperCaptureRefused = shopperCaptureRefused;
  }


  public ReceiptPrinting shopperRefundApproved(Boolean shopperRefundApproved) {
    
    this.shopperRefundApproved = shopperRefundApproved;
    return this;
  }

   /**
   * Print a shopper receipt when the refund is approved.
   * @return shopperRefundApproved
  **/
  
  @ApiModelProperty(value = "Print a shopper receipt when the refund is approved.")

  public Boolean getShopperRefundApproved() {
    return shopperRefundApproved;
  }


  public void setShopperRefundApproved(Boolean shopperRefundApproved) {
    this.shopperRefundApproved = shopperRefundApproved;
  }


  public ReceiptPrinting shopperRefundRefused(Boolean shopperRefundRefused) {
    
    this.shopperRefundRefused = shopperRefundRefused;
    return this;
  }

   /**
   * Print a shopper receipt when the refund is refused.
   * @return shopperRefundRefused
  **/
  
  @ApiModelProperty(value = "Print a shopper receipt when the refund is refused.")

  public Boolean getShopperRefundRefused() {
    return shopperRefundRefused;
  }


  public void setShopperRefundRefused(Boolean shopperRefundRefused) {
    this.shopperRefundRefused = shopperRefundRefused;
  }


  public ReceiptPrinting shopperRefused(Boolean shopperRefused) {
    
    this.shopperRefused = shopperRefused;
    return this;
  }

   /**
   * Print a shopper receipt when the payment is refused.
   * @return shopperRefused
  **/
  
  @ApiModelProperty(value = "Print a shopper receipt when the payment is refused.")

  public Boolean getShopperRefused() {
    return shopperRefused;
  }


  public void setShopperRefused(Boolean shopperRefused) {
    this.shopperRefused = shopperRefused;
  }


  public ReceiptPrinting shopperVoid(Boolean shopperVoid) {
    
    this.shopperVoid = shopperVoid;
    return this;
  }

   /**
   * Print a shopper receipt when a previous transaction is voided.
   * @return shopperVoid
  **/
  
  @ApiModelProperty(value = "Print a shopper receipt when a previous transaction is voided.")

  public Boolean getShopperVoid() {
    return shopperVoid;
  }


  public void setShopperVoid(Boolean shopperVoid) {
    this.shopperVoid = shopperVoid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptPrinting receiptPrinting = (ReceiptPrinting) o;
    return Objects.equals(this.merchantApproved, receiptPrinting.merchantApproved) &&
        Objects.equals(this.merchantCancelled, receiptPrinting.merchantCancelled) &&
        Objects.equals(this.merchantCaptureApproved, receiptPrinting.merchantCaptureApproved) &&
        Objects.equals(this.merchantCaptureRefused, receiptPrinting.merchantCaptureRefused) &&
        Objects.equals(this.merchantRefundApproved, receiptPrinting.merchantRefundApproved) &&
        Objects.equals(this.merchantRefundRefused, receiptPrinting.merchantRefundRefused) &&
        Objects.equals(this.merchantRefused, receiptPrinting.merchantRefused) &&
        Objects.equals(this.merchantVoid, receiptPrinting.merchantVoid) &&
        Objects.equals(this.shopperApproved, receiptPrinting.shopperApproved) &&
        Objects.equals(this.shopperCancelled, receiptPrinting.shopperCancelled) &&
        Objects.equals(this.shopperCaptureApproved, receiptPrinting.shopperCaptureApproved) &&
        Objects.equals(this.shopperCaptureRefused, receiptPrinting.shopperCaptureRefused) &&
        Objects.equals(this.shopperRefundApproved, receiptPrinting.shopperRefundApproved) &&
        Objects.equals(this.shopperRefundRefused, receiptPrinting.shopperRefundRefused) &&
        Objects.equals(this.shopperRefused, receiptPrinting.shopperRefused) &&
        Objects.equals(this.shopperVoid, receiptPrinting.shopperVoid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantApproved, merchantCancelled, merchantCaptureApproved, merchantCaptureRefused, merchantRefundApproved, merchantRefundRefused, merchantRefused, merchantVoid, shopperApproved, shopperCancelled, shopperCaptureApproved, shopperCaptureRefused, shopperRefundApproved, shopperRefundRefused, shopperRefused, shopperVoid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptPrinting {\n");
    sb.append("    merchantApproved: ").append(toIndentedString(merchantApproved)).append("\n");
    sb.append("    merchantCancelled: ").append(toIndentedString(merchantCancelled)).append("\n");
    sb.append("    merchantCaptureApproved: ").append(toIndentedString(merchantCaptureApproved)).append("\n");
    sb.append("    merchantCaptureRefused: ").append(toIndentedString(merchantCaptureRefused)).append("\n");
    sb.append("    merchantRefundApproved: ").append(toIndentedString(merchantRefundApproved)).append("\n");
    sb.append("    merchantRefundRefused: ").append(toIndentedString(merchantRefundRefused)).append("\n");
    sb.append("    merchantRefused: ").append(toIndentedString(merchantRefused)).append("\n");
    sb.append("    merchantVoid: ").append(toIndentedString(merchantVoid)).append("\n");
    sb.append("    shopperApproved: ").append(toIndentedString(shopperApproved)).append("\n");
    sb.append("    shopperCancelled: ").append(toIndentedString(shopperCancelled)).append("\n");
    sb.append("    shopperCaptureApproved: ").append(toIndentedString(shopperCaptureApproved)).append("\n");
    sb.append("    shopperCaptureRefused: ").append(toIndentedString(shopperCaptureRefused)).append("\n");
    sb.append("    shopperRefundApproved: ").append(toIndentedString(shopperRefundApproved)).append("\n");
    sb.append("    shopperRefundRefused: ").append(toIndentedString(shopperRefundRefused)).append("\n");
    sb.append("    shopperRefused: ").append(toIndentedString(shopperRefused)).append("\n");
    sb.append("    shopperVoid: ").append(toIndentedString(shopperVoid)).append("\n");
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
    openapiFields.add("merchantApproved");
    openapiFields.add("merchantCancelled");
    openapiFields.add("merchantCaptureApproved");
    openapiFields.add("merchantCaptureRefused");
    openapiFields.add("merchantRefundApproved");
    openapiFields.add("merchantRefundRefused");
    openapiFields.add("merchantRefused");
    openapiFields.add("merchantVoid");
    openapiFields.add("shopperApproved");
    openapiFields.add("shopperCancelled");
    openapiFields.add("shopperCaptureApproved");
    openapiFields.add("shopperCaptureRefused");
    openapiFields.add("shopperRefundApproved");
    openapiFields.add("shopperRefundRefused");
    openapiFields.add("shopperRefused");
    openapiFields.add("shopperVoid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReceiptPrinting
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReceiptPrinting.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReceiptPrinting is not found in the empty JSON string", ReceiptPrinting.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReceiptPrinting.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReceiptPrinting` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReceiptPrinting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReceiptPrinting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReceiptPrinting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReceiptPrinting.class));

       return (TypeAdapter<T>) new TypeAdapter<ReceiptPrinting>() {
           @Override
           public void write(JsonWriter out, ReceiptPrinting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReceiptPrinting read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReceiptPrinting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReceiptPrinting
  * @throws IOException if the JSON string is invalid with respect to ReceiptPrinting
  */
  public static ReceiptPrinting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReceiptPrinting.class);
  }

 /**
  * Convert an instance of ReceiptPrinting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

