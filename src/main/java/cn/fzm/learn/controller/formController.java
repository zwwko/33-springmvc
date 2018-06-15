package cn.fzm.learn.controller;

import cn.fzm.learn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
//curl -H "Content-Type:application/json" -X POST -d "{\"user\": \"admin\"}" http://localhost:8080/welcome --verbose

@Controller
@RequestMapping("/form")
public class formController {
    @RequestMapping("/input")
    public String input(Model model) {
        model.addAttribute("customer", new User());
        return "form";
    }

    @RequestMapping("/save")
    public String save(Model model, @ModelAttribute("customer") @Validated User user, BindingResult result) {
        model.addAttribute("customer", user);
        if (result.hasErrors()) {
            return "form";
        }
        return "form_show";
    }


}