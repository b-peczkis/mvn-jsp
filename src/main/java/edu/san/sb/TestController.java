package edu.san.sb;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/")
	public String test(Map<String, Object> model) {
		
		model.put("message", "HEJ");
		
		return "test";
	}

}
