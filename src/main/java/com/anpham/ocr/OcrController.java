package com.anpham.ocr;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OcrController {

	@RequestMapping(path = "/create", produces = {MediaType.APPLICATION_JSON_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.POST)
	@ResponseBody
	Person create(@RequestBody Person person, HttpServletRequest context) {
		return person;
	}
	
	@RequestMapping(path = "/get", method = RequestMethod.GET)
	@ResponseBody
	String get() {
		return "Hi";
	}

}

