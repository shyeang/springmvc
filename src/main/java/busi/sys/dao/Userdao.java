package busi.sys.dao;

import busi.sys.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface  Userdao {
    boolean CreateUser(User testC);

    boolean UpdateUser(User testC);

    User ReadUserByID(@Param("id") String userID);

    boolean DeleteUserByID(@Param("id") String userID);
}
