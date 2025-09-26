package com.rodrigopepato.course.repositories;

import com.rodrigopepato.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
