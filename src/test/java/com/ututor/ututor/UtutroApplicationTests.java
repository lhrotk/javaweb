package com.ututor.ututor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ututor.dao.UserDAO;
import com.ututor.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UtutroApplicationTests {
	
	@Autowired
	UserDAO userDAO;

	@Test
	public void contextLoads() {
		User user = userDAO.findByEmail("lhrotk@gmail.com");
		System.out.println(user.toString());
	}

}
