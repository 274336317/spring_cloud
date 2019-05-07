package com.mackerelpike.springcloud.user_service.vo;

/**
 * 返回错误信息的json数据
 * @author Administrator
 *
 */
public class VO_JsonErrorResult extends VO_JsonResult
{
	private static final long serialVersionUID = 7958897988078836346L;
	
	private int errorCode;
	
	private String description;
	
	public VO_JsonErrorResult()
	{
		result = "ERROR";
	}
	
	public VO_JsonErrorResult(int errorCode, String description)
	{
		this();
		this.errorCode = errorCode;
		this.description = description;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
}