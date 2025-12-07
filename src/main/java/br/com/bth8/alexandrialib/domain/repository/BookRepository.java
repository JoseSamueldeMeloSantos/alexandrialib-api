package br.com.bth8.alexandrialib.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bth8.alexandrialib.domain.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
