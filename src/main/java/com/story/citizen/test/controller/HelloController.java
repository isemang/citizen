package com.story.citizen.test.controller;

import com.story.citizen.test.dto.Hello;
import com.story.citizen.test.dto.response.Response;
import com.story.citizen.test.dto.response.ResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello";
    }

    @ResponseBody
    @PostMapping("hello-test")
    public ResponseEntity<String> helloPostTest(@RequestBody Hello hello) {
        log.info("*******수신 Data::" + hello.toString());
        Response response = Response.of(ResponseCode.RP000);
        ResponseEntity<String> responseEntity = new ResponseEntity<>(response.getResponseResult(), HttpStatus.OK);

        return responseEntity;
    }
}