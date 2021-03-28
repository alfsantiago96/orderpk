package com.hypeflame.job.services;

import com.hypeflame.job.entities.User;
import com.hypeflame.job.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<User> findAll(){
        List<User> userList = userRepository.findAll() ;
        return userList;
    }

    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow();
    }

    public void deleteById(Long id){
        findById(id);
        userRepository.deleteById(id);
    }

    public User insert(User newUser){
        return userRepository.save(newUser);
    }

    public User update(User obj) {
        User newUser = findById(obj.getId());
        updateData(newUser, obj);
        return userRepository.save(newUser);
    }

    private void updateData(User newUser, User obj) {
        newUser.setName(obj.getName());
        newUser.setEmail(obj.getEmail());
    }

}

