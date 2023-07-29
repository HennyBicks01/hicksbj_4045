package com.hicksbj_Assignment0;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hicksbj_Assignment0.dto.SpecimenDTO;
import com.hicksbj_Assignment0.service.ISpecimenService;

@Controller
public class HicksbjAssignment0Controller {
	
	@Autowired
	private ISpecimenService specimenServiceStub;
	/**
	* Handle the /start endpoint.
	* @return
	*/
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read(Model model) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		model.addAttribute("specimenDTO", specimenDTO);
		return "start";
	}
	
	/**
	* Handle the /start endpoint.
	* @return
	*/
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=blue"})
	public String readBlue() {
		return "start";
	}
	
	/**
	* Handle the /start endpoint.
	* @return
	*/
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"loyalty=silver"})
	public ModelAndView readSilver() {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchById(43);
		specimenDTO.setSpecimenId(83);
		ModelAndView modelAndView = new ModelAndView(); 
		modelAndView.setViewName("start");
		modelAndView.addObject("specimenDTO", specimenDTO);
		return modelAndView;
	}

	/**
	* Handle the /start endpoint.
	* @return
	*/
	@RequestMapping(value="/start", method=RequestMethod.GET, headers = {"content-type=text/json"})
	public String readJSON() {
		return "start";
	}

	/**
	* Handle the /start endpoint.
	* @return
	*/
	@PostMapping("/start")
	public String create() {
		return "start";
	}

	/**
	* Handle the / endpoint.
	* @return
	*/
	@RequestMapping("/")
	public String index() {
		return "start";
	}
}
