package in.btm.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="Welcome-Api")
public interface WelcomeFeignClient {
	
	@GetMapping("/welcome")
	public String welMsg();


}
