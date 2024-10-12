# Java Book Library Management System

## Project Overview
Create a simple Book Library Management System that reads book data from a file, processes it using streams and various data structures, and provides basic library management functionalities.

## Key Components

1. Book Class
   - Properties: ISBN, title, author, year, genre
   - Methods: getters, setters, toString()

2. Library Class
   - Data Structures:
     - ArrayList<Book> for storing all books
     - LinkedList<Book> for managing book loans
     - HashMap<String, List<Book>> for categorizing books by genre

3. FileHandler Class
   - Methods for reading from and writing to files

4. LibraryManager Class (main class)
   - Implements the main logic and user interface

## Features to Implement

1. File Handling:
   - Read book data from a CSV file
   - Parse the data and create Book objects

2. Data Processing with Streams:
   - Filter books by year, genre, or author
   - Sort books by title or year
   - Calculate average publication year

3. Data Structure Operations:
   - Add books to the ArrayList
   - Categorize books by genre using the HashMap
   - Manage book loans using the LinkedList

4. User Interface:
   - Display all books
   - Search for books by title or author
   - Add new books
   - Remove books
   - Lend and return books

## Implementation Steps

1. Create the Book class with necessary properties and methods.
2. Implement the FileHandler class to read book data from a CSV file.
3. Create the Library class with the required data structures.
4. Implement methods in the Library class to add, remove, and search for books.
5. Use streams to filter, sort, and process book data.
6. Create the LibraryManager class with a simple command-line interface.
7. Implement user interaction logic in the LibraryManager class.

This project will give you practice with file handling, streams, and various data structures while creating a practical application.
