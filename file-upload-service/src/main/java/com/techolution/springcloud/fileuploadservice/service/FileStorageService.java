package com.techolution.springcloud.fileuploadservice.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * A service for file storage related behaviours
 *
 * @author Srinivasu
 * On: 3rd Sep 2018
 */
public interface FileStorageService {

    /**
     * Stores the multipart file
     *
     * @param multipartFile the multipart file to store
     * @return the filename of the stored multipart file
     */
    String storeFile(MultipartFile multipartFile);
}
