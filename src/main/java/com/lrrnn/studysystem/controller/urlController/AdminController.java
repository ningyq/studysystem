package com.lrrnn.studysystem.controller.urlController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public String admin() {
        return "/admin/admin";
    }

    @GetMapping("/home")
    public String home() {
        return "/home";
    }
}
