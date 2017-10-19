package com.stylefeng.guns.mongo;

import com.stylefeng.guns.base.BaseJunit;
import com.stylefeng.guns.modular.mongo.entity.UserBeanLog;
import com.stylefeng.guns.modular.mongo.service.UserBeanLogService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

/**
 * Created by Eden on 2017/10/14.
 */
public class BeanLogTest extends BaseJunit {
	@Autowired
	private UserBeanLogService userBeanLogService;

	@Autowired
	private MongoTemplate mongoTemplate;

	@Test
	public void findByName(){
		List<UserBeanLog> userBeanLog = userBeanLogService.findByUsername("eden001");
		for (UserBeanLog u: userBeanLog){
			System.out.println(u.getBeanAmount());
		}
	}

	@Test
	public void query(){
		/**
		 * Query 条件	条件是通过criteria
		 * Query得到结果集	结果集进行排序分页
		 */
		Criteria criteria = new Criteria();
//		criteria.and("username").is("eden001");
//		criteria.and("beanAmount").lte(1000);
		criteria.andOperator(Criteria.where("username").is("eden001"), Criteria.where("beanAmount").lte(1000));
		Query query = new Query(criteria).with(new Sort(Sort.Direction.ASC, "createTime")).limit(5);
		List<UserBeanLog> userBeanLog = mongoTemplate.find(query, UserBeanLog.class);
		System.err.println(userBeanLog.size());
		userBeanLog.forEach(x -> {
			System.out.println(x.getCreateTime());
		});
	}
}
