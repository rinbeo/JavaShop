package model.utils;
// Generated Mar 16, 2017 4:57:39 PM by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;

/**
 * Orders generated by hbm2java
 */
public class Orders  implements java.io.Serializable {


     private int OId;
     private Integer OCustomerId;
     private Serializable ODetails;
     private Double OShippingPrice;
     private Double OShippingTax;
     private Double ODiscountPercentage;
     private Double OAffiliatePercentage;
     private Double OTotalPrice;
     private Date ODate;
     private Serializable OPurchaseOrderNo;
     private Integer OSecurityId;
     private Serializable OSent;
     private Serializable OInvoiced;
     private Serializable OShipped;
     private Serializable OPaid;
     private Serializable OStatus;
     private Date OLastModified;
     private Integer OWishListId;
     private Serializable OCouponCode;
     private Float OCouponDiscountTotal;
     private Serializable OPricesIncTax;
     private Integer OTaxDue;
     private Serializable OPaymentGateWay;
     private Serializable OReferenceCode;
     private Integer OLanguageId;
     private Integer OCurrencyId;
     private Double OTotalPriceGateway;
     private Integer OCurrencyIdgateway;
     private Integer OAffiliatePaymentId;
     private Double OAffiliateTotalPrice;
     private Serializable OSendOrderUpdateEmail;
     private Double OOrderHandlingCharge;
     private Double OOrderHandlingChargeTax;
     private Double OCurrencyRate;
     private Serializable OShippingMethod;
     private Serializable OShippingMethodDesc;
     private Serializable OBillingAddress;
     private Serializable OShippingAddress;
     private Float OPromotionDiscountTotal;
     private Serializable OPromotionDescription;

    public Orders() {
    }

	
    public Orders(int OId) {
        this.OId = OId;
    }
    public Orders(int OId, Integer OCustomerId, Serializable ODetails, Double OShippingPrice, Double OShippingTax, Double ODiscountPercentage, Double OAffiliatePercentage, Double OTotalPrice, Date ODate, Serializable OPurchaseOrderNo, Integer OSecurityId, Serializable OSent, Serializable OInvoiced, Serializable OShipped, Serializable OPaid, Serializable OStatus, Date OLastModified, Integer OWishListId, Serializable OCouponCode, Float OCouponDiscountTotal, Serializable OPricesIncTax, Integer OTaxDue, Serializable OPaymentGateWay, Serializable OReferenceCode, Integer OLanguageId, Integer OCurrencyId, Double OTotalPriceGateway, Integer OCurrencyIdgateway, Integer OAffiliatePaymentId, Double OAffiliateTotalPrice, Serializable OSendOrderUpdateEmail, Double OOrderHandlingCharge, Double OOrderHandlingChargeTax, Double OCurrencyRate, Serializable OShippingMethod, Serializable OShippingMethodDesc, Serializable OBillingAddress, Serializable OShippingAddress, Float OPromotionDiscountTotal, Serializable OPromotionDescription) {
       this.OId = OId;
       this.OCustomerId = OCustomerId;
       this.ODetails = ODetails;
       this.OShippingPrice = OShippingPrice;
       this.OShippingTax = OShippingTax;
       this.ODiscountPercentage = ODiscountPercentage;
       this.OAffiliatePercentage = OAffiliatePercentage;
       this.OTotalPrice = OTotalPrice;
       this.ODate = ODate;
       this.OPurchaseOrderNo = OPurchaseOrderNo;
       this.OSecurityId = OSecurityId;
       this.OSent = OSent;
       this.OInvoiced = OInvoiced;
       this.OShipped = OShipped;
       this.OPaid = OPaid;
       this.OStatus = OStatus;
       this.OLastModified = OLastModified;
       this.OWishListId = OWishListId;
       this.OCouponCode = OCouponCode;
       this.OCouponDiscountTotal = OCouponDiscountTotal;
       this.OPricesIncTax = OPricesIncTax;
       this.OTaxDue = OTaxDue;
       this.OPaymentGateWay = OPaymentGateWay;
       this.OReferenceCode = OReferenceCode;
       this.OLanguageId = OLanguageId;
       this.OCurrencyId = OCurrencyId;
       this.OTotalPriceGateway = OTotalPriceGateway;
       this.OCurrencyIdgateway = OCurrencyIdgateway;
       this.OAffiliatePaymentId = OAffiliatePaymentId;
       this.OAffiliateTotalPrice = OAffiliateTotalPrice;
       this.OSendOrderUpdateEmail = OSendOrderUpdateEmail;
       this.OOrderHandlingCharge = OOrderHandlingCharge;
       this.OOrderHandlingChargeTax = OOrderHandlingChargeTax;
       this.OCurrencyRate = OCurrencyRate;
       this.OShippingMethod = OShippingMethod;
       this.OShippingMethodDesc = OShippingMethodDesc;
       this.OBillingAddress = OBillingAddress;
       this.OShippingAddress = OShippingAddress;
       this.OPromotionDiscountTotal = OPromotionDiscountTotal;
       this.OPromotionDescription = OPromotionDescription;
    }
   
    public int getOId() {
        return this.OId;
    }
    
    public void setOId(int OId) {
        this.OId = OId;
    }
    public Integer getOCustomerId() {
        return this.OCustomerId;
    }
    
    public void setOCustomerId(Integer OCustomerId) {
        this.OCustomerId = OCustomerId;
    }
    public Serializable getODetails() {
        return this.ODetails;
    }
    
    public void setODetails(Serializable ODetails) {
        this.ODetails = ODetails;
    }
    public Double getOShippingPrice() {
        return this.OShippingPrice;
    }
    
    public void setOShippingPrice(Double OShippingPrice) {
        this.OShippingPrice = OShippingPrice;
    }
    public Double getOShippingTax() {
        return this.OShippingTax;
    }
    
    public void setOShippingTax(Double OShippingTax) {
        this.OShippingTax = OShippingTax;
    }
    public Double getODiscountPercentage() {
        return this.ODiscountPercentage;
    }
    
    public void setODiscountPercentage(Double ODiscountPercentage) {
        this.ODiscountPercentage = ODiscountPercentage;
    }
    public Double getOAffiliatePercentage() {
        return this.OAffiliatePercentage;
    }
    
    public void setOAffiliatePercentage(Double OAffiliatePercentage) {
        this.OAffiliatePercentage = OAffiliatePercentage;
    }
    public Double getOTotalPrice() {
        return this.OTotalPrice;
    }
    
    public void setOTotalPrice(Double OTotalPrice) {
        this.OTotalPrice = OTotalPrice;
    }
    public Date getODate() {
        return this.ODate;
    }
    
    public void setODate(Date ODate) {
        this.ODate = ODate;
    }
    public Serializable getOPurchaseOrderNo() {
        return this.OPurchaseOrderNo;
    }
    
    public void setOPurchaseOrderNo(Serializable OPurchaseOrderNo) {
        this.OPurchaseOrderNo = OPurchaseOrderNo;
    }
    public Integer getOSecurityId() {
        return this.OSecurityId;
    }
    
    public void setOSecurityId(Integer OSecurityId) {
        this.OSecurityId = OSecurityId;
    }
    public Serializable getOSent() {
        return this.OSent;
    }
    
    public void setOSent(Serializable OSent) {
        this.OSent = OSent;
    }
    public Serializable getOInvoiced() {
        return this.OInvoiced;
    }
    
    public void setOInvoiced(Serializable OInvoiced) {
        this.OInvoiced = OInvoiced;
    }
    public Serializable getOShipped() {
        return this.OShipped;
    }
    
    public void setOShipped(Serializable OShipped) {
        this.OShipped = OShipped;
    }
    public Serializable getOPaid() {
        return this.OPaid;
    }
    
    public void setOPaid(Serializable OPaid) {
        this.OPaid = OPaid;
    }
    public Serializable getOStatus() {
        return this.OStatus;
    }
    
    public void setOStatus(Serializable OStatus) {
        this.OStatus = OStatus;
    }
    public Date getOLastModified() {
        return this.OLastModified;
    }
    
    public void setOLastModified(Date OLastModified) {
        this.OLastModified = OLastModified;
    }
    public Integer getOWishListId() {
        return this.OWishListId;
    }
    
    public void setOWishListId(Integer OWishListId) {
        this.OWishListId = OWishListId;
    }
    public Serializable getOCouponCode() {
        return this.OCouponCode;
    }
    
    public void setOCouponCode(Serializable OCouponCode) {
        this.OCouponCode = OCouponCode;
    }
    public Float getOCouponDiscountTotal() {
        return this.OCouponDiscountTotal;
    }
    
    public void setOCouponDiscountTotal(Float OCouponDiscountTotal) {
        this.OCouponDiscountTotal = OCouponDiscountTotal;
    }
    public Serializable getOPricesIncTax() {
        return this.OPricesIncTax;
    }
    
    public void setOPricesIncTax(Serializable OPricesIncTax) {
        this.OPricesIncTax = OPricesIncTax;
    }
    public Integer getOTaxDue() {
        return this.OTaxDue;
    }
    
    public void setOTaxDue(Integer OTaxDue) {
        this.OTaxDue = OTaxDue;
    }
    public Serializable getOPaymentGateWay() {
        return this.OPaymentGateWay;
    }
    
    public void setOPaymentGateWay(Serializable OPaymentGateWay) {
        this.OPaymentGateWay = OPaymentGateWay;
    }
    public Serializable getOReferenceCode() {
        return this.OReferenceCode;
    }
    
    public void setOReferenceCode(Serializable OReferenceCode) {
        this.OReferenceCode = OReferenceCode;
    }
    public Integer getOLanguageId() {
        return this.OLanguageId;
    }
    
    public void setOLanguageId(Integer OLanguageId) {
        this.OLanguageId = OLanguageId;
    }
    public Integer getOCurrencyId() {
        return this.OCurrencyId;
    }
    
    public void setOCurrencyId(Integer OCurrencyId) {
        this.OCurrencyId = OCurrencyId;
    }
    public Double getOTotalPriceGateway() {
        return this.OTotalPriceGateway;
    }
    
    public void setOTotalPriceGateway(Double OTotalPriceGateway) {
        this.OTotalPriceGateway = OTotalPriceGateway;
    }
    public Integer getOCurrencyIdgateway() {
        return this.OCurrencyIdgateway;
    }
    
    public void setOCurrencyIdgateway(Integer OCurrencyIdgateway) {
        this.OCurrencyIdgateway = OCurrencyIdgateway;
    }
    public Integer getOAffiliatePaymentId() {
        return this.OAffiliatePaymentId;
    }
    
    public void setOAffiliatePaymentId(Integer OAffiliatePaymentId) {
        this.OAffiliatePaymentId = OAffiliatePaymentId;
    }
    public Double getOAffiliateTotalPrice() {
        return this.OAffiliateTotalPrice;
    }
    
    public void setOAffiliateTotalPrice(Double OAffiliateTotalPrice) {
        this.OAffiliateTotalPrice = OAffiliateTotalPrice;
    }
    public Serializable getOSendOrderUpdateEmail() {
        return this.OSendOrderUpdateEmail;
    }
    
    public void setOSendOrderUpdateEmail(Serializable OSendOrderUpdateEmail) {
        this.OSendOrderUpdateEmail = OSendOrderUpdateEmail;
    }
    public Double getOOrderHandlingCharge() {
        return this.OOrderHandlingCharge;
    }
    
    public void setOOrderHandlingCharge(Double OOrderHandlingCharge) {
        this.OOrderHandlingCharge = OOrderHandlingCharge;
    }
    public Double getOOrderHandlingChargeTax() {
        return this.OOrderHandlingChargeTax;
    }
    
    public void setOOrderHandlingChargeTax(Double OOrderHandlingChargeTax) {
        this.OOrderHandlingChargeTax = OOrderHandlingChargeTax;
    }
    public Double getOCurrencyRate() {
        return this.OCurrencyRate;
    }
    
    public void setOCurrencyRate(Double OCurrencyRate) {
        this.OCurrencyRate = OCurrencyRate;
    }
    public Serializable getOShippingMethod() {
        return this.OShippingMethod;
    }
    
    public void setOShippingMethod(Serializable OShippingMethod) {
        this.OShippingMethod = OShippingMethod;
    }
    public Serializable getOShippingMethodDesc() {
        return this.OShippingMethodDesc;
    }
    
    public void setOShippingMethodDesc(Serializable OShippingMethodDesc) {
        this.OShippingMethodDesc = OShippingMethodDesc;
    }
    public Serializable getOBillingAddress() {
        return this.OBillingAddress;
    }
    
    public void setOBillingAddress(Serializable OBillingAddress) {
        this.OBillingAddress = OBillingAddress;
    }
    public Serializable getOShippingAddress() {
        return this.OShippingAddress;
    }
    
    public void setOShippingAddress(Serializable OShippingAddress) {
        this.OShippingAddress = OShippingAddress;
    }
    public Float getOPromotionDiscountTotal() {
        return this.OPromotionDiscountTotal;
    }
    
    public void setOPromotionDiscountTotal(Float OPromotionDiscountTotal) {
        this.OPromotionDiscountTotal = OPromotionDiscountTotal;
    }
    public Serializable getOPromotionDescription() {
        return this.OPromotionDescription;
    }
    
    public void setOPromotionDescription(Serializable OPromotionDescription) {
        this.OPromotionDescription = OPromotionDescription;
    }




}

