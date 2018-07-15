package busi.sys.service;

import busi.sys.entity.User;

public interface  TUserService {
    boolean CreateUser();

    boolean UpdateUser();

    User ReadUserByID(String userID);

    boolean DeleteUserByID(String userID);
}
