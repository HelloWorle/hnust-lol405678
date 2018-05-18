package hnust.lol405678.web.services.users;

import hnust.lol405678.web.mapper.users.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户信息服务
 *
 * @author zl
 * */
@Service
public class UsersService {

    @Autowired
    private UsersMapper usersMapper;

    /**
     * 用户注册
     *
     * @param userNameNew 用户名
     * @param passwordNew 密码
     * @return int
     * */
    public int register(String userNameNew, String passwordNew) {
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("userNameNew", userNameNew);
        map.put("passwordNew", passwordNew);
        return usersMapper.register(map);
    }
}
