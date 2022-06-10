package org.dlea.entities;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CRUDTacticTest {

    @Test
    public void createTactic_itIsCreated() {
        given()
                .when().post("/api/tactic")
                .then()
                .statusCode(201)
                .body("isResultSuccessful", is(true));
    }
}
