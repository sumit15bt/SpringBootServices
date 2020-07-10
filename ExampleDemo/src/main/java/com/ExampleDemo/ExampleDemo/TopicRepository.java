package com.ExampleDemo.ExampleDemo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface TopicRepository extends CrudRepository<Topic,String> {
    //getAllTopic
    //getTopic(id)
    //UpdateTopic(id,topic)
    //deleteTopic(id)
}
