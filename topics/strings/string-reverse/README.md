# 1. Two Sum
[LeetCode Link](https://leetcode.com/problems/reverse-string/description/)

**Difficulty:** Easy
**Tags:** String
**Language:** Java

## Problem
Write a function that reverses a string. The input string is given as an array of characters s.
## Approach
Copy the original array into a temporary array, then traverse the temporary array in reverse order and write the characters back to the original array.

*(Optimization note: Use the two-pointer approach by swapping the characters from the beginning and the end of the array until the pointers meet, eliminating the need for an extra array.)*

## Complexity
- Time: O(n)
- Space: O(n)
