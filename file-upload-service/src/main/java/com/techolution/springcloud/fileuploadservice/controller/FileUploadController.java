package com.techolution.springcloud.fileuploadservice.controller;

import com.techolution.springcloud.fileuploadservice.response.FileUploadResponse;
import com.techolution.springcloud.fileuploadservice.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 * A RestController to handle all the endpoints of file-upload
 *
 * @author Srinivasu
 * On: 3rd Sep 2018
 */
@RestController
public class FileUploadController {

    @Autowired
    private FileStorageService fileStorageService;

    @PostMapping("/upload")
    public FileUploadResponse uploadFile(@RequestParam MultipartFile file) {
        String fileName = fileStorageService.storeFile(file);
        return new FileUploadResponse(fileName, file.getContentType(), file.getSize());
    }
}
