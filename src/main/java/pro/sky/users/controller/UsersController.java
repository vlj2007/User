package pro.sky.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.users.entity.User;
import pro.sky.users.service.UsersService;


public class UsersController {
    @Autowired
    private UsersService usersService;

    @PostMapping("/users")
    public ResponseEntity<Void> createUsers(@RequestBody User user) {
        usersService.createUser(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
        User user = usersService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable("id") Integer id) {
        usersService.deleteUserById(id);
        return ResponseEntity.ok().build();
    }



}
