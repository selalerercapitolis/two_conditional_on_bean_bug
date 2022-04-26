package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@ConditionalOnBean(Service2.class)
public class Service1 {

    private static final Logger logger = Logger.getLogger(Service1.class.getName());

    Service1() {
        logger.info(getClass().getSimpleName() + " created");
    }
}
