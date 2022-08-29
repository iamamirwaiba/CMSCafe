package com.personal.cafecms.Service;

import com.personal.cafecms.Entity.Category;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory();
    ResponseEntity<String> addCategory(String name);
}
