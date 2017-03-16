package model.utils;
// Generated Mar 16, 2017 4:57:39 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;

/**
 * Customers generated by hbm2java
 */
public class Customers  implements java.io.Serializable {


     private int CId;
     private Serializable CEmailAddress;
     private Serializable CTelephone;
     private Serializable CPassword;
     private Float CCustomerDiscount;
     private Serializable CCardholderName;
     private Serializable CCardholderCompany;
     private Serializable CCardholderEuvatnum;
     private Serializable CCardNumber;
     private Serializable CCardType;
     private Serializable CCardStartDate;
     private Serializable CCardExpiry;
     private Serializable CCardIssueNumber;
     private Serializable CCardSecurityNumber;
     private Serializable CCardholderStreetAddress;
     private Serializable CCardholderTownCity;
     private Serializable CCardholderCounty;
     private Serializable CCardholderPostCode;
     private Integer CCardholderCountry;
     private Serializable CShippingName;
     private Serializable CShippingCompany;
     private Serializable CShippingStreetAddress;
     private Serializable CShippingTownCity;
     private Serializable CShippingCounty;
     private Serializable CShippingPostCode;
     private Integer CShippingCountry;
     private Integer CAffiliateId;
     private Serializable CApproved;
     private Integer CCustomerGroupiD;
     private Serializable CIsAffiliate;
     private Float CAffiliateCommission;
     private Integer CLanguageId;
     private Date CMlSignupDateTime;
     private Serializable CMlSignupIp;
     private Date CMlConfirmationDateTime;
     private Serializable CMlConfirmationIp;
     private Serializable CMlRandomKey;
     private Serializable CMlFormat;
     private Serializable CMlSendMail;

    public Customers() {
    }

	
    public Customers(int CId) {
        this.CId = CId;
    }
    public Customers(int CId, Serializable CEmailAddress, Serializable CTelephone, Serializable CPassword, Float CCustomerDiscount, Serializable CCardholderName, Serializable CCardholderCompany, Serializable CCardholderEuvatnum, Serializable CCardNumber, Serializable CCardType, Serializable CCardStartDate, Serializable CCardExpiry, Serializable CCardIssueNumber, Serializable CCardSecurityNumber, Serializable CCardholderStreetAddress, Serializable CCardholderTownCity, Serializable CCardholderCounty, Serializable CCardholderPostCode, Integer CCardholderCountry, Serializable CShippingName, Serializable CShippingCompany, Serializable CShippingStreetAddress, Serializable CShippingTownCity, Serializable CShippingCounty, Serializable CShippingPostCode, Integer CShippingCountry, Integer CAffiliateId, Serializable CApproved, Integer CCustomerGroupiD, Serializable CIsAffiliate, Float CAffiliateCommission, Integer CLanguageId, Date CMlSignupDateTime, Serializable CMlSignupIp, Date CMlConfirmationDateTime, Serializable CMlConfirmationIp, Serializable CMlRandomKey, Serializable CMlFormat, Serializable CMlSendMail) {
       this.CId = CId;
       this.CEmailAddress = CEmailAddress;
       this.CTelephone = CTelephone;
       this.CPassword = CPassword;
       this.CCustomerDiscount = CCustomerDiscount;
       this.CCardholderName = CCardholderName;
       this.CCardholderCompany = CCardholderCompany;
       this.CCardholderEuvatnum = CCardholderEuvatnum;
       this.CCardNumber = CCardNumber;
       this.CCardType = CCardType;
       this.CCardStartDate = CCardStartDate;
       this.CCardExpiry = CCardExpiry;
       this.CCardIssueNumber = CCardIssueNumber;
       this.CCardSecurityNumber = CCardSecurityNumber;
       this.CCardholderStreetAddress = CCardholderStreetAddress;
       this.CCardholderTownCity = CCardholderTownCity;
       this.CCardholderCounty = CCardholderCounty;
       this.CCardholderPostCode = CCardholderPostCode;
       this.CCardholderCountry = CCardholderCountry;
       this.CShippingName = CShippingName;
       this.CShippingCompany = CShippingCompany;
       this.CShippingStreetAddress = CShippingStreetAddress;
       this.CShippingTownCity = CShippingTownCity;
       this.CShippingCounty = CShippingCounty;
       this.CShippingPostCode = CShippingPostCode;
       this.CShippingCountry = CShippingCountry;
       this.CAffiliateId = CAffiliateId;
       this.CApproved = CApproved;
       this.CCustomerGroupiD = CCustomerGroupiD;
       this.CIsAffiliate = CIsAffiliate;
       this.CAffiliateCommission = CAffiliateCommission;
       this.CLanguageId = CLanguageId;
       this.CMlSignupDateTime = CMlSignupDateTime;
       this.CMlSignupIp = CMlSignupIp;
       this.CMlConfirmationDateTime = CMlConfirmationDateTime;
       this.CMlConfirmationIp = CMlConfirmationIp;
       this.CMlRandomKey = CMlRandomKey;
       this.CMlFormat = CMlFormat;
       this.CMlSendMail = CMlSendMail;
    }
   
    public int getCId() {
        return this.CId;
    }
    
    public void setCId(int CId) {
        this.CId = CId;
    }
    public Serializable getCEmailAddress() {
        return this.CEmailAddress;
    }
    
    public void setCEmailAddress(Serializable CEmailAddress) {
        this.CEmailAddress = CEmailAddress;
    }
    public Serializable getCTelephone() {
        return this.CTelephone;
    }
    
    public void setCTelephone(Serializable CTelephone) {
        this.CTelephone = CTelephone;
    }
    public Serializable getCPassword() {
        return this.CPassword;
    }
    
    public void setCPassword(Serializable CPassword) {
        this.CPassword = CPassword;
    }
    public Float getCCustomerDiscount() {
        return this.CCustomerDiscount;
    }
    
    public void setCCustomerDiscount(Float CCustomerDiscount) {
        this.CCustomerDiscount = CCustomerDiscount;
    }
    public Serializable getCCardholderName() {
        return this.CCardholderName;
    }
    
    public void setCCardholderName(Serializable CCardholderName) {
        this.CCardholderName = CCardholderName;
    }
    public Serializable getCCardholderCompany() {
        return this.CCardholderCompany;
    }
    
    public void setCCardholderCompany(Serializable CCardholderCompany) {
        this.CCardholderCompany = CCardholderCompany;
    }
    public Serializable getCCardholderEuvatnum() {
        return this.CCardholderEuvatnum;
    }
    
    public void setCCardholderEuvatnum(Serializable CCardholderEuvatnum) {
        this.CCardholderEuvatnum = CCardholderEuvatnum;
    }
    public Serializable getCCardNumber() {
        return this.CCardNumber;
    }
    
    public void setCCardNumber(Serializable CCardNumber) {
        this.CCardNumber = CCardNumber;
    }
    public Serializable getCCardType() {
        return this.CCardType;
    }
    
    public void setCCardType(Serializable CCardType) {
        this.CCardType = CCardType;
    }
    public Serializable getCCardStartDate() {
        return this.CCardStartDate;
    }
    
    public void setCCardStartDate(Serializable CCardStartDate) {
        this.CCardStartDate = CCardStartDate;
    }
    public Serializable getCCardExpiry() {
        return this.CCardExpiry;
    }
    
    public void setCCardExpiry(Serializable CCardExpiry) {
        this.CCardExpiry = CCardExpiry;
    }
    public Serializable getCCardIssueNumber() {
        return this.CCardIssueNumber;
    }
    
    public void setCCardIssueNumber(Serializable CCardIssueNumber) {
        this.CCardIssueNumber = CCardIssueNumber;
    }
    public Serializable getCCardSecurityNumber() {
        return this.CCardSecurityNumber;
    }
    
    public void setCCardSecurityNumber(Serializable CCardSecurityNumber) {
        this.CCardSecurityNumber = CCardSecurityNumber;
    }
    public Serializable getCCardholderStreetAddress() {
        return this.CCardholderStreetAddress;
    }
    
    public void setCCardholderStreetAddress(Serializable CCardholderStreetAddress) {
        this.CCardholderStreetAddress = CCardholderStreetAddress;
    }
    public Serializable getCCardholderTownCity() {
        return this.CCardholderTownCity;
    }
    
    public void setCCardholderTownCity(Serializable CCardholderTownCity) {
        this.CCardholderTownCity = CCardholderTownCity;
    }
    public Serializable getCCardholderCounty() {
        return this.CCardholderCounty;
    }
    
    public void setCCardholderCounty(Serializable CCardholderCounty) {
        this.CCardholderCounty = CCardholderCounty;
    }
    public Serializable getCCardholderPostCode() {
        return this.CCardholderPostCode;
    }
    
    public void setCCardholderPostCode(Serializable CCardholderPostCode) {
        this.CCardholderPostCode = CCardholderPostCode;
    }
    public Integer getCCardholderCountry() {
        return this.CCardholderCountry;
    }
    
    public void setCCardholderCountry(Integer CCardholderCountry) {
        this.CCardholderCountry = CCardholderCountry;
    }
    public Serializable getCShippingName() {
        return this.CShippingName;
    }
    
    public void setCShippingName(Serializable CShippingName) {
        this.CShippingName = CShippingName;
    }
    public Serializable getCShippingCompany() {
        return this.CShippingCompany;
    }
    
    public void setCShippingCompany(Serializable CShippingCompany) {
        this.CShippingCompany = CShippingCompany;
    }
    public Serializable getCShippingStreetAddress() {
        return this.CShippingStreetAddress;
    }
    
    public void setCShippingStreetAddress(Serializable CShippingStreetAddress) {
        this.CShippingStreetAddress = CShippingStreetAddress;
    }
    public Serializable getCShippingTownCity() {
        return this.CShippingTownCity;
    }
    
    public void setCShippingTownCity(Serializable CShippingTownCity) {
        this.CShippingTownCity = CShippingTownCity;
    }
    public Serializable getCShippingCounty() {
        return this.CShippingCounty;
    }
    
    public void setCShippingCounty(Serializable CShippingCounty) {
        this.CShippingCounty = CShippingCounty;
    }
    public Serializable getCShippingPostCode() {
        return this.CShippingPostCode;
    }
    
    public void setCShippingPostCode(Serializable CShippingPostCode) {
        this.CShippingPostCode = CShippingPostCode;
    }
    public Integer getCShippingCountry() {
        return this.CShippingCountry;
    }
    
    public void setCShippingCountry(Integer CShippingCountry) {
        this.CShippingCountry = CShippingCountry;
    }
    public Integer getCAffiliateId() {
        return this.CAffiliateId;
    }
    
    public void setCAffiliateId(Integer CAffiliateId) {
        this.CAffiliateId = CAffiliateId;
    }
    public Serializable getCApproved() {
        return this.CApproved;
    }
    
    public void setCApproved(Serializable CApproved) {
        this.CApproved = CApproved;
    }
    public Integer getCCustomerGroupiD() {
        return this.CCustomerGroupiD;
    }
    
    public void setCCustomerGroupiD(Integer CCustomerGroupiD) {
        this.CCustomerGroupiD = CCustomerGroupiD;
    }
    public Serializable getCIsAffiliate() {
        return this.CIsAffiliate;
    }
    
    public void setCIsAffiliate(Serializable CIsAffiliate) {
        this.CIsAffiliate = CIsAffiliate;
    }
    public Float getCAffiliateCommission() {
        return this.CAffiliateCommission;
    }
    
    public void setCAffiliateCommission(Float CAffiliateCommission) {
        this.CAffiliateCommission = CAffiliateCommission;
    }
    public Integer getCLanguageId() {
        return this.CLanguageId;
    }
    
    public void setCLanguageId(Integer CLanguageId) {
        this.CLanguageId = CLanguageId;
    }
    public Date getCMlSignupDateTime() {
        return this.CMlSignupDateTime;
    }
    
    public void setCMlSignupDateTime(Date CMlSignupDateTime) {
        this.CMlSignupDateTime = CMlSignupDateTime;
    }
    public Serializable getCMlSignupIp() {
        return this.CMlSignupIp;
    }
    
    public void setCMlSignupIp(Serializable CMlSignupIp) {
        this.CMlSignupIp = CMlSignupIp;
    }
    public Date getCMlConfirmationDateTime() {
        return this.CMlConfirmationDateTime;
    }
    
    public void setCMlConfirmationDateTime(Date CMlConfirmationDateTime) {
        this.CMlConfirmationDateTime = CMlConfirmationDateTime;
    }
    public Serializable getCMlConfirmationIp() {
        return this.CMlConfirmationIp;
    }
    
    public void setCMlConfirmationIp(Serializable CMlConfirmationIp) {
        this.CMlConfirmationIp = CMlConfirmationIp;
    }
    public Serializable getCMlRandomKey() {
        return this.CMlRandomKey;
    }
    
    public void setCMlRandomKey(Serializable CMlRandomKey) {
        this.CMlRandomKey = CMlRandomKey;
    }
    public Serializable getCMlFormat() {
        return this.CMlFormat;
    }
    
    public void setCMlFormat(Serializable CMlFormat) {
        this.CMlFormat = CMlFormat;
    }
    public Serializable getCMlSendMail() {
        return this.CMlSendMail;
    }
    
    public void setCMlSendMail(Serializable CMlSendMail) {
        this.CMlSendMail = CMlSendMail;
    }




}

