package com.devtiro.quickstart.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InkService {

    public void printSomethingElse(){
        log.info("printing from InkService");
    }
}
