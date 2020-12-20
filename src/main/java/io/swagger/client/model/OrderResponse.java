package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

public class OrderResponse {

  private Long id;
  private MlOrderStatus status;

  @JsonProperty("status_detail")
  private String statusDetail;
  @JsonProperty("date_created")
  private String dateCreated;
  @JsonProperty("date_closed")
  private String dateClosed;
  @JsonProperty("last_updated")
  private String lastUpdated;
  @JsonProperty("manufacturing_ending_date")
  private String manufacturingEndingDate;
  @JsonProperty("order_items")
  private List<MlOrderItem> orderItems;
  @JsonProperty("total_amount")
  private Integer totalAmount;
  @JsonProperty("paid_amount")
  private Integer paidAmount;
  private Taxes taxes;
  @JsonProperty("currency_id")
  private String currencyId;
  private MlBuyer buyer;
  private MlSeller seller;
  private List<MlPayment> payments;
  private MlShipping shipping;
  private List<String> tags;
  private Feedback feedback;
  private boolean fulfilled;
  @JsonProperty("cancel_detail")
  private CancelDetail cancelDetail;
  private List<Mediation> mediations;

  public List<Mediation> getMediations() {
    return mediations;
  }

  public void setMediations(List<Mediation> mediations) {
    this.mediations = mediations;
  }

  public CancelDetail getCancelDetail() {
    return cancelDetail;
  }

  public void setCancelDetail(CancelDetail cancelDetail) {
    this.cancelDetail = cancelDetail;
  }

  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public String getManufacturingEndingDate() {
    return manufacturingEndingDate;
  }

  public void setManufacturingEndingDate(String manufacturingEndingDate) {
    this.manufacturingEndingDate = manufacturingEndingDate;
  }

  public Integer getPaidAmount() {
    return paidAmount;
  }

  public void setPaidAmount(Integer paidAmount) {
    this.paidAmount = paidAmount;
  }

  public Taxes getTaxes() {
    return taxes;
  }

  public void setTaxes(Taxes taxes) {
    this.taxes = taxes;
  }

  public Feedback getFeedback() {
    return feedback;
  }

  public void setFeedback(Feedback feedback) {
    this.feedback = feedback;
  }

  public boolean isFulfilled() {
    return fulfilled;
  }

  public void setFulfilled(boolean fulfilled) {
    this.fulfilled = fulfilled;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MlOrderStatus getStatus() {
    return status;
  }

  public void setStatus(MlOrderStatus status) {
    this.status = status;
  }

  public String getStatusDetail() {
    return statusDetail;
  }

  public void setStatusDetail(String statusDetail) {
    this.statusDetail = statusDetail;
  }

  public String getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }

  public String getDateClosed() {
    return dateClosed;
  }

  public void setDateClosed(String dateClosed) {
    this.dateClosed = dateClosed;
  }

  public List<MlOrderItem> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<MlOrderItem> orderItems) {
    this.orderItems = orderItems;
  }

  public Integer getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
  }

  public String getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(String currencyId) {
    this.currencyId = currencyId;
  }

  public MlBuyer getBuyer() {
    return buyer;
  }

  public void setBuyer(MlBuyer buyer) {
    this.buyer = buyer;
  }

  public MlSeller getSeller() {
    return seller;
  }

  public void setSeller(MlSeller seller) {
    this.seller = seller;
  }

  public List<MlPayment> getPayments() {
    return payments;
  }

  public void setPayments(List<MlPayment> payments) {
    this.payments = payments;
  }

  public MlShipping getShipping() {
    return shipping;
  }

  public void setShipping(MlShipping shipping) {
    this.shipping = shipping;
  }

  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class MlOrderItem {
    private MlItem item;
    private Integer quantity;
    @JsonProperty("unit_price")
    private Integer unitPrice;
    @JsonProperty("full_unit_price")
    private Integer fullUnitPrice;
    @JsonProperty("manufacturing_days")
    private Integer manufacturinDays;
    @JsonProperty("sale_fee")
    private BigDecimal saleFee;
    @JsonProperty("currency_id")
    private String currencyId;
    @JsonProperty("listing_type_id")
    private String listingTypeId;

    public MlItem getItem() {
      return item;
    }

    public void setItem(MlItem item) {
      this.item = item;
    }

    public Integer getQuantity() {
      return quantity;
    }

    public void setQuantity(Integer quantity) {
      this.quantity = quantity;
    }

    public Integer getUnitPrice() {
      return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
      this.unitPrice = unitPrice;
    }

    public String getCurrencyId() {
      return currencyId;
    }

    public void setCurrencyId(String currencyId) {
      this.currencyId = currencyId;
    }

    public Integer getFullUnitPrice() {
      return fullUnitPrice;
    }

    public void setFullUnitPrice(Integer fullUnitPrice) {
      this.fullUnitPrice = fullUnitPrice;
    }

    public Integer getManufacturinDays() {
      return manufacturinDays;
    }

    public void setManufacturinDays(Integer manufacturinDays) {
      this.manufacturinDays = manufacturinDays;
    }

    public BigDecimal getSaleFee() {
      return saleFee;
    }

    public void setSaleFee(BigDecimal saleFee) {
      this.saleFee = saleFee;
    }

    public String getListingTypeId() {
      return listingTypeId;
    }

    public void setListingTypeId(String listingTypeId) {
      this.listingTypeId = listingTypeId;
    }
  }


  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class MlItem {
    private String id;
    private String title;
    @JsonProperty("variation_id")
    private String variationId;
    @JsonProperty("seller_sku")
    private String sellerSku;
    @JsonProperty("variation_attributes")
    private List<String> variationAttributes;

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public String getVariationId() {
      return variationId;
    }

    public void setVariationId(String variationId) {
      this.variationId = variationId;
    }

    public List<String> getVariationAttributes() {
      return variationAttributes;
    }

    public void setVariationAttributes(List<String> variationAttributes) {
      this.variationAttributes = variationAttributes;
    }

    public String getSellerSku() {
      return sellerSku;
    }

    public void setSellerSku(String sellerSku) {
      this.sellerSku = sellerSku;
    }
  }


  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class MlBillingInfo {
    @JsonProperty("doc_type")
    private String docType;
    @JsonProperty("doc_number")
    private String docNumber;

    public String getDocType() {
      return docType;
    }

    public void setDocType(String docType) {
      this.docType = docType;
    }

    public String getDocNumber() {
      return docNumber;
    }

    public void setDocNumber(String docNumber) {
      this.docNumber = docNumber;
    }
  }


  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class MlBuyer {
    private Long id;
    private String nickname;
    private String email;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("billing_info")
    private MlBillingInfo billingInfo;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public String getNickname() {
      return nickname;
    }

    public void setNickname(String nickname) {
      this.nickname = nickname;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public String getFirstName() {
      return firstName;
    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public String getLastName() {
      return lastName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    public MlBillingInfo getBillingInfo() {
      return billingInfo;
    }

    public void setBillingInfo(MlBillingInfo billingInfo) {
      this.billingInfo = billingInfo;
    }
  }


  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class MlSeller {
    private String id;
    private String nickname;
    private String email;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getNickname() {
      return nickname;
    }

    public void setNickname(String nickname) {
      this.nickname = nickname;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public String getFirstName() {
      return firstName;
    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public String getLastName() {
      return lastName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }
  }


  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class MlPayment {
    private Long id;
    @JsonProperty("order_id")
    private Long orderId;
    @JsonProperty("payer_id")
    private Long payerId;
    @JsonProperty("card_id")
    private Long cardId;
    private Collector collector;
    private String status;
    @JsonProperty("status_code")
    private String statusCode;
    @JsonProperty("status_detail")
    private String statusDetail;
    @JsonProperty("site_id")
    private String siteId;
    @JsonProperty("payment_method_id")
    private String paymentMethodId;
    @JsonProperty("issuer_id")
    private String issuerId;
    private String reason;
    @JsonProperty("date_created")
    private String dateCreated;
    @JsonProperty("date_last_modified")
    private String dateLastModified;
    @JsonProperty("date_approved")
    private String dateApproved;
    @JsonProperty("authorization_code")
    private String authorizationCode;
    @JsonProperty("transaction_amount")
    private Integer transactionAmount;
    @JsonProperty("taxes_amount")
    private Integer taxesAmount;
    @JsonProperty("shipping_cost")
    private Integer shippingCost;
    @JsonProperty("coupon_amount")
    private Integer couponAmount;
    @JsonProperty("overpaid_amount")
    private Integer overPaidAmount;
    @JsonProperty("total_paid_amount")
    private Integer totalPaidAmount;
    @JsonProperty("installments")
    private Integer installments;
    @JsonProperty("installment_amount")
    private Integer installmentAmount;
    @JsonProperty("currency_id")
    private String currencyId;
    @JsonProperty("coupon_id")
    private String couponId;
    @JsonProperty("activation_uri")
    private String activationUri;
    @JsonProperty("operation_type")
    private String operationType;
    @JsonProperty("payment_type")
    private String paymentType;
    @JsonProperty("available_actions")
    private List<String> availableActions;
    @JsonProperty("atm_transfer_reference")
    private AtmTransferReference atmTransferReference;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public Long getOrderId() {
      return orderId;
    }

    public void setOrderId(Long orderId) {
      this.orderId = orderId;
    }

    public Long getPayerId() {
      return payerId;
    }

    public void setPayerId(Long payerId) {
      this.payerId = payerId;
    }

    public Long getCardId() {
      return cardId;
    }

    public void setCardId(Long cardId) {
      this.cardId = cardId;
    }

    public Collector getCollector() {
      return collector;
    }

    public void setCollector(Collector collector) {
      this.collector = collector;
    }

    public String getStatusCode() {
      return statusCode;
    }

    public void setStatusCode(String statusCode) {
      this.statusCode = statusCode;
    }

    public String getStatusDetail() {
      return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
      this.statusDetail = statusDetail;
    }

    public String getSiteId() {
      return siteId;
    }

    public void setSiteId(String siteId) {
      this.siteId = siteId;
    }

    public String getPaymentMethodId() {
      return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
      this.paymentMethodId = paymentMethodId;
    }

    public String getIssuerId() {
      return issuerId;
    }

    public void setIssuerId(String issuerId) {
      this.issuerId = issuerId;
    }

    public String getReason() {
      return reason;
    }

    public void setReason(String reason) {
      this.reason = reason;
    }

    public String getDateApproved() {
      return dateApproved;
    }

    public void setDateApproved(String dateApproved) {
      this.dateApproved = dateApproved;
    }

    public String getAuthorizationCode() {
      return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
      this.authorizationCode = authorizationCode;
    }

    public Integer getTaxesAmount() {
      return taxesAmount;
    }

    public void setTaxesAmount(Integer taxesAmount) {
      this.taxesAmount = taxesAmount;
    }

    public Integer getShippingCost() {
      return shippingCost;
    }

    public void setShippingCost(Integer shippingCost) {
      this.shippingCost = shippingCost;
    }

    public Integer getCouponAmount() {
      return couponAmount;
    }

    public void setCouponAmount(Integer couponAmount) {
      this.couponAmount = couponAmount;
    }

    public Integer getOverPaidAmount() {
      return overPaidAmount;
    }

    public void setOverPaidAmount(Integer overPaidAmount) {
      this.overPaidAmount = overPaidAmount;
    }

    public Integer getTotalPaidAmount() {
      return totalPaidAmount;
    }

    public void setTotalPaidAmount(Integer totalPaidAmount) {
      this.totalPaidAmount = totalPaidAmount;
    }

    public Integer getInstallments() {
      return installments;
    }

    public void setInstallments(Integer installments) {
      this.installments = installments;
    }

    public Integer getInstallmentAmount() {
      return installmentAmount;
    }

    public void setInstallmentAmount(Integer installmentAmount) {
      this.installmentAmount = installmentAmount;
    }

    public String getCouponId() {
      return couponId;
    }

    public void setCouponId(String couponId) {
      this.couponId = couponId;
    }

    public String getActivationUri() {
      return activationUri;
    }

    public void setActivationUri(String activationUri) {
      this.activationUri = activationUri;
    }

    public String getOperationType() {
      return operationType;
    }

    public void setOperationType(String operationType) {
      this.operationType = operationType;
    }

    public String getPaymentType() {
      return paymentType;
    }

    public void setPaymentType(String paymentType) {
      this.paymentType = paymentType;
    }

    public List<String> getAvailableActions() {
      return availableActions;
    }

    public void setAvailableActions(List<String> availableActions) {
      this.availableActions = availableActions;
    }

    public AtmTransferReference getAtmTransferReference() {
      return atmTransferReference;
    }

    public void setAtmTransferReference(AtmTransferReference atmTransferReference) {
      this.atmTransferReference = atmTransferReference;
    }

    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }

    public String getDateCreated() {
      return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
      this.dateCreated = dateCreated;
    }

    public String getDateLastModified() {
      return dateLastModified;
    }

    public void setDateLastModified(String dateLastModified) {
      this.dateLastModified = dateLastModified;
    }

    public Integer getTransactionAmount() {
      return transactionAmount;
    }

    public void setTransactionAmount(Integer transactionAmount) {
      this.transactionAmount = transactionAmount;
    }

    public String getCurrencyId() {
      return currencyId;
    }

    public void setCurrencyId(String currencyId) {
      this.currencyId = currencyId;
    }
  }


  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Collector {
    private Long id;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }
  }


  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class AtmTransferReference {
    @JsonProperty("company_id")
    private String companyId;
    @JsonProperty("transaction_id")
    private String transactionId;

    public String getCompanyId() {
      return companyId;
    }

    public void setCompanyId(String companyId) {
      this.companyId = companyId;
    }

    public String getTransactionId() {
      return transactionId;
    }

    public void setTransactionId(String transactionId) {
      this.transactionId = transactionId;
    }
  }


  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class MlShipping {
    private Long id;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }
  }


  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Taxes {
    private Long amount;
    @JsonProperty("currency_id")
    private String currencyId;

    public Long getAmount() {
      return amount;
    }

    public void setAmount(Long amount) {
      this.amount = amount;
    }

    public String getCurrencyId() {
      return currencyId;
    }

    public void setCurrencyId(String currencyId) {
      this.currencyId = currencyId;
    }
  }


  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class CancelDetail {
    @JsonProperty("group")
    private String group;
    @JsonProperty("code")
    private String code;
    @JsonProperty("description")
    private String description;
    @JsonProperty("requested_by")
    private String requestedBy;
    @JsonProperty("date")
    private String date;
    @JsonProperty("application_id")
    private String applicationId;

    public String getGroup() {
      return group;
    }

    public void setGroup(String group) {
      this.group = group;
    }

    public String getCode() {
      return code;
    }

    public void setCode(String code) {
      this.code = code;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public String getRequestedBy() {
      return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
      this.requestedBy = requestedBy;
    }

    public String getDate() {
      return date;
    }

    public void setDate(String date) {
      this.date = date;
    }

    public String getApplicationId() {
      return applicationId;
    }

    public void setApplicationId(String applicationId) {
      this.applicationId = applicationId;
    }
  }


  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Feedback {
    private FeedbackObject sale;
    private FeedbackObject purchase;

    public FeedbackObject getSale() {
      return sale;
    }

    public void setSale(FeedbackObject sale) {
      this.sale = sale;
    }

    public FeedbackObject getPurchase() {
      return purchase;
    }

    public void setPurchase(FeedbackObject purchase) {
      this.purchase = purchase;
    }
  }


  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class FeedbackObject {
    private Long id;
    @JsonProperty("date_created")
    private String dateCreated;
    private boolean fulfilled;
    private String rating;
    private String status;
    private String reason;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public String getDateCreated() {
      return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
      this.dateCreated = dateCreated;
    }

    public boolean isFulfilled() {
      return fulfilled;
    }

    public void setFulfilled(boolean fulfilled) {
      this.fulfilled = fulfilled;
    }

    public String getRating() {
      return rating;
    }

    public void setRating(String rating) {
      this.rating = rating;
    }

    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }

    public String getReason() {
      return reason;
    }

    public void setReason(String reason) {
      this.reason = reason;
    }
  }


  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Mediation {
    private Long id;
    @JsonProperty("date_created")
    private String dateCreated;
    private String status;
    private Object interactions;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public String getDateCreated() {
      return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
      this.dateCreated = dateCreated;
    }


    public String getStatus() {
      return status;
    }

    public void setStatus(String status) {
      this.status = status;
    }

    public Object getInteractions() {
      return interactions;
    }

    public void setInteractions(Object interactions) {
      this.interactions = interactions;
    }
  }


  public enum MlOrderStatus {
    confirmed,
    payment_required,
    payment_in_process,
    partially_paid,
    paid,
    cancelled;
  }

}
