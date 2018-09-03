package com.techolution.springcloud.filedownloadservice;

import com.techolution.springcloud.filedownloadservice.properties.FileProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * A SpringBoot application class for file-download-service
 *
 * @author Srinivasu Nakka
 * On: 3rd Sep 2018
 */
@EnableConfigurationProperties({FileProperties.class})
@EnableDiscoveryClient
@SpringBootApplication
public class FileDownloadServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileDownloadServiceApplication.class, args);
	}
}
