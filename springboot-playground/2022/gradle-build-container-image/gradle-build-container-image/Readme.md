# Commands

- Build Jar

``` shell
./gradlew build
```

- Build container image

``` shell
podman build -t gradle-build-container-image  . 
```

- Run cotainer

``` shell
podman container run \
--publish 8080:8080 \
--rm \
gradle-build-container-image
```


