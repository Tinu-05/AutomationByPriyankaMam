package testRestAPI;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GETWithoutBDD {
  @Test
  public void singleUserRequest() 
  {
	  
	  Response res=RestAssured.get("https://reqres.in/api/users/2");
	  
	  System.out.println("Status code:"+res.getStatusCode());
	  System.out.println("Status line: "+res.statusLine());
	  System.out.println("Time :"+res.getTime());
	  System.out.println(res.asPrettyString());
	  System.out.println("********************************");
	  System.out.println(res.asString());
	  
	   
  }
  
  @Test
  public void validateResponse()
  {
	
	  Response res=RestAssured.get("https://reqres.in/api/users/2");	
	  int statusCode=res.getStatusCode();
	  Assert.assertEquals(statusCode,200,"Test Fail: Status code not matched!");
	  System.out.println("Test Pass: Status code matched!");
	  System.out.println("Status code: "+statusCode);
	  
	  System.out.println(res.asPrettyString());
	  
	  //to validate json response
	  int id=res.jsonPath().getInt("data.id");
	  System.out.println("Id validation: "+id);
	  
	  String fname=res.jsonPath().getString("data.first_name");
	  Assert.assertEquals(fname,"Janet","Test Fail!");
	  System.out.println("Test Pass: Name matched!");
	  
	  
	  
	  
  }
  
  
  @Test
  public void listOfUsers()
  {
	  Response res=RestAssured.get("https://reqres.in/api/users?page=2");
	  System.out.println(res.asPrettyString());
	   
	 List<Integer> allId=res.jsonPath().getList("data.id"); 
	 System.out.println("Total id are:"+allId.size());
	 
	 for(Integer i:allId)
	 {
		 System.out.println(i);
	 }
	 
	 System.out.println("*********************");
	 
	 //all emails
	 
	 List<String> allEmails=res.jsonPath().getList("data.email");
	 for(String i:allEmails)
	 {
		 System.out.println(i);
	 }
	 
	 
	 System.out.println("*****************");
	 
	 //4th firstname
	 String fname=res.jsonPath().getString("data.first_name[4]");
	 
	 Assert.assertEquals(fname,"George","Test Fail");
	 System.out.println("Test Pass: Firstname matched!");
	 
	 
	  
	  
  }
  
  
  
  
  
  
  
  
  
}
