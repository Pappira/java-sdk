package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionsSearchResponse {

  private Long total;
  private Long limit;
  private List<QuestionResponse> questions;

  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public List<QuestionResponse> getQuestions() {
    return questions;
  }

  public void setQuestions(List<QuestionResponse> questions) {
    this.questions = questions;
  }
}
