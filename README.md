# Guest Registration Form Automation in Java

## Overview:
This Java-based script automates the guest registration form on the WP Everest demo website.

## Steps:
1. **Form Filling**: Inputs the required fields such as name, email, gender, and phone.
2. **Terms Agreement**: The terms and conditions checkbox is selected.
3. **Submission**: Clicks the submit button.
4. **Assertion**: Validates the registration success message.

## Prerequisites:
- Java Development Kit (JDK) installed
- Selenium WebDriver dependency added to project (via Maven or Gradle)
- WebDriver for your browser (e.g., ChromeDriver)

## Instructions:
1. **Set Up**:
    - Add the Selenium dependency in your `pom.xml` (Maven):
      ```xml
      <dependency>
          <groupId>org.seleniumhq.selenium</groupId>
          <artifactId>selenium-java</artifactId>
          <version>4.x.x</version>
      </dependency>
      ```
    - Or in `build.gradle` (Gradle):
      ```groovy
      dependencies {
          testImplementation 'org.seleniumhq.selenium:selenium-java:4.x.x'
      }
      ```
2. **Run the Script**:
   - Set up WebDriver executable (e.g., ChromeDriver path).
   - Run the `Assignment2.java` file from your IDE or terminal.

## Note:
Make sure WebDriver matches your browser version and adjust file paths accordingly.

## [[HTML Report]](https://drive.google.com/file/d/1UEL0MUma1shtgpP7XRY5_uZC6fkPvHtW/view?usp=drive_link)
