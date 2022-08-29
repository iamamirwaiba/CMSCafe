package com.personal.cafecms.Service.Impl;

import com.personal.cafecms.Entity.Category;
import com.personal.cafecms.Repo.CategoryRepo;
import com.personal.cafecms.Service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepo.findAll();
    }

    @Override
    public ResponseEntity<String> addCategory(String name) {
        try{
            LocalDate createdAt= LocalDate.now();
            LocalDate updatedAt=LocalDate.now();
            Category category=new Category(name,createdAt,updatedAt);
            categoryRepo.save(category);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
}
