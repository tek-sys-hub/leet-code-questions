# 1. Two Sum
[LeetCode Link](https://leetcode.com/problems/two-sum/)

**Difficulty:** Easy
**Tags:** Array, Hash Map
**Language:** Java

## Problem
Given an array of integers `nums` and an integer `target`, return the indices
of the two numbers that add up to `target`.

## Approach
Brute force: check every pair of numbers with nested loops until one pair
sums to the target.

*(Optimization note: this can be improved to O(n) using a HashMap to store
seen values and their indices.)*

## Complexity
- Time: O(n²)
- Space: O(1)
