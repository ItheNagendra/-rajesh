package test;

public class test3 {

	
	package test;

	import io.cucumber.java.en.When;
	import io.restassured.config.Config;
	import io.restassured.config.ConfigProvider;

	public class test2 {

	    @When("customer creates rule with valid jwt token$")
	    public void customer_creates_rule_with_valid_jwt_token() {
	        // Retrieve configuration values
	        Config conf = ConfigProvider.getConfig();
	        this.baseStep.setApiEndPoint(EndPoint.CREATE_DATE_BASE_RULE);
	        this.baseStep.updatePathParam(Param.GOAL_IDENTIFIER, conf.getString("goalIdentifier"));

	        String customerID = conf.getString("customerID");
	        String password = conf.getString("password");
	        String entity = conf.getString("entity");
	        String token = TokenGenerationUtility.getCustomerJwtTokenForUK(customerID, password);

	        this.baseStep.updateHeader(Header.X_HSBC_E2E_TRUST_TOKEN, token);
	        this.baseStep.loadPayload(FlatFile.CREATE_DATE_BASE_RULE_PAYLOAD);
	        this.baseStep.postPayload();
	    }
	}

	
	
	
	
	
	
	
	
	
	package test; // This defines the package where this class resides, organizing your code logically.

	public class test3 { // This is the main class named `test3`. It serves as the container for your logic and methods.

	    // Nested class `test2`
	    package test; // Defines the same package as the outer class. It should not be repeated here.
	    
	    import io.cucumber.java.en.When; // Imports the `@When` annotation, part of the Cucumber library used for defining test steps in Gherkin.
	    import io.restassured.config.Config; // Provides configuration for REST-assured API testing.
	    import io.restassured.config.ConfigProvider; // A utility to fetch configuration details for REST-assured.

	    public class test2 { // Defines the `test2` class, which contains a test step.

	        @When("customer creates rule with valid jwt token$") 
	        // This Cucumber annotation links a Gherkin step (written in plain text) to this method.
	        public void customer_creates_rule_with_valid_jwt_token() { 
	            // This method is executed when the corresponding Gherkin step is triggered.

	            // Retrieve configuration values from a central configuration provider.
	            Config conf = ConfigProvider.getConfig();
	            // Example: `conf.getString("goalIdentifier")` fetches the "goalIdentifier" value from the configuration file.

	            // Set the API endpoint to be used for the request.
	            this.baseStep.setApiEndPoint(EndPoint.CREATE_DATE_BASE_RULE);
	            // Example: Sets the endpoint for creating a rule in the database.

	            // Update the URL path with the goal identifier from the configuration.
	            this.baseStep.updatePathParam(Param.GOAL_IDENTIFIER, conf.getString("goalIdentifier"));
	            // Example: If the URL template is `/rules/{goalIdentifier}`, this replaces `{goalIdentifier}` with the actual value.

	    
	            
	            // Retrieve customer credentials from the configuration.
	            String customerID = conf.getString("customerID"); // Fetch the customer ID.
	            String password = conf.getString("password"); // Fetch the customer password.
	            String entity = conf.getString("entity"); // Fetch additional information, such as the customer's entity (e.g., region or group).

	            // Generate a JWT token for authentication using the customer credentials.
	            String token = TokenGenerationUtility.getCustomerJwtTokenForUK(customerID, password);
	            // Example: Calls a utility to generate a JWT token for the UK region.

	            // Add the generated token to the request header for authentication.
	            this.baseStep.updateHeader(Header.X_HSBC_E2E_TRUST_TOKEN, token);
	            // Example: Adds a header named `X-HSBC-E2E-TRUST-TOKEN` with the token value.

	            // Load the payload (request body) for creating a rule.
	            this.baseStep.loadPayload(FlatFile.CREATE_DATE_BASE_RULE_PAYLOAD);
	            // Example: Reads the payload content from a flat file containing predefined JSON or XML data.

	            // Send the POST request with the payload to the specified endpoint.
	            this.baseStep.postPayload();
	            // Example: Executes the API call, using the configured endpoint, headers, and body.
	        }
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
