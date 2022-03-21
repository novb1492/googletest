package com.example.googletest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restcontroller {
    
    @Autowired
    private SheetsQuickstart SheetsQuickstart;

    @RequestMapping("/test")
    public void name() throws Exception {
        SheetsQuickstart.main();   
    }
}
