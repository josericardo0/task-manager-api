package controller;

import model.Lista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ListaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/listas")
public class ListaController {

    @Autowired
    private ListaService listaService;

    @PostMapping
    public Lista criarLista(@RequestBody Lista lista) {
        return listaService.salvarLista(lista);
    }

    @GetMapping
    public List<Lista> listarListas() {
        return listaService.listarListas();
    }

    @GetMapping("/{id}")
    public Optional<Lista> buscarListaPorId(@PathVariable Long id) {
        return listaService.buscarListaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarLista(@PathVariable Long id) {
        listaService.deletarLista(id);
    }
}
