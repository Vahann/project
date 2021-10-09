package com.project.project.endpoint;

import com.project.project.model.Category;
import com.project.project.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/categories")
public class CategoryEndpoint {

    private final CategoryRepository categoryRepository;

    @GetMapping("/categories")
    public List<Category> allCategories(){
        return categoryRepository.findAll();

    }
}
