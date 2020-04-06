package model;

import java.sql.Time;

public class responseModel {

	private int responseId;
	
	private String response;


	public responseModel() {

		this.responseId = 0;
		this.response = "";
	}


	public responseModel(int responseId, String response) {

		this.responseId = responseId;
		this.response = response;
	}


	public int getResponseId() {
		return responseId;
	}


	public void setResponseId(int responseId) {
		this.responseId = responseId;
	}


	public String getResponse() {
		return response;
	}


	public void setResponse(String response) {
		this.response = response;
	}
	
	

	
	
	
}
