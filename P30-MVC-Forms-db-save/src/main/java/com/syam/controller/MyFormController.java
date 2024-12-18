package com.syam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.syam.form.MyForm;
import com.syam.service.MyService;

@Controller
public class MyFormController {

	@Autowired
	private MyService myService;

	@GetMapping("/")
	public String formInput(@ModelAttribute("reference")  MyForm myForm) {

		//MyForm myForm = new MyForm();

		//model.addAttribute("reference", myForm);

		return "index";

	}

	@PostMapping("/mapping")
	public String formHandler(@ModelAttribute("reference")  MyForm myForm, Model model) {
		System.out.println(myForm); // --------->>>> for console printing

		String text = "Successfull............";

		model.addAttribute("msg", text);
		myService.saveForm(myForm);
		return "success";

	}

}
