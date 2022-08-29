package com.personal.cafecms.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

import java.util.Map;

public interface MenuService {
    String addMenuItemPage(Model model);

    ResponseEntity<String> addItem(Map<String,Object> finaldata);
}
