package cn.fzm.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//curl -H "Content-Type:application/json" -X POST -d "{\"user\": \"admin\"}" http://localhost:8080/welcome --verbose

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(Model model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }


    @RequestMapping(value = "hello1", method = RequestMethod.GET, params = "user=admin")
    public String hello1(Model model) {
        model.addAttribute("message", "Spring 3 MVC Hello1 World");
        return "hello";
    }

//    @RequestMapping(value = "hello2", method = RequestMethod.GET, headers = "Host=localhost:8007")
//    curl  -X GET  http://localhost:8007/hello2 --verbose
//    curl  -H "User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36"  http://localhost:8007/hello2 --verbose
//    @RequestMapping(value = "hello2", method = RequestMethod.GET, headers = "User-Agent=curl/7.47.0")
//    @RequestMapping(value = "hello2", method = RequestMethod.GET, headers = "User-Agent=curl/7.47.0")
    @RequestMapping(value = "hello2", method = RequestMethod.GET, headers = "User-Agent=Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36")
    public String hello2(Model model) {
        model.addAttribute("message", "Spring 3 MVC Hello2 World");
        return "hello";
    }


//    @RequestMapping(value = "json",method = {RequestMethod.GET, RequestMethod.POST})
//    public String printJson(ModelMap model) {
//        Map<String,String> map = new HashMap();
//        map.put("name","admin");
//        return "hello";
//    }

}