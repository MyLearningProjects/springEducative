package com.example.educative;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    ApplicationRunner storageRunner(Storage storage, GcpProjectIdProvider projectIdProvider) {
        return (args) -> {
            Page<Blob> list = storage.list(projectIdProvider.getProjectId());
            list.iterateAll().forEach(blob -> System.out.println(blob.getName()));
        };
    }

}
