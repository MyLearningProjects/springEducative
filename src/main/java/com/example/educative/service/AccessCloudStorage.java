package com.example.educative.service;

import com.google.api.client.util.Value;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLOutput;


@Component
public class AccessCloudStorage {

    public String accessStorage(){
      try {
          Storage storage = StorageOptions.newBuilder().setProjectId("cool-subset-426206-j9").build().getService();

          Blob blob = storage.get(BlobId.of("cool-subset-426206-j9-bucket", "intJava.txt"));

          System.out.println("file name::"+blob.getName() + "::::"+blob.getContentType());

      }catch (Exception e ){
          System.out.println(e.getMessage());

      }
      return "returned hello";
    }

}
