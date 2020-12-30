package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class QuestionResponse {

  private Long id;
  @JsonProperty("seller_id")
  private Long sellerId;
  private MlQuestionStatus status;
  private String text;
  @JsonProperty("item_id")
  private String itemId;
  @JsonProperty("date_created")
  private String dateCreated;
  private MlQuestionAnswer answer;
  private Boolean hold;
  @JsonProperty("deleted_from_listing")
  private Boolean deletedFromListing;
  private MlQuestionFrom from;
  private String email;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getSellerId() {
    return sellerId;
  }

  public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
  }

  public MlQuestionStatus getStatus() {
    return status;
  }

  public void setStatus(MlQuestionStatus status) {
    this.status = status;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public String getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }

  public MlQuestionAnswer getAnswer() {
    return answer;
  }

  public void setAnswer(MlQuestionAnswer answer) {
    this.answer = answer;
  }

  public Boolean getHold() {
    return hold;
  }

  public void setHold(Boolean hold) {
    this.hold = hold;
  }

  public Boolean getDeletedFromListing() {
    return deletedFromListing;
  }

  public void setDeletedFromListing(Boolean deletedFromListing) {
    this.deletedFromListing = deletedFromListing;
  }

  public MlQuestionFrom getFrom() {
    return from;
  }

  public void setFrom(MlQuestionFrom from) {
    this.from = from;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class MlQuestionAnswer {
    private String text;
    private String status;
    @JsonProperty("date_created")
    private String dateCreated;

    public String getText() {
      return text;
    }

    public void setText(String text) {
      this.text = text;
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
  }


  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class MlQuestionFrom {
    private Long id;
    @JsonProperty("answered_questions")
    private Integer answeredQuestions;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private Phone phone;

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public Integer getAnsweredQuestions() {
      return answeredQuestions;
    }

    public void setAnsweredQuestions(Integer answeredQuestions) {
      this.answeredQuestions = answeredQuestions;
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

    public Phone getPhone() {
      return phone;
    }

    public void setPhone(Phone phone) {
      this.phone = phone;
    }
  }


  public enum MlQuestionStatus {
    ANSWERED,
    BANNED,
    CLOSED_UNANSWERED,
    DELETED,
    DISABLED,
    UNANSWERED,
    UNDER_REVIEW;
  }

}
