package br.com.bth8.alexandrialib.domain.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;


public enum Category {

    FANTASY("fantasy"),
    SCIENCE_FICTION("science fiction"),
    ROMANCE("romance"),
    MYSTERY("mytery"),
    THRILLER("thriller"),
    HORROR("horror"),
    HISTORICAL("historical"),
    BIOGRAPHY("biography"),
    SELF_HELP("self help"),
    PHILOSOPHY("philosophy"),
    POETRY("poetry"),
    DRAMA("drama"),
    ADVENTURE("adventure"),
    CHILDREN("children"),
    YOUNG_ADULT("young adult");

	  private String categoryText;

	  private Category(String categoryText) {
		this.categoryText = categoryText;
	}
	  
	  @JsonCreator//Escolhe como o JSON deve ser convertido para algo da classe.
	  private static Category categoryCreate(String category) {
		    if (category == null || category.isBlank()) {
		        throw new IllegalArgumentException("Category cannot be null or empty");
		    }
		    
		  try {
			  return Category.valueOf(category.toUpperCase().replace(" ", "_"));
		  } catch (Exception e) {
			  throw new IllegalArgumentException("Illegal Category Exception");
		  }
	  }
	
	  @JsonValue//Escolhe como o algo da classe  aparece no JSON retornado.
	  public String getCategoryText() {
		    return  categoryText;
	} 
}
