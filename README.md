This is a demo project create to impliment the Springboot with Hibernate and Jpa using a MYSQL db

Implimented 

Created a Product entity class to store the Product.

Created Employee and Commission entity, Commission entity is the sub entity an employee can have multiple commission records.

** @onetomany is used to link Employee and Commision

eg:    @OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="epmployeId",referencedColumnName = "epmployeId")
private List<CommisionEmp> commissions;

----------------------------------------------

Implemented Actuator to check health of app

You can enable Actuator by adding the spring-boot-starter-actuator dependency to your project.
Use this end point to check health
http://localhost:8080/actuator/health

To get all options of actuator use below endpoint
http://localhost:8080/actuator

also we can implement custom checkers that implements HealthIndicator Interface

---------------------------------------------------------

