package com.personal.cafecms.Controller;


import com.personal.cafecms.Service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class GeneralPageController {

    private final MenuService menuService;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("message","Home page");
        return "chiya/index";

    }

    @GetMapping("/category")
    public String categoryMenu(Model model){
        model.addAttribute("message","Category Page");
        return "category/category";
    }

    @GetMapping("/employee-page")
    public String employee(Model model){
        model.addAttribute("message","Employee Page");
        return "chiya/employee";
    }

    @GetMapping("/add-category-menu")
    public String addCategoryMenu(Model model){
        model.addAttribute("message","addCategory");
        return "chiya/add-category-menu";

    }

    @GetMapping("/add-item-menu")
    public String addItemMenu(Model model){
        return menuService.addMenuItemPage(model);
    }

}
