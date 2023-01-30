/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payout;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.payout.FraudCheckResult;
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

import com.adyen.model.payout.JSON;

/**
 * FraudResult
 */

public class FraudResult {
  public static final String SERIALIZED_NAME_ACCOUNT_SCORE = "accountScore";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SCORE)
  private Integer accountScore;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<FraudCheckResult> results = null;

  public FraudResult() { 
  }

  public FraudResult accountScore(Integer accountScore) {
    
    this.accountScore = accountScore;
    return this;
  }

   /**
   * The total fraud score generated by the risk checks.
   * @return accountScore
  **/
  
  @ApiModelProperty(required = true, value = "The total fraud score generated by the risk checks.")

  public Integer getAccountScore() {
    return accountScore;
  }


  public void setAccountScore(Integer accountScore) {
    this.accountScore = accountScore;
  }


  public FraudResult results(List<FraudCheckResult> results) {
    
    this.results = results;
    return this;
  }

  public FraudResult addResultsItem(FraudCheckResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * The result of the individual risk checks.
   * @return results
  **/

  @ApiModelProperty(value = "The result of the individual risk checks.")

  public List<FraudCheckResult> getResults() {
    return results;
  }


  public void setResults(List<FraudCheckResult> results) {
    this.results = results;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudResult fraudResult = (FraudResult) o;
    return Objects.equals(this.accountScore, fraudResult.accountScore) &&
        Objects.equals(this.results, fraudResult.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountScore, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudResult {\n");
    sb.append("    accountScore: ").append(toIndentedString(accountScore)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
    openapiFields.add("accountScore");
    openapiFields.add("results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountScore");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FraudResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FraudResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FraudResult is not found in the empty JSON string", FraudResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FraudResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FraudResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FraudResult.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
      if (jsonArrayresults != null) {
        // ensure the json data is an array
        if (!jsonObj.get("results").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
        }

        // validate the optional field `results` (array)
        for (int i = 0; i < jsonArrayresults.size(); i++) {
          FraudCheckResult.validateJsonObject(jsonArrayresults.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FraudResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FraudResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FraudResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FraudResult.class));

       return (TypeAdapter<T>) new TypeAdapter<FraudResult>() {
           @Override
           public void write(JsonWriter out, FraudResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FraudResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FraudResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FraudResult
  * @throws IOException if the JSON string is invalid with respect to FraudResult
  */
  public static FraudResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FraudResult.class);
  }

 /**
  * Convert an instance of FraudResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

