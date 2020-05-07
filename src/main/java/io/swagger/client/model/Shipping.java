/*
 * MercadoLibre API
 * MercadoLibre API Documentation.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Shipping
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-06T14:21:46.668-03:00")
public class Shipping {
  @JsonProperty("mode")
  private String mode = null;

  @JsonProperty("local_pick_up")
  private Boolean localPickUp = null;

  @JsonProperty("free_shipping")
  private Boolean freeShipping = null;

  @JsonProperty("methods")
  private List<String> methods = null;

  @JsonProperty("dimensions")
  private Object dimensions = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  @JsonProperty("costs")
  private List<Costs> costs = null;

  @JsonProperty("logistic_type")
  private String logisticType = null;

  @JsonProperty("store_pick_up")
  private Boolean storePickUp = null;

  public Shipping mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(value = "")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public Shipping localPickUp(Boolean localPickUp) {
    this.localPickUp = localPickUp;
    return this;
  }

   /**
   * Get localPickUp
   * @return localPickUp
  **/
  @ApiModelProperty(value = "")
  public Boolean isLocalPickUp() {
    return localPickUp;
  }

  public void setLocalPickUp(Boolean localPickUp) {
    this.localPickUp = localPickUp;
  }

  public Shipping freeShipping(Boolean freeShipping) {
    this.freeShipping = freeShipping;
    return this;
  }

   /**
   * Get freeShipping
   * @return freeShipping
  **/
  @ApiModelProperty(value = "")
  public Boolean isFreeShipping() {
    return freeShipping;
  }

  public void setFreeShipping(Boolean freeShipping) {
    this.freeShipping = freeShipping;
  }

  public Shipping methods(List<String> methods) {
    this.methods = methods;
    return this;
  }

  public Shipping addMethodsItem(String methodsItem) {
    if (this.methods == null) {
      this.methods = new ArrayList<String>();
    }
    this.methods.add(methodsItem);
    return this;
  }

   /**
   * Get methods
   * @return methods
  **/
  @ApiModelProperty(value = "")
  public List<String> getMethods() {
    return methods;
  }

  public void setMethods(List<String> methods) {
    this.methods = methods;
  }

  public Shipping costs(List<Costs> costs) {
    this.costs = costs;
    return this;
  }

  public Shipping addCostsItem(Costs cost) {
    if (this.costs == null) {
      this.costs = new ArrayList<Costs>();
    }
    this.costs.add(cost);
    return this;
  }

   /**
   * Get costs
   * @return costs
  **/
  @ApiModelProperty(value = "")
  public List<Costs> getCosts() {
    return costs;
  }

  public void setCosts(List<Costs> costs) {
    this.costs = costs;
  }

  public Shipping dimensions(Object dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(value = "")
  public Object getDimensions() {
    return dimensions;
  }

  public void setDimensions(Object dimensions) {
    this.dimensions = dimensions;
  }

  public Shipping tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Shipping addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Shipping logisticType(String logisticType) {
    this.logisticType = logisticType;
    return this;
  }

   /**
   * Get logisticType
   * @return logisticType
  **/
  @ApiModelProperty(value = "")
  public String getLogisticType() {
    return logisticType;
  }

  public void setLogisticType(String logisticType) {
    this.logisticType = logisticType;
  }

  public Shipping storePickUp(Boolean storePickUp) {
    this.storePickUp = storePickUp;
    return this;
  }

   /**
   * Get storePickUp
   * @return storePickUp
  **/
  @ApiModelProperty(value = "")
  public Boolean isStorePickUp() {
    return storePickUp;
  }

  public void setStorePickUp(Boolean storePickUp) {
    this.storePickUp = storePickUp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Shipping shipping = (Shipping) o;
    return Objects.equals(this.mode, shipping.mode) &&
        Objects.equals(this.localPickUp, shipping.localPickUp) &&
        Objects.equals(this.freeShipping, shipping.freeShipping) &&
        Objects.equals(this.methods, shipping.methods) &&
        Objects.equals(this.dimensions, shipping.dimensions) &&
        Objects.equals(this.tags, shipping.tags) &&
        Objects.equals(this.logisticType, shipping.logisticType) &&
        Objects.equals(this.storePickUp, shipping.storePickUp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, localPickUp, freeShipping, methods, dimensions, tags, logisticType, storePickUp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipping {\n");
    
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    localPickUp: ").append(toIndentedString(localPickUp)).append("\n");
    sb.append("    freeShipping: ").append(toIndentedString(freeShipping)).append("\n");
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    logisticType: ").append(toIndentedString(logisticType)).append("\n");
    sb.append("    storePickUp: ").append(toIndentedString(storePickUp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

