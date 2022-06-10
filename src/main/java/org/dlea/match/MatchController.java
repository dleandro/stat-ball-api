package org.dlea.match;

import org.dlea.common.model.CustomResponse;
import org.jboss.resteasy.reactive.RestResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/match")
public class MatchController {

    @Inject
    MatchService ms;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public RestResponse<CustomResponse<Long>> createMatch(@RequestBody Match matchToBeCreated) {
        Long createdMatchId = ms.createMatch(matchToBeCreated);

        return RestResponse.ResponseBuilder.ok(new CustomResponse<Long>(createdMatchId, true)).status(201).build();
    }
}