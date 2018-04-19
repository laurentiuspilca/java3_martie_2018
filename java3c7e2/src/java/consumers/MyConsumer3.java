/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumers;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author student
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "clientId", propertyValue = "client3")
    ,@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic1")
    ,@ActivationConfigProperty(propertyName = "subscriptionName", propertyValue = "topic1")
    ,@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")
})
public class MyConsumer3 implements MessageListener {
    
    public MyConsumer3() {
    }
    
    @Override
    public void onMessage(Message message) {
        try {
            TextMessage tm = (TextMessage) message;
            System.out.println("CONSUMER 3: " + tm.getText());
        } catch (JMSException ex) {
            Logger.getLogger(MyConsumer3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
