package user_ext.service.impl;

import com.cloud.common.constants.CommonConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import user_ext.service.UserService;

/**
 * @author xiaolh
 * @date 2019/12/13
 */
@Service
public class UserServiceImpl implements UserService {

    @Value("${server.port}")
    private String PORT;

    @Override
    public String userTest() {
        return CommonConstants.SUCCESS + " [ " + PORT + " ] ";
    }

}
