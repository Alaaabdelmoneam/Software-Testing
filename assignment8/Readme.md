# Java Program: 2D Array Operations

## Overview

This program performs various operations on a 2D array (matrix) and demonstrates the use of methods, loops, conditionals, and object-oriented concepts such as setters, getters, and static methods.

---

## Requirements

### 1. **Matrix Initialization**
- Write a method `initializeMatrix(int rows, int cols)` that:
  - Creates and returns a 2D array filled with random integers between `1` and `100`.

### 2. **Display Matrix**
- Write a method `displayMatrix(int[][] matrix)` that:
  - Prints the matrix in a readable format.

### 3. **Sum of Elements**
- Write a method `sumOfElements(int[][] matrix)` that:
  - Calculates and returns the sum of all elements in the matrix.

### 4. **Transpose of Matrix**
- Write a method `transposeMatrix(int[][] matrix)` that:
  - Returns a new 2D array that is the transpose of the original matrix.

### 5. **Find Maximum Element**
- Write a method `findMax(int[][] matrix)` that:
  - Returns the maximum element in the matrix.

### 6. **Check for Even/Odd Count**
- Write a method `countEvenOdd(int[][] matrix)` that:
  - Returns an array with two elements:
    - Count of even numbers.
    - Count of odd numbers in the matrix.

---

## Main Method

In the `main` method, perform the following steps:

1. **Prompt the user** for the number of rows and columns.
2. Call `initializeMatrix` to create the matrix.
3. Call `displayMatrix` to print the matrix.
4. Call `sumOfElements` and print the result.
5. Call `transposeMatrix` and display the transposed matrix.
6. Call `findMax` and print the maximum value.
7. Call `countEvenOdd` and display the counts of even and odd numbers.

---

## Setters and Getters

- Create a `Matrix` class with:
  - **Instance variables** for the matrix.
  - **Methods** for setters and getters.
- Refactor the existing methods to utilize this class.

---

## Static Methods

- Convert some methods (e.g., `initializeMatrix` and `displayMatrix`) to static methods.
- Observe and document how this affects their usage in the main method.

---

## Call by Reference and Value

- Demonstrate the difference between:
  - Passing the matrix to methods (**call by reference**).
  - Passing primitive types like row and column counts (**call by value**).

---

## Submission

Submit the following:
1. **Java Code Files**:
   - `Matrix.java` (Matrix class)
   - `Main.java` (Main method and operations)
2. **Brief Report** (1-2 paragraphs):
   - Explain how each method was implemented.
   - Discuss any challenges you faced during implementation.

---

## Evaluation Criteria

- Correct use of **classes** and **objects**.
- Proper implementation of **loops** and **conditionals**.
- Code readability and comments.
- Functional correctness as per the requirements.
