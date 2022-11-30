package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController 
{
	@GetMapping("/welcome")
	public String productForm()
	{
		return "index";
	}

}
