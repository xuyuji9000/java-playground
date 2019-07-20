- Create new gradle build:

``` bash
rm -fr ./build
./gradlew build
```

- Build Dokcer image:

```bash
docker build \
--build-arg JAR_FILE=./build/libs/gs-spring-boot-0.1.0.jar \
-t springboot-playground .
```

- Run container:

``` bash
docker run --rm \
-p 8080:8080 \
springboot-playground
```

# Reference

1. [Creating New Gradle Builds](https://guides.gradle.org/creating-new-gradle-builds/)


2. [Integrating OWASP Dependency Check in to development process
](https://blog.gypsyengineer.com/en/security/integrating-owasp-dependency-check.html)

3. [OWASP Dependency-Check Plugin
](https://jenkins.io/doc/pipeline/steps/dependency-check-jenkins-plugin/)

4. [Suppressing False Positives](https://jeremylong.github.io/DependencyCheck/general/suppression.html)
