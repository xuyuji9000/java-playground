1. Install

``` shell
brew install openjdk
```

2. Link

``` shell
sudo ln -sfn /usr/local/opt/openjdk/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk
```
> Need to link manually, cause openjdk is [keg-only](https://docs.brew.sh/FAQ#what-does-keg-only-mean)

> List all available java homes: `/usr/libexec/java_home -V`


# Reference

- [How to install Java JDK on macOS](https://mkyong.com/java/how-to-install-java-on-mac-osx/)
