package br.com.bth8.alexandrialib.api.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.bth8.alexandrialib.domain.enums.Category;
import br.com.bth8.alexandrialib.domain.model.Author;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class BookDTO {

	@EqualsAndHashCode.Include
	private Long id;
	
	private String name;
	
	@JsonFormat(timezone = "dd/mm/yyyy")
	@JsonProperty("release_date")
	private LocalDate releaseDate;
	
	@JsonProperty("pages_numbers")
	private Integer pagesNumbers;
	
	private Author author;
	
	private String description;
	
	@JsonProperty("cover_url")
	private String coverUrl;
	
	@JsonProperty()
	private String pdfUrl;
	
	private Category category;
	
	@JsonIgnore
	private LocalDateTime dateAdded;
}
