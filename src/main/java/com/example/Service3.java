package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@ConditionalOnBean(Service2.class)
public class Service3 {

    private static final Logger logger = Logger.getLogger(Service3.class.getName());

    Service3() {
        logger.info(getClass().getSimpleName() + " created");
    }
}
