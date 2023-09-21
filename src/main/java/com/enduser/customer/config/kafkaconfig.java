package com.enduser.customer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import com.enduser.customer.constants.KafkaConstants;

@Configuration
public class kafkaconfig {

    @KafkaListener(topics = KafkaConstants.LOCATION_UPDATE_TOPIC, groupId = KafkaConstants.GROUP_ID)
    public void updatedLocation(String value){

        System.out.println(value);
    }
}
