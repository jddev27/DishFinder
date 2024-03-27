# DishFinder

DishFinder is a Spring Boot application that allows users to find recipes of dishes. It utilizes the MealDB API to retrieve dish information based on the user's query.

## Features

- **Search by Dish Name**: Users can search for recipes by entering the name of the dish they are interested in.
- **Retrieve Ingredients**: The application fetches the ingredients of the specified dish from the MealDB API and presents them to the user.

## Technologies Used

- **Spring Boot**: Framework for building robust Java applications.
- **RestCient**: Utilized for making HTTP requests to the MealDB API.
- **Lombok**: Library to reduce boilerplate code with annotations like `@Getter`, `@Setter`, etc.
- **Java**: The primary programming language used for development.

## How to Run

1. Clone the repository:


`git clone https://github.com/jddev27/DishFinder.git`


2. Navigate to the project directory:

`cd DishFinder`


3. Build the project:

`mvn clean install`


4. Run the application:

`mvn spring-boot:run`


5. Access the application in your web browser at `http://localhost:8080`.


