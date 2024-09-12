package service;

import model.Lista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ListaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ListaService {

    @Autowired
    private ListaRepository listaRepository;

    public Lista salvarLista(Lista lista) {
        return listaRepository.save(lista);
    }

    public List<Lista> listarListas() {
        return listaRepository.findAll();
    }

    public Optional<Lista> buscarListaPorId(Long id) {
        return listaRepository.findById(id);
    }

    public void deletarLista(Long id) {
        listaRepository.deleteById(id);
    }
}
