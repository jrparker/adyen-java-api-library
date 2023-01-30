/*
 * Transfers API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfer;

import com.google.gson.*;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * Transaction
 */

public class Transaction {
  public static final String SERIALIZED_NAME_ACCOUNT_HOLDER_ID = "accountHolderId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_HOLDER_ID)
  private String accountHolderId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_BALANCE_ACCOUNT_ID = "balanceAccountId";
  @SerializedName(SERIALIZED_NAME_BALANCE_ACCOUNT_ID)
  private String balanceAccountId;

  public static final String SERIALIZED_NAME_BALANCE_PLATFORM = "balancePlatform";
  @SerializedName(SERIALIZED_NAME_BALANCE_PLATFORM)
  private String balancePlatform;

  public static final String SERIALIZED_NAME_BOOKING_DATE = "bookingDate";
  @SerializedName(SERIALIZED_NAME_BOOKING_DATE)
  private Date bookingDate;

  /**
   * The category of the transaction indicating the type of activity.   Possible values:  * **platformPayment**: The transaction is a payment or payment modification made with an Adyen merchant account.  * **internal**: The transaction resulted from an internal adjustment such as a deposit correction or invoice deduction.  * **bank**: The transaction is a bank-related activity, such as sending a payout or receiving funds.  * **issuedCard**: The transaction is a card-related activity, such as using an Adyen-issued card to pay online.  
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    BANK("bank"),
    
    GRANTS("grants"),
    
    INTERNAL("internal"),
    
    ISSUEDCARD("issuedCard"),
    
    PLATFORMPAYMENT("platformPayment");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private CategoryEnum category;

  public static final String SERIALIZED_NAME_COUNTERPARTY = "counterparty";
  @SerializedName(SERIALIZED_NAME_COUNTERPARTY)
  private CounterpartyV3 counterparty;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Date createdAt;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INSTRUCTED_AMOUNT = "instructedAmount";
  @SerializedName(SERIALIZED_NAME_INSTRUCTED_AMOUNT)
  private Amount instructedAmount;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID = "paymentInstrumentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUMENT_ID)
  private String paymentInstrumentId;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_REFERENCE_FOR_BENEFICIARY = "referenceForBeneficiary";
  @SerializedName(SERIALIZED_NAME_REFERENCE_FOR_BENEFICIARY)
  private String referenceForBeneficiary;

  /**
   * The status of the transaction.   Possible values:  * **pending**: The transaction is still pending.  * **booked**: The transaction has been booked to the balance account.  
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    BOOKED("booked"),
    
    PENDING("pending");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TRANSFER_ID = "transferId";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  private String transferId;

  /**
   * The type of the transaction.   Possible values: **payment**, **capture**, **captureReversal**, **refund** **refundReversal**, **chargeback**, **chargebackReversal**, **secondChargeback**, **atmWithdrawal**, **atmWithdrawalReversal**, **internalTransfer**, **manualCorrection**, **invoiceDeduction**, **depositCorrection**, **bankTransfer**, **miscCost**, **paymentCost**, **fee**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ATMWITHDRAWAL("atmWithdrawal"),
    
    ATMWITHDRAWALREVERSAL("atmWithdrawalReversal"),
    
    BALANCEADJUSTMENT("balanceAdjustment"),
    
    BANKTRANSFER("bankTransfer"),
    
    CAPTURE("capture"),
    
    CAPTUREREVERSAL("captureReversal"),
    
    CHARGEBACK("chargeback"),
    
    CHARGEBACKREVERSAL("chargebackReversal"),
    
    DEPOSITCORRECTION("depositCorrection"),
    
    FEE("fee"),
    
    GRANT("grant"),
    
    INSTALLMENT("installment"),
    
    INSTALLMENTREVERSAL("installmentReversal"),
    
    INTERNALTRANSFER("internalTransfer"),
    
    INVOICEDEDUCTION("invoiceDeduction"),
    
    LEFTOVER("leftover"),
    
    MANUALCORRECTION("manualCorrection"),
    
    MISCCOST("miscCost"),
    
    PAYMENT("payment"),
    
    PAYMENTCOST("paymentCost"),
    
    REFUND("refund"),
    
    REFUNDREVERSAL("refundReversal"),
    
    REPAYMENT("repayment"),
    
    RESERVEADJUSTMENT("reserveAdjustment"),
    
    SECONDCHARGEBACK("secondChargeback");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_VALUE_DATE = "valueDate";
  @SerializedName(SERIALIZED_NAME_VALUE_DATE)
  private Date valueDate;

  public Transaction() { 
  }

  
  public Transaction(
     String id
  ) {
    this();
    this.id = id;
  }

  public Transaction accountHolderId(String accountHolderId) {
    
    this.accountHolderId = accountHolderId;
    return this;
  }

   /**
   * Unique identifier of the account holder.
   * @return accountHolderId
  **/

  @ApiModelProperty(required = true, value = "Unique identifier of the account holder.")

  public String getAccountHolderId() {
    return accountHolderId;
  }


  public void setAccountHolderId(String accountHolderId) {
    this.accountHolderId = accountHolderId;
  }


  public Transaction amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/

  @ApiModelProperty(required = true, value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public Transaction balanceAccountId(String balanceAccountId) {
    
    this.balanceAccountId = balanceAccountId;
    return this;
  }

   /**
   * Unique identifier of the balance account.
   * @return balanceAccountId
  **/

  @ApiModelProperty(required = true, value = "Unique identifier of the balance account.")

  public String getBalanceAccountId() {
    return balanceAccountId;
  }


  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }


  public Transaction balancePlatform(String balancePlatform) {
    
    this.balancePlatform = balancePlatform;
    return this;
  }

   /**
   * Unique identifier of the balance platform.
   * @return balancePlatform
  **/

  @ApiModelProperty(required = true, value = "Unique identifier of the balance platform.")

  public String getBalancePlatform() {
    return balancePlatform;
  }


  public void setBalancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
  }


  public Transaction bookingDate(Date bookingDate) {
    
    this.bookingDate = bookingDate;
    return this;
  }

   /**
   * The date the transaction was booked to the balance account.
   * @return bookingDate
  **/

  @ApiModelProperty(required = true, value = "The date the transaction was booked to the balance account.")

  public Date getBookingDate() {
    return bookingDate;
  }


  public void setBookingDate(Date bookingDate) {
    this.bookingDate = bookingDate;
  }


  public Transaction category(CategoryEnum category) {
    
    this.category = category;
    return this;
  }

   /**
   * The category of the transaction indicating the type of activity.   Possible values:  * **platformPayment**: The transaction is a payment or payment modification made with an Adyen merchant account.  * **internal**: The transaction resulted from an internal adjustment such as a deposit correction or invoice deduction.  * **bank**: The transaction is a bank-related activity, such as sending a payout or receiving funds.  * **issuedCard**: The transaction is a card-related activity, such as using an Adyen-issued card to pay online.  
   * @return category
  **/

  @ApiModelProperty(value = "The category of the transaction indicating the type of activity.   Possible values:  * **platformPayment**: The transaction is a payment or payment modification made with an Adyen merchant account.  * **internal**: The transaction resulted from an internal adjustment such as a deposit correction or invoice deduction.  * **bank**: The transaction is a bank-related activity, such as sending a payout or receiving funds.  * **issuedCard**: The transaction is a card-related activity, such as using an Adyen-issued card to pay online.  ")

  public CategoryEnum getCategory() {
    return category;
  }


  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  public Transaction counterparty(CounterpartyV3 counterparty) {
    
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/

  @ApiModelProperty(required = true, value = "")

  public CounterpartyV3 getCounterparty() {
    return counterparty;
  }


  public void setCounterparty(CounterpartyV3 counterparty) {
    this.counterparty = counterparty;
  }


  public Transaction createdAt(Date createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date the transaction was created.
   * @return createdAt
  **/

  @ApiModelProperty(required = true, value = "The date the transaction was created.")

  public Date getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  public Transaction description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The &#x60;description&#x60; from the &#x60;/transfers&#x60; request.
   * @return description
  **/

  @ApiModelProperty(value = "The `description` from the `/transfers` request.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


   /**
   * Unique identifier of the transaction.
   * @return id
  **/

  @ApiModelProperty(required = true, value = "Unique identifier of the transaction.")

  public String getId() {
    return id;
  }




  public Transaction instructedAmount(Amount instructedAmount) {
    
    this.instructedAmount = instructedAmount;
    return this;
  }

   /**
   * Get instructedAmount
   * @return instructedAmount
  **/

  @ApiModelProperty(value = "")

  public Amount getInstructedAmount() {
    return instructedAmount;
  }


  public void setInstructedAmount(Amount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }


  public Transaction paymentInstrumentId(String paymentInstrumentId) {
    
    this.paymentInstrumentId = paymentInstrumentId;
    return this;
  }

   /**
   * Unique identifier of the payment instrument that was used for the transaction.
   * @return paymentInstrumentId
  **/

  @ApiModelProperty(value = "Unique identifier of the payment instrument that was used for the transaction.")

  public String getPaymentInstrumentId() {
    return paymentInstrumentId;
  }


  public void setPaymentInstrumentId(String paymentInstrumentId) {
    this.paymentInstrumentId = paymentInstrumentId;
  }


  public Transaction reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * The [&#x60;reference&#x60;](https://docs.adyen.com/api-explorer/#/transfers/latest/post/transfers__reqParam_reference) from the &#x60;/transfers&#x60; request. If you haven&#39;t provided any, Adyen generates a unique reference.
   * @return reference
  **/

  @ApiModelProperty(required = true, value = "The [`reference`](https://docs.adyen.com/api-explorer/#/transfers/latest/post/transfers__reqParam_reference) from the `/transfers` request. If you haven't provided any, Adyen generates a unique reference.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public Transaction referenceForBeneficiary(String referenceForBeneficiary) {
    
    this.referenceForBeneficiary = referenceForBeneficiary;
    return this;
  }

   /**
   * The reference sent to or received from the counterparty.  * For outgoing funds, this is the [&#x60;referenceForBeneficiary&#x60;](https://docs.adyen.com/api-explorer/#/transfers/latest/post/transfers__resParam_referenceForBeneficiary) from the  [&#x60;/transfers&#x60;](https://docs.adyen.com/api-explorer/#/transfers/latest/post/transfers__reqParam_referenceForBeneficiary) request.   * For incoming funds, this is the reference from the sender.
   * @return referenceForBeneficiary
  **/

  @ApiModelProperty(value = "The reference sent to or received from the counterparty.  * For outgoing funds, this is the [`referenceForBeneficiary`](https://docs.adyen.com/api-explorer/#/transfers/latest/post/transfers__resParam_referenceForBeneficiary) from the  [`/transfers`](https://docs.adyen.com/api-explorer/#/transfers/latest/post/transfers__reqParam_referenceForBeneficiary) request.   * For incoming funds, this is the reference from the sender.")

  public String getReferenceForBeneficiary() {
    return referenceForBeneficiary;
  }


  public void setReferenceForBeneficiary(String referenceForBeneficiary) {
    this.referenceForBeneficiary = referenceForBeneficiary;
  }


  public Transaction status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the transaction.   Possible values:  * **pending**: The transaction is still pending.  * **booked**: The transaction has been booked to the balance account.  
   * @return status
  **/

  @ApiModelProperty(required = true, value = "The status of the transaction.   Possible values:  * **pending**: The transaction is still pending.  * **booked**: The transaction has been booked to the balance account.  ")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Transaction transferId(String transferId) {
    
    this.transferId = transferId;
    return this;
  }

   /**
   * Unique identifier of the related transfer.
   * @return transferId
  **/

  @ApiModelProperty(value = "Unique identifier of the related transfer.")

  public String getTransferId() {
    return transferId;
  }


  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }


  public Transaction type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the transaction.   Possible values: **payment**, **capture**, **captureReversal**, **refund** **refundReversal**, **chargeback**, **chargebackReversal**, **secondChargeback**, **atmWithdrawal**, **atmWithdrawalReversal**, **internalTransfer**, **manualCorrection**, **invoiceDeduction**, **depositCorrection**, **bankTransfer**, **miscCost**, **paymentCost**, **fee**
   * @return type
  **/

  @ApiModelProperty(value = "The type of the transaction.   Possible values: **payment**, **capture**, **captureReversal**, **refund** **refundReversal**, **chargeback**, **chargebackReversal**, **secondChargeback**, **atmWithdrawal**, **atmWithdrawalReversal**, **internalTransfer**, **manualCorrection**, **invoiceDeduction**, **depositCorrection**, **bankTransfer**, **miscCost**, **paymentCost**, **fee**")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Transaction valueDate(Date valueDate) {
    
    this.valueDate = valueDate;
    return this;
  }

   /**
   * The date the transfer amount becomes available in the balance account.
   * @return valueDate
  **/

  @ApiModelProperty(required = true, value = "The date the transfer amount becomes available in the balance account.")

  public Date getValueDate() {
    return valueDate;
  }


  public void setValueDate(Date valueDate) {
    this.valueDate = valueDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.accountHolderId, transaction.accountHolderId) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.balanceAccountId, transaction.balanceAccountId) &&
        Objects.equals(this.balancePlatform, transaction.balancePlatform) &&
        Objects.equals(this.bookingDate, transaction.bookingDate) &&
        Objects.equals(this.category, transaction.category) &&
        Objects.equals(this.counterparty, transaction.counterparty) &&
        Objects.equals(this.createdAt, transaction.createdAt) &&
        Objects.equals(this.description, transaction.description) &&
        Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.instructedAmount, transaction.instructedAmount) &&
        Objects.equals(this.paymentInstrumentId, transaction.paymentInstrumentId) &&
        Objects.equals(this.reference, transaction.reference) &&
        Objects.equals(this.referenceForBeneficiary, transaction.referenceForBeneficiary) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.transferId, transaction.transferId) &&
        Objects.equals(this.type, transaction.type) &&
        Objects.equals(this.valueDate, transaction.valueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderId, amount, balanceAccountId, balancePlatform, bookingDate, category, counterparty, createdAt, description, id, instructedAmount, paymentInstrumentId, reference, referenceForBeneficiary, status, transferId, type, valueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    sb.append("    accountHolderId: ").append(toIndentedString(accountHolderId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    paymentInstrumentId: ").append(toIndentedString(paymentInstrumentId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    referenceForBeneficiary: ").append(toIndentedString(referenceForBeneficiary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
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
    openapiFields.add("accountHolderId");
    openapiFields.add("amount");
    openapiFields.add("balanceAccountId");
    openapiFields.add("balancePlatform");
    openapiFields.add("bookingDate");
    openapiFields.add("category");
    openapiFields.add("counterparty");
    openapiFields.add("createdAt");
    openapiFields.add("description");
    openapiFields.add("id");
    openapiFields.add("instructedAmount");
    openapiFields.add("paymentInstrumentId");
    openapiFields.add("reference");
    openapiFields.add("referenceForBeneficiary");
    openapiFields.add("status");
    openapiFields.add("transferId");
    openapiFields.add("type");
    openapiFields.add("valueDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountHolderId");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("balanceAccountId");
    openapiRequiredFields.add("balancePlatform");
    openapiRequiredFields.add("bookingDate");
    openapiRequiredFields.add("counterparty");
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("reference");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("valueDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Transaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Transaction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Transaction is not found in the empty JSON string", Transaction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Transaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Transaction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Transaction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field accountHolderId
      if (jsonObj.get("accountHolderId") != null && !jsonObj.get("accountHolderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountHolderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountHolderId").toString()));
      }
      // validate the optional field `amount`
      if (jsonObj.getAsJsonObject("amount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      // validate the optional field balanceAccountId
      if (jsonObj.get("balanceAccountId") != null && !jsonObj.get("balanceAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balanceAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balanceAccountId").toString()));
      }
      // validate the optional field balancePlatform
      if (jsonObj.get("balancePlatform") != null && !jsonObj.get("balancePlatform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balancePlatform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balancePlatform").toString()));
      }
      // ensure the field category can be parsed to an enum value
      if (jsonObj.get("category") != null) {
        if(!jsonObj.get("category").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
        }
        CategoryEnum.fromValue(jsonObj.get("category").getAsString());
      }
      // validate the optional field `counterparty`
      if (jsonObj.getAsJsonObject("counterparty") != null) {
        CounterpartyV3.validateJsonObject(jsonObj.getAsJsonObject("counterparty"));
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `instructedAmount`
      if (jsonObj.getAsJsonObject("instructedAmount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("instructedAmount"));
      }
      // validate the optional field paymentInstrumentId
      if (jsonObj.get("paymentInstrumentId") != null && !jsonObj.get("paymentInstrumentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentInstrumentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentInstrumentId").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field referenceForBeneficiary
      if (jsonObj.get("referenceForBeneficiary") != null && !jsonObj.get("referenceForBeneficiary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceForBeneficiary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceForBeneficiary").toString()));
      }
      // ensure the field status can be parsed to an enum value
      if (jsonObj.get("status") != null) {
        if(!jsonObj.get("status").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
        }
        StatusEnum.fromValue(jsonObj.get("status").getAsString());
      }
      // validate the optional field transferId
      if (jsonObj.get("transferId") != null && !jsonObj.get("transferId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferId").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Transaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Transaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Transaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Transaction.class));

       return (TypeAdapter<T>) new TypeAdapter<Transaction>() {
           @Override
           public void write(JsonWriter out, Transaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Transaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Transaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Transaction
  * @throws IOException if the JSON string is invalid with respect to Transaction
  */
  public static Transaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Transaction.class);
  }

 /**
  * Convert an instance of Transaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

