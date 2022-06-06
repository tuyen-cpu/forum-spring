package com.example.forum.service.iml;

import com.example.forum.model.TopicDTO;
import com.example.forum.repo.TopicRepo;
import com.example.forum.service.ITopicService;
import com.example.forum.utils.TopicConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicService implements ITopicService {
    @Autowired
    private TopicRepo topicRepo;
    @Autowired
  private TopicConverter topicConverter;
    @Override
    public List<TopicDTO> getTopics() {
        return topicRepo.findAll().stream().map(topicEntity->topicConverter.convertToDTO(topicEntity)).collect(Collectors.toList());

    }
}
