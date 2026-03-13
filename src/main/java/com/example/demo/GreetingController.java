package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/greet")
    public String handlePost(@RequestParam("userName") String name, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("name", name);
        return "redirect:/welcome";
    }

    @GetMapping("/welcome")
    public String showGreeting() {
        return "welcome";
    }
}