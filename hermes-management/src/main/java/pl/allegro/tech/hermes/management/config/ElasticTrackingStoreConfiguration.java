package pl.allegro.tech.hermes.management.config;

import org.elasticsearch.client.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.allegro.tech.hermes.tracker.elasticsearch.management.ElasticsearchLogRepository;
import pl.allegro.tech.hermes.tracker.management.LogRepository;

@Configuration
public class ElasticTrackingStoreConfiguration {
    @Bean
    LogRepository logRepository(Client client) {
        return new ElasticsearchLogRepository(client);
    }
}
