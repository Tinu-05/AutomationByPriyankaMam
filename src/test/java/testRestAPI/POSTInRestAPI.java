package testRestAPI;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class POSTInRestAPI {
  @Test
  public void createUser_HashMap() 
  {
	  //request payload
	  HashMap<String,Object> data=new HashMap<String,Object>();
	  data.put("name","Sarang");
	  data.put("job","QA");
	  
	Response res= given()
	 	.contentType("application/json")
	 	.body(data)
	 
	 .when().post("https://reqres.in/api/users");
	 
	System.out.println("User Created with id: "+res.jsonPath().getInt("id"));
	String name=res.jsonPath().getString("name");
	System.out.println("User name is: "+name);
	
	
//	 .then()
//	 .statusCode(201)
//	 .log().body();
	  
	  
  }
  
  
  @Test
  public void postUsingPOJO()
  {
	  //request payload
	  
	 PojoData data=new PojoData();
	 data.setName("Jay");
	 data.setJob("SDET");
	 
	  given()
	  	.contentType("application/json")
	  	.body(data)
	  
	  .when()
	  	.post("https://reqres.in/api/users")
	  .then()
	  .statusCode(201)
	  .log().body();
  }
  
  
  
  
  
  
}
