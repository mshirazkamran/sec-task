package dev.shiraz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class UserController {
    
    private final UserService userService;

    
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/user-registration")
    public String showRegsitrationForm() {
        return "addUser";
    }


    @PostMapping("/add-user")
    public String addUser(@ModelAttribute User user) {
        System.out.println(user);
        userService.saveUser(user);
        return "success";
    }
   
    



}
