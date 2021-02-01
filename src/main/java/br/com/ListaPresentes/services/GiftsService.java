package br.com.ListaPresentes.services;

import java.util.List;
import java.util.Optional;

import br.com.ListaPresentes.model.Gift;

public interface GiftsService {
	
	Gift saveGift(Gift gift);
	
	List<Gift> findAllGifits();
	
	Optional<Gift> findGiftById(String id);
	
	List<Gift> findGiftByName(String name);
	
	String deleteGift(String _id);
	
	Gift updateGift(Gift gift);
}
