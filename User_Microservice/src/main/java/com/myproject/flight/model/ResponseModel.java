package com.myproject.flight.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseModel<T> {

	private T value;
	public ResponseModel(T value) {
		super();
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "ResponseModel [value=" + value + "]";
	}

	

	
}
