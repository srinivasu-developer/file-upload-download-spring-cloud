# Cloud enabled file upload-download application

The repository contains the spring cloud enabled file upload-download services developed with springboot.

**Functional capabilities:**
1. A simple password-based authentication
2. A Restful service to accept file upload
3. A Restful service to download file requested


With externalized configurations

Technology stack used: Spring Boot, Spring Cloud, Java, Maven, Spring Security (Basic username, password authentication)

The endpoints are:

Name | Endpoint | Request Type 
------------- |:----------- |:-----------
Upload | http://localhost:8765/file-upload/api/v1/upload | POST
Download | http://localhost:8765/file-download/api/v1/download/filename.jpg | GET


Security basic authentication:

**username:** user

**password:** techolution
