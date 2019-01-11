package application.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/member")
public class IndexContorller {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Value("${server.port}")
	private String serverPort;

	@RequestMapping("/getMember")
	public String getMember(){
		return "会员服务，订单服务调用会员服务";
	}
}
