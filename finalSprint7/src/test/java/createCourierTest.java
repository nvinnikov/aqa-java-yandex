import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.*;

public class Praktikum {

    @Before
    public void setUp() {
        RestAssured.baseURI = "https://qa-mesto.praktikum-services.ru";
    }

    @Test
    public void checkUserActivityAndPrintResponseBody() {

        // отправляет запрос и сохраняет ответ в переменную response, экзмепляр класса Response
        Response response = given().auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MzI4NDExNTM2OTc4NDAwM2QwZTZjOTQiLCJpYXQiOjE2NzAyNDA4MTksImV4cCI6MTY3MDg0NTYxOX0.iu076eZuughuMzklQFSOg_SwL8XxWCblho-xPXd_AEM").get("/api/users/me");
        // проверяет, что в теле ответа ключу about соответствует нужное занятие
        response.then().assertThat().body("data.about",equalTo("Исследователь"));
        // выводит тело ответа на экран
        System.out.println(response.body().asString());

    }

}