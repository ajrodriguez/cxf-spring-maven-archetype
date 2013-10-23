#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.services.impl;

import javax.ws.rs.core.Response;

import ${package}.beans.App;
import ${package}.services.AppService;
import org.springframework.stereotype.Service;

/**
 * @author aj2r
 *
 */
@Service("appService")
public class AppServiceImpl implements AppService {

	public App getAppObject(Long id) {
		
		App app = new App();
		
		app.setId(id);
		app.setDescriptor("Descriptor: " + app.getId());
		
		return app;
	}

	public Response getAppObjectResponse(String descriptor) {
		return Response.status(Response.Status.OK).build(); 
	}

}
