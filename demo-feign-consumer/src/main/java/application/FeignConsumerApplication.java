package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FeignConsumerApplication.class, args);

	}


//解决RestTemplate could not be found 问题
@Bean
@LoadBalanced
//使用rest方式以别名方式就行调用依赖ribbon负载均衡器@LoadBalanced
//@LoadBalanced就能让这个restTemplate在请求时拥有客户端负载均衡能力
RestTemplate restTemplate(){

	return new RestTemplate();
}
}