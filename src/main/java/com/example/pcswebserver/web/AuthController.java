package com.example.pcswebserver.web;


import com.example.pcswebserver.web.payload.Credentials;
import jakarta.validation.Valid;
import org.fluentd.logger.FluentLogger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static com.example.pcswebserver.web.WebConstants.AUTH;
import static com.example.pcswebserver.web.WebConstants.SIGN_IN;

@RestController
@RequestMapping(AUTH)
public class AuthController {
    private final FluentLogger log = FluentLogger.getLogger("my-app", "127.0.0.1", 24224);

    @PostMapping(SIGN_IN)
    @ResponseStatus(HttpStatus.OK)
    public Credentials signIn(@Valid Credentials credentials) {
        log.log("sign-in", "credentials", credentials);
        return credentials;
    }

}