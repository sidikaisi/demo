package com.andysun.demo;

/**
 * Created by andysun on 下午 9:10.
 */
public class Arithmetic1 {
    static class MyNode{

        private String nodeValue;

        private MyNode nextNode;


        public String getNodeValue() {
            return nodeValue;
        }

        public void setNodeValue(String nodeValue) {
            this.nodeValue = nodeValue;
        }

        public MyNode getNextNode() {
            return nextNode;
        }

        public void setNextNode(MyNode nextNode) {
            this.nextNode = nextNode;
        }
    }

    /**
     * 链表转向
     * @param node
     * @return
     */
    public static MyNode cacl(MyNode node){
        if(node == null || node.nextNode == null){
            return node;
        }

        MyNode newNode = cacl(node.nextNode);
        node.getNextNode().setNextNode(node);
        node.setNextNode(null);
        return newNode;
    }

    public static void main(String[] args){
        MyNode a = new MyNode();
        a.setNodeValue("a");

        MyNode d = new  MyNode();
        d.setNodeValue("d");

        MyNode c = new  MyNode();
        c.setNodeValue("c");
        c.setNextNode(d);

        MyNode b = new  MyNode();
        b.setNodeValue("b");
        b.setNextNode(c);

        a.setNextNode(b);

        for(MyNode node = a; ; node = node.getNextNode()){
            System.out.print(node.getNodeValue()+"-");
            if(node.getNextNode() == null) break;
        }
        System.out.print("-----------------------");

        MyNode newNode = cacl(a);

        for(MyNode node = newNode; ; node = node.getNextNode()){
            System.out.print(node.getNodeValue()+"-");
            if(node.getNextNode() == null) break;
        }
    }

}
