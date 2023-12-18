package homework31;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static lesson31.Specification.*;
import static org.hamcrest.Matchers.notNullValue;

public class TestToCheckUserRegistered {
    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testCreatingUser() {
        installSpec(requestSpecification(BASE_URL), responseSpecification(201));
        Register register = new Register("morpheus", "leader");
        SuccessRegistration successRegistration = given()
                .when()
                .body(register)
                .post("api/users")
                .then().log().all()
                .body("id", notNullValue())
                .body("createdAt", notNullValue())
                .extract().as(SuccessRegistration.class);

        Assert.assertEquals(register.getName(), successRegistration.getName());
        Assert.assertEquals(register.getJob(), successRegistration.getJob());
    }
}