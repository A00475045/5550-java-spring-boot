# 5550-java-spring-boot

This Project is the output of an assignment in the MCDA 5550.

## Hotel Reservation System.
The project is an backend for the Hotel Reservation system: Equipped with 2 api's:
### /api/all-hotels {GET}
This will return an array of objects of all the hotels in the database
### /api/add-hotel {POST}
This will add a record if a json is provided.

/* {
    "hotelName": "WestINN",
    "hotelLocation": "Lower Water street, Halifax NS",
    "reviewsInStars": 5,
    "totalRooms": 28,
    "availableRooms": 2,
    "createdAt": "2010-03-07T22:26:21.000+00:00"
    
  } */

  ### Running this project.

To run this project download java 21, maven. Clone the repository. Run the command " mvn clean package ". and then run the command " java -jar .\target\rest-api-1.0.0.jar "

### validating the Run.

localhost:8080/ should say " hello world "
localhost:8080/api/all-hotels returns [{},{},{}]
localhost:8080/api/add-hotel {POST} adds a record
