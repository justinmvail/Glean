package com.glean.databaseDataSetup;

import com.glean.repository.ShowRepo;
import com.glean.guideBoxAccessLayer.GuideBoxDataAggregator;
import com.mongodb.MongoClient;
import org.junit.Ignore;
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
 * Created by ericweidman on 1/7/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowSetup {

    @Autowired
    private ShowRepo showRepo;

    @Autowired
    private GuideBoxDataAggregator dataAggregator;

    @Value("${spring.data.mongodb.database}")
    String databaseName;

    @Value("${database.collection.show}")
    String showCollection;

    @Value("${showid.module.elementToSearch}")
    private String[] showIds;

    @Test
    public void createTestDataShowsByScrapingGuideBox() throws IOException {

        MongoTemplate mongoTemplate = new MongoTemplate(new SimpleMongoDbFactory(new MongoClient(), databaseName));
        mongoTemplate.remove(new Query(), showCollection);

        for (String showId : showIds) {
            showRepo.save(dataAggregator.fetchAndAssembleFullShowFromGuideBox(showId));
            System.out.println("ShowID " + showId + " complete.");
        }
    }
}
