package com.ex._8.Services;

import com.ex._8.Models.DepartamentoModel;
import com.ex._8.Repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {
    @Autowired
    private DepartamentoRepository departamentoRepository;

    public DepartamentoModel criarDepartamento(DepartamentoModel departamentoModel) {
        return departamentoRepository.save(departamentoModel);
    }

    public List<DepartamentoModel> findAll() {
        return departamentoRepository.findAll();
    }

    public Optional<DepartamentoModel> buscarIdDepartamento(Long id) {
        return departamentoRepository.findById(id);
    }

    public void deletarDepartamento(Long id) {
        departamentoRepository.deleteById(id);
    }
}