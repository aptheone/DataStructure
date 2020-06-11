package com.aptheone.map;

public class TestMap {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(5);
        hashTable.put(6,"Robert");
        hashTable.put(8,"AP");
        hashTable.put(11,"Jyoti");
        hashTable.put(8,"Archisha");
        hashTable.put(9,"Kumari");
        System.out.println(hashTable.get(8));
        hashTable.remove(9);
        hashTable.remove(20);
    }


}
