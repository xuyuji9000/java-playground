This folder contains a SpringBoot example done on 2022.

# Steps

1. Generate initial project from [Spring Initializr](https://start.spring.io/)

    > Use `Java 11` for the project.

    > Remember to add `Spring Web` as Dependency

2. Run the application 

   ``` shell
   ./gradlew bootRun
   ```

   > `curl localhost:8080`

3. Build jar file 

``` shell
./gradlew build
```

4. Run jar file 

``` shell
java -jar ./build/libs/demo-0.0.1-SNAPSHOT.jar
```