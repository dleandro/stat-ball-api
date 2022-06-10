package org.dlea.player;

import org.dlea.common.model.CustomResponse;
import org.jboss.resteasy.reactive.RestResponse;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/player")
public class PlayerController {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public RestResponse<CustomResponse> createPlayer() {
        return RestResponse.ResponseBuilder.ok(new CustomResponse(true)).status(201).build();
    }
}
