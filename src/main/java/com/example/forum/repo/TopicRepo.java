package com.example.forum.repo;

import com.example.forum.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepo extends JpaRepository<Topic,Long> {

}
