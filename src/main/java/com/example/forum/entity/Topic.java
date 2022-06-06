package com.example.forum.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "topic")
public class Topic extends AMessage{


    @OneToMany
    @JoinColumn(name = "topic_id", referencedColumnName = "id")
    private List<ReplyMessage> replyMessages;
}
