package com.grupo.mscn.response;

import java.util.List;

public class ResponseError {

	private String message;
	private Integer httpStatus;
	private List<String> erros;
	
	public ResponseError(String message, Integer httpStatus) {
		this.message = message;
		this.httpStatus = httpStatus;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(Integer httpStatus) {
		this.httpStatus = httpStatus;
	}
	public List<String> getErros() {
		return erros;
	}
	public void setErros(List<String> erros) {
		this.erros = erros;
	}
	
	
	
}
