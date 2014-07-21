package ru.grey.testspringmvc;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by stravin on 21.07.2014.
 */
public class HomeController {
    public static final int DEFAULT_SPITTLES_PER_PAGE = 25;

    // TODO Create and implement SpitterService
    //private SpitterService spitterService;

    public HomeController() {
    }

    @RequestMapping({"/", "/home"})
    public String showHomePage(Map<String, Object> model) {
        //model.put("spittles", )

        return "home";
    }
}
