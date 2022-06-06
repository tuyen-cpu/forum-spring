package com.example.forum.controller;

import com.example.forum.model.TopicDTO;
import com.example.forum.service.iml.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/topics")
public class TopicController {
    @Autowired
    private TopicService topicService;
    @GetMapping("/all")
    public List<TopicDTO> getTopics(){
        return topicService.getTopics();
    }
}
