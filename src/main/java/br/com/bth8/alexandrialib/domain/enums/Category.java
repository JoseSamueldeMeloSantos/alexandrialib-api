package br.com.bth8.alexandrialib.domain.enums;

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
	
	  public String getCategoryText() {
		    return  categoryText;
	} 
}
