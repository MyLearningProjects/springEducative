package com.example.educative.service;

import com.google.api.client.util.Value;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

@Component
public class AccessCloudStorage {

    Logger log = Logger.getLogger(getClass().getName());

    @Value("gs://cool-subset-426206-j9-bucket/intJava.txt")
    private Resource gcsResource;

    public String accessStorage(){
        log.info( "FileName::: "+ gcsResource.getFilename());
        return gcsResource.getFilename();
    }

}
