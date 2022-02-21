package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.weaver.weaverminds.dto.LoginDTO1;


@Controller
public class LoginController {
	@Autowired
	LoginService service;

	@PostMapping("login")

	public ModelAndView login(LoginDTO1 dto1) {
		ModelAndView andView = new ModelAndView("login");
		System.out.println(dto1.getEmail());

		System.out.println(dto1.getPass());

		boolean response = service.validateAndLogin(dto1);
		if (response == true) {
			andView.addObject("useName", dto1.getEmail());
			andView.setViewName("home.jsp");
		} else {
			andView.addObject("useName", "provide correct input");
			andView.setViewName("login.jsp");
			System.out.println("");

		}
		return andView;

	}

}
