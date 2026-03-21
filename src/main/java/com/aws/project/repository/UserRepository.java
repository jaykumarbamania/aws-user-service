package com.aws.project.repository;

import com.aws.project.entity.User;
import org.hibernate.query.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    List<User> findByUserId(UUID userId);

}