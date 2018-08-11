package com.nucleus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nucleus.model.Customer;
import com.nucleus.service.CustomerService;

@Controller
//@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/")
	public String ShowLoginForm() {

		return "Split";
	}

	@RequestMapping("/addCustomer")
	public ModelAndView adduser(Customer customer) {

		return new ModelAndView("NewDetails");
	}

	@RequestMapping("/newCustomer")
	public ModelAndView addnewUser(Customer customer) {

		customerService.addcustomer(customer);
		return new ModelAndView("newCustomer");

	}

	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.GET)
	public String deleteuser() {

		return "DeleteDetails";

	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(Model model,
			@RequestParam("customerCode") String customerCode) {
		customerService.deleteCustomer(Integer.parseInt(customerCode));
		return "deleteCustomer";

	}

	@RequestMapping(value = "/viewCustomer", method = RequestMethod.GET)
	public String viewuser() {
		return "viewOne";

	}

	@RequestMapping(value = "/oneview", method = RequestMethod.POST)
	public String oneview(Model model,
			@RequestParam("customerCode") String customerCode) {
		Customer customer = customerService.viewCustomer(Integer.parseInt(customerCode));
		model.addAttribute("customer", customer);

		return "viewOneTable";

	}

	@RequestMapping(value = "/viewall", method = RequestMethod.GET)
	public String viewAll(Model model) {

		List<Customer> customer = customerService.viewAll();

		model.addAttribute("customer", customer);

		return "viewAll";

	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateUser() {
		return "updateCustomer";

	}

	@RequestMapping(value = "/updatevalue", method = RequestMethod.POST)
	public String updateValue(Model model,

	@RequestParam("customerCode") String customerCode,
			@ModelAttribute Customer customer) {

		customer = customerService.viewCustomer(Integer.parseInt(customerCode));
		model.addAttribute("customer", customer);

		return "updateDetails";

	}

	@RequestMapping(value = "/updated", method = RequestMethod.POST)
	public String updated(Customer customer) {
		customerService.updateCustomer(customer);
		return "updated";

	}
	
	@RequestMapping(value = "/LogOutController")
	public String logout() {
		
		return "index";
	}

}
