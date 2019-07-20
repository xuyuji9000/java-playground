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

- Push to docker hub

``` bash
docker tag springboot-playground yogiman/springboot-playground
docker push yogiman/springboot-playground
```
