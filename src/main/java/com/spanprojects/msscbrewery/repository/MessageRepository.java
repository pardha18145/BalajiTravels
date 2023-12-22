package com.spanprojects.msscbrewery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spanprojects.msscbrewery.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    // You can add custom queries or methods here if needed
}

