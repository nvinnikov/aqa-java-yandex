import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class courierLoginTest {
    @Before
    public void setUp() {
        RestAssured.baseURI = "https://qa-scooter.praktikum-services.ru/";
    }

    @Test
    public void checkCourierLoginResponseBodyTest() {
        CourierLogin courierLogin = new CourierLogin("nikitanikita", "nikita");

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(courierLogin)
                .when()
                .post("/api/v1/courier/login");

        response.then().assertThat().body("id", equalTo(139762))
                .and()
                .statusCode(200);

        System.out.println(response.body().asString());

    }

    @Test
    public void checkCourierLoginBadPasswordResponseBodyTest() {
        CourierLogin courierLogin = new CourierLogin("nikitanikita", "nikitanikita");

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(courierLogin)
                .when()
                .post("/api/v1/courier/login");

        response.then().assertThat().body("message", equalTo("Учетная запись не найдена"))
                .and()
                .statusCode(404);

        System.out.println(response.body().asString());

    }

}
