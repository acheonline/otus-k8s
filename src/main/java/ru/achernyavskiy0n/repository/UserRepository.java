package ru.achernyavskiy0n.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.achernyavskiy0n.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
