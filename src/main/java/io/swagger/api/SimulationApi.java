/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.2).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.SimulationRequest;
import io.swagger.model.SimulationResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-06T11:26:37.208Z")

@Api(value = "simulation", description = "the simulation API")
public interface SimulationApi {

    @ApiOperation(value = "Simulation crédit", nickname = "addPet", notes = "", response = SimulationResponse.class, tags={ "simulation", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = SimulationResponse.class),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/simulation",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<SimulationResponse> addPet(@ApiParam(value = "Variable du prêt" ,required=true )  @Valid @RequestBody SimulationRequest body);

}