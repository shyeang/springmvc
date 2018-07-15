package busi.sys.service.impl;

import busi.sys.dao.Userdao;
import busi.sys.entity.User;
import busi.sys.service.TUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service(value="tUserService")
@Transactional(rollbackFor = Exception.class)
public class TUserServiceImpl implements TUserService {
    @Resource
    private Userdao userdao;


    public boolean CreateUser() {
        return false;
    }

    public boolean UpdateUser() {
        return false;
    }

    public User ReadUserByID(String userID) {
        return userdao.ReadUserByID(userID);
    }

    public boolean DeleteUserByID(String userID) {
        return false;
    }
}
