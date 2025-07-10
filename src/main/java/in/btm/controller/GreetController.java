package in.btm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import in.btm.client.WelcomeFeignClient;

@RestController
public class GreetController {
	
	
	
	@Autowired
	private WelcomeFeignClient client;
	
	
	
	@GetMapping("/greet")
	public String greetMsg() {
		String msg=client.welMsg();
		return "Good Night "+msg;
	}

}
