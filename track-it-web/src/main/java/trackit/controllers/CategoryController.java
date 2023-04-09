package trackit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import trackit.model.Category;
import trackit.services.CategoryService;

import java.util.Set;

@Controller
@RequestMapping({"categories"})
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping({"/", ""})
    public String getCategories(Model model){
        Set<Category> categories = categoryService.findAll();

        model.addAttribute("categories", categories);

        return "categories/categoriesList";
    }
}
