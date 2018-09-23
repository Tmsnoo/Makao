package pl.tmsnoo.makao.entity;


import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Card {
	
	private enum Suit {
		DIAMONDS,
		CLUBS ,
		HEARTS ,
		SPADES ;
	}
	
	@Enumerated
	Suit suit ;
	
	@Id
	private String id;	
}
