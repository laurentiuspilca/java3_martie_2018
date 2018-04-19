/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producer;

import java.time.LocalDateTime;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

/**
 *
 * @author student
 */
@Singleton
@Startup
public class MyProducer {

    @Resource(mappedName = "queue1")
    private Queue queue1;

    @Inject // CDI
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;
    
    
    @PostConstruct
    public void init () {
        sendJMSMessageToQueue1(LocalDateTime.now().toString());
    }

    private void sendJMSMessageToQueue1(String messageData) {
        context.createProducer().send(queue1, messageData);
    }
    
    
}
