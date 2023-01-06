import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class courierTest {
    @Before
    public void setUp() {
        RestAssured.baseURI = "https://qa-scooter.praktikum-services.ru/";
    }

    @Test
    public void checkCourierResponseBodyTest() {
        Courier courier = new Courier("nikitanikita", "nikita", "Nikita");

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(courier)
                .when()
                .post("/api/v1/courier");

        response.then().assertThat().body("ok", equalTo(true))
                .and()
                .statusCode(201);

        System.out.println(response.body().asString());

    }

    @Test
    public void checkCourierDoubleResponseBodyTest() {
        Courier courier = new Courier("nikitanikita1", "nikita", "Nikita1");

        Response response1 = given()
                .header("Content-type", "application/json")
                .and()
                .body(courier)
                .when()
                .post("/api/v1/courier");

        Response response2 = given()
                .header("Content-type", "application/json")
                .and()
                .body(courier)
                .when()
                .post("/api/v1/courier");

        response2.then().assertThat().body("message", equalTo("Этот логин уже используется. Попробуйте другой."))
                .and()
                .statusCode(409);

        System.out.println(response2.body().asString());

    }

    @Test
    public void checkCourierResponseWithoutFieldBodyTest() {
        CourierWithoutPassword courierWithoutPassword = new CourierWithoutPassword("nikitanikita3d21nikita", "Nikita");

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(courierWithoutPassword)
                .when()
                .post("/api/v1/courier");

        response.then().assertThat().body("message", equalTo("Недостаточно данных для создания учетной записи"))
                .and()
                .statusCode(400);

        System.out.println(response.body().asString());

    }

}
