# Mastering High Performance With Kotlin
This project contains the code examples from [the "Mastering High Performance with Kotlin" book](https://www.packtpub.com/application-development/mastering-high-performance-kotlin).
To build the project [import it as Maven project in Intellij IDEA](https://www.jetbrains.com/help/idea/maven-support.html).

Project contains packages for each chapter that is splitted by sections:

<img src="http://i64.tinypic.com/fypdvm.png" width="380" height="500"/>

Most of the examples contain a "main" function that cab run by clicking the ![](https://www.jetbrains.com/help/img/idea/2018.1/run.png) icon in the left gutter and choose the Run or Debug command.

Project also contains benchmarks that can be run using the following commands:
1) Build a .jar file using this command at the root of the repository: ```mvn clean install```
2) To run the .jar with fast benchmarking: ```java -jar target/benchmarks.jar -wi 0 -i 1 -f 1 -tu ns -bm avgt```
   To run the .jar with default benchmarking: ```java -jar target/benchmarks.jar```
