package com.example.demo;

import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

@RestController
public class SampleController {

    @GetMapping("/")
    public String home() {
        return "Public home page";
    }

    @GetMapping("/secure")
    public String securePage(@AuthenticationPrincipal OidcUser user) {
        return "Welcome, " + user.getFullName();
    }
}
