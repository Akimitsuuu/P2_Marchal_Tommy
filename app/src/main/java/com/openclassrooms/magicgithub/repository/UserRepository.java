package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.List;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS;

public class UserRepository {

    List<User> users = new ArrayList<>(FAKE_USERS);

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        return users;
    }


    public void generateRandomUser() {
        users.add(User.random());
    }

    public void deleteUser(User user) {
        users.remove(user);
    }
}
