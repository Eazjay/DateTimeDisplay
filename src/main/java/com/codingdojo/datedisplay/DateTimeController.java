package com.codingdojo.datedisplay;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateTimeController {
	@RequestMapping("/")
	public String dashBoard() {
		return "dashboard.jsp";
	}
	
	@RequestMapping("/date")
	public String displayDate(Model model) {
		DateTimeFormatter dateForm = DateTimeFormatter.ofPattern("EEEE, dd MMMM, Y");
		model.addAttribute("currentDate", dateForm.format(LocalDate.now()));
		return "date.jsp";
	}

	@RequestMapping("/time")
	public String displayTime(Model model) {
		DateTimeFormatter timeForm = DateTimeFormatter.ofPattern("hh:mm a");
		model.addAttribute("currentTime", timeForm.format(LocalTime.now()));
		return "time.jsp";
	}
}
