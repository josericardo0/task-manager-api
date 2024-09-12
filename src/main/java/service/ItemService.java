package service;

import model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ItemRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item salvarItem(Item item) {
        return itemRepository.save(item);
    }

    public List<Item> listarItens() {
        return itemRepository.findAll();
    }

    public Optional<Item> buscarItemPorId(Long id) {
        return itemRepository.findById(id);
    }

    public void deletarItem(Long id) {
        itemRepository.deleteById(id);
    }
}
