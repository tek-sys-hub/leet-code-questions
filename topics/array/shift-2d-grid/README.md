# 1. Shift 2D Array`
[LeetCode Link](https://leetcode.com/problems/shift-2d-grid/description/)

**Difficulty:** Easy
**Tags:** Array
**Language:** Java

## Problem
Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.

## Approach
1.Pretend the $m \times n$ grid is a single flat line of length $m \times n$.<br>
2.Convert each 2D spot $(i, j)$ into a 1D position using i * n + j.<br>
3.Find the new 1D position using (current_position + k) % (m * n).<br>
4.Convert the new 1D position back to 2D row (new_position / n) and column (new_position % n) to build the shifted grid.

## Complexity
- Time: O(m * n)
- Space: O(m * n)
