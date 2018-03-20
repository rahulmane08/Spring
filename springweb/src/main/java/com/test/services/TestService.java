package com.test.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/test/hello")
public class TestService {

    @GetMapping(value = "/say")
    @RolesAllowed("ADMIN")
    public ResponseEntity<String> hello () {
        return ResponseEntity.ok("Hello there");
    }
}
