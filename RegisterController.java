package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.weaver.weaverminds.dto.ResisterDTO;

import services.RegisterService;

@Controller
public class RegisterController { 

	@Autowired
	RegisterService service;

	@PostMapping("signup")
	public ModelAndView signUp(ResisterDTO dto) {
		ModelAndView modelAndView = new ModelAndView("signup.jsp");
		try {
			if (dto != null) {
				String response = service.validateAndSave(dto);
				modelAndView.addObject("msg", response);
				modelAndView.setViewName("home.jsp");
			} else {
				modelAndView.addObject("msg", "object is null");
				modelAndView.setViewName("signup.jsp");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return modelAndView;
	}
}
