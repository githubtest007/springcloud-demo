package application.api.controller;

import application.entity.UserDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Random;


@RestController
public class MemberContorller {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Value("${server.port}")
	private String serverPort;

	@RequestMapping("/getMember")
	public String getMember(){
		return "我是会员服务，springcloud2.0版本,端口号："+serverPort;
	}
}
