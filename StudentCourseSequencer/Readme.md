# CSX42: Assignment 3
## Name: Mukunthan Sriram Balaji

Note - I have used 3 slack days for this project.

-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in StudentCourseSequencer/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile studentCoursesMgmt/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile StudentCourseSequencer/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile StudentCourseSequencer/src/build.xml run -Darg0=input.txt -Darg1=Output.txt -Darg2=ErrFile.txt

## Replace <fileName.txt> with real file names. For example, if the files are available in the path,
## you can run it in the following manner:

ant -buildfile StudentCourseSequencer/src/build.xml run -Darg0=input_file.txt -Darg1=delete_file.txt -Darg2=output1_file.txt -Darg3=output2_file.txt -Darg4=output3_file.txt

Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Description:

This application follows the 'State Pattern' by using 5 states for 5 Groups.

Interface implementation is used in this assignment for the required state classes.

This assignment has been programmed to accept and process simple inputs containing atleast 3 courses per group. Shorter inputs might not work.

The classes such as GroupIdentifier and Semester has been implemented succesfully.

The output class is designed to update the output file in the required style.

The input is fetched from and written to text files using 'FileReader' and 'FileWriter' classes.

I've mainly used 'Queue' to implement the waiting list part of the application.

I have used data structures such as ArrayList and Arrays to improve efficiency and consistency in this project.

Exception handling is performed accordingly for inputs and outputs.

The time complexity of this application should be O(m+n) since it's design is number of number of students + number of courses.

The 'StateSwtich' class is the context class in this assignment of mine.

The flags have been initiated in all the states to indicate if that state has been set or not.

Edge cases:

The code has a condition to handle if the input file is missing.

-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.""

Date: 10-19-2023

