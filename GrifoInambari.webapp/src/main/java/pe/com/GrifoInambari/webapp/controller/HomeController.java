package pe.com.GrifoInambari.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.GrifoInambari.webapp.util.Person;

@Controller
public class HomeController {

	
	@RequestMapping(value="home/dashboard", method = RequestMethod.GET)
	public String search(Model model, HttpServletRequest request) {
		
		
		model.addAttribute("nombre","Omar Calsin Curo");
		
		Person person = new Person();
		person.setName("Omar");
		person.setLastName("Calsin");
		person.setCreditCard("2152154");

		model.addAttribute("person",person);
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(person);
		
		
		person = new Person();
		person.setName("jose");
		person.setLastName("Perez");
		person.setCreditCard("1111");
		personList.add(person);

		person = new Person();
		person.setName("Mario");
		person.setLastName("Pia");
		person.setCreditCard("222222");
		personList.add(person);
		
		model.addAttribute("personList",personList);
		
		
		return "home/dashboard";
	}

}
