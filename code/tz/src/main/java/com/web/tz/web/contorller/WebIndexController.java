package com.web.tz.web.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.tz.web.contorller.constants.ForwardConstants;

@Controller
@RequestMapping("/index")
public class WebIndexController {
	@RequestMapping("")
	public String listUI() {
		return ForwardConstants.INDEX;
	}
}
