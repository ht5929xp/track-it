package trackit.services.impl.map;

import org.springframework.stereotype.Service;
import trackit.model.Group;
import trackit.services.GroupService;
import trackit.services.impl.map.AbstractMapService;

@Service
public class GroupServiceMapImpl extends AbstractMapService<Group, Long> implements GroupService {

}
