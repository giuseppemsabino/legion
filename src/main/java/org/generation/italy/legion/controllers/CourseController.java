package org.generation.italy.legion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {
    @GetMapping("/index")
    public String showCourses(Model m ){
        m.addAttribute("data","Hello mvc world");
        return "courses";
    }

}
