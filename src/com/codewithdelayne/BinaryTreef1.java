package com.codewithdelayne;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;

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

        /* A utility function to print preorder traversal of BST */
        void preOrder(Node node) {
            if (node == null) {
                return;
            }
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }


    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        Node root = tree.balancedTree(arr, 0, n - 1);
        System.out.println("Preorder traversal of constructed BST");
        tree.preOrder(root);
        System.out.println(root);
    }

}


//      Question Analysis

// Given: sorted array list

// create a balanced binary tree

// return the root of the tree as your result.

//
//ArrayList<Integer> inputList;
//    Node node = balancedTree(inputList);
//
//    private Node balancedTree(ArrayList<Integer> inputList2){
//        return balancedTree(inputList, 0, inputList.size() - 1);
//    }
//    public static Node balancedTree(ArrayList<Integer> inputList, int start, int end){
//
//
//
//        if(end<start)
//            return null;
//
//        int mid = (start+end)/2;
//        Node node= new Node(inputList.get(mid));
//        node.left = balancedTree(inputList, start, mid -1);
//        node.right = balancedTree(inputList, mid + 1, end);
//
//        return node;
//    }