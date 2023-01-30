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
import com.adyen.model.management.Links;
import com.adyen.model.management.Name;
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
 * CreateUserResponse
 */

public class CreateUserResponse {
  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Links links;

  public static final String SERIALIZED_NAME_ACCOUNT_GROUPS = "accountGroups";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_GROUPS)
  private List<String> accountGroups = null;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Name name;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<String> roles = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIME_ZONE_CODE = "timeZoneCode";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE_CODE)
  private String timeZoneCode;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public CreateUserResponse() { 
  }

  public CreateUserResponse links(Links links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  
  @ApiModelProperty(value = "")

  public Links getLinks() {
    return links;
  }


  public void setLinks(Links links) {
    this.links = links;
  }


  public CreateUserResponse accountGroups(List<String> accountGroups) {
    
    this.accountGroups = accountGroups;
    return this;
  }

  public CreateUserResponse addAccountGroupsItem(String accountGroupsItem) {
    if (this.accountGroups == null) {
      this.accountGroups = new ArrayList<>();
    }
    this.accountGroups.add(accountGroupsItem);
    return this;
  }

   /**
   * The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.
   * @return accountGroups
  **/
  
  @ApiModelProperty(value = "The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.")

  public List<String> getAccountGroups() {
    return accountGroups;
  }


  public void setAccountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
  }


  public CreateUserResponse active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Indicates whether this user is active.
   * @return active
  **/
  
  @ApiModelProperty(value = "Indicates whether this user is active.")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public CreateUserResponse email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email address of the user.
   * @return email
  **/
  
  @ApiModelProperty(required = true, value = "The email address of the user.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CreateUserResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the user.
   * @return id
  **/
  
  @ApiModelProperty(required = true, value = "The unique identifier of the user.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CreateUserResponse name(Name name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  
  @ApiModelProperty(value = "")

  public Name getName() {
    return name;
  }


  public void setName(Name name) {
    this.name = name;
  }


  public CreateUserResponse roles(List<String> roles) {
    
    this.roles = roles;
    return this;
  }

  public CreateUserResponse addRolesItem(String rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The list of [roles](https://docs.adyen.com/account/user-roles) for this user.
   * @return roles
  **/
  
  @ApiModelProperty(required = true, value = "The list of [roles](https://docs.adyen.com/account/user-roles) for this user.")

  public List<String> getRoles() {
    return roles;
  }


  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  public CreateUserResponse timeZoneCode(String timeZoneCode) {
    
    this.timeZoneCode = timeZoneCode;
    return this;
  }

   /**
   * The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.
   * @return timeZoneCode
  **/
  
  @ApiModelProperty(required = true, value = "The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.")

  public String getTimeZoneCode() {
    return timeZoneCode;
  }


  public void setTimeZoneCode(String timeZoneCode) {
    this.timeZoneCode = timeZoneCode;
  }


  public CreateUserResponse username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * The username for this user.
   * @return username
  **/
  
  @ApiModelProperty(required = true, value = "The username for this user.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserResponse createUserResponse = (CreateUserResponse) o;
    return Objects.equals(this.links, createUserResponse.links) &&
        Objects.equals(this.accountGroups, createUserResponse.accountGroups) &&
        Objects.equals(this.active, createUserResponse.active) &&
        Objects.equals(this.email, createUserResponse.email) &&
        Objects.equals(this.id, createUserResponse.id) &&
        Objects.equals(this.name, createUserResponse.name) &&
        Objects.equals(this.roles, createUserResponse.roles) &&
        Objects.equals(this.timeZoneCode, createUserResponse.timeZoneCode) &&
        Objects.equals(this.username, createUserResponse.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, accountGroups, active, email, id, name, roles, timeZoneCode, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserResponse {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    timeZoneCode: ").append(toIndentedString(timeZoneCode)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("_links");
    openapiFields.add("accountGroups");
    openapiFields.add("active");
    openapiFields.add("email");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("roles");
    openapiFields.add("timeZoneCode");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("roles");
    openapiRequiredFields.add("timeZoneCode");
    openapiRequiredFields.add("username");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateUserResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateUserResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateUserResponse is not found in the empty JSON string", CreateUserResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateUserResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateUserResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateUserResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `_links`
      if (jsonObj.getAsJsonObject("_links") != null) {
        Links.validateJsonObject(jsonObj.getAsJsonObject("_links"));
      }
      // ensure the json data is an array
      if (jsonObj.get("accountGroups") != null && !jsonObj.get("accountGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountGroups` to be an array in the JSON string but got `%s`", jsonObj.get("accountGroups").toString()));
      }
      // validate the optional field email
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `name`
      if (jsonObj.getAsJsonObject("name") != null) {
        Name.validateJsonObject(jsonObj.getAsJsonObject("name"));
      }
      // ensure the json data is an array
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }
      // validate the optional field timeZoneCode
      if (jsonObj.get("timeZoneCode") != null && !jsonObj.get("timeZoneCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZoneCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeZoneCode").toString()));
      }
      // validate the optional field username
      if (jsonObj.get("username") != null && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateUserResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateUserResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateUserResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateUserResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateUserResponse>() {
           @Override
           public void write(JsonWriter out, CreateUserResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateUserResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateUserResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateUserResponse
  * @throws IOException if the JSON string is invalid with respect to CreateUserResponse
  */
  public static CreateUserResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateUserResponse.class);
  }

 /**
  * Convert an instance of CreateUserResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

