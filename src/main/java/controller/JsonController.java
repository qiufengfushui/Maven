package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class JsonController {

    @ResponseBody
    @RequestMapping("getJson.do")
    public User getJson()  {
        User user = new User();
        user.setId(2);
        user.setName("王五");
        return user;
    }
}
