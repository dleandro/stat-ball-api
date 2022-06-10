package org.dlea.entities;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.response.Response;
import org.dlea.common.model.CustomResponse;
import org.dlea.common.model.MatchResult;
import org.dlea.match.Match;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CRUDMatchTest {

    static Match matchToBeCreated;
    static MatchResult matchResultToCheck;

    @BeforeAll
    public static void testPreparation() {
        matchToBeCreated = new Match();
        matchResultToCheck = new MatchResult(1, 0);
        matchToBeCreated.setActualMatchResult(matchResultToCheck);
    }

    @Test
    public void createMatch_itIsCreated() {
        // this needs to be a json object
        createMatch(matchToBeCreated)
                .then()
                .statusCode(201)
                .body("isResultSuccessful", is(true));
    }

    @Test
    public void getCreatedMatch_itIsReturned() {
        Response createdMatch = createMatch(matchToBeCreated);
        CustomResponse<Integer> createdMatchId = createdMatch.body().jsonPath().get("objectToReturn");

        // add header on response with redirect which will have the created resource id
        given()
                .when()
                .get(String.format("/api/match/%s", createdMatchId))
                .then()
                .statusCode(200)
                .body(
                        "id", is(createdMatchId),
                        ".matchResult.homeTeamGoals", is(matchResultToCheck.getHomeTeamGoals()),
                        ".matchResult.awayTeamGoals", is(matchResultToCheck.getAwayTeamGoals()));
    }

    public Response createMatch(Match matchToBeCreated) {
        return given()
                .when()
                .body(matchToBeCreated)
                .post("/api/match");
    }


}
