package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
@Service
public class UserServiceImpl
        implements UserService {

    private List<User> users = new ArrayList<>();


    @Autowired
    public UserServiceImpl() {
    }

    @PostConstruct
    private void populateSampleData() {
        users.add(new User("test@mail.com", "password", "Andres", "Perez"));
    }


    @Override
    public String getCompleteName(String email) {
        System.out.println("");
        System.out.println("llegue y tengo el correo " + email);
        String name=null;
        for(User usr: users){
            if(usr.getEmail().equals(email)){
                name=usr.getFirstname()+" "+usr.getLastname();
            }
        }
        System.out.println("pillate el nombre "+ name);
        return name;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User getUser(Long id) {
        return users.get(0);
    }

    @Override
    public User createUser(User user) {
        return users.get(0);
    }

    @Override
    public User findUserByEmail(String email) {
        User user = null;
        for(User usr: users){
            if(usr.getEmail().equals(email)){
                user = usr;
            }
        }
        return user;
    }

    @Override
    public User findUserByEmailAndPassword(String email, String password) {
        User user = null;
        for(User usr: users){
            if(usr.getPassword().equals(password) && usr.getEmail().equals(email)){
                user = usr;
            }
        }
        return user;
    }

}
