package test;

import io.cucumber.java.en.When;
import io.restassured.config.Config;

public class test2 {
	

@When("customer creates rule with valid jwt token$")
public void customer_creates_rule_with_valid_jwt_token() 
{
	Config conf = ConfigProvider.getConfig(key: "createDataBaseRule");
	this.baseStep.setApiEndPoint(EndPoint.CREAT_DATE_BASE_RULE);
	this.baseStep.updatePathParam(Param.GOAL_IDENTIFIER,conf.getString(s:"goalIdentifier"));
	String CustomerID = conf.getString(s:"customerID");
	String password = conf.getString(s:"password");
	String entity = conf.getString(s:"entity";)
	String token = TokenGenerationUtility.getCustomerJwtTokenForUK(customerID,password)
	this.baseStep.updateHeader(Header.x_HSBC_E2E_TRUST_TOKEN,token);
	this.baseStep.loadPayload(FlatFile.CREATE_DATE_BASE_RULE_PAYLOAD);
	this.baseStep.postPayload();
	

}
}