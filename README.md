
---

# Java Programs Collection

This repository contains two Java programs:

## 1. NumberGuessingGame.java

### Overview

This program allows a user to play a number guessing game against the computer. The computer randomly selects a number between 1 and 100, and the user has up to 10 attempts to guess it correctly.

### How to Run

1. Ensure you have Java installed on your system.
2. Compile the program:
   ```bash
   javac NumberGuessingGame.java
   ```
3. Run the program:
   ```bash
   java NumberGuessingGame
   ```
4. Follow the prompts to play the game.

### Features

- Random number generation.
- Input handling using `Scanner`.
- Looping constructs for gameplay.
- Score calculation based on the number of attempts.

## 2. OnlineReservationSystem.java

### Overview

This program simulates an online reservation system where users can log in, make reservations, and cancel reservations based on predefined credentials and reservation data.

### How to Run

1. Ensure you have Java installed on your system.
2. Compile the program:
   ```bash
   javac OnlineReservationSystem.java
   ```
3. Run the program:
   ```bash
   java OnlineReservationSystem
   ```
4. Follow the prompts to interact with the reservation system.

### Features

- User authentication with predefined credentials.
- Reservation management (making and canceling reservations).
- Input handling using `Scanner`.
- Data storage using `HashMap` for credentials and reservations.
- Simple methods for generating PNR (Passenger Name Record) and fetching train details.

### Example Usage

#### NumberGuessingGame.java

```
Welcome to the Number Guessing Game!
Guess a number between 1 and 100.

Round 1 - Let's begin!
Enter your guess (Attempt 1/10): 50
The number is lower.
Enter your guess (Attempt 2/10): 25
Congratulations! You guessed the correct number.
Your score for this round: 9

Do you want to play another round? (yes/no): yes

Round 2 - Let's begin!
...
```

#### OnlineReservationSystem.java

```
Welcome to Online Reservation System
Enter username: user1
Enter password: password1
Login successful!

Main Menu:
1. Make a Reservation
2. Cancel Reservation
3. Exit
Enter your choice: 1

Reservation System
Please fill out the following details:
Enter your name: John Doe
Enter train number: Train1
Enter class type: 1st Class
Enter date of journey (DD/MM/YYYY): 12/06/2024
Enter journey from (place): A
Enter journey to (destination): B

Reservation successful!
PNR Number: PNR123
Details:
John Doe: Sample Train Name, 1st Class, 12/06/2024, A to B

Main Menu:
1. Make a Reservation
2. Cancel Reservation
3. Exit
Enter your choice: 2

...
```

### Notes

- These programs demonstrate basic Java programming concepts including loops, conditionals, user input handling, and data structures (`HashMap`).
- Feel free to explore, modify, or extend these programs for your own learning or project needs.

---

# OIBSIP
