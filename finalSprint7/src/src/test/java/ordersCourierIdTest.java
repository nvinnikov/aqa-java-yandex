import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ordersCourierIdTest {
    @Before
    public void setUp() {
        RestAssured.baseURI = "https://qa-scooter.praktikum-services.ru/";
    }

    @Test
    public void checkOrdersResponseBodyTest() {

        Response response = given()
                .header("Content-type", "application/json")
                .when()
                .get("/api/v1/orders?courierId=138882");

        response.then().assertThat()
                .statusCode(200);

        System.out.println(response.body().asString());

    }
}
