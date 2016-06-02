package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by nakulkumar on 2/6/16.
 */
@Service("helloService")
public class HelloService {

    @Autowired
    private RedisTemplate<Integer, Employee> redisTemplate;

    private static Integer EMP_KEY = 1;

//    public RedisTemplate<Integer, Employee> getRedisTemplate() {
//        return redisTemplate;
//    }
//
//    public void setRedisTemplate(RedisTemplate<Integer, Employee> redisTemplate) {
//        this.redisTemplate = redisTemplate;
//    }

    public void save(Employee e) {
        this.redisTemplate.opsForHash().put(EMP_KEY, e.getEmpId(), e);
    }

    public Map<Object, Object> getAllEmployees() {
        return this.redisTemplate.opsForHash().entries(EMP_KEY);
    }

}
