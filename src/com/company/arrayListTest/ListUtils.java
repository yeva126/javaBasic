package com.company.arrayListTest;

/**
 *  手写单项链表
 */
public class ListUtils<E> {
    private class Node{
        private E data;
        private Node next;

        public Node(E data, Node next){
            this.data = data;
            this.next = next;
        }

        public Node(E data){
            new Node(data, null);
        }

        public Node(){
            new Node(null, null);
        }
    }

    private Node head;
    private int length;

    public ListUtils(){
        head = new Node();
        length = 0;
    }

    /**
     * @author： wenyihan
     * @description：获取链表长度
    */
    private int getLength(){
        return this.length;
    }

    /**
     * @author： wenyihan
     * @description：是否为空
    */
    public boolean isEmpty(){
        return length == 0;
    }

    /**
     * 添加元素
     */
    public void add(int index, E data){
        if(index < 0 || index > length){
            throw new IllegalArgumentException("输入的位置非法");
        }
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        node.next = new Node(data, node.next);
        length++;
    }

    /**
     * @author： wenyihan
     * @description：头插
    */
    public void addFirst(E data){
        this.add(0, data);
    }

    /**
     * @author： wenyihan
     * @description：尾插
    */
    public void addLast(E data){
        this.add(this.length, data);
    }

    /**
     *  移除方法
     */
    public boolean remove(int index){
        if(index < 0 || index > length){
            throw new IllegalArgumentException("输入的位置非法");
        }
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        Node noNode = node.next;
        node.next = noNode.next;
        node.next = null;
        length--;
        return true;
    }


    public boolean removeFirst(){
        return remove(0);
    }

    public boolean removeLast(){
        return remove(length);
    }

    /**
     * 获取元素
     */
    public E get(int index){
        Node node = head.next;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node.data;
    }


}
