package com.satheeshtech.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.satheeshtech.model.Topic;
import com.satheeshtech.service.TopicService;

@RestController
public class TopicController {
 @Autowired
	private TopicService tservice;
 
 @RequestMapping("/topics")
 public List<Topic> getAllTopics()
 {
	 return tservice.getAllTopics();
 }
 @RequestMapping("/topics/{id}")
 public Topic getTopic(@PathVariable String id)
 {
	 return tservice.getTopic(id);
 }
 @RequestMapping(method=RequestMethod.POST,value="/topics",produces=MediaType.APPLICATION_XML_VALUE)
 public void addTopic(@RequestBody Topic topic) {
	 
 }
}
