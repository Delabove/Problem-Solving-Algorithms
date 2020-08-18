package com.codewithdelayne;

public class BinaryTreef1 {


// Java program to print BST in given range

    // A binary tree node
   public static class Node {

        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    static class BinaryTree {

        static Node root;

        /* A function that constructs Balanced Binary Search Tree
         from a sorted array */
        Node balancedTree(int arr[], int start, int end) {

            /* Base Case */
            if (start > end) {
                return null;
            }

            /* Get the middle element and make it root */
            int mid = (start + end) / 2;
            Node node = new Node(arr[mid]);

        /* Recursively construct the left subtree and make it
         left child of root */
            node.left = balancedTree(arr, start, mid - 1);

        /* Recursively construct the right subtree and make it
         right child of root */
            node.right = balancedTree(arr, mid + 1, end);

            return node;
        }

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        Node root = tree.balancedTree(arr, 0, n - 1);


    }

}


//      Question Analysis

// Given: sorted array list

// create a balanced binary tree

// return the root of the tree as your result.