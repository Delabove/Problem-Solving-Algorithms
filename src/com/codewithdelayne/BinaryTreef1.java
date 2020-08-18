package com.codewithdelayne;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTreef1 {

    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int x) { data = x; }


        public Node(Node node)
        {
            this.data = node.data;
            this.left = node.left;
            this.right = node.right;

        }

        public void add(Node node)
        {

            if(data > node.data)
            {

                if(left == null)
                    left = node;

                else
                    left.add(node);
            }

            if(data < node.data)
                if(right == null)
                    right = node;

                else
                    right.add(node);
        }


    }

    static class Tree
    {
        Node root;

        public Tree(Node node)
        {
            this.root = node;

        }
        public Tree()
        {
            this.root = null;
        }

        public void add(Node node)
        {

            if(root == null)
            {
                root = node;
            }
            if(root.data > node.data){

                if(root.left == null)
                    root.left = node;
                else
                    root.left.add(node);
            }

            if(root.data < node.data)
            {
                if(root.right == null)
                    root.right = node;
                else
                    root.right.add(node);
            }

        }

        public void addInt(int value){
            add(new Node(value));

        }

        public void postorder(Node n)
        {
            if (n != null)
            {
                postorder(n.left);
                postorder(n.right);
                System.out.print(n.data + " ");
            }
        }

        public void inorder(Node n)
        {
            if (n != null)
            {
                inorder(n.left);
                System.out.print(n.data + " ");
                inorder(n.right);
            }
        }

    }


    public static class TreeTest
    {


        public static ArrayList<Integer> printPath(Node node, ArrayList<Integer> path, int value) {

            if (node == null) {
                return path;
            }

            if (node.data == value) {
                path.add(value);
                return path;
            }

            if(node.data > value){
                path.add(node.data);
                printPath(node.left, path, value);
            }
            if(node.data < value) {
                path.add(node.data);
                printPath(node.right,path, value);
            }

            return path;
        }

        }



    public static void main(String[] args)
    {

        Tree tree = new Tree();

        tree.add(new Node(1));
        tree.add(new Node(2));
        tree.add(new Node(3));
        tree.add(new Node(4));
        tree.add(new Node(5));
        tree.add(new Node(6));
        tree.add(new Node(7));



        ArrayList<Integer> mylist = TreeTest.printPath(tree.root, new ArrayList<Integer>(),10);

        System.out.println("the path is "+mylist);

        tree.inorder(tree.root);
        System.out.println("");
        tree.postorder(tree.root);
        System.out.println("");
        System.out.println((tree.root));

    }
}


//      Question Analysis

// Given: sorted array list

// create a balanced binary tree

// return the root of the tree as your result.