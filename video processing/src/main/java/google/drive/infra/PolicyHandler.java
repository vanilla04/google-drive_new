package google.drive.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import google.drive.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import google.drive.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired StreamRepository streamRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Indexed'")
    public void wheneverIndexed_IfVideoStream(@Payload Indexed indexed){

        Indexed event = indexed;
        System.out.println("\n\n##### listener IfVideoStream : " + indexed + "\n\n");


        

        // Sample Logic //
        Stream.ifVideoStream(event);
        

        

    }

}


