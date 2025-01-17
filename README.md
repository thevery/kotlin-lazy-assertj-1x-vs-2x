test ok on kotlin 1.9.21 but fails on kotlin 2.0.21:
- run `./gradlew test` – fail
- change kotlin version in `build.gradle.kts` to 1.9.21 and run `./gradlew test` again – ok