# Objective

1) Test micronaut framework for microservices development.
2) Compare it with spring boot for features like boot time vs jar size vs memory utilized.

Tasks:
Created a simple rest based application same as savePerson and listPersons using JPA -H2 to compare apples with apples with
the other project I created spring-example-test

GET :http://localhost:9090/person/list



POST : http://localhost:9090/person/save

{
	"people":{
     "firstName":"jon",
     "lastName":"snow"
	}
}	

Results:

1) Micronaut (micronaut-example-test) start up time 4.4 sec vs Spring boot startup (spring-example-test) time 10.4 sec 
2) Micronaut jar- 32.5 MB vs spring boot 32.7 MB. So roughly similar here.
3) Memory utilization (Java Visual VM ) : Micronaut ~28 MB vs Spring Boot ~63MB

Micronaut is very promising! Spring boot has got tough competition!!!

