package com.example.Beksi_Book.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Items> items = new ArrayList<>();

    static {
        items.add(new Items(1L,"Book_1",2000));
        items.add(new Items(2L,"Book_2",1000));
        items.add(new Items(3L,"Book_3",1500));
        items.add(new Items(4L,"Book_4",2500));
    }

    private static Long id=5L;

    public static ArrayList<Items> getItems(){
        return items;
    }

    public static void addItem(Items item){
        item.setId(id);
        items.add(item);
        id++;
    }

    public static Items getItem(Long id){
        for (Items it : items){
            if (it.getId() == id) return it;
            }
        return null;
    }

}
