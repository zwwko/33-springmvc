package cn.fzm.learn.controller;

import cn.fzm.learn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


//curl -H "Content-Type:application/json" -X POST -d "{\"user\": \"admin\"}" http://localhost:8080/welcome --verbose

@Controller
@RequestMapping("/params")
public class paramsController {


    /**
     * 1.直接把表单的参数写在Controller相应的方法的形参中
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/addUser1")
    public String addUser1(String username,String password) {
        System.out.println("username is:"+username);
        System.out.println("password is:"+password);

//        return "redirect:/hello";
        return "forward:/hello";
    }

    /**
     * 2、通过HttpServletRequest接收
     * @param request
     * @return
     */
    @RequestMapping("/addUser2")
    public String addUser2(HttpServletRequest request) {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println("username is:"+username);
        System.out.println("password is:"+password);
        return "demo/index";
    }

    @RequestMapping("/doLogin")
    public User doLogin(User u) {
        System.out.println("name: " + u.getName());
        return u;
    }

}