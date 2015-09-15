# Histogram
A Graphical Representation of Data!

I created this Java program for a project in my Data Structures & Algorithms class. The objective was to output a neatly formatted histogram based on an arbitrary number of integers from zero to one-hundred.


input from histogram.txt:
    `51 68 42 61 23 50 79 9 12 9 67 85 64 97 41 13 66 47 54 2 46 48 11 52 79 48 73 48 51 15 44 97 19 48 53 13 58 47 95 2 1 65 84 28 89 99 70 67 84 36 57 89 44 11 22 33 55 45 66 88 77 11 13 16 17 19 22 23 25 28 29 37 34 36 95 85`


I created an array of 10 integers to keep count of the numbers. For each integer parsed from the text file, it is categorized and then increments the corresponding section of the array. After all integers have been read from the file, the **printHistogram** function is called with the array as an argument. This function handles the formatted output of the data into the command line. Within this function, **creatAsterisks** is called. This function creates a String with as many asterisks as the corresponding counter in the array.


output:

![](http://i.imgur.com/26hkzSg.png)