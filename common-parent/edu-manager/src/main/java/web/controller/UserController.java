package web.controller;

import com.edu.model.User;
import com.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(){
        System.out.println("......");
        return "Default";
    }

    @RequestMapping("find")
    public String find(Integer id){
        System.out.println("......");
        User user= userService.findById(id);
        System.out.println(user);
        return null;
    }

    @RequestMapping("manage")
    public String manage(){

        return "User/manage";
    }
    @RequestMapping("info")
    public String info(){

        return "User/info";
    }
    @RequestMapping("edit")
    public String edit(){
        return "User/edit";
    }

}
