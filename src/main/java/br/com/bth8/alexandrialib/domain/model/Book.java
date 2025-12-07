package br.com.bth8.alexandrialib.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;


import org.hibernate.annotations.CreationTimestamp;

import br.com.bth8.alexandrialib.domain.enums.Category;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Book {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name =  "name", unique = true)
	private String name;
	
	@Column(name = "release_date")
	private LocalDate releaseDate;
	
	@Column(name = "pages_numbers")
	private Integer pagesNumbers;
	
	@ManyToOne
	@JoinColumn(name = "autor")
	private Author author;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "book_cover")
	private String coverUrl;
	
	@Column(name = "book_pdf_url")
	private String pdfUrl;
	
	@Enumerated(EnumType.STRING)//Isso garantirá que a API grave a categoria como texto no banco (mais legível).
	@Column(name = "category")
	private Category category;
	
	@CreationTimestamp
	@Column(name = "date_added")
	private LocalDateTime dateAdded;
}
