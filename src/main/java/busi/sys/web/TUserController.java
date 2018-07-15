package busi.sys.web;

import busi.sys.entity.User;
import busi.sys.service.TUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/tUser")
public class TUserController {
    private  int count = 0;

    @Resource
    private TUserService tUserService;
    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public User testC(User user) {
        System.out.println(count++);
        User testC = tUserService.ReadUserByID(user.getId());
        return testC;
    }
}
