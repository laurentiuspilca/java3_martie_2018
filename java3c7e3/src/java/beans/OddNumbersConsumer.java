/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

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
    @ActivationConfigProperty(propertyName = "clientId", propertyValue = "client1")
    ,@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic2")
    ,@ActivationConfigProperty(propertyName = "subscriptionName", propertyValue = "topic2")
    ,@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")
})
public class OddNumbersConsumer implements MessageListener {
    
    public OddNumbersConsumer() {
    }
    
    @Override
    public void onMessage(Message message) {
        try {
            TextMessage tm = (TextMessage) message;
            String numar = tm.getText();
            int nr = Integer.parseInt(numar);
            if (nr % 2 != 0) {
                System.out.println("IMAPAR: " + nr);
            }
        } catch (JMSException ex) {
            Logger.getLogger(OddNumbersConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
