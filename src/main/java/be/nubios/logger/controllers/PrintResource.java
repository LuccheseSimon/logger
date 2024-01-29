package be.nubios.logger.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class PrintResource {

    @GetMapping
    public void log() {
        log.info("Hello, thanks for the log");
    }
}