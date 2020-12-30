package com.james.springprofiles.practice;

import com.james.springprofiles.practice.config.ApplicationConfig;
import com.james.springprofiles.practice.service.OutputService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringProfilePracticeApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        OutputService outputService = context.getBean(OutputService.class);

        for (int i=0;i<5;i++){
            outputService.generateOutput();
            Thread.sleep(3000);
        }
    }
}
