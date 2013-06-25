def print_spiral(l, start=0, end=None):
    """
    This is the simple solution using python, very optimized for readability.
    It is based on recurssion, each time we print only the outer elements,
    then call the same function again, modifing the start and end pointers.
    Note: this is Python 2.7
    """
    end = end or len(l[start])
    for i in range(start, end): 
        print l[start][i]

    for i in range(start+1, end): 
        print l[i][end-1]

    for i in range(end-2, start-1, -1):
        print l[end-1][i]

    for i in range(end-2, start, -1): 
        print l[i][start]

    if start < end - 2: 
        print_spiral(l, start + 1, end - 1)

print_spiral([[1,2,3], [4,5,6], [7, 8, 9]])
print
print_spiral([[1,2,3,4], [5,6,7,8], [9, 10,11,12], [13, 14,15,16]])

