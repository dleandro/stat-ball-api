package org.dlea;

import org.dlea.common.model.CustomResponse;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserController {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public CustomResponse createUser (User userToBeCreated) {
        return new CustomResponse(true);
    }
}
