# spring-boot-mongodb-rest
REST API using Spring Boot and MongoDB

## Technologies Used
 1. Java 1.8.x
 2. Maven 3.x.x
 3. mongoDB.Atlas
 4. Spring Boot 
 5. Spring Data JPA
 
  
## Steps to Setup
1. Clone the application
	https://github.com/arivuselvanchinnasamy/spring-boot-mongodb-rest.git

2. Set up the cluster in MongoDB Atlas(https://cloud.mongodb.com) and update the spring.data.mongodb.uri value as per cluster created by you.

3. Build and run the app using maven
    mvn package
	java -jar target/spring-boot-mongodb-rest-0.0.1-SNAPSHOT.jar

	Alternatively, you can run the app without packaging it using -
	mvn spring-boot:run

## REST APIs
1. GET: localhost:8080/rest/v1/users/
	Sample Response:
	[
    {
        "id": "5c644cb54eb73b34b4a018bc",
        "firstName": "Arivuselvan",
        "lastName": "Chinnasamy",
        "email": "arivuselvan@mail.com",
        "phoneNumber": "124356789"
    }
]
2. POST: localhost:8080/rest/v1/users/
	Sample Request:
		{ "firstName": "test",
        "lastName": "user1",
        "email": "testuser1@mail.com",
        "phoneNumber": "124356789"
		}
	Sample Response:
	{
    "id": "5c68024a59af1450d4a8e5d4",
    "firstName": "test",
    "lastName": "user1",
    "email": "testuser1@mail.com",
    "phoneNumber": "124356789"
	}
3. PUT: localhost:8080/rest/v1/users/5c68024a59af1450d4a8e5d4
	Sample Request:
	{ "firstName": "test",
        "lastName": "user",
        "email": "testuser@mail.com",
        "phoneNumber": "124356789"
	}
	Sample Response:
	{
    "id": "5c68024a59af1450d4a8e5d4",
    "firstName": "test",
    "lastName": "user",
    "email": "testuser@mail.com",
    "phoneNumber": "124356789"
	}
4. DELETE:localhost:8080/rest/v1/users/5c68024a59af1450d4a8e5d4
