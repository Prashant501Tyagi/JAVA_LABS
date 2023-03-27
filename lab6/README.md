Q.Create a Student class, that will store the details of the Student, below mentioned are the attributes of a student. Reg. No. Name Email Phone Class Department The Student class will have the following methods: A constructor to initialize the values of the Student A method to print the Details of the Student. A method (named 'toString()) that convert the student details to string, and can be used to write the student details to file. In the main-method class, create an array of Student Class to hold maximum details of 100 Students.

In the menu-driven program, the menu options will have Add a student Adds the details of 1 student to the array of Student. Search for a student Search for the details of a student from the array of Student. Searching can be done with Name or Register Number. Update the details of a student Update the student details based on the search based on name or register number. Display all students Displays the details of all students. Save the details of each student in a file, with the student name as filename.

Note: Make use of functions to implement the menu options.



D:\JAVA_LAB_EXEM\lab6>java lab6
MENU
1. Add a student
2. Search for a student
3. Update the details of a student
4. Display all students
5. Save student details to file
6. Exit
Enter your choice: 1
Enter the details of the student:
Reg No.: 22122036

Name: prashant
Email: tparshant501@gmail.com
Phone: 8708245465
Class: msc
Department: datascience
Student added successfully
MENU
1. Add a student
2. Search for a student
3. Update the details of a student
4. Display all students
5. Save student details to file
6. Exit
Enter your choice: 5
Enter the name of the student to save the details to file:
prashant
Student details saved to file successfully
MENU
1. Add a student
2. Search for a student
3. Update the details of a student
4. Display all students
5. Save student details to file
6. Exit
Enter your choice: 2
Enter the search term (name or register number):
prashant
Reg No.: 22122036
Name: prashant
Email: tparshant501@gmail.com
Phone: 8708245465
Class: msc
Department: datascience
MENU
1. Add a student
2. Search for a student
3. Update the details of a student
4. Display all students
5. Save student details to file
6. Exit
Enter your choice: 3
Enter the search term (name or register number):
prashant
Enter the new details:
Name: prashant tyagi
Email: tparshant501@
Phone: 53895y
Class: msds
Department: datasceince
Student details updated successfully
MENU
1. Add a student
2. Search for a student
3. Update the details of a student
4. Display all students
5. Save student details to file
6. Exit
Enter your choice: 4
Reg No.: 22122036
Name: prashant tyagi
Email: tparshant501@
Phone: 53895y
Class: msds
Department: datasceince
MENU