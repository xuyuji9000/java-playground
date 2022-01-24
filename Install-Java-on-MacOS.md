# Introduction

This file document the steps about "How to install Java 11 on macOS"


# Steps

1. Install

    ``` shell
    brew install openjdk
    ```

2. Link

    ``` shell
    sudo ln -sfn /usr/local/opt/openjdk\@11/libexec/openjdk.jdk/ /Library/Java/JavaVirtualMachines/openjdk.jdk
    ```
    > Need to link manually, cause openjdk is [keg-only](https://docs.brew.sh/FAQ#what-does-keg-only-mean)

    > List all available java homes: `/usr/libexec/java_home -V`

3. Set environment variable `JAVA_HOME` in startup script `~/.bash_profile`

    ``` shell
    # ~/.bash_profile
    # java home
    export JAVA_HOME=`/usr/libexec/java_home -v11`
    ```

    > `source ~/.bash_profile`

# Reference

- [How to install Java JDK on macOS](https://mkyong.com/java/how-to-install-java-on-mac-osx/)
