package booker.auth;

import booker.BaseBookerTest;
import booker.model.Credentials;
import booker.util.BookingHelper;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.Matchers.hasKey;

public class AuthServiceTest extends BaseBookerTest {

    @BeforeClass
    public static void setup() {
        RestAssured.basePath = "/auth";
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .build();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectStatusCode(HttpStatus.SC_OK)
                .build();
    }

    @Test
    public void canCreateToken() {
        Credentials creds = Credentials.builder()
                .username("admin")
                .password("password123")
                .build();

        RestAssured.given()
                .body(BookingHelper.toJson(creds, Credentials.class))
                .when()
                .post()
                .then()
                .body("$", hasKey("token"));
    }

}
