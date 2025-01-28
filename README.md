# Rock Paper Scissors Game in Kotlin

A simple implementation of the classic Rock, Paper, Scissors game in Kotlin, designed to simulate multiple rounds with one player always choosing 'Rock' and the other choosing randomly.

## Project Overview

This project demonstrates:

- Basic game logic for Rock, Paper, Scissors.
- Use of enums for move representation.
- Data classes for player representation.
- Simple game simulation for 100 rounds.
- Unit testing with JUnit Jupiter.

## Structure

- `com.rockpaperscissors.Main`: Entry point of the application, runs the game.
- `com.rockpaperscissors.Move`: Enum class representing possible moves.
- `com.rockpaperscissors.Player`: Data class for player representation.
- `com.rockpaperscissors.Game`: Contains the game logic and simulation.
- `com.rockpaperscissors.GameTest`: Unit tests for the game logic.

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- Kotlin (if not using the Kotlin plugin for your IDE)
- Gradle

## Steps of Running the Application

- Clone the repository:
   ```sh
    git clone https://github.com/youssefhatem124/java-kotlin-coding-interview.git
- In java-koltin-coding-interview folder run this command
   ```sh
   ./gradlew build
- Run the project using this command
   ```sh
   ./gradlew run