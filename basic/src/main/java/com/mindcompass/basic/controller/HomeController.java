package com.mindcompass.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		log.trace("trace!");
		log.debug("debug!");
		log.info("info!");
		log.warn("warn!");
		log.error("error!");
		return "home";
	}
}