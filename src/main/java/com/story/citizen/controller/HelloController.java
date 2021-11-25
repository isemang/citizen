package com.story.citizen.controller;

import com.story.citizen.dto.Hello;
import com.story.citizen.dto.response.Response;
import com.story.citizen.dto.response.ResponseCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello";
    }

    @ResponseBody
    @PostMapping("hello-test")
    public ResponseEntity<String> helloPostTest(@RequestBody Hello hello) {
        logger.info("*******수신 Data::" + hello.toString());
        Response response = Response.of(ResponseCode.RP000);
        ResponseEntity<String> responseEntity = new ResponseEntity<>(response.getResponseResult(), HttpStatus.OK);

        return responseEntity;
    }
}