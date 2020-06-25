package com.strategies.sv.strategies.app.entities;

public class RespuestaLogin {

	private boolean result;

	public boolean getResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "RespuestaLogin [result=" + result + "]";
	}

	public RespuestaLogin(boolean result) {
		super();
		this.result = result;
	}
	
	
}
