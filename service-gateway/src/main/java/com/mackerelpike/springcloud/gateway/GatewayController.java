package com.mackerelpike.springcloud.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GatewayController
{
	@RequestMapping("/fallback")
	@ResponseBody
	public String serviceNotAvailable()
	{
		return "Service Unavailable";
	}
}