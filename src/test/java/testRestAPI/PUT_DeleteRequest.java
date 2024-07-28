package testRestAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PUT_DeleteRequest {
  @Test
  public void UpdatePUT()
  {
	  //payload
	  PojoData data=new PojoData();
	  data.setName("Kiran");
	  data.setJob("QA");
	  
	  given()
	  	.contentType("application/json")
	  	.body(data)
	  	
	  .when().put("https://reqres.in/api/users/2")
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	  
  }
  
  @Test
  public void deleteUser()
  
  {
	  given()
	  .when().delete("https://reqres.in/api/users/2")
	  
	  .then()
	  .statusCode(204)
	  .log().all();
	  
	  
	  
	  
	  
  }
}
