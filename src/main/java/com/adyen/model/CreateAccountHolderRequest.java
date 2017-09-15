/**
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2017 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */
package com.adyen.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

/**
 * CreateAccountHolderRequest
 */
public class CreateAccountHolderRequest {
    @SerializedName("createDefaultAccount")
    private Boolean createDefaultAccount = null;

    @SerializedName("accountHolderCode")
    private String accountHolderCode = null;

    @SerializedName("accountHolderDetails")
    private AccountHolderDetails accountHolderDetails = null;

    @SerializedName("processingTier")
    private Integer processingTier = null;

    /**
     * account holder legal entity type (Busines / Individual)
     */
    public enum LegalEntityEnum {
        @SerializedName("Business")
        BUSINESS("Business"),

        @SerializedName("Individual")
        INDIVIDUAL("Individual");

        private String value;

        LegalEntityEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    @SerializedName("legalEntity")
    private LegalEntityEnum legalEntity = null;

    public CreateAccountHolderRequest createDefaultAccount(Boolean createDefaultAccount) {
        this.createDefaultAccount = createDefaultAccount;
        return this;
    }

    /**
     * indicates if a default account has to be created for the account holder
     *
     * @return createDefaultAccount
     **/
    public Boolean getCreateDefaultAccount() {
        return createDefaultAccount;
    }

    public void setCreateDefaultAccount(Boolean createDefaultAccount) {
        this.createDefaultAccount = createDefaultAccount;
    }

    public CreateAccountHolderRequest accountHolderCode(String accountHolderCode) {
        this.accountHolderCode = accountHolderCode;
        return this;
    }

    /**
     * code of account holder to be created
     *
     * @return accountHolderCode
     **/
    public String getAccountHolderCode() {
        return accountHolderCode;
    }

    public void setAccountHolderCode(String accountHolderCode) {
        this.accountHolderCode = accountHolderCode;
    }

    public CreateAccountHolderRequest accountHolderDetails(AccountHolderDetails accountHolderDetails) {
        this.accountHolderDetails = accountHolderDetails;
        return this;
    }

    /**
     * account holder properties to be set
     *
     * @return accountHolderDetails
     **/
    public AccountHolderDetails getAccountHolderDetails() {
        return accountHolderDetails;
    }

    public void setAccountHolderDetails(AccountHolderDetails accountHolderDetails) {
        this.accountHolderDetails = accountHolderDetails;
    }

    public CreateAccountHolderRequest processingTier(Integer processingTier) {
        this.processingTier = processingTier;
        return this;
    }

    /**
     * processing tier in which the account needs to start
     *
     * @return processingTier
     **/
    public Integer getProcessingTier() {
        return processingTier;
    }

    public void setProcessingTier(Integer processingTier) {
        this.processingTier = processingTier;
    }

    public CreateAccountHolderRequest legalEntity(LegalEntityEnum legalEntity) {
        this.legalEntity = legalEntity;
        return this;
    }

    /**
     * account holder legal entity type (Busines / Individual)
     *
     * @return legalEntity
     **/
    public LegalEntityEnum getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(LegalEntityEnum legalEntity) {
        this.legalEntity = legalEntity;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAccountHolderRequest createAccountHolderRequest = (CreateAccountHolderRequest) o;
        return Objects.equals(this.createDefaultAccount, createAccountHolderRequest.createDefaultAccount)
                && Objects.equals(this.accountHolderCode, createAccountHolderRequest.accountHolderCode)
                && Objects.equals(this.accountHolderDetails, createAccountHolderRequest.accountHolderDetails)
                && Objects.equals(this.processingTier, createAccountHolderRequest.processingTier)
                && Objects.equals(this.legalEntity, createAccountHolderRequest.legalEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createDefaultAccount, accountHolderCode, accountHolderDetails, processingTier, legalEntity);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAccountHolderRequest {\n");

        sb.append("    createDefaultAccount: ").append(toIndentedString(createDefaultAccount)).append("\n");
        sb.append("    accountHolderCode: ").append(toIndentedString(accountHolderCode)).append("\n");
        sb.append("    accountHolderDetails: ").append(toIndentedString(accountHolderDetails)).append("\n");
        sb.append("    processingTier: ").append(toIndentedString(processingTier)).append("\n");
        sb.append("    legalEntity: ").append(toIndentedString(legalEntity)).append("\n");
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

}

