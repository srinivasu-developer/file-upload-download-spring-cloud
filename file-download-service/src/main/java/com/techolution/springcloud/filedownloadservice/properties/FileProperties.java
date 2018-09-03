package com.techolution.springcloud.filedownloadservice.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * A SpringBoot property configuration related to file
 *
 * @author Srinivasu
 * On: 3rd Sep 2018
 */
@ConfigurationProperties("file")
public class FileProperties {

    private String downloadDirectory;

    public String getDownloadDirectory() {
        return downloadDirectory;
    }

    public void setDownloadDirectory(String downloadDirectory) {
        this.downloadDirectory = downloadDirectory;
    }
}
