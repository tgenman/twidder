package com.dmitrybondarev.twidder.repo;

import com.dmitrybondarev.twidder.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
