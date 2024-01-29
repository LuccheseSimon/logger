package be.nubios.logger.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PrintResource {

    @GetMapping("/log")
    public String log() {
        String message = "Hello, thanks for the log";
        log.info(message);
        return message;
    }
}