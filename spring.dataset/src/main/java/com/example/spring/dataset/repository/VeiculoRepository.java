package com.example.spring.dataset.repository;


import com.example.spring.dataset.model.Veiculo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VeiculoRepository extends MongoRepository<Veiculo, String> {

    List<Veiculo> findByPlaca(String placa);
    List<Veiculo> findByMarca(String marca);
    List<Veiculo> findByModelo(String modelo);
    List<Veiculo> findByAno(String ano);
    List<Veiculo> findByCor(String cor);
    List<Veiculo> findByKmRodados(Integer kmRodados);
    List<Veiculo> findByKmRodadosBetween(Integer min, Integer max);
    List<Veiculo> findByPreco(Double preco);
    List<Veiculo> findByPrecoBetween(Double precoIni, Double precoFim);
    List<Veiculo> findByTipo(String tipo);
    List<Veiculo> findByAutomatico(Boolean automatico);


}
