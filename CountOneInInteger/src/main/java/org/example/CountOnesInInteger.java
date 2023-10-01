package org.example;

public class CountOnesInInteger {
    public int countOnes(int num) {
        int count = 0;
        while (num != 0) {
            count += (num & 1); // Check the least significant bit
            num >>= 1; // Right-shift the number to check the next bit
        }
        return count;
    }
}
