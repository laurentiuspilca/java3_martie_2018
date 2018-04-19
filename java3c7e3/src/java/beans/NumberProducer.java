/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Random;
import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

/**
 *
 * @author student
 */
@Stateless
@LocalBean
public class NumberProducer {

    @Resource(mappedName = "queue2")
    private Queue queue2;

    @Inject
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;

    @Schedule(dayOfWeek = "Mon-Fri", month = "*", hour = "9-22", dayOfMonth = "*", year = "*", minute = "*", second = "*")
    public void generateNumbers() {
        Random r = new Random();
        sendJMSMessageToQueue2(String.valueOf(r.nextInt(10000000)));
    }

    private void sendJMSMessageToQueue2(String messageData) {
        context.createProducer().send(queue2, messageData);
    }

}
