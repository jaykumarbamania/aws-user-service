package com.aws.project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.nio.file.Paths;

@Service
public class S3Service {

    private S3Client s3Client;

    public S3Service (S3Client s3Client) {
        this.s3Client = s3Client;
    }

    private final String bucketName = "aws-user-service-bucket-learning";

    public void uploadFile(String filePath, String key) {

        PutObjectRequest request = PutObjectRequest.builder()
                .bucket(bucketName)
                .key(key)
                .build();

        s3Client.putObject(request, Paths.get(filePath));
    }
}