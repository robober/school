package org.school.eltex;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainLauncher {

    private static final Logger logger = LogManager.getLogger(MainLauncher.class);

    public static void main(String[] args) {
        logger.info("Service started!");

        new SpringApplication(MainLauncher.class).run(args);
    }
}
