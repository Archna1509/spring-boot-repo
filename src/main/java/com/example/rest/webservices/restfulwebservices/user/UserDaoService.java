package com.example.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDaoService {
    private static List<User> userList = new ArrayList<User>();
    private static int count;
    static{
        userList.add(new User(1,"Archna",LocalDate.now().minusYears(36)));
        userList.add(new User(2,"Animesh",LocalDate.now().minusYears(34)));
        userList.add(new User(3,"Girish",LocalDate.now().minusYears(45)));
        count =  userList.size();
    }

    public List<User> findAllUsers(){
        return userList;
    }

    public User findUserById(Integer id){
        return  userList.stream().filter( user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public User saveUser(User user) {
        user.setId(++count);
        userList.add(user);
        return user;

    }
}
