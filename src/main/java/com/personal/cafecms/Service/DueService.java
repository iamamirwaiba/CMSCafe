package com.personal.cafecms.Service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface DueService {
    ResponseEntity<String> addDue(Map<String,Object> finalDate);
 }
