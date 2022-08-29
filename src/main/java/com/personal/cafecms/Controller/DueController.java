package com.personal.cafecms.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/due")
public class DueController {



    @PostMapping("/add")
    public ResponseEntity<String> addDue(@RequestBody Map<String,Object> finalDate){
        System.out.println(finalDate.toString());
        return null;
    }

    @GetMapping("/")
    public String getDuePage(Model model){
        model.addAttribute("message","duePage");
        return "dues/due";
    }

    @GetMapping ("/add")
    public String addDuePage(Model model){
        model.addAttribute("message","addDuePage");
        return "dues/addDue";
    }


}
