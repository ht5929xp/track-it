package trackit.initialize;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import trackit.model.Category;
import trackit.model.User;
import trackit.services.CategoryService;
import trackit.services.UserService;

import java.util.List;
import java.util.Set;

@Component
public class DataInitializer implements CommandLineRunner, ApplicationContextAware {

    private final CategoryService categoryService;
    private final UserService userService;

    private ApplicationContext ctx;

    public DataInitializer(CategoryService categoryService, UserService userService) {
        this.categoryService = categoryService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started Data Initialization");

        Category category1 = new Category("Personal", "Tracking of Personal Items.");
        Category category2 = new Category("Stellantis", "Stellantis Business Notes.");

        categoryService.save(category1);
        categoryService.save(category2);

        User user = new User("Heithem", "Talahmeh");

        userService.save(user);

        Set<Category> categories = categoryService.findAll();
        categories.forEach((c) -> System.out.println(c));

        System.out.println("Completed Data Initialization");

        List<Category> catList = (List<Category>) ctx.getBean("categories");
        System.out.println("The categories read from context: " + catList.size());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }
}
