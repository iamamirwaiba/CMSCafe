package com.personal.cafecms.Controller;

import com.personal.cafecms.Service.CategoryService;
import com.personal.cafecms.Service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping(value = "/add-category")
    public ResponseEntity<String> addCategory(@RequestBody String categoryName){
        return categoryService.addCategory(categoryName);
    }

    @GetMapping(value = "/add-category")
    public String addCategory(Model model){
        return "chiya/add-category-menu";
    }


}
