# Password Validator

The "Password Validator" is a Java program designed to check the validity of a password based on specific criteria. This program takes a user-provided password and evaluates it against various rules to determine if it meets the necessary security standards.

## Table of Contents

- [Introduction](#introduction)
- [Usage](#usage)
- [Validation Criteria](#validation-criteria)
- [Code Structure](#code-structure)
- [How It Works](#how-it-works)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Password security is a crucial aspect of user authentication in applications and systems. This program helps ensure that passwords meet certain security standards, making them less vulnerable to unauthorized access.

## Usage

1. Clone or download the repository to your local machine.
2. Open the project in a Java IDE or compile it using the command line.
3. Run the `PasswordValidator` class.
4. Enter a password when prompted.
5. The program will determine if the provided password is valid or not and display the result.

## Validation Criteria

The program checks passwords against the following criteria:

1. Length: Password must be between 8 and 16 characters.
2. Categories: It must contain characters from at least three of the following four categories:
   - Lowercase letters (a-z)
   - Uppercase letters (A-Z)
   - Numbers (0-9)
   - Special symbols (~!@#$%^&*()-=+_)

## Code Structure

The code is organized as follows:

- `PasswordValidator` class: The main class that contains the `isValidPassword` method for password validation and various helper methods for checking lowercase, uppercase, numbers, and special symbols.

- Helper methods:
  - `containsLowercase`: Checks for the presence of lowercase letters.
  - `containsUppercase`: Checks for the presence of uppercase letters.
  - `containsNumbers`: Checks for the presence of numbers.
  - `containsSpecialSymbols`: Uses regular expressions to check for the presence of special symbols.

- `main` method: Accepts user input for a password, validates it, and prints whether the password is valid or not.

## How It Works

1. The program starts by checking the length of the provided password. If it is not between 8 and 16 characters, the password is immediately considered invalid.

2. It then evaluates the password for each of the four categories (lowercase, uppercase, numbers, and special symbols) using helper methods.

3. The `categories` variable counts the number of categories that the password satisfies.

4. Finally, the program checks if the password satisfies at least three out of the four categories, and if it does, the password is considered valid.

## Contributing

Feel free to contribute to this project by opening issues or pull requests to suggest improvements, report bugs, or add new features.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.