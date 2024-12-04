package test;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import ...

public class data {

	public ArrayList<Goal> getGoals(){ return goals ;}
	
	public void setGoals(ArrayList<Goal> goals) { this.goals=goals;}
	
	@JsonProperty("goals")
	public ArrayList<Goal> goals;
	
	public static class goal{
		
		public String goalIdentifier ;
		
		public String getStatusType() {return statusType;}
		
		public void setStatusType(String statusType) {this.statusType = statusType;}
		
		public String statusType;
		public String startDate;
		public String categorycode;
		public String goalName;
		public TargetAmount targetAmount;
		public CurrentBalanceAmount currentBalanceAmount;
		public String completionPercent;
		public ArrayList<Object> associtedPost;
		public String goalType;
		
	}
		
	 //1 usage
		public class CurrentBalanceAmount{
			public String getAmount() {return amount;}
			
			public void setAmount(String amount) {this.amount=amount;}
			
			public String amount ;
			public String currencyCode;
			
		}	
	
		
		

		 //1 usage
		public class TargetAmount{
			public String getAmount() {return amount;}
			
			public void setAmount(String amount) {this.amount=amount;}
			
			public String amount ;
			public String currencyCode;
			
		}	
	
		
		
		
		
		
		
	}
	
	
	
	
	

