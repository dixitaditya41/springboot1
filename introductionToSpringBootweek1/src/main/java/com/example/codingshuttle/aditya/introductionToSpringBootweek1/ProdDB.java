package com.example.codingshuttle.aditya.introductionToSpringBootweek1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env",havingValue = "production")
public class ProdDB implements  DB {

    public String getData()
    {
        return  "Prod Db";
    }
}
