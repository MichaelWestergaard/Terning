# Terning
This is a Java program for- rolling dice.

## Purpose
This is an exercise in using _GIT_ to fix errors and trace the changes.

## JUnit
The testing framework JUnit was implemented to test two aspects of the program.

The first test was to confirm whether or not the dice could assume a value other than 1-6. This was done by executing the program 1000 times, and noting which value was returned.

The second test was to determine if the values of the dice, i.e. 1, 2, 3, 4, 5, 6, had the same probability of occurring within a reasonable margin. This was done by rolling the dice 60000 times, noting the value of each throw, and calculating the percentage chance for each value being chosen.  

## BugFixes
The first JUnit test passed, which meant that no values other than 1-6 were possible, and as such the program was working as intended.

The second JUnit test failed, which meant the probability of rolling some values were higher or lower than others. In this case 1 and 6 were half as likely to occur as the other values, and to prevent this the process with which the values were generated was changed.

Apart from this a off-by-one error was found in the program. When the user specified the number of dice to throw, it would be compared against another value in a for loop, which was off by one. This meant that the number of dice thrown was one less than expected.
