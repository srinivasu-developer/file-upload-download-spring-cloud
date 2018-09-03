package com.techolution.springcloud.fileuploadservice.service.impl;

import com.techolution.springcloud.fileuploadservice.exception.FileStorageException;
import com.techolution.springcloud.fileuploadservice.properties.FileProperties;
import com.techolution.springcloud.fileuploadservice.service.FileStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * An implementation of {@code FileStorageService}
 *
 * @author Srinivasu Nakka
 * On: 3rd Sep 2018
 */
@Service
public class FileStorageServiceImpl implements FileStorageService {

    private final Path fileStoragePath;

    @Autowired
    public FileStorageServiceImpl(FileProperties fileProperties) {
        this.fileStoragePath = Paths.get(fileProperties.getUploadDirectory()).toAbsolutePath().normalize();
        try {
            Files.createDirectories(this.fileStoragePath);
        } catch (Exception e) {
            throw new FileStorageException("The directory is not found");
        }
    }

    @Override
    public String storeFile(MultipartFile multipartFile) {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        try {
            if(fileName.contains("..")) {
                throw new FileStorageException("The filename contains invalid path sequence " + fileName);
            }
            Path targetLocation = this.fileStoragePath.resolve(fileName);
            Files.copy(multipartFile.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
            return fileName;
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName, ex);
        }
    }
}
