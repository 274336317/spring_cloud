package com.mackerelpike.springcloud.user_service.vo;

public class VO_JsonDataResult<T> extends VO_JsonOkResult
{
	private static final long serialVersionUID = -738370314630252392L;
	
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}