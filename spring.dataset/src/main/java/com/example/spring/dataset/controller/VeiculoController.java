package com.example.spring.dataset.controller;

import com.example.spring.dataset.model.Veiculo;
import com.example.spring.dataset.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping
    public List<Veiculo> getAllVeiculos(){
        return veiculoService.getAllVeiculos();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> getItemById(@PathVariable(required = true) String id){
        return veiculoService.getVeiculoById(id);
    }

    @GetMapping("/placa")
    public ResponseEntity<List<Veiculo>> getByPlaca(@RequestParam String placa) {
        return veiculoService.getByPlaca(placa);
    }

    @GetMapping("/marca")
    public ResponseEntity<List<Veiculo>> getByMarca(@RequestParam String marca) {
       return veiculoService.getByMarca(marca);
    }

    @GetMapping("/modelo")
    public ResponseEntity<List<Veiculo>> getByModelo(@RequestParam String modelo) {
       return veiculoService.getByModelo(modelo);
    }

    @GetMapping("/ano")
    public ResponseEntity<List<Veiculo>> getByAno(@RequestParam String ano) {
       return veiculoService.getByAno(ano);
    }

    @GetMapping("/cor")
    public ResponseEntity<List<Veiculo>> getByCor(@RequestParam String cor) {
       return veiculoService.getByCor(cor);
    }

    @GetMapping("/km-rodados")
    public ResponseEntity<List<Veiculo>> getByKmRodados(@RequestParam Integer kmRodados) {
        return veiculoService.getByKmRodados(kmRodados);
    }

    @GetMapping("/km-rodados-between")
    public ResponseEntity<List<Veiculo>> getByKmRodados(@RequestParam Integer min,@RequestParam Integer max ) {
        return veiculoService.getByKmRodadosBetween(min, max);
    }

    @GetMapping("/preco")
    public ResponseEntity<List<Veiculo>> getByPreco(@RequestParam Double preco) {
        return veiculoService.getByPreco(preco);
    }

    @GetMapping("/preco-between")
    public ResponseEntity<List<Veiculo>> getByPrecoBetween(@RequestParam Double min, @RequestParam Double max) {
        return veiculoService.getByPrecoBetween(min, max);
    }

    @GetMapping("/tipo")
    public ResponseEntity<List<Veiculo>> getByTipo(@RequestParam String tipo) {
        return veiculoService.getByTipo(tipo);
    }

    @GetMapping("/automatico")
    public ResponseEntity<List<Veiculo>> getByAutomatico(@RequestParam Boolean automatico) {
        return veiculoService.getByAutomatico(automatico);
    }
}