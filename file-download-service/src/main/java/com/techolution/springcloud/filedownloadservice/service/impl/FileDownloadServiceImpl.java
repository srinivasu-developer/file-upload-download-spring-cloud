package com.techolution.springcloud.filedownloadservice.service.impl;

import com.techolution.springcloud.filedownloadservice.exception.FileNotFoundException;
import com.techolution.springcloud.filedownloadservice.properties.FileProperties;
import com.techolution.springcloud.filedownloadservice.service.FileDownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Srinivasu
 *         On: 02th Sep 2018
 */
@Service
public class FileDownloadServiceImpl implements FileDownloadService {

    private final Path fileDownloadPath;

    @Autowired
    public FileDownloadServiceImpl(FileProperties fileProperties) {
        this.fileDownloadPath = Paths.get(fileProperties.getDownloadDirectory()).toAbsolutePath().normalize();
    }


    @Override
    public Resource loadFileAsResource(String fileName) {
        try {
            Path filePath = this.fileDownloadPath.resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if (resource.exists()) {
                return resource;
            } else {
                throw new FileNotFoundException("File not found with name: " + fileName);
            }
        } catch (Exception e) {
            throw new FileNotFoundException("File not found with name: " + fileName, e);
        }
    }
}
