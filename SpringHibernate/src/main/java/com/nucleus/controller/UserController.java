package com.nucleus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.model.User;
import com.nucleus.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/User")
	public String user() {

		return "SplitUser";

	}

	@RequestMapping("/adduser")
	public ModelAndView adduser(User user) {

		return new ModelAndView("NewUser");
	}

	@RequestMapping("/newUser")
	public ModelAndView addnewUser(User user) {

		userService.adduser(user);
		return new ModelAndView("userAdded");

	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public String deleteuser() {

		return "DeleteUser";

	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
	public String delete(Model model,

	@RequestParam("id") String id) {
		userService.deleteUser(Integer.parseInt(id));
		return "deleteCustomer";
	}

	@RequestMapping(value = "/viewallUser", method = RequestMethod.GET)
	public String viewAll(Model model) {

		List<User> user = userService.viewAllUser();

		model.addAttribute("user", user);

		return "viewAllUser";

	}

}
