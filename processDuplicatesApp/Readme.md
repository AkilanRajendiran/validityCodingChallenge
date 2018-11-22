# Build Process Duplicate App

Build a Spring boot application to process duplicates in the CSV files

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Docker 17.05

-- the application is built to get the file(CSV) from the user,then it will process the file based on the input.

## Steps to setup

**1. Clone the application**

```bash
git clone https://github.com/AkilanRajendiran/validityCodingChallenge.git
```

**2. Build and run the app using maven**

```bash
cd processDuplicatesApp
mvn package
java -jar target/process-duplicates-0.0.1-SNAPSHOT.jar
```

You can also run the app without packaging it using -

```bash 
mvn spring-boot:run
```
## Application Features
1. File upload feature to accept the CSV files and upon submission shows the duplicates and non-duplicates
2. Validation for tye ".CSV" 
3. Results shows the count and rows of Duplicates and non-duplicates from the file
4. Dokerized the application
