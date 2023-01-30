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

import com.adyen.model.checkout.JSON;

/**
 * CheckoutSessionInstallmentOption
 */

public class CheckoutSessionInstallmentOption {
  /**
   * Gets or Sets plans
   */
  @JsonAdapter(PlansEnum.Adapter.class)
  public enum PlansEnum {
    REGULAR("regular"),
    
    REVOLVING("revolving");

    private String value;

    PlansEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlansEnum fromValue(String value) {
      for (PlansEnum b : PlansEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PlansEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlansEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlansEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PlansEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PLANS = "plans";
  @SerializedName(SERIALIZED_NAME_PLANS)
  private List<PlansEnum> plans = null;

  public static final String SERIALIZED_NAME_PRESELECTED_VALUE = "preselectedValue";
  @SerializedName(SERIALIZED_NAME_PRESELECTED_VALUE)
  private Integer preselectedValue;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<Integer> values = null;

  public CheckoutSessionInstallmentOption() { 
  }

  public CheckoutSessionInstallmentOption plans(List<PlansEnum> plans) {
    
    this.plans = plans;
    return this;
  }

  public CheckoutSessionInstallmentOption addPlansItem(PlansEnum plansItem) {
    if (this.plans == null) {
      this.plans = new ArrayList<>();
    }
    this.plans.add(plansItem);
    return this;
  }

   /**
   * Defines the type of installment plan. If not set, defaults to **regular**.  Possible values: * **regular** * **revolving**
   * @return plans
  **/

  @ApiModelProperty(value = "Defines the type of installment plan. If not set, defaults to **regular**.  Possible values: * **regular** * **revolving**")

  public List<PlansEnum> getPlans() {
    return plans;
  }


  public void setPlans(List<PlansEnum> plans) {
    this.plans = plans;
  }


  public CheckoutSessionInstallmentOption preselectedValue(Integer preselectedValue) {
    
    this.preselectedValue = preselectedValue;
    return this;
  }

   /**
   * Preselected number of installments offered for this payment method.
   * @return preselectedValue
  **/

  @ApiModelProperty(value = "Preselected number of installments offered for this payment method.")

  public Integer getPreselectedValue() {
    return preselectedValue;
  }


  public void setPreselectedValue(Integer preselectedValue) {
    this.preselectedValue = preselectedValue;
  }


  public CheckoutSessionInstallmentOption values(List<Integer> values) {
    
    this.values = values;
    return this;
  }

  public CheckoutSessionInstallmentOption addValuesItem(Integer valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * An array of the number of installments that the shopper can choose from. For example, **[2,3,5]**. This cannot be specified simultaneously with &#x60;maxValue&#x60;.
   * @return values
  **/

  @ApiModelProperty(value = "An array of the number of installments that the shopper can choose from. For example, **[2,3,5]**. This cannot be specified simultaneously with `maxValue`.")

  public List<Integer> getValues() {
    return values;
  }


  public void setValues(List<Integer> values) {
    this.values = values;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutSessionInstallmentOption checkoutSessionInstallmentOption = (CheckoutSessionInstallmentOption) o;
    return Objects.equals(this.plans, checkoutSessionInstallmentOption.plans) &&
        Objects.equals(this.preselectedValue, checkoutSessionInstallmentOption.preselectedValue) &&
        Objects.equals(this.values, checkoutSessionInstallmentOption.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plans, preselectedValue, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutSessionInstallmentOption {\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
    sb.append("    preselectedValue: ").append(toIndentedString(preselectedValue)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("plans");
    openapiFields.add("preselectedValue");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CheckoutSessionInstallmentOption
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CheckoutSessionInstallmentOption.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckoutSessionInstallmentOption is not found in the empty JSON string", CheckoutSessionInstallmentOption.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CheckoutSessionInstallmentOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CheckoutSessionInstallmentOption` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("plans") != null && !jsonObj.get("plans").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `plans` to be an array in the JSON string but got `%s`", jsonObj.get("plans").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckoutSessionInstallmentOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckoutSessionInstallmentOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckoutSessionInstallmentOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckoutSessionInstallmentOption.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckoutSessionInstallmentOption>() {
           @Override
           public void write(JsonWriter out, CheckoutSessionInstallmentOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckoutSessionInstallmentOption read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CheckoutSessionInstallmentOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckoutSessionInstallmentOption
  * @throws IOException if the JSON string is invalid with respect to CheckoutSessionInstallmentOption
  */
  public static CheckoutSessionInstallmentOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckoutSessionInstallmentOption.class);
  }

 /**
  * Convert an instance of CheckoutSessionInstallmentOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

