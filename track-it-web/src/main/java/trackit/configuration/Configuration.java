package trackit.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import trackit.model.Category;

import java.util.ArrayList;
import java.util.List;

@PropertySource("classpath:categories.properties")
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean(name = "categories")
    List<Category> initializeCategories(@Value("${categories}") List<String> categories){
        List<Category> catList = new ArrayList<>();
        for(String c : categories){
            Category cat = new Category(c, "");
            catList.add(cat);
        }

        return catList;
    }
}
