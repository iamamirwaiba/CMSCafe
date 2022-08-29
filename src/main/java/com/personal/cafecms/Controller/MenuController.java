package com.personal.cafecms.Controller;


import com.personal.cafecms.Service.MenuService;
import liquibase.pro.packaged.G;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/menu")
public class MenuController {

    private final MenuService menuService;

    @GetMapping(value = "/")
    public String getMenu(Model model){
        model.addAttribute("message","menu");
        return "menu/menu";

    }

    @PostMapping(value = "/add-item",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addItem(@RequestBody List<Object> finalData){
        System.out.println("here is apple");
        System.out.println("here is dog");
        return null;
    }

    @GetMapping ("/add-item")
    public String addItem(Model model){
        model.addAttribute("message","item-add-page");
        return "menu/add-menu-item";
    }
}
