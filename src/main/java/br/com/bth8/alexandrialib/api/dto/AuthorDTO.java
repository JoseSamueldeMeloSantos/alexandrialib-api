package br.com.bth8.alexandrialib.api.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.bth8.alexandrialib.domain.model.Book;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class AuthorDTO {

	@EqualsAndHashCode.Include
	private Long id;
	
	private String name;
	
	@JsonFormat(timezone = "dd/mm/yyyy")
	@JsonProperty("birth_date")
	private LocalDate birthDate;
	
	private String nationality;
	
	@JsonIgnore
	private List<Book> books;
}
