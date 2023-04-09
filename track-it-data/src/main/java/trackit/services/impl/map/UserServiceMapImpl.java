package trackit.services.impl.map;

import org.springframework.stereotype.Service;
import trackit.model.User;
import trackit.services.UserService;
import trackit.services.impl.map.AbstractMapService;

@Service
public class UserServiceMapImpl extends AbstractMapService<User, Long> implements UserService {

}
