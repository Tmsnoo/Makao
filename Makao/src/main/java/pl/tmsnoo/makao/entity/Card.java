package pl.tmsnoo.makao.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Card {
	
	private enum Suit {
		DIAMONDS,
		CLUBS ,
		HEARTS ,
		SPADES ;
	}

	@Id
	@GeneratedValue
	private Long id;	
	
	@Enumerated(EnumType.STRING)
	@Column(length = 8)
	private Suit suit ;
	
	@NotNull
	private String figure;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public String getFigure() {
		return figure;
	}

	public void setFigure(String figure) {
		this.figure = figure;
	}
	
}
