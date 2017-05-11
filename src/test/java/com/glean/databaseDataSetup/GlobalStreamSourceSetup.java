package com.glean.databaseDataSetup;

import com.glean.guideBoxAccessLayer.GuideBoxDataAggregator;
import com.glean.repository.UserStreamSourceRepo;
import com.mongodb.MongoClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * Created by justi on 5/2/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GlobalStreamSourceSetup {

    @Autowired
    private GuideBoxDataAggregator dataAggregator;

    @Autowired
    private UserStreamSourceRepo globalStreamSourceRepo;

    @Value("${spring.data.mongodb.database}")
    String databaseName;

    @Value("${database.collection.userStreamSource}")
    String globalStreamSourceCollection;

    @Test
    public void createTestDataStreamSourcesByScrapingGuideBox() throws IOException {

        MongoTemplate mongoTemplate = new MongoTemplate(new SimpleMongoDbFactory(new MongoClient(), databaseName));
        mongoTemplate.remove(new Query(), globalStreamSourceCollection);

        globalStreamSourceRepo.save(dataAggregator.fetchAndAssembleFreeSources());
        globalStreamSourceRepo.save(dataAggregator.fetchAndAssembleSubscriptionSources());

    }

}
