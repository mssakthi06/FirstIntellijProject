package com.qa.javaconcepts;

import java.sql.SQLOutput;
import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Kungumakkaliamman");
        al.add("Kungumakkaliamman");
        al.add("Kungumakkaliamman");
        al.add("Muruga");
        al.add("Easwara");
        al.add("Easwara");
        al.add(null);
        al.add(null);
        al.add(" ");
        System.out.println("From ArrayList"+al);
        for(String str:al){
            System.out.println(str);
        }
        HashSet<String> hs=new HashSet<String>();
        hs.addAll(al);
        System.out.println("From HashSet"+hs);
        Iterator<String> itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("100","Kungumakkaliamman");
        hm.put("101","Kungumakkaliamman");
        hm.put("100","apple");
        hm.put("102","Kungumakkaliamman");
        hm.put("103","Kungumakkaliamman");
        hm.put(null,"aa");
        hm.put(null,"Easwara");
        hm.put("104","Easwara");
        hm.put("105","Easwara");
        System.out.println("From Hashmap");
        for(Map.Entry<String,String> entry:hm.entrySet()){
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
    }
}

