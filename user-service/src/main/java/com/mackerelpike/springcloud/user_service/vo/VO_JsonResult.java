package com.mackerelpike.springcloud.user_service.vo;

import java.io.Serializable;

public abstract class VO_JsonResult implements Serializable
{
	private static final long serialVersionUID = 1864257036240283335L;
	
	protected String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}