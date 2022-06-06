package com.example.forum.utils;

import com.example.forum.entity.Topic;
import com.example.forum.model.TopicDTO;
import org.springframework.stereotype.Service;

@Service
public class TopicConverter {
    public TopicDTO convertToDTO(Topic topic){
        TopicDTO topicDTO = new TopicDTO();
        topicDTO.setId(topic.getId());
        topicDTO.setTitle(topic.getTitle());
        topicDTO.setCreatedTime(topic.getCreatedTime());
 return topicDTO;

    }
}
