package com.aws.project.controller;

import com.aws.project.service.S3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class S3Controller {

    private S3Service s3Service;

    public S3Controller (S3Service s3Service) {
        this.s3Service = s3Service;
    }

//    @PostMapping("/upload")
//    public String upload() {
//        s3Service.uploadFile("/tmp/test.txt", "test.txt");
//        return "Uploaded to S3 🚀";
//    }

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        s3Service.uploadFile(file);
        return "Uploaded to S3 🚀";
    }
}