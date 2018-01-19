package com.jrf.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.jrf.entity.UserT;

/**
 * ����spring��junit���ϣ�junit����ʱ����springIOC���� spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// ����junit spring�����ļ�
@ContextConfiguration({ "classpath:applicationContext.xml"})
public class IUserServiceTest {

    @Autowired
    public IUserService userService;
    
    @Test
    public void getUserByIdTest(){
     
    	UserT user = userService.getUserById(1);
        System.out.println(user.getUserName());
    }
    
}