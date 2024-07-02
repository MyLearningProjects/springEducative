package com.example.educative.service;

import com.google.api.client.util.Value;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class AccessCloudStorage {



    @Value("gs://cool-subset-426206-j9/intJava.txt")
    private Resource gcsResource;

    public void accessStorage(){

        try (InputStream is = ( gcsResource).getInputStream()) {
             is.read("foo".getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
