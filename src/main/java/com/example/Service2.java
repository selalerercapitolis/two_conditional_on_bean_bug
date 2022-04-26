package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@ConditionalOnBean(MissingBean.class)
public class Service2 {

    private static final Logger logger = Logger.getLogger(Service2.class.getName());

    Service2() {
        logger.info(getClass().getSimpleName() + " created");
    }
}
