package com.arpita.courseinfo.Controller;

import com.arpita.courseinfo.Services.TopicService;
import com.arpita.courseinfo.model.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/api")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/courses")
    public List<Topics> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping(method = RequestMethod.POST,value="/topics")
    public void addTopics(@RequestBody  Topics topic){
            topicService.addTopics(topic);
    }

}
