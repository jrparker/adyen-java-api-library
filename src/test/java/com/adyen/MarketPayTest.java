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
package com.adyen;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.adyen.model.AccountHolderBalanceRequest;
import com.adyen.model.AccountHolderBalanceResponse;
import com.adyen.model.AccountHolderDetails;
import com.adyen.model.Address;
import com.adyen.model.BankAccountDetail;
import com.adyen.model.CreateAccountHolderRequest;
import com.adyen.model.CreateAccountHolderResponse;
import com.adyen.model.FraudCheckResult;
import com.adyen.model.IndividualDetails;
import com.adyen.model.Name;
import com.adyen.model.PaymentRequest;
import com.adyen.model.PaymentResult;
import com.adyen.model.PersonalData;
import com.adyen.model.PhoneNumber;
import com.adyen.model.additionalData.SplitPayment;
import com.adyen.model.additionalData.SplitPaymentItem;
import com.adyen.service.Account;
import com.adyen.service.Fund;
import com.adyen.service.Payment;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Tests for /authorise and /authorise3d
 */
public class MarketPayTest extends BaseTest {


    /**
     * Test success flow for
     * POST /authorise
     */
    @Test
    public void TestCreateSplitPayment() throws Exception {

        Client client = createMockClientFromFile("mocks/authorise-success.json");
        Payment payment = new Payment(client);

        PaymentRequest paymentRequest = createBasePaymentRequest(new PaymentRequest()).reference("123456")
                                                                                      .setAmountData("6200", "EUR")
                                                                                      .setCardData("5136333333333335", "John Doe", "08", "2018", "737");

        // splitPayment
        SplitPayment splitPayment = new SplitPayment();
        splitPayment.setApi(1);
        splitPayment.setTotalAmount(new Long("6200"));
        splitPayment.setCurrencyCode("EUR");

        List<SplitPaymentItem> splitPaymentItems = new ArrayList<SplitPaymentItem>();

        // first split payment item
        SplitPaymentItem splitPaymentItem = new SplitPaymentItem();
        splitPaymentItem.setAmount(new Long(6000));
        splitPaymentItem.setType("MarketPlace");
        splitPaymentItem.setAccount("151272963");
        splitPaymentItem.setReference("6124145");
        splitPaymentItem.setDescription("Porcelain Doll: Eliza (20cm)");
        splitPaymentItems.add(splitPaymentItem);

        // seconf split payment item
        SplitPaymentItem splitPaymentItem2 = new SplitPaymentItem();
        splitPaymentItem2.setAmount(new Long(200));
        splitPaymentItem2.setType("Commission");
        splitPaymentItem2.setReference("6124146");
        splitPaymentItems.add(splitPaymentItem2);

        // add items to list
        splitPayment.setSplitPaymentItems(splitPaymentItems);

        // add it into the request
        paymentRequest.setSplitPayment(splitPayment);

        PaymentResult paymentResult = payment.authorise(paymentRequest);

        assertTrue(paymentResult.isAuthorised());

        SimpleDateFormat format = new SimpleDateFormat("M/yyyy");
        assertEquals("8/2018", format.format(paymentResult.getExpiryDate()));

        assertEquals("411111", paymentResult.getCardBin());
        assertEquals("1111", paymentResult.getCardSummary());
        assertEquals("Holder", paymentResult.getCardHolderName());
        assertTrue(paymentResult.get3DOffered());
        assertFalse(paymentResult.get3DAuthenticated());
        assertEquals("69746", paymentResult.getAuthCode());

        assertEquals(11, paymentResult.getFraudResult().getFraudCheckResults().size());

        FraudCheckResult fraudCheckResult = paymentResult.getFraudResult().getFraudCheckResults().get(0);
        assertEquals("CardChunkUsage", fraudCheckResult.getName());
        assertEquals(8, fraudCheckResult.getAccountScore().intValue());
        assertEquals(2, fraudCheckResult.getCheckId().intValue());
    }

    /**
     * Test success flow for
     * POST /createAccountHolder
     */
    @Test
    public void TestCreateAccountHolderSuccess() throws Exception {

        // setup client
        Client client = createMockClientFromFile("mocks/marketpay/account/create-account-holder-success.json");

        // use Account service
        Account account = new Account(client);

        // Create Account Holder Reqeust
        CreateAccountHolderRequest createAccountHolderRequest = new CreateAccountHolderRequest();
        createAccountHolderRequest.setAccountHolderCode("TestAccountHolder781664");

        // create AcountHolderDetails
        AccountHolderDetails accountHolderDetails = new AccountHolderDetails();

        // Add address to AcountHolderDetails
        Address address = new Address();
        address.setCity("Amsterdam");
        address.setCountry("US");
        address.houseNumberOrName("10");
        address.postalCode("12345");
        address.stateOrProvince("NH");
        address.setStreet("Teststreet 1");
        accountHolderDetails.setAddress(address);

        // set BankAccountDetails
        BankAccountDetail bankAccountDetail = new BankAccountDetail();
        bankAccountDetail.setAccountNumber("12345678");
        bankAccountDetail.setBankAccountName("baName");
        bankAccountDetail.setBankBicSwift("BicSUSft");
        bankAccountDetail.setBankCity("city");
        bankAccountDetail.setBankName("bankName");
        bankAccountDetail.setBranchCode("122105155");
        bankAccountDetail.setCountryCode("US");
        bankAccountDetail.setCurrencyCode("EUR");
        bankAccountDetail.setIban("iban");
        bankAccountDetail.setOwnerCity("ownerCity");
        bankAccountDetail.setOwnerCountryCode("BE");
        bankAccountDetail.setOwnerDateOfBirth("1980-01-01"); // set datetime element
        bankAccountDetail.setOwnerHouseNumberOrName("houseNumberOrName");
        bankAccountDetail.setOwnerName("ownerName");
        bankAccountDetail.setOwnerNationality("AD");
        bankAccountDetail.setOwnerPostalCode("ownerPostalCode");
        bankAccountDetail.setOwnerState("ownerState");
        bankAccountDetail.setOwnerStreet("ownerStreet");
        bankAccountDetail.setPrimaryAccount(true);
        bankAccountDetail.setTaxId("bankTaxId");
        List<BankAccountDetail> bankAccountDetails = new ArrayList<BankAccountDetail>();
        bankAccountDetails.add(bankAccountDetail);
        accountHolderDetails.setBankAccountDetails(bankAccountDetails);
        accountHolderDetails.setEmail("test@adyen.com");

        // set individualDetails
        IndividualDetails individualDetails = new IndividualDetails();

        // set name inside individualDetails
        Name name = new Name();
        name.firstName("First name");
        name.lastName("Last Name");
        name.gender(Name.GenderEnum.MALE);
        individualDetails.setName(name);

        // set personal data inside individualDetails
        PersonalData personalData = new PersonalData();
        personalData.dateOfBirth("1970-01-01");
        personalData.setIdNumber("1234567890");
        personalData.setNationality("NL");
        individualDetails.setPersonalData(personalData);

        // attach individualDetails into accountHolderDetails
        accountHolderDetails.setIndividualDetails(individualDetails);
        accountHolderDetails.setMerchantCategoryCode("7999");

        // create phone number
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setPhoneCountryCode("NL");
        phoneNumber.setPhoneNumber("0612345678");
        phoneNumber.setPhoneType(PhoneNumber.PhoneTypeEnum.MOBILE);
        accountHolderDetails.setPhoneNumber(phoneNumber);
        accountHolderDetails.setWebAddress("http://www.adyen.com");

        // set accountHolderDetails
        createAccountHolderRequest.setAccountHolderDetails(accountHolderDetails);
        createAccountHolderRequest.setCreateDefaultAccount(true);
        createAccountHolderRequest.setLegalEntity(CreateAccountHolderRequest.LegalEntityEnum.INDIVIDUAL);

        // createAccountHolder
        CreateAccountHolderResponse createAccountHolderResponse = account.createAccountHolder(createAccountHolderRequest);

        System.out.println(createAccountHolderResponse);
        assertEquals("140922935", createAccountHolderResponse.getAccountCode());
    }


    /**
     * Test success flow for
     * POST /accountHolderBalance
     */
    @Test
    public void TestAccountHolderBalanceSuccess() throws Exception {

        // setup client
        Client client = createMockClientFromFile("mocks/marketpay/fund/account-holder-balance-success.json");

        // use Fund service
        Fund fund = new Fund(client);

        // create AccountHolderBalance Request
        AccountHolderBalanceRequest accountHolderBalanceRequest = new AccountHolderBalanceRequest();
        accountHolderBalanceRequest.accountHolderCode("TestAccountHolder877209");
        AccountHolderBalanceResponse accountHolderBalanceResponse = fund.AccountHolderBalance(accountHolderBalanceRequest);

        System.out.println(accountHolderBalanceResponse);
    }
}
