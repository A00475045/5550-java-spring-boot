package com.example.hotelapp.controller;

import com.example.hotelapp.model.Hotel;
import com.example.hotelapp.model.User;
import com.example.hotelapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class UsersController {

    @Autowired
    UserRepository userRepository;

    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @PostMapping("/get-all-users")
//    List<User> getUserByGuestOfId(@RequestBody Map<String, Object> payload) {
//        Integer id = (Integer) payload.get("id");
//        return userRepository.findByGuestOf_Id(id);
//    }

    @PostMapping("/add-users")
    public List<User> createUsers(@Valid @RequestBody List<User> users) {
        User hostUser = userRepository.save(users.get(0));
        for(int i = 1 ; i < users.size(); i++){
//            if (i != 0)
                users.get(i).setGuestOf(hostUser.getId());
        }
        users.remove(0);
        List<User> guestsUsers =  userRepository.saveAll(users);
        guestsUsers.add(0,hostUser);
        return guestsUsers;
    }


}
