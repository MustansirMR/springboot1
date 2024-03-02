package com.devtiro.quickstart.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrintingService {

    // Dependency injection using @Autowire
    @Autowired
    private InkService inkService;

//    private InkService inkService;

    // Dependency injection using constructor
//    public PrintingService(InkService service){
//      this.inkService = service;
//    }

    public void printSomething(){
      log.info("From PrintingService");
      inkService.printSomethingElse();
    }
}
