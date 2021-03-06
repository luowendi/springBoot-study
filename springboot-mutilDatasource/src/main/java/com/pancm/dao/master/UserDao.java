package com.pancm.dao.master;

import org.apache.ibatis.annotations.Mapper;

import com.pancm.dao.BaseDao;
import com.pancm.pojo.User;

/**
 * 
* Title: UserDao
* Description:
* 用户数据接口 
* Version:1.0.0  
* @author pancm
* @date 2018年1月9日
 */
@Mapper
public interface UserDao extends BaseDao<User>{
    
}
