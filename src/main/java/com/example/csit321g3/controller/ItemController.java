package com.example.csit321g3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.csit321g3.entity.ItemEntity;
import com.example.csit321g3.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController 
@RequestMapping(path="/item/api")
// #crossorigin is needed only when you’re ready to use this backend api in #your frontend app
@CrossOrigin(origins = "http://localhost:3307")

public class ItemController {
    @Autowired
    ItemService iserv;

    public ItemController() {
    // TODO Auto-generated constructor stub
    }

    @GetMapping("/printAuthor")
    public String printAuthor() {
        return "Leah V. Barbaso";
    }

    //C - Create
    @PostMapping("/postNewItem")
    public ItemEntity postItem(@RequestBody ItemEntity Item) {
        return iserv.postItem(Item);
    }

    //R - Read
    @GetMapping("/getAllItems")
    public List<ItemEntity> getAllItems(){
        return iserv.getAllItems();
    }

    //U - Update
    @PutMapping("/putItem")
    public ItemEntity putItem(@RequestParam int id, @RequestBody 
    ItemEntity newItemDetails) {
        return iserv.putItem(id, newItemDetails);
    }

    //D - Delete
    @DeleteMapping("/deleteItem/{id}")
    public String deleteItem(@PathVariable int id) {
        return iserv.deleteItem(id);    
    }
}