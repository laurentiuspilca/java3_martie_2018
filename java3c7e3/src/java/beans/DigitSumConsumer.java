/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.jms.Topic;

/**
 *
 * @author student
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue2")
    ,@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class DigitSumConsumer implements MessageListener {

    @Resource(mappedName = "topic2")
    private Topic topic2;

    @Inject
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;
    
    public DigitSumConsumer() {
    }
    
    @Override
    public void onMessage(Message message) {
        TextMessage m = (TextMessage) message;
        try {
            String numar = m.getText();
            int sum = 0;
            for (int i=0 ;i<numar.length(); i++) {
                sum += Integer.parseInt(String.valueOf(numar.charAt(i)));
            }
//            System.out.println(numar + " SUM: " + sum);
            sendJMSMessageToTopic2(String.valueOf(sum));
        } catch (JMSException ex) {
            Logger.getLogger(DigitSumConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sendJMSMessageToTopic2(String messageData) {
        context.createProducer().send(topic2, messageData);
    }
    
}
