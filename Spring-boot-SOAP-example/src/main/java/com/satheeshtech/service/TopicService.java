package com.satheeshtech.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.satheeshtech.model.Topic;

@Service
public class TopicService {

	public List<Topic> topics = Arrays.asList(
			new Topic("Spring","Spring Framework","Framework Description"),
			new Topic("JAVA","Core JAVA","JAVA Description"),
			new Topic("Angular","Angular JS","Javascript framework desc"));
			
	public List<Topic > getAllTopics()
	{
		return topics;
	}
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}

