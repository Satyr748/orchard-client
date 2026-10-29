# Orchard 26.2 Port — Starter

This is a clean Fabric 26.2 project scaffold, **not a completed port** of the supplied Orchard JAR.

## Requirements
- Java 25
- Gradle 9.5.1 (the Gradle wrapper is configured for this version)
- Minecraft Java Edition 26.2
- Fabric Loader 0.19.3 or newer

## Build
From this folder, run:

- Windows: `gradlew.bat build`
- macOS/Linux: `./gradlew build`

The resulting mod JAR should be in `build/libs/`.

## Porting status
The supplied Orchard JAR declares Minecraft `~1.21.11`, Java `>=21`, and Fabric API. Its class names are heavily obfuscated. This scaffold only confirms that a new 26.2 Fabric project has been laid out; it does not contain Orchard's original implementation or features.

To rebuild the actual client, the next step is to inventory the features that matter most and reimplement them against 26.2. Do not distribute or publish a port unless you have the rights/permission required by the original license.
