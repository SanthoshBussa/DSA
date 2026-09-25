<div align="center">

# 🧠 Data Structures & Algorithms in Java

**Curated collection of 100+ Data Structures & Algorithms problems solved across LeetCode and GeeksforGeeks**

[![Language](https://img.shields.io/badge/Language-Java_17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![LeetCode](https://img.shields.io/badge/LeetCode-Problem_Solving-FFA116?style=for-the-badge&logo=leetcode&logoColor=white)](https://leetcode.com/)
[![GeeksforGeeks](https://img.shields.io/badge/GeeksforGeeks-DSA-2F8D46?style=for-the-badge&logo=geeksforgeeks&logoColor=white)](https://www.geeksforgeeks.org/)

</div>

---

## 📌 Overview

This repository contains clean, modular, and complexity-analyzed **Java** implementations of core Data Structures and Algorithms. Each package focuses on optimal time and space complexity patterns frequently used in production backend systems and technical problem solving.

---

## 🗂️ Repository Structure & Complexity Matrix

| Topic / Package | Key Implementations | Time Complexity | Space Complexity | Source File |
| :--- | :--- | :---: | :---: | :--- |
| **Sorting Algorithms** | Bubble Sort, Selection Sort, Insertion Sort | $O(N^2)$ | $O(1)$ | [`src/algorithms/Sortings.java`](./src/algorithms/Sortings.java) |
| **Arrays & Two Pointers** | Two Sum, Kadane's Max Subarray, Container With Most Water, Trapping Rain Water, Merge Intervals | $O(N)$ – $O(N \log N)$ | $O(1)$ – $O(N)$ | [`src/arrays/ArraysAndTwoPointers.java`](./src/arrays/ArraysAndTwoPointers.java) |
| **Binary Search** | Search in Rotated Sorted Array, Minimum in Rotated Array, Find Peak Element | $O(\log N)$ | $O(1)$ | [`src/searching/BinarySearchProblems.java`](./src/searching/BinarySearchProblems.java) |
| **Linked Lists** | Singly Linked List (Insert, Delete, Traverse, Reverse) | $O(1)$ – $O(N)$ | $O(1)$ | [`src/linkedlist/SinglyLinkedList.java`](./src/linkedlist/SinglyLinkedList.java) |
| **Stacks** | Custom Stack Implementation (`push`, `pop`, `peek`, overflow/underflow checks) | $O(1)$ | $O(N)$ | [`src/stack/MyStack.java`](./src/stack/MyStack.java) |
| **Binary Trees & BST** | Level Order Traversal (BFS), Validate BST, Lowest Common Ancestor (LCA) | $O(N)$ | $O(H)$ | [`src/trees/BinaryTreeSolutions.java`](./src/trees/BinaryTreeSolutions.java) |
| **Dynamic Programming** | Longest Increasing Subsequence (LIS), Coin Change, Longest Common Subsequence (LCS) | $O(N \log N)$ – $O(M \cdot N)$ | $O(N)$ – $O(M \cdot N)$ | [`src/dynamicprogramming/DynamicProgrammingSolutions.java`](./src/dynamicprogramming/DynamicProgrammingSolutions.java) |

---

## 🚀 How to Compile & Run

```bash
# Clone the repository
git clone https://github.com/SanthoshBussa/DSA.git
cd DSA

# Compile any package
javac -d bin src/arrays/ArraysAndTwoPointers.java
```

---

## 👨‍💻 Author

**Santhosh Bussa** — *Java Developer*
- 💼 LinkedIn: [linkedin.com/in/santhosh-bussa](https://www.linkedin.com/in/santhosh-bussa)
- 🐙 GitHub: [github.com/SanthoshBussa](https://github.com/SanthoshBussa)
