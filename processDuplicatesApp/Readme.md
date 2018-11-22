# Build Process Duplicate App

Build a Spring boot application to process duplicates in the CSV files

## Application Features
1. File upload feature to accept the CSV files and upon submission shows the duplicates and non-duplicates
2. Validation for type ".CSV" 
3. Shows the results with count and rows of Duplicates and non-duplicates from the file
4. Dokerized the application
## End points for app 
localhost:8080/ - Landing page to upload files
localhost:8080/upload - Show results of file processing

### Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Docker 17.05

-- the application is built to get the file(CSV) from the user,then it will process the file based on the input.

#### Steps to setup

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

** 3. Run in docker CLI
docker pull akil06/validitychallenge:processduplicates
docker run -p 8080:8080 <imagename> akil06/validitychallenge:processduplicates
docker - machine ls (-> to get the IP on which the process is running)
 hit the end point
 IP:8080/ in browser to launch the app 
  
