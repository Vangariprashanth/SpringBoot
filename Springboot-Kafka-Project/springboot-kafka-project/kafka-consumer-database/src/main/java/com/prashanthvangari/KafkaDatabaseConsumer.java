package com.prashanthvangari;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.prashanthvangari.entity.WikimediaData;
import com.prashanthvangari.repository.WikimediaDataRepository;

@Service
public class KafkaDatabaseConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    private WikimediaDataRepository dataRepository;

    

    public KafkaDatabaseConsumer(WikimediaDataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }



    @KafkaListener(topics = "wikimedia_recentchange", 
    groupId = "myPrashanthVangariGroup"
        )
    public void consumer(String eventMessage){
        LOGGER.info(String.format("Event Message received -> %s", eventMessage));
        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(eventMessage);

        dataRepository.save(wikimediaData);
    }
}
