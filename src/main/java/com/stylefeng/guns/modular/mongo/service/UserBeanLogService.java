package com.stylefeng.guns.modular.mongo.service;

import com.stylefeng.guns.modular.mongo.entity.UserBeanLog;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Eden on 2017/10/14.
 */
public interface UserBeanLogService extends MongoRepository<UserBeanLog, Integer> {
	List<UserBeanLog> findByUsername(String username);
}
