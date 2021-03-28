package com.hypeflame.job.resources;

import com.hypeflame.job.dto.UserModel;
import com.hypeflame.job.entities.User;
import com.hypeflame.job.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<UserModel>> findAll(){
        List<User> userList = userService.findAll();
        return ResponseEntity.ok().body(toCollectionModel(userList));
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User user = userService.findById(id);
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> findModelById(@PathVariable Long id){
        User user = userService.findById(id);
        UserModel userModel = modelMapper.map(user, UserModel.class);
        return ResponseEntity.ok(userModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User newUser){
        userService.insert(newUser);
        return ResponseEntity.ok().body(newUser);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@RequestBody User obj, @PathVariable String id) {
        userService.update(obj);
        return ResponseEntity.noContent().build();
    }//May not be working

    private UserModel toModel(User user){
        return modelMapper.map(user, UserModel.class);
    }

    private List<UserModel> toCollectionModel(List<User> userList){
       return userList.stream()
                .map(user -> toModel(user))
                .collect(Collectors.toList());
    }

}
