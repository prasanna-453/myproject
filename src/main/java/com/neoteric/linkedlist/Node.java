package com.neoteric.linkedlist;

public class Node {

    private int data;
    private Node nextnode;

    public int getData() {
        return data;
    }

    public Node getNextnode() {
        return nextnode;
    }

        public Node(int data,Node nextnode){

        this.data=data;
        this.nextnode=nextnode;

        
    }
}
