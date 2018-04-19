/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producers;

import java.time.LocalDateTime;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Topic;

/**
 *
 * @author student
 */
@Singleton
@Startup
public class MyProducer {

    @Resource(mappedName = "topic1")
    private Topic topic1;

    @Inject
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;
    
    @PostConstruct
    public void init() {
        sendJMSMessageToTopic1(LocalDateTime.now().toString());
    }

    private void sendJMSMessageToTopic1(String messageData) {
        context.createProducer().send(topic1, messageData);
    }
    
    
}
