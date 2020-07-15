package com.arpita.courseinfo.Services;

import com.arpita.courseinfo.Repository.TopicRepo;
import com.arpita.courseinfo.model.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepo topicRepo;


    public List<Topics> getAllTopics(){

        List<Topics> list=new ArrayList<>();
        topicRepo.findAll().forEach(list::add);

        return list;

    }

    public void addTopics(Topics topics){
        topicRepo.save(topics);
    }



}
