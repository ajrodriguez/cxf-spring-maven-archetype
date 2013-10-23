#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import ${package}.beans.App;

/**
 * @author aj2r
 *
 */
@WebService
@Path("/appService/")
@Produces("application/json")
public interface AppService {
	
	@WebMethod
	@GET
	@Path("/getApp/{id}")
	public App getAppObject(@PathParam("id") Long id);

	@WebMethod
	@POST
	@Path("/appResponse/{descriptor}")
	public Response getAppObjectResponse(@PathParam("descriptor") String descriptor) ;
	

}

