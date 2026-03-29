package com.ex._8.Repositories;

import com.ex._8.Models.DepartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class DepartamentoRepository implements JpaRepository<DepartamentoModel, Long> {
}
