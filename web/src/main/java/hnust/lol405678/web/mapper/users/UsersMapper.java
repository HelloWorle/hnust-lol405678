package hnust.lol405678.web.mapper.users;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 用户信息Mapper
 *
 * @author zl
 * */
public interface UsersMapper {

    /**
     * 用户注册
     *
     * @param map 用户名
     * @return int
     * */
    int register(Map<String, Object> map);
}