package org.buaa.wms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class AngularStaticHtmlController {
	
	@RequestMapping("main")
	public String mainPage(){
		return "";
	}

}
