package br.com.ListaPresentes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ListaPresentes.domain.Gift;
import br.com.ListaPresentes.exceptions.GiftNotfoundException;
import br.com.ListaPresentes.repositories.GiftRepository;

@Service
public class GiftsServiceImpl implements GiftsService {
	
	@Autowired
	GiftRepository giftRepository;
	
	@Override
	public Gift saveGift(Gift gift) {
		return giftRepository.save(gift);
	}

	@Override
	public List<Gift> findAllGifits() {
		return giftRepository.findAll();
	}

	@Override
	public Optional<Gift> findGiftById(String id) {
		return giftRepository.findById(id);
	}

	@Override
	public List<Gift> findGiftByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteGift(String id) {
		giftRepository.findById(id).orElseThrow(() -> new GiftNotfoundException(id));
		giftRepository.deleteById(id);
		return id;
	}
	@Override
	public Gift updateGift(Gift gift) {
		
		return null;
	}
}
