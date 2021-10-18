<h3>Restful Booker Api Tests</h3>

  <p>
    A test task to explore automation testing with JUnit and RestAssured based on Restful Booker API.
  </p>


### Built With

* [JUnit4](https://junit.org/junit4/)
* [Maven](https://maven.apache.org/)
* [Project Lombok](https://projectlombok.org/)
* [REST-assured](https://rest-assured.io/)
* Java 15

Training public API: [Restful Booker API](https://restful-booker.herokuapp.com)

### Prerequisites

* Make sure you have annotation processing enabled:
    * IntelliJ: ```Settings/Preference > search for "Annotation Processor" > Enable annotation processing```
    * Eclipse: ```project Properties > Java Compiler > Annotation Processing > Enable annotation processing```
* Have Lombok plugin installed in your IDE ([IntelliJ](https://projectlombok.org/setup/intellij), [Eclipse](https://projectlombok.org/setup/eclipse))

### Running the test

1. Clone the repo
   ```sh
   git clone https://github.com/ValeriePtah/restful-booked-mvn-junit-auto-test.git
   ```
2. Make sure to have **Java 15** JDK setup in your project (both project and Maven configurations)
3. To see all the console output run `mvn test` from the Terminal / command line