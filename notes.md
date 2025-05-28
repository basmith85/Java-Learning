# Java Learning Notes

---

## 1. Intro to Java

### Concepts Learned
- A Java program begins with a `public class` whose name matches the filename.
- The method `public static void main(String[] args)` is the program's entry point.
- Single-line comments are written with `//`.
- Multi-line comments are written with `/* */`.
- `System.out.print()` outputs text without a line break.
- `System.out.println()` outputs text followed by a line break.
- `\n` can be used within strings to manually insert a new line.

---

## 2. Variables

### Concepts Learned
- A variable stores a value and has a specific data type.
- Variables are created in two steps: declaration (type + name) and assignment (value).
- Java requires variables to be declared with a type, and that type cannot change.

### Primitive Types
- `int` stores whole numbers.
- `double` stores decimal numbers.
- `char` stores a single character and uses single quotes.
- `boolean` stores true/false values.

### Reference Type
- `String` is a reference type used to store text and uses double quotes.
- Reference types point to objects in memory rather than holding the value directly.

### Conditionals
- `if` and `else` statements control logic based on boolean values.
- A boolean variable can be used directly in a conditional check.

### Additional Notes
- Class and filename must match exactly, including capitalization.
- `char` must use single quotes (`'A'`), while `String` must use double quotes (`"pizza"`).
- Use `camelCase` for variables and `PascalCase` for class names.
- Java is strongly typed—once declared, a variable’s type cannot be changed.
---

## 3. User Input

### Concepts Learned
- Java uses the `Scanner` class from `java.util` to read user input from the terminal.
- A `Scanner` must be created using `new Scanner(System.in)` and should be closed once all input is complete.
- Only one `Scanner` instance should be used per program to avoid errors with `System.in`.

### Input Methods
- `nextInt()` reads an integer value.
- `nextDouble()` reads a decimal number.
- `nextBoolean()` reads a true/false value.
- `nextLine()` reads a full line of input including spaces.
- `next()` reads a single word, stopping at whitespace.

### Common Input Issues
- When using `nextInt()`, `nextDouble()`, or similar methods, the newline character (`\n`) is not consumed.
- Calling `nextLine()` immediately afterward can cause it to read the leftover newline, resulting in an empty string.
- To prevent this, insert an extra `nextLine()` after `nextInt()` or similar methods to consume the newline.

### Conditional Input Logic
- Input values can be used in `if`/`else` statements to adjust program behavior.
- Booleans entered by the user (`true` or `false`) can be evaluated directly in conditions.

### Exercise: Rectangle Area
- Prompt the user to enter a width and height.
- Multiply the two values to calculate the area.
- Output the result with appropriate units.

### Additional Notes
- Use `System.out.print()` for inline prompts and `System.out.println()` to move to a new line.
- Always close the `Scanner` at the end of the program to free resources.
- `String` input that includes spaces requires `nextLine()`.
- Java methods like `nextInt()` and `nextLine()` must be used carefully in combination to avoid unexpected behavior.

---

## 4. Mad Libs

### Concepts Learned
- A simple interactive program using `Scanner` to collect multiple `String` inputs.
- User is prompted for specific types of words to insert into a pre-written template.

### String Handling
- Each input uses `nextLine()` to allow multi-word entries.
- Variables are declared for each expected word and stored as `String`.

### Output Composition
- Strings and user input are combined using concatenation (`+`) to build custom sentences.
- Repeating a variable like `noun1` multiple times shows how to reuse input.

### Additional Notes
- This exercise demonstrates how to take structured input and insert it into a meaningful narrative.
- Good formatting and prompt clarity are important for user-friendly interaction.
- Always close the `Scanner` at the end of input collection.

---

## 5. Arithmetic

### Concepts Learned
- Java supports standard arithmetic operations: `+`, `-`, `*`, `/`, and `%`.
- Compound assignment operators simplify arithmetic and assignment:
  - `x += y`, `x -= y`, `x *= y`, `x /= y`, `x %= y`
- Increment and decrement:
  - `x++` adds 1 to `x`
  - `x--` subtracts 1 from `x`

### Order of Operations
- Java follows PEMDAS:
  - Parentheses
  - Multiplication and Division (left to right)
  - Addition and Subtraction (left to right)
- Integer division truncates (cuts off) decimals unless a `double` is involved.

### Additional Notes
- Parentheses can be used to explicitly control order of evaluation.
- Assigning a math expression to a variable shows how to store calculated results.

---

## 6. Shopping Cart

### Concepts Learned
- Builds on input and arithmetic to create a basic checkout system.
- Prompts the user for item name, price, and quantity, then calculates a total.

### Input Types and Variables
- `String` is used for the item name.
- `double` is used for price.
- `int` is used for quantity.
- `char` is used to represent the currency symbol.

### Logic and Output
- The total is calculated by multiplying price by quantity.
- A conditional (`if`/`else`) handles pluralization of item name based on quantity.
- Output is displayed using concatenation.

### Additional Notes
- Real-world example of combining input, variables, conditionals, and arithmetic.
- Ensures good practice for formatting, plural logic, and displaying results.
- `Scanner` is closed after all input is complete.

---

## 7. If Statements

### Concepts Learned
- `if` statements are used to conditionally execute blocks of code when a boolean expression evaluates to `true`.
- `else` provides an alternative block of code if the `if` condition is `false`.
- `else if` allows chaining multiple conditions for more complex decision logic.

### Boolean Evaluation
- Conditions must evaluate to a boolean (`true` or `false`).
- Boolean variables (like `isStudent`) can be used directly in an `if` statement.

### String Validation
- `isEmpty()` checks if a `String` has a length of 0.
- Useful for ensuring required user input is not left blank.

### Age-Based Conditions
- `if-else if-else` chains can be used to evaluate a range of possibilities:
  - `if (age >= 65)` for seniors
  - `else if (age >= 18)` for adults
  - `else if (age < 0)` for invalid input
  - `else if (age == 0)` for newborns
  - `else` for children under 18

### Additional Notes
- Braces `{}` are required for all code blocks in `if`, `else if`, and `else` sections.
- Always close the `Scanner` after use to prevent resource leaks.
- Logical branching enables dynamic and personalized output based on user input.

---

## 8. Random Numbers

### Concepts Learned
- Java provides the `Random` class to generate pseudo-random values.
- An instance of `Random` is created using `new Random()`.
- Random values can be generated in different types:
  - `nextInt(origin, bound)` generates integers within a specific range.
  - `nextDouble()` generates a decimal between 0.0 (inclusive) and 1.0 (exclusive).
  - `nextBoolean()` randomly returns `true` or `false`.

### Random Integer Ranges
- `random.nextInt(origin, bound)` produces numbers from `origin` (inclusive) to `bound - 1` (exclusive).
- Example: `nextInt(1, 101)` produces values from 1 to 100.

### Boolean Usage
- `random.nextBoolean()` is useful for binary outcomes like coin flips.
- The result can be used in an `if` statement to execute one of two outcomes.

### Additional Notes
- `Random` must be imported from `java.util` to be used.
- Only one instance of `Random` is needed per program unless different generators are required.
- Variable names such as `random` follow the convention of being lowercase and matching the class name in purpose.

---

## 9. Math Class

### Concepts Learned
- Java provides the `Math` class for performing common mathematical operations.
- The `Math` class contains static methods, so its methods are used directly as `Math.methodName()`.

### Common Math Methods
- `Math.sqrt(x)` returns the square root of `x`.
- `Math.pow(base, exponent)` raises a number to a power.
- `Math.abs(x)` returns the absolute value of `x`.
- `Math.round(x)` rounds to the nearest whole number.
- `Math.ceil(x)` rounds up to the next highest integer.
- `Math.floor(x)` rounds down to the next lowest integer.
- `Math.max(x, y)` returns the larger of two values.
- `Math.min(x, y)` returns the smaller of two values.

### Constants
- `Math.PI` provides the value of π.
- `Math.E` provides the value of Euler’s number.

### Example: Hypotenuse Calculation
- The formula `c = sqrt(a² + b²)` can be written as:
  - `Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))`
- Useful for geometry-based problems, such as finding triangle sides.

### Exercise: Circle and Sphere Calculations
- `circumference = 2 * Math.PI * radius`
- `area = Math.PI * Math.pow(radius, 2)`
- `volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)`
- Formulas demonstrate how to apply mathematical constants and functions for real-world geometry.

### Additional Notes
- The `Math` class does not require importing.
- `System.out.printf()` allows formatted decimal output with precision control.
- Calculations using `Math` should generally use `double` for fractional precision.
---

## 10. printf

### Concepts Learned
- `System.out.printf()` is used to produce formatted output in Java.
- The general format is: `printf("format string", values...)`.
- The format string can include placeholders with optional modifiers to control how values are displayed.

### Format Syntax
- The full syntax: `%[flags][width][.precision][conversion]`

### Common Conversion Characters
- `%s` – `String`
- `%c` – `char`
- `%d` – `int`
- `%f` – `float` or `double`
- `%b` – `boolean`

### Precision
- Controls the number of digits after the decimal point for floating-point numbers.
- Example: `%.1f` will round and display one digit after the decimal.

### Flags
- `+` – forces a sign to be shown for numeric values (`+` or `-`)
- `,` – adds comma grouping separators to large numbers
- `(` – encloses negative numbers in parentheses
- space – inserts a space for positive numbers to align with negative ones

### Width
- Specifies the minimum number of characters to output.
- If the output is shorter, it will be padded.
  - Positive numbers = right-justified (default)
  - Negative number = left-justified
  - `0` = pads with zeroes

### Examples
- `%-4d` – left-justified integer with 4-character width
- `% .2f` – float with 2 decimal places and a space or minus sign prefix

### Additional Notes
- `printf()` does not automatically move to a new line; use `\n` or `%n` explicitly.
- Useful for aligning columns or formatting currency, percentages, and IDs.
- Helps produce clean, readable output especially in console applications.
---

## 11. Compound Interest Calculator

### Concepts Learned
- A real-world application of math in Java using user input and formatted output.
- Demonstrates how to apply the compound interest formula:
  - `A = P * (1 + r/n)^(n*t)`
  - Where:
    - `P` = principal amount
    - `r` = annual interest rate (as a decimal)
    - `n` = number of times interest is compounded per year
    - `t` = time in years
    - `A` = amount after `t` years

### Input and Output
- Uses `Scanner` to get values for principal, interest rate, compound frequency, and duration.
- Interest rate is converted from percentage to decimal by dividing by 100.
- Uses `Math.pow()` to compute the exponential part of the formula.
- Uses `System.out.printf()` for clean formatting of the final result to two decimal places.

### Additional Notes
- This project demonstrates combining math, variables, and input/output formatting in a practical example.
- Good example of chaining multiple inputs and ensuring type accuracy (`double` vs `int`).

---

## 12. Nested If

### Concepts Learned
- `if` statements can be nested inside each other to handle multi-layered decision logic.
- Demonstrates checking two related conditions (`isStudent`, `isSenior`) to apply compound discounts.

### Discount Logic
- If the user is both a student and a senior:
  - Applies a 20% senior discount and an additional 10% student discount.
  - Final price is calculated as `price * 0.7`.
- If the user is only a student:
  - Applies a 10% student discount.
  - `price * 0.9`
- If only a senior:
  - Applies a 20% senior discount.
  - `price * 0.8`
- If neither:
  - No discount is applied.

### Additional Notes
- Nested conditionals allow for more granular and specific decision-making.
- Readability can be improved with consistent indentation and clear separation of logic blocks.
- `System.out.printf()` is used for formatted price output.
---

## 13. String Methods

### Concepts Learned
- The `String` class in Java includes many useful methods for examining and manipulating text.

### Common String Methods
- `length()` – returns the number of characters in the string.
- `charAt(index)` – returns the character at the specified index.
- `indexOf(str)` – returns the index of the first occurrence of the specified substring.
- `lastIndexOf(str)` – returns the index of the last occurrence of the specified substring.
- `toUpperCase()` – converts all characters in the string to uppercase.
- `toLowerCase()` – converts all characters in the string to lowercase.
- `trim()` – removes leading and trailing whitespace from the string.
- `replace(oldChar, newChar)` – replaces all occurrences of a character with another.

### String Validation Methods
- `isEmpty()` – returns `true` if the string has a length of 0.
- `contains(str)` – returns `true` if the string contains the specified substring.
- `equals(str)` – compares two strings with case sensitivity.
- `equalsIgnoreCase(str)` – compares two strings while ignoring case.

### Conditional Usage
- These methods are often used in `if` statements to validate or check string content.
- For example, checking for blank input or disallowed values (like the word "password").

### Additional Notes
- Strings are immutable; methods like `toUpperCase()` return a new string and do not modify the original unless reassigned.
- Java string comparisons should always use `.equals()` or `.equalsIgnoreCase()`, not `==`, which compares object references.
---

## 14. Substrings

### Concepts Learned
- The `.substring()` method is used to extract a portion of a string.
- Syntax: `string.substring(start, end)` or `string.substring(start)`
  - `start` is inclusive.
  - `end` is exclusive (optional in the two-argument version).

### Use Case Example
- Extracting a username and domain from an email address:
  - `email.substring(0, email.indexOf("@"))` extracts the part before the `@` (username).
  - `email.substring(email.indexOf("@") + 1)` extracts the part after the `@` (domain).

### Validation
- Before using `.substring()` in this context, the code checks whether the input contains an `@` symbol using `email.contains("@")`.

### Additional Notes
- If the string does not contain the specified index or character, using `.substring()` can cause `StringIndexOutOfBoundsException`.
- Always validate the string format before performing substring operations to avoid runtime errors.
- Useful for parsing structured text like emails, URLs, or file paths.
---

## 15. Weight Converter

### Concepts Learned
- A simple interactive project using conditional logic and arithmetic to convert between units.
- Demonstrates how to use user input to guide program logic through a menu system.

### Program Structure
- Displays a menu with numbered options for conversion direction:
  - Option 1: Convert pounds (lbs) to kilograms (kgs).
  - Option 2: Convert kilograms (kgs) to pounds (lbs).
- Uses `if-else if-else` to execute the correct conversion based on the user’s choice.

### Conversion Logic
- Pounds to kilograms: multiply by `0.453592`.
- Kilograms to pounds: multiply by `2.20462`.

### Input and Output
- Uses `nextInt()` to select the option.
- Uses `nextDouble()` to collect the weight input.
- `System.out.printf()` is used for formatted decimal output with two digits of precision.

### Additional Notes
- Includes input validation with an `else` block to handle invalid choices.
- Illustrates how to chain together multiple user prompts and calculations within a single method.
- Serves as a practical example of combining menu selection with unit conversion logic.
---

## 16. Ternary Operator

### Concepts Learned
- The ternary operator is a compact form of an `if-else` statement used to assign values based on a condition.
- Syntax:
  - `variable = (condition) ? valueIfTrue : valueIfFalse;`

### Use Cases
- Can be used for quick decisions where a simple condition determines which of two values to assign.
- Improves readability when the logic is straightforward and fits on one line.

### Examples
- Determining pass/fail based on score:
  - `(score >= 60) ? "PASS" : "FAIL"`
- Checking if a number is even or odd:
  - `(number % 2 == 0) ? "EVEN" : "ODD"`
- Determining time of day:
  - `(hours < 12) ? "A.M." : "P.M."`
- Setting tax rate based on income:
  - `(income >= 40000) ? 0.25 : 0.15`

### Additional Notes
- The ternary operator is best used when returning one of two values; for more complex logic, a full `if-else` block may be more appropriate.
- Useful for setting flags, conditions, or small assignments in a concise way.
- Helps simplify logic in places like initializations or return statements.
---

## 17. Temperature Converter

### Concepts Learned
- Combines user input, string handling, arithmetic, and the ternary operator to perform a practical temperature conversion.
- Demonstrates temperature conversion formulas:
  - Fahrenheit to Celsius: `(temp - 32) * 5 / 9`
  - Celsius to Fahrenheit: `(temp * 9 / 5) + 32`

### Program Flow
- Takes a numeric input for temperature.
- Asks the user whether to convert to Celsius or Fahrenheit.
- Converts the input to uppercase using `toUpperCase()` to simplify comparison.

### Ternary Logic
- The ternary operator is used to apply the correct conversion formula:
  - If the user enters `"C"`, it converts from Fahrenheit to Celsius.
  - Otherwise, it assumes the input is in Celsius and converts to Fahrenheit.

### Output
- Uses `System.out.printf()` to display the result with one decimal place.
- Appends the selected unit (`C` or `F`) to the result using string formatting.

### Additional Notes
- Input validation is not included; the program assumes `"C"` or `"F"` will be entered.
- The use of `.toUpperCase()` ensures that input is case-insensitive.
- Practical example of conditional logic applied to real-world unit conversion.
---

## 18. Enhanced Switches

### Concepts Learned
- Enhanced `switch` statements provide a cleaner and more concise alternative to long `if-else if` chains.
- Introduced in Java 14, the enhanced syntax allows multiple case labels and arrow (`->`) expressions for one-line execution.

### Syntax Features
- Multiple values can be grouped using commas in a single case line.
- Uses the `->` syntax to directly associate a case with an action.
- `default` handles unmatched input.

### Example Structure
```java
switch(day) {
    case "Monday", "Tuesday" -> System.out.println("Weekday");
    case "Saturday", "Sunday" -> System.out.println("Weekend");
    default -> System.out.println("Invalid day");
}
```
---

## 19. Calculator

### Concepts Learned
- Demonstrates a basic calculator that performs arithmetic operations based on user input.
- Uses enhanced `switch` statements to select and execute operations.

### Program Flow
- Collects two numbers and an operator (`+`, `-`, `*`, `/`, `^`) from the user.
- Operator is read as a `char` using `scanner.next().charAt(0)`.
- A `switch` statement determines the operation to perform.

### Supported Operations
- `+` – addition
- `-` – subtraction
- `*` – multiplication
- `/` – division (with division-by-zero check)
- `^` – exponentiation using `Math.pow(num1, num2)`

### Error Handling
- Checks for division by zero when the operator is `/`.
- Handles invalid operators using the `default` case in the `switch`.
- Uses a `validOperation` flag to determine whether to print the result.

### Additional Notes
- The result is stored in a `double` to accommodate all supported operations.
- Program logic is structured to ensure the result is only printed if the operation is valid.
- This example combines conditionals, user input, error handling, and formatted logic using enhanced switch syntax.
---

## 21. While Loops

### Concepts Learned
- `while` loops execute a block of code repeatedly as long as the given condition is `true`.
- If the condition is `false` at the start, the loop is skipped entirely.
- A `do-while` loop guarantees the loop runs **at least once**, because the condition is checked **after** the loop body.

### While Loop Usage
- Commonly used for input validation and continuous prompting.
- Example: requesting non-empty user input until a name is entered.
- Another example: looping a game state until the user types "Q" to quit.

### Infinite Loop Warning
- A `while` loop with a condition that never becomes `false` results in an **infinite loop**.
- Always ensure the loop’s condition can eventually be broken.

### Do-While Loop Usage
- Ensures user input is collected and validated even if the initial input is invalid.
- Useful when the prompt must appear at least once regardless of the condition.

### Input and Control
- `scanner.nextLine()` and `scanner.next()` are used to gather input.
- `toUpperCase()` is used to make user input case-insensitive.
- A `System.exit(0);` can be used to stop execution early for testing purposes.

### Additional Notes
- Always close the `Scanner` object after use to avoid resource leaks.
- Good practice to use comments to distinguish different input loops and to document the purpose of each.
---

## 22. Number Guessing Game

### Concepts Learned
- A practical project using `Random`, `Scanner`, loops, and conditionals to build a simple interactive game.
- The game involves guessing a randomly generated number within a specified range.

### Program Structure
- A `Random` object is used to generate a number between `min` and `max` (inclusive).
- A `Scanner` object is used to collect user guesses.
- A `do-while` loop allows repeated guessing until the correct number is found.
- An `attempts` counter tracks how many tries it takes to guess the correct number.

### Conditional Logic
- If the guess is lower than the target, a "TOO LOW" message is shown.
- If the guess is higher, a "TOO HIGH" message is shown.
- If the guess matches, a success message and the attempt count are displayed.

### Output and Input Handling
- Uses `printf` to format initial prompt with the guessing range.
- Ensures repeated prompting by checking the win condition at the end of each loop iteration.

### Additional Notes
- `random.nextInt(min, max + 1)` ensures the upper bound is inclusive.
- The loop guarantees at least one guess attempt.
- Encourages control flow understanding and reinforces user interaction design.
- Always closes the `Scanner` at the end to prevent resource leaks.
---

## 23. For Loops

### Concepts Learned
- A `for` loop is used to execute code a specific number of times.
- Syntax:
  - `for(initialization; condition; update) { // code to repeat }`

### Loop Control
- `initialization`: sets the starting value (e.g., `int i = 1`)
- `condition`: continues the loop while `true` (e.g., `i <= max`)
- `update`: modifies the loop variable (e.g., `i++`, `i--`, `i -= 3`)

### Use Cases
- A loop that runs from 1 to a user-specified number using user input and `scanner.nextInt()`.
- A countdown project using reverse iteration from a user-defined start value.

### Countdown Exercise
- Demonstrates reverse iteration with `for (int i = start; i > 0; i--)`.
- Uses `Thread.sleep(1000)` to pause for one second between each number.
- The method `main` is marked with `throws InterruptedException` to handle potential thread interruptions.

### Additional Notes
- `System.exit(0)` is used to stop the execution of any code that follows the countdown method.
- Properly closes the `Scanner` to avoid resource leaks.
- A `for` loop is ideal when the number of iterations is known in advance.
---

## 24. Break and Continue

### Concepts Learned
- `break` and `continue` are control flow statements used within loops.
- They alter the normal flow of execution based on specific conditions.

### `break`
- Immediately exits the nearest enclosing loop.
- Any code after the `break` statement within the loop is skipped.
- Commonly used to exit a loop early when a condition is met.

### `continue`
- Skips the current iteration and proceeds to the next loop cycle.
- Any code after the `continue` statement within the current iteration is not executed.

### Example Behavior
- In a loop from 0 to 9, using `continue` when `i == 5` will cause the value 5 to be skipped in the output.
- Using `break` instead would cause the loop to stop entirely once `i == 5`.

### Additional Notes
- These statements are useful for fine-tuned control over loop behavior.
- Should be used intentionally, as overuse can make loops harder to read and maintain.
---

## 25. Nested Loops

### Concepts Learned
- A nested loop is a loop placed inside another loop.
- The outer loop typically controls rows, and the inner loop controls columns.
- Commonly used in working with matrices, tables, grids, or any 2D structure.

### Basic Structure
- The outer loop runs once for each row.
- The inner loop runs fully for each iteration of the outer loop.
- Example: printing numbers in multiple rows, where the inner loop prints 1–9 on each line.

### Mini Project: Matrix Printer
- Prompts the user to enter the number of rows and columns, and a character to print.
- Uses a nested loop to construct a rectangle using the user-defined symbol.
- The outer loop handles line breaks (new rows), and the inner loop prints characters across a row.

### Input and Logic
- Uses `Scanner` to read `int` values for rows and columns, and a `char` for the symbol.
- `scanner.next().charAt(0)` reads a single character from input.
- `System.out.print(symbol)` prints characters in the same row.
- `System.out.println()` moves to the next line after each row.

### Additional Notes
- Nested loops are essential in many algorithms and are often used in data structures and algorithm challenges.
- Pay attention to loop boundaries (`<` vs `<=`) to control dimensions correctly.
- `System.exit(0)` is used in this example to control which part of the program runs.
---

## 26. Methods

### Concepts Learned
- A method is a block of reusable code that performs a specific task and is executed when called.
- Methods improve modularity, readability, and code reuse.

### Method Declaration
- Syntax: `static returnType methodName(parameters) { // code }`
- Methods must specify:
  - A return type (`void`, `int`, `double`, `boolean`, etc.)
  - A name
  - Optional parameters with defined types

### Method Examples
- `happyBirthday(String name, int age)` – prints a birthday message using parameters.
- `square(double number)` – returns the square of a number.
- `cube(double number)` – returns the cube of a number.
- `getFullName(String first, String last)` – returns a concatenated full name.
- `ageCheck(int age)` – returns `true` if age is 18 or older, otherwise `false`.

### Calling Methods
- Methods are called using their name followed by parentheses, passing required arguments.
- Return values can be used directly or stored in variables.

### Return Types
- `void` – does not return a value.
- Other types (`double`, `String`, `boolean`) return values which can be used or printed.

### Additional Notes
- Method names should be descriptive and follow camelCase convention.
- Parameters allow passing data into methods; arguments must match in type and order.
- Methods can call other methods and return values to the caller.
---

## 27. Overloaded Methods

### Concepts Learned
- Method overloading allows multiple methods to share the same name as long as their parameter lists (signatures) are different.
- A method's **signature** includes its name and parameter types/order, not the return type.

### Rules of Overloading
- The method name must remain the same.
- The number and/or types of parameters must be different.
- Return type can be the same or different, but it does not determine overload validity.

### Examples

#### Overloaded `add` Methods:
- `add(double a, double b)`
- `add(double a, double b, double c)`
- `add(double a, double b, double c, double d)`
- Each method adds a different number of values.

#### Overloaded `bakePizza` Methods:
- `bakePizza(String bread)` – basic pizza.
- `bakePizza(String bread, String cheese)` – adds cheese.
- `bakePizza(String bread, String cheese, String topping)` – adds topping.

### Benefits
- Simplifies code readability when methods perform similar operations with varying inputs.
- Allows for flexible method use depending on how much information is provided.

### Additional Notes
- Overloading does not work based solely on return type.
- Method resolution is determined at compile time based on the method call's arguments.
---

## 29. Banking Program

### Concepts Learned
- A menu-driven console application combining control flow, methods, user input, and validation logic.
- Demonstrates how to structure a multi-option program using a loop and `switch` statement.

### Program Flow
- Displays a menu with four options:
  1. Show Balance
  2. Deposit
  3. Withdraw
  4. Exit
- The program runs inside a `while` loop until the user selects the exit option.

### Method Overview
- `showBalance(double balance)` – displays the current account balance using `printf` for formatting.
- `deposit()` – collects a deposit amount, validates it, and returns the value to be added to the balance.
- `withdraw(double balance)` – collects a withdrawal amount, checks if it’s valid and affordable, and returns the value to subtract.

### Input Handling
- A single static `Scanner` is used throughout the file to avoid repeated instantiations.
- Inputs are validated to prevent negative deposits or withdrawals, and to ensure sufficient balance for withdrawals.

### Control Structure
- Uses an enhanced `switch` statement to execute menu actions based on user input.
- A `boolean isRunning` flag controls the loop and is set to `false` when the user chooses to exit.

### Additional Notes
- Demonstrates good modular design with small, focused methods.
- Makes use of reusable logic and consistent validation.
- A practical example of user interaction and dynamic state updates within a program.
---

## 30. Dice Roller Program

### Concepts Learned
- Simulation of a dice roll using `Random` and `Scanner`.
- Use of `switch` and multi-line strings to display ASCII art for each die face.
- Demonstrates loop logic for handling user-defined repetition and accumulative operations.

### Program Behavior
- Prompts the user to enter the number of dice to roll.
- Rolls each die individually using `random.nextInt(1, 7)`.
- Each roll is:
  - Printed visually using a helper method `printDie(int roll)`.
  - Displayed numerically.
  - Added to the total roll score.

### `printDie()` Method
- Uses Java's text blocks (`""" """`) to define ASCII art representations for each die value (1 to 6).
- A `switch` statement prints the correct die face based on the roll.

### Input Validation
- Ensures that the number of dice entered is greater than 0.
- Displays an error message if the input is invalid.

### Additional Notes
- This is a complete mini-project showcasing:
  - Use of methods to organize logic (`printDie`).
  - Basic input validation.
  - Looping constructs (`for` loop).
  - Random number generation.
  - Output formatting using multiline strings.
---

## 31. Arrays

### Concepts Learned
- An **array** is a container that holds multiple values of the same data type.
- Arrays are declared using square brackets `[]` after the data type.
- Arrays have a fixed size and are zero-indexed (first element is at index 0).

```java
String[] fruits = {"apple", "orange", "banana", "coconut"};
```

### Common Operations
- Access an element:
```java
System.out.println(fruits[0]);
```

- Modify an element:
```java
fruits[0] = "pineapple";
```

- Get array length:
```java
int length = fruits.length;
```

### Useful Methods from Arrays Class
- Sort array alphabetically:
```java
Arrays.sort(fruits);
```

- Fill entire array with a single value:
```java
Arrays.fill(fruits, "pineapple");
```

### Looping Through Arrays
- Standard for loop:
```java
for (int i = 0; i < fruits.length; i++) {
    System.out.println(fruits[i]);
}
```

- Enhanced for-each loop:
```java
for (String fruit : fruits) {
    System.out.println(fruit);
}
```

### Additional Notes
- Use arrays when the number of elements is fixed.
- For dynamic collections, use `ArrayList`.
## 32. Array User Input

### Concepts Learned
- Arrays can be initialized at runtime based on user input for flexible sizing.
- User input can be collected and stored sequentially into an array using a loop.
- `Scanner.nextLine()` is used to capture full string input, including spaces.
- A `for` loop allows indexed assignment into the array, followed by iteration using a for-each loop to display values.

### Program Behavior
- The program first asks how many food items the user wants to input.
- It then initializes a `String[]` array with the specified size.
- A `for` loop runs from `0` to `size - 1`, prompting the user each time to enter a food name.
- Each food entered is stored in the corresponding array index.
- After the array is filled, a for-each loop prints each food item on a new line.

### Input Handling Notes
- `scanner.nextInt()` reads the integer input for array size.
- `scanner.nextLine()` is called after `nextInt()` to consume the leftover newline character from the buffer. Without this, the first call to `nextLine()` inside the loop would be skipped.

### Additional Notes
- This approach demonstrates how to dynamically allocate an array size at runtime.
- Proper closure of the `Scanner` ensures there are no resource leaks.
- Using a for-each loop for output is more concise when the index is not needed.

## 33. Search an Array

### Concepts Learned
- Arrays can be searched linearly using a `for` loop.
- Use `.equals()` to compare strings rather than `==`, which compares object references.
- Introduced the use of a `boolean` flag (`isFound`) to track search results during iteration.

### Program Behavior
- The program defines an array of `String` values (`fruits`).
- It prompts the user to input a string (fruit name) to search for in the array.
- A `for` loop iterates through each element in the `fruits` array.
  - If a match is found using `.equals()`, the index is printed and `isFound` is set to `true`.
  - The loop terminates early using `break` once a match is found.
- After the loop, the program checks if `isFound` is still `false` to determine if the search was unsuccessful.

### Input Handling Notes
- `scanner.nextLine()` reads a full line from the user, useful for string input.
- `scanner.close()` is called at the end to release resources.

### Additional Notes
- Linear search is suitable for small arrays or unsorted data.
- `equalsIgnoreCase()` could be used instead of `equals()` for case-insensitive matching.
- Searching through an array using `for-each` is possible, but tracking the index is easier with a regular `for` loop.
---
## 34. Varargs

### Concepts Learned
- **Varargs** (variable-length arguments) allow methods to accept zero or more arguments of the same type.
- Declared using an ellipsis (`...`) after the type in the method parameter.
- Internally, Java treats varargs as an array, enabling iteration over the passed values.

### Advantages
- Increases **flexibility** by avoiding method overloading for different numbers of arguments.
- Simplifies method definitions when accepting an unknown number of inputs.

### Program Behavior
- Defines two methods:
  - `add(int... numbers)` sums any number of integers.
  - `average(double... numbers)` calculates the average of passed doubles.
- If no arguments are passed to `average()`, it returns `0` to avoid division by zero.

### Syntax
- Only one varargs parameter is allowed per method.
- The varargs parameter must be the **last** in the parameter list:
  ```java
  static void example(String label, int... values)
  ```

### Additional Notes
- Varargs can be passed directly as comma-separated arguments.
- Java implicitly wraps the inputs in an array, so methods behave as if receiving a standard array.
- Useful for utility methods where the number of arguments isn't fixed.

