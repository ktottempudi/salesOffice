# salesOffice
 
 This is a Spring Boot application that works as a backend service for a Sales office. This services works in conjuction with a MySQL server that houses a database featuring an Employee, Sales, and Branch tables.
 
 **Requirements:**  
 Spring Boot (2.5.2)      
 Java (11)  
 Maven  
 Hibernate  
 MySQL  

**Spring Boot Dependecies:**  
Spring Boot  
Spring Boot Actuator  
Spring Boot Data JPA  
Spring Boot Web  
MySQL Connector  

**Setup:**  
After cloning this repository the user should go the application.properties file located in src/main/resources and update the database information.
![image](https://user-images.githubusercontent.com/43048860/125852868-14d0c642-3fe1-4646-af2f-964d17949e7e.png)


**Database Schema:**  
![image](https://user-images.githubusercontent.com/43048860/125854515-63859227-55f1-4ce9-a7ce-c84f4305f8c6.png)

**Functionality:**  
This program can perform CRUD operations on any of the tables shown in the schema above. The user can create a new branch, employee, or sale. They can retrieve or update that information, and even delete it so long has they use the proper id when doing so.

**Testing:**  
In order to test the application Postman would be the ideal choice for its ease of use. The user simply needs to specify the correct endpoint and the CRUD operation to perform and then let Postman take care of the rest.
