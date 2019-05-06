package com.vehicle.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vehicle.model.UserLogin;
import com.vehicle.model.UserRegister;
import com.vehicle.model.Vehicle;
import com.vehicle.service.SettingsService;
import com.vehicle.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	HttpServletRequest request;
	@Autowired
	HttpSession session;
	@Autowired
	UserService userService;
	@Autowired
	SettingsService settingsService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView doStart() {
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "userReg", method = RequestMethod.POST)
	public String userReg(@ModelAttribute("userRegister") UserRegister ur) {
		userService.insertUser(ur);
		return "home";
	}
	
	String curUser = "";
	String curMail = "";
	
	@RequestMapping(value = "/userLog", method = RequestMethod.POST)
	public String userLog(@ModelAttribute("userLogin") UserLogin ul, Model mdu) {
		String un = ul.getUserName();
		String ps = ul.getUserPass();
		curUser = un;
		
		List<UserRegister> ob = userService.checkUser();
		
		int flag = 0;
		for (UserRegister tr : ob) {
			if (un.equals(tr.getUserName()) && ps.equals(tr.getUserPass())) {
				flag = 1;
				curMail = tr.getUserEmail();
				break;
			}
		}
		int dur = 0;
		if (flag == 0) {
			mdu.addAttribute("message", "Invalid Credentials");
			return "home";
		} else {
			session.setAttribute("userStudent", un);
			curUser = un;
			return "userLanding";
		}
	}
	
	@RequestMapping("/userLanding")
	public String home(Model model) {
		return "userLanding";
	}
	
	@RequestMapping("/reset")
	public String reset(Model mdu) {
		mdu.addAttribute("user", curUser);
		mdu.addAttribute("email",curMail);
		return "resetPage";
	}
	
	@RequestMapping("/cancel")
	public String cancel() {
		return "redirect:/userLanding";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		session.invalidate();
		return "home";
	}
	
	@RequestMapping("/addVehicle")
	public String quizSettings(Model theModel2) {
		theModel2.addAttribute("insert", new Vehicle());
		return "addVehicle";
	}
	
	@RequestMapping(value = "/applySettings", method = RequestMethod.POST)
	public String applySettings(@ModelAttribute("insert") Vehicle obz, Model mdAS) {
		settingsService.applySettings(obz);
		return "userLanding";
	}
	
	@RequestMapping("/removeVehicle")
	public String report(Model model2) {
		List<Vehicle> vehicle = settingsService.getData();
		model2.addAttribute("vehicle", vehicle);
		return "removeVehicle";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("userId") int id) {
		settingsService.delete(id);
		return "redirect:/removeVehicle";
	}
	
	@RequestMapping(value = "/resetPass", method = RequestMethod.POST)
	public String resetPass(@ModelAttribute("userRegister") UserRegister obz) {
		userService.resetPass(obz.getUserName(), obz);
		return "redirect:/userLanding";
	}
}







