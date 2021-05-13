# Lab 01

| Outline | Value |
| --- | --- |
| Course | SEG 3X03 |
| Date | Summer 2021 |
| Professor | Andrew Forward, aforward@uottawa.ca |
| Team | Youcef Ben Ali 300110797|


### Java

To compile the java files run the following command from the newmath_java directory:

```bash
javac --source-path src -d dist src/*.java
```

To run use the following command: 

```bash
java -cp ./dist Main
```

The following is a screenshot of the working java code in the command console

![Running Java in the console](images/MainRun.png)

### JUnit

To compile the Junit test files run the following command from the newmath_java directory:

```bash
javac --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java
```

To run
```
java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
```

The following is a screenshot of the working test run

![Running JUnit in the console](images/MainJUnitTest.png)


### Elixir

To compile the elixir program first go to the newmath_ex directory and run the following command: 

```bash
mix compile
```

Then run the following:

```bash
iex -S mix
```

The following is a screenshot of the elixir program working

![Running Elixir in the console](images/ElixirRun.png)

### ExUnit


Since we already compiled earlier all we need to do to run is use the following command:

```
mix test
```

The following is a screenshot of the test working with elixir:

![Running ExUnit in the console](images/ElixirTest.png)

