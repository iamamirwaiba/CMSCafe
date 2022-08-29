package com.personal.cafecms.Service.Impl;

import com.personal.cafecms.Repo.DueRepo;
import com.personal.cafecms.Service.DueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;


@RequiredArgsConstructor
@Service
public class DueServiceImpl implements DueService {

    private final DueRepo dueRepo;
    @Override
    public ResponseEntity<String> addDue(Map<String, Object> finalDate) {
        return null;
    }
}
