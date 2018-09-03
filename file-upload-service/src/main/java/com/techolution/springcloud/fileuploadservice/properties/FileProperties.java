package com.techolution.springcloud.fileuploadservice.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The SpringBoot file configuration properties
 *
 * @author Srinivasu
 * On: 3rd Sep 2018
 */
@ConfigurationProperties("file")
public class FileProperties {

    private String uploadDirectory;

    public String getUploadDirectory() {
        return uploadDirectory;
    }

    public void setUploadDirectory(String uploadDirectory) {
        this.uploadDirectory = uploadDirectory;
    }
}
