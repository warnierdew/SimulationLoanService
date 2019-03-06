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
 * SimulationResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-06T11:26:37.208Z")

public class SimulationResponse   {
  @JsonProperty("installlmentRate")
  private Long installlmentRate = null;

  @JsonProperty("costLoan")
  private Integer costLoan = null;

  public SimulationResponse installlmentRate(Long installlmentRate) {
    this.installlmentRate = installlmentRate;
    return this;
  }

  /**
   * Get installlmentRate
   * @return installlmentRate
  **/
  @ApiModelProperty(value = "")


  public Long getInstalllmentRate() {
    return installlmentRate;
  }

  public void setInstalllmentRate(Long installlmentRate) {
    this.installlmentRate = installlmentRate;
  }

  public SimulationResponse costLoan(Integer costLoan) {
    this.costLoan = costLoan;
    return this;
  }

  /**
   * Get costLoan
   * @return costLoan
  **/
  @ApiModelProperty(value = "")


  public Integer getCostLoan() {
    return costLoan;
  }

  public void setCostLoan(Integer costLoan) {
    this.costLoan = costLoan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulationResponse simulationResponse = (SimulationResponse) o;
    return Objects.equals(this.installlmentRate, simulationResponse.installlmentRate) &&
        Objects.equals(this.costLoan, simulationResponse.costLoan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(installlmentRate, costLoan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulationResponse {\n");
    
    sb.append("    installlmentRate: ").append(toIndentedString(installlmentRate)).append("\n");
    sb.append("    costLoan: ").append(toIndentedString(costLoan)).append("\n");
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

