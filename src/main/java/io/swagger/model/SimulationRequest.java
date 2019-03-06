package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SimulationRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-06T11:26:37.208Z")

public class SimulationRequest   {
  @JsonProperty("loanAmount")
  private Long loanAmount = null;

  @JsonProperty("loanDuration")
  private Integer loanDuration = null;

  public SimulationRequest loanAmount(Long loanAmount) {
    this.loanAmount = loanAmount;
    return this;
  }

  /**
   * Get loanAmount
   * @return loanAmount
  **/
  @ApiModelProperty(value = "")


  public Long getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(Long loanAmount) {
    this.loanAmount = loanAmount;
  }

  public SimulationRequest loanDuration(Integer loanDuration) {
    this.loanDuration = loanDuration;
    return this;
  }

  /**
   * Get loanDuration
   * @return loanDuration
  **/
  @ApiModelProperty(value = "")


  public Integer getLoanDuration() {
    return loanDuration;
  }

  public void setLoanDuration(Integer loanDuration) {
    this.loanDuration = loanDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulationRequest simulationRequest = (SimulationRequest) o;
    return Objects.equals(this.loanAmount, simulationRequest.loanAmount) &&
        Objects.equals(this.loanDuration, simulationRequest.loanDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanAmount, loanDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulationRequest {\n");
    
    sb.append("    loanAmount: ").append(toIndentedString(loanAmount)).append("\n");
    sb.append("    loanDuration: ").append(toIndentedString(loanDuration)).append("\n");
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

