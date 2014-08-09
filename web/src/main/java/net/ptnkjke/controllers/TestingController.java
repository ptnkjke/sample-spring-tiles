package net.ptnkjke.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dalopatin on 07.08.2014.
 */
@Controller
@RequestMapping("/")
public class TestingController {

    @RequestMapping(method = RequestMethod.GET)
    public String maing() {
        return "main";
    }
}
