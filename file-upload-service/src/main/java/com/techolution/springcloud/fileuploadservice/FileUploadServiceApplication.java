package com.techolution.springcloud.fileuploadservice;

import com.techolution.springcloud.fileuploadservice.properties.FileProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * The SpringBoot application class for file-upload-service
 */
@EnableConfigurationProperties({FileProperties.class})
@EnableDiscoveryClient
@SpringBootApplication
public class FileUploadServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadServiceApplication.class, args);
	}
}
