package com.ututor.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ututor.model.User;

@Mapper
public interface UserDAO {
	String TABLE_NAME = "user";
    String INSET_FIELDS = " name, password, salt, head_url ";
    String SELECT_FIELDS = "";
    
    @Select({"select * from", TABLE_NAME, "where email= #{email}"})
    User findByEmail(String email);
}
