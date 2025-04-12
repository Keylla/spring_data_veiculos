package com.example.spring.dataset.service;

import com.example.spring.dataset.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.spring.dataset.model.Veiculo;
import org.springframework.http.ResponseEntity;
import java.util.List;


@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> getAllVeiculos (){
        return veiculoRepository.findAll();
    }

    public ResponseEntity<Veiculo> getVeiculoById(String id){
        return veiculoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<List<Veiculo>> getByPlaca(String placa) {
        List<Veiculo> veiculos = veiculoRepository.findByPlaca(placa);
        return ResponseEntity.ok(veiculos);
    }

    public ResponseEntity<List<Veiculo>> getByMarca(String marca) {
        List<Veiculo> veiculos = veiculoRepository.findByMarca(marca);
        return ResponseEntity.ok(veiculos);
    }

    public ResponseEntity<List<Veiculo>> getByModelo(String modelo) {
        List<Veiculo> veiculos = veiculoRepository.findByModelo(modelo);
        return ResponseEntity.ok(veiculos);
    }

    public ResponseEntity<List<Veiculo>> getByAno(String ano) {
        List<Veiculo> veiculos = veiculoRepository.findByAno(ano);
        return ResponseEntity.ok(veiculos);
    }

    public ResponseEntity<List<Veiculo>> getByCor(String cor) {
        List<Veiculo> veiculos = veiculoRepository.findByCor(cor);
        return ResponseEntity.ok(veiculos);
    }

    public ResponseEntity<List<Veiculo>> getByKmRodados(Integer kmRodados) {
        List<Veiculo> veiculos = veiculoRepository.findByKmRodados(kmRodados);
        return ResponseEntity.ok(veiculos);
    }

    public ResponseEntity<List<Veiculo>> getByKmRodadosBetween(Integer min, Integer max) {
        List<Veiculo> veiculos = veiculoRepository.findByKmRodadosBetween(min, max);
        return ResponseEntity.ok(veiculos);
    }

    public ResponseEntity<List<Veiculo>> getByPreco(Double preco) {
        List<Veiculo> veiculos = veiculoRepository.findByPreco(preco);
        return ResponseEntity.ok(veiculos);
    }

    public ResponseEntity<List<Veiculo>> getByPrecoBetween(Double min, Double max ) {
        List<Veiculo> veiculos = veiculoRepository.findByPrecoBetween(min, max);
        return ResponseEntity.ok(veiculos);
    }

    public ResponseEntity<List<Veiculo>> getByTipo(String tipo) {
        List<Veiculo> veiculos = veiculoRepository.findByTipo(tipo);
        return ResponseEntity.ok(veiculos);
    }

    public ResponseEntity<List<Veiculo>> getByAutomatico(Boolean automatico) {
        List<Veiculo> veiculos = veiculoRepository.findByAutomatico(automatico);
        return ResponseEntity.ok(veiculos);
    }
}
