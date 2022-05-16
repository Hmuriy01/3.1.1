package com.gmail.tregulov.springbootcrudapp.service;

import com.gmail.tregulov.springbootcrudapp.model.User;
import com.gmail.tregulov.springbootcrudapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repoSpringData;

    @Autowired
    public void setRepoSpringData(UserRepository repoSpringData) {
        this.repoSpringData = repoSpringData;
    }

    @Override
    public void addUser(User user) {
            repoSpringData.save(user);
    }

    @Override
    public void addUser(String name, String surname, Integer age) {
            repoSpringData.save(new User(name, surname, age));
    }

    @Override
    public void editUser(User user) {
            repoSpringData.save(user);
    }

    @Override
    public void deleteUser(long id) {
        repoSpringData.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(repoSpringData.findAll());
    }

    @Override
    public User getUser(long id) {
        return repoSpringData.getOne(id);
    }
}
