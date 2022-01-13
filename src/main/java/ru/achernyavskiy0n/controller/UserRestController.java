package ru.achernyavskiy0n.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.achernyavskiy0n.model.User;
import ru.achernyavskiy0n.service.UserService;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserRestController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        Integer _id = Integer.valueOf(id);
        User user = this.service.getUserById(_id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = this.service.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User created = this.service.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> putUser(@PathVariable String id, @RequestBody User user) {
        Integer _id = Integer.valueOf(id);
        User updated = this.service.putUserById(_id, user);
        return ResponseEntity.status(HttpStatus.CREATED).body(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable String id) {
        Integer _id = Integer.valueOf(id);
        this.service.deleteUserById(_id);
        return ResponseEntity.ok("User deleted: ".concat(id));
    }
}
