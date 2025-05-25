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
