/*
Intuition
Position of rightmost set bit using two’s complement:

(n&-n) always return the binary number containing the rightmost set bit as 1. if N = 12 (1100) then it will return 4 (100).
Here log2 will return, the number of times we can express that number in a power of two.
For all binary numbers containing only the rightmost set bit as 1 like 2, 4, 8, 16, 32….
Find that position of rightmost set bit is always equal to log2(Number) + 1(to convert into one based indexing).

Implementation
Let input be 12 (1100)
Take two’s complement of the given no as all bits are reverted except the first ‘1’ from right to left (0100)
Do a bit-wise & with original no, this will return no with the required one only (0100)
Take the log2 of the no, you will get position - zero-based indexing.(we can also use __builtin_ctz() function to find setbit)
Add 1 to covert one based indexing.
return index.

Complexity
Time Complexity: O(Log(N)), Where N is given number.
Auxiliary Space: O(1), We are not using any extra space.


 */
package FirstSetBit;

public class Xorr {
}
