package com.aula44.biblioteca.repository;

import com.aula44.biblioteca.model.LivrosModel;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository<LivrosModel, Long> {
}
