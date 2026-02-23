###**Guessing App (Java Console Game)**

A feature-rich **Number Guessing Game** built in Java using OOP principles and structured with use-case based development.

The game interacts with the user, provides intelligent hints, validates inputs, and allows replay functionality.

## Features

### Core Gameplay
- User guesses a randomly generated number
- Feedback on each guess:
  - Too High 
  - Too Low
  

### Limited Attempts (UC2)
- User has a **fixed number of guesses**
- Game ends when:
  - Correct guess
  - Attempts exhausted
   

### Smart Hints (UC3)
- Tells if the number is:
  - Even or Odd
  - Greater than 50 or less than/equal to 50


### Exception Handling (UC4)
- Handles invalid inputs like:
  - `"eleven"` instead of `11`
- Prevents crashes using proper validation


### Result Storage (UC5)
- Stores and displays game result:
  - Win / Lose
  - Attempts used


### Restart & Exit (UC6)
- After game ends:
  - User can choose to:
    - Restart 
    - Exit 


## Tech Stack

- **Language:** Java
- **Concepts Used:**
  - OOP (Classes & Objects)
  - Encapsulation
  - Conditional Statements
  - Loops
  - Exception Handling (`try-catch`)
  - User Input (`Scanner`)
  - Random Number Generation


