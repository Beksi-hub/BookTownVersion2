
package com.example.Beksi_Book.services;

import com.example.Beksi_Book.entities.ShopItems;

import java.util.List;

public interface ItemService {

    ShopItems addItem(ShopItems item);
    List<ShopItems> getAllItems();
    ShopItems getItem(Long id);
    void deleteItem(ShopItems item);
    ShopItems saveItem(ShopItems item);

}

