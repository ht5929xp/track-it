package trackit.services.impl.map;

import org.springframework.stereotype.Service;
import trackit.model.Category;
import trackit.services.CategoryService;
import trackit.services.impl.map.AbstractMapService;

@Service
public class CategoryServiceMapImpl extends AbstractMapService<Category, Long> implements CategoryService {

}
