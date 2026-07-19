# 189. Rotate Array
[LeetCode Link](https://leetcode.com/problems/rotate-array/)

**Difficulty:** Medium
**Tags:** Array, Two Pointers, Math
**Language:** Java

## Problem
Given an array `nums`, rotate the array to the right by `k` steps, where `k`
is non-negative.

## Approach
Used the reversal trick:
1. Reverse the entire array.
2. Reverse the first `k` elements.
3. Reverse the remaining `n - k` elements.

This produces the rotated array without needing extra space. Also handled
the case where `k > nums.length` by taking `k = k % nums.length`.

## Complexity
- Time: O(n)
- Space: O(1)
