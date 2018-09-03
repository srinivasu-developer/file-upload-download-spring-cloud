package com.techolution.springcloud.filedownloadservice.service;

import org.springframework.core.io.Resource;

/**
 * @author Srinivasu
 *         On: 02th Sep 2018
 */
public interface FileDownloadService {

    Resource loadFileAsResource(String fileName);
}
