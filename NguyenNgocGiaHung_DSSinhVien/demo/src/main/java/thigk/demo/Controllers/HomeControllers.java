package thigk.demo.Controllers;

import org.springframework.stereotype.Controller;
// import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeControllers {
    @GetMapping("/home")
	public String Homepage() {
	    return "Home.html";
	}
}
