package application.contorller;

import application.entity.UserDemo;
import application.feignService.DemoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
	/**
	 * springcloud中有两种方式调用api：rest和fegin restTemplate是由springboot web组件提供,默认聚合了ribbon负载均衡器
	 * rest方式底层采用httpclient
	 */
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value="/getOrder", method=RequestMethod.GET)
	public String demoServiceTest() {
		//有两种方式：一种是采用服务别名调用；一种是直接调用
		String result= restTemplate.getForObject("http://demo-feign-provider/getMember",String.class);
		System.out.println("consumer："+result);
		return result;
	}
}
