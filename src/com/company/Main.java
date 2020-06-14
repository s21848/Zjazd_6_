package com.company;

import java.util.*;

public class Main {
     //Zad2
    public static void main(String[] args) {
        Item item_1=new Item(1, "Telefon");
        Item item_2=new Item(2, "Książka");
        Item item_3=new Item(3, "Komputer");
        Item item_4=new Item(4, "Klawiatura");
        Item item_5=new Item(5, "Myszka");

        item_1.show();
        item_2.show();
        item_3.show();
        item_4.show();
        item_5.show();


        ArrayList<Item> items=new ArrayList<>();


        items.add(item_1);
        items.add(item_2);
        items.add(item_3);
        items.add(item_4);
        items.add(item_5);

        for (int i=0; i<items.size();i++){
            items.get(i).show();

        }

        HashMap<Integer, String> hmap= new HashMap<>();

        for (Item item:items){
            hmap.put(item.getId(),item.getNazwa());
        }
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();


        System.out.println("Zawartość mapy:");
        while(iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("klucz: " + mentry.getKey() + " & wartość: " + mentry.getValue());
        }
    }

}
