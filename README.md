# snet-asclepios-plugin

## prerequisites

* gradle

## build

```
./gradlew jar 
```

## install

```
cp build/libs/snet02-asclepios-plugin-x.x.x.jar /path/to/xnat/plugins
```

## configure

* login to xnat
* go to `Administer -> Data Types -> Set Up Additional Data types` and add all the `snet02:*` data-types.
