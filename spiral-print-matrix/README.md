Sprial Matrix
=============

Input: a square matrix, like:  
Example 1:  
        1 2 3  
        4 5 6  
        7 8 9  

Or Example 2:  
        1  2  3  4  
        5  6  7  8  
        9  10 11 12  
        13 14 15 16  

The square matrix maybe a 2 dimensional array, or Array of Arrays, or lists of lists (based on the programming language).  
You should print the items of the Matrix in the spiral way, like this:  
        1 > 2 > 3  
                 V  
        4 >  5  6  
        ^       V
        7 < 8 < 9  
so that the output is similar to the following:  
        1 2 3 6 9 8 7 4 5  

and for example 2:  
        1  > 2  > 3  > 4
                         V
        5  > 6  > 7    8
        ^         V    V
        9    10 < 11   12
        ^              V
        13 < 14 < 15 < 16  

and the output:  
        1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10  
