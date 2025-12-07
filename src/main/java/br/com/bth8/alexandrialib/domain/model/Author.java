package br.com.bth8.alexandrialib.domain.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
public class Author {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", unique = true, nullable = false)
	private String name;
	
	@Column(name = "birth_date")
	private LocalDate birthDate;
	
	private String nationality;
	
	
	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	private List<Book> books;
}
