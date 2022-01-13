package ru.achernyavskiy0n.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ru.achernyavskiy0n.model.User;
import ru.achernyavskiy0n.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User getUserById(Integer id) {
        return this.repository.findById(id).orElse(null);
    }


    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public void deleteUserById(Integer id) {
        this.repository.deleteById(id);
    }

    public User putUserById(Integer id, User userUpdated) {
        User user = getUserById(id);
        if (user != null) {
            user.setFirstName(userUpdated.getFirstName());
            user.setLastName(userUpdated.getLastName());
            user.setPhone(userUpdated.getPhone());
            user.setEmail(userUpdated.getEmail());
            return this.repository.save(user);
        } else return null;
    }

    public User addUser(User user) {
        return this.repository.save(user);
    }
}
