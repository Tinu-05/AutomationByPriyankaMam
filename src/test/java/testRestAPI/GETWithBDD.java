package testRestAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
/*
 * given() -prerequisite
 * ---------------------
 * headers,cookies,request payload,query and path param ,authentication
 * 
 * when() -API Request
 * ---------------------
 * GET,POST,PUT,PATCH,DELETE
 * 
 * then() -validate response
 * -----------------------------
 * status code,time,status message,response payload
 * 
 */
public class GETWithBDD {
  @Test
  public void getTheSignleUser()
  {
	  
	  given()
	  
	  .when()
	  	.get("https://reqres.in/api/users/2")
	  
	  
	  .then()
	  	.statusCode(200)
	  	.log().all();
	  
	  
	  
	  
	  
  }
  
  
  @Test
  public void validateSignleUser()
  {
	  
	  Response res=given()
	  
			  .when()
			  .get("https://reqres.in/api/users/2");
	  
	  
	  System.out.println(res.asPrettyString());
	  int statusCode=res.statusCode();
	  Assert.assertEquals(statusCode,200);
	  System.out.println("Status code is: 200 : Test Pass");
	  //url
	  String url=res.jsonPath().getString("support.url");
	  Assert.assertEquals(url,"https://reqres.in/#support-heading");
	  System.out.println("Test Pass: Url matched!");
	  
	  
	  
//	  .then()
//	  	.statusCode(200)
//	  	.log().all();
	  
	  
	  
	  
	  
  }
  /*
   * equalTo()-test equality for data
	hasItems() -> Check all elements are in a collection
	contains() -> Check all elements are in a collection and in a strict order

   */
  @Test 
  public void validateListOfUsers()
  {
	  given()
	  
	  .when()
	  .get("https://reqres.in/api/users?page=2")
	  
	  .then()
	  .statusCode(200)
	  .body("page",equalTo(2))
	  .body("data.id[0]",equalTo(7))
	  .body("data.first_name[5]",equalTo("Rachel"))
	  //hasItems():Check all elements are in a collection
	  .body("data.id",hasItems(7,8,9,10,11,12))//pass
	  .body("data.id",hasItems(7,10,12))//pass
	  .body("data.id",hasItems(12,7,10,8,9))//pass
	  //.body("data.id",hasItems(7,8,9,10,11,13))//fails
	  
	  //contains():Check all elements are in a collection and in a strict order
	  
	  .body("data.id",contains(7,8,9,10,11,12))//pass
	  //.body("data.id",contains(7,8,12))//fail
	  .body("data.id",contains(7,10,9,8,11,12))//fail
	  
	  .log().all();
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
