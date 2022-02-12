# Commands

- Build Jar

``` shell
# Clean up
./gradlew clean

# Build
./gradlew build
```

- Build container image

``` shell
# List podman machine
podman machine list

# Build container image
podman build -t gradle-build-container-image  . 
```

- Run cotainer

``` shell
# start containers
podman container run \
--publish 8080:8080 \
--rm \
gradle-build-container-image

# list containers
podman container list
```
