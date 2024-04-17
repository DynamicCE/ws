package com.hoaxify.ws.user;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
@PostMapping("/api/v1/users")
void createUser (){
}
}
