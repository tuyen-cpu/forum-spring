package com.example.forum.service;

import com.example.forum.model.TopicDTO;

import java.util.List;

public interface ITopicService{
    List<TopicDTO> getTopics();
}
