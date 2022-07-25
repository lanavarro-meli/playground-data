package br.dh.meli.springdatai.controller;

import br.dh.meli.springdatai.model.UserModel;
import br.dh.meli.springdatai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> buscaPorId(@PathVariable long id){
        return ResponseEntity.ok(service.getUserById(id));
    }
    @PostMapping
    public ResponseEntity<UserModel> insertUser(@RequestBody UserModel user){
            return ResponseEntity.status(HttpStatus.CREATED).body(service.insertUser(user)) ;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable long id){
       service.deleteUser(id);
       return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<UserModel> updateUser(@RequestBody UserModel user){
        return ResponseEntity.ok(service.updateUser(user));
    }
    @PatchMapping("/{id}")
    public ResponseEntity<UserModel> updateUser(@PathVariable long id, @RequestBody Map<String,String> changes){
        return ResponseEntity.ok(service.updateModelPartial(id,changes));
    }


    @GetMapping
    public ResponseEntity<List<UserModel>> getAll(){
        return ResponseEntity.ok(service.listAll());
    }
}
