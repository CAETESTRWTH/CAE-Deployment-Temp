package i5.las2peer.services.res2;


import java.net.HttpURLConnection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import i5.las2peer.api.Context;
import i5.las2peer.api.ManualDeployment;
import i5.las2peer.api.ServiceException;
import i5.las2peer.api.logging.MonitoringEvent;
import i5.las2peer.restMapper.RESTService;
import i5.las2peer.restMapper.annotations.ServicePath;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;
import org.json.simple.*;

import java.util.HashMap;
import java.util.Map;
 

/**
 *
 * 9
 *
 * This microservice was generated by the CAE (Community Application Editor). If you edit it, please
 * make sure to keep the general structure of the file and only add the body of the methods provided
 * in this main file. Private methods are also allowed, but any "deeper" functionality should be
 * outsourced to (imported) classes.
 *
 */
@ServicePath("res2")
@ManualDeployment
public class Res2 extends RESTService {





  public Res2() {
	super();
    // read and set properties values
    setFieldValues();
    
  }

  @Override
  public void initResources() {
	getResourceConfig().register(RootResource.class);
  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // REST methods
  // //////////////////////////////////////////////////////////////////////////////////////

  @Api
  @SwaggerDefinition(
      info = @Info(title = "9", version = "$Metadata_Version$",
          description = "$Metadata_Description$",
          termsOfService = "$Metadata_Terms$",
          contact = @Contact(name = "me", email = "CAEAddress@gmail.com") ,
          license = @License(name = "BSD",
              url = "https://github.com/CAETESTRWTH/microservice-9/blob/master/LICENSE.txt") ) )
  @Path("/")
  public static class RootResource {

    private final Res2 service = (Res2) Context.getCurrent().getService();

      /**
   * 
   * getText2
   *
   * 
   *
   * 
   * @return Response 
   * 
   */
  @GET
  @Path("/text2")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.TEXT_PLAIN)
  @ApiResponses(value = {
       @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "response2")
  })
  @ApiOperation(value = "getText2", notes = " ")
  public Response getText2() {




     
    // service method invocations

     




    // response2
    boolean response2_condition = true;
    if(response2_condition) {
      JSONObject result2 = new JSONObject();
      result.put("text2", "The other one");
      

      return Response.status(HttpURLConnection.HTTP_OK).entity(result2.toJSONString()).build();
    }
    return null;
  }



  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // Service methods (for inter service calls)
  // //////////////////////////////////////////////////////////////////////////////////////
  
  

  // //////////////////////////////////////////////////////////////////////////////////////
  // Custom monitoring message descriptions (can be called via RMI)
  // //////////////////////////////////////////////////////////////////////////////////////

  public Map<String, String> getCustomMessageDescriptions() {
    Map<String, String> descriptions = new HashMap<>();
    
    return descriptions;
  }

}
