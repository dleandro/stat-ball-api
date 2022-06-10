package org.dlea.tactic;

import org.dlea.common.model.CustomResponse;
import org.jboss.resteasy.reactive.RestResponse;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tactic")
public class TacticController {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public RestResponse<CustomResponse> createTactic() {
        return RestResponse.ResponseBuilder.ok(new CustomResponse(true)).status(201).build();
    }
}
