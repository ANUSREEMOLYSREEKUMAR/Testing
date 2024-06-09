# Selenium Cucumber Maven Project

## Description
This project is a Selenium WebDriver test automation suite using Cucumber for behavior-driven development (BDD). 
The project automates the testing of the SauceDemo website, including login, adding items to the cart, removing items from the cart, and verifying order placement.

## Prerequisites
Before you begin, ensure you have met the following requirements:
- Java Development Kit (JDK) version 8 or higher
- Apache Maven
- Firefox browser
- Geckodriver for Firefox (Make sure Geckodriver is in your system PATH or specify its location in the code)

## Setup
1. **Clone the repository**:
    ```sh
    git clone https://github.com/your-username/your-repository.git
    
2. **Navigate to the project directory**:
    ```sh
    cd your-repository
    ```

3. **Install dependencies and run the tests**:
    ```sh
    mvn clean test
    ```

## Usage
This project contains several Cucumber scenarios to test the SauceDemo website. The tests are written in Gherkin syntax and can be found in the `src/test/resources/features` directory.

### Running Tests
To run the tests, use the following Maven command:
```sh
mvn clean test
    ```
