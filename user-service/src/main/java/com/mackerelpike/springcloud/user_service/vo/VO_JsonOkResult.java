package com.mackerelpike.springcloud.user_service.vo;

/**
 * 返回操作成功的Json数据
 * @author Administrator
 *
 */
public class VO_JsonOkResult extends VO_JsonResult
{
	private static final long serialVersionUID = 435122988451618220L;

	public VO_JsonOkResult()
	{
		this.result = "OK";
	}
}
