package com.personal.cafecms.Service.Impl;

import com.personal.cafecms.Entity.Category;
import com.personal.cafecms.Entity.Menu;
import com.personal.cafecms.Repo.MenuRepo;
import com.personal.cafecms.Service.CategoryService;
import com.personal.cafecms.Service.MenuService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.json.JSONArray;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final CategoryService categoryService;

    private final MenuRepo menuRepo;
    @Override
    public String addMenuItemPage(Model model) {
        List<Category> categories=categoryService.getAllCategory();
        JSONArray listCategory =new JSONArray(categories);
        model.addAttribute("message","addItem");
        model.addAttribute("categories",listCategory);
        return "chiya/add-category-menu";
    }

    @Override
    public ResponseEntity<String> addItem(Map<String, Object> finaldata) {
        try{
            String name= (String) finaldata.get("name");
            Integer price=(Integer) finaldata.get("price");
            Integer id=(Integer) finaldata.get("c_id");
            Menu menu=new Menu(id,name,price);
            menuRepo.save(menu);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
