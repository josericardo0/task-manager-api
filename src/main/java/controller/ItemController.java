package controller;

import model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ItemService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/itens")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public Item criarItem(@RequestBody Item item) {
        return itemService.salvarItem(item);
    }

    @GetMapping
    public List<Item> listarItens() {
        return itemService.listarItens();
    }

    @GetMapping("/{id}")
    public Optional<Item> buscarItemPorId(@PathVariable Long id) {
        return itemService.buscarItemPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarItem(@PathVariable Long id) {
        itemService.deletarItem(id);
    }
}
