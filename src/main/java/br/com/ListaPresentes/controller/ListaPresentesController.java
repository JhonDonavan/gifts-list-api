package br.com.ListaPresentes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ListaPresentes.model.Gift;
import br.com.ListaPresentes.services.GiftsService;

@RestController
@RequestMapping("api")
public class ListaPresentesController {
	
	@Autowired
	
	GiftsService giftService;
	@GetMapping("/giftsList")
	public String home(){
		return "Hello world!  -- listaPresentesController";
	}
	
	@GetMapping("/myGiftslist")
	public ResponseEntity<List<Gift>> getAllGifits(){
		return ResponseEntity.status(HttpStatus.OK).body(giftService.findAllGifits());
	}
	
	@GetMapping("/giftList/{_id}")
	public ResponseEntity<Optional<Gift>> getGiftById(@PathVariable  String _Id){
		return ResponseEntity.status(HttpStatus.OK).body(giftService.findGiftById(_Id));
	}
	
	@PutMapping("/giftList")
	public ResponseEntity<Gift> updateGift(@RequestBody Gift gift){
		return ResponseEntity.status(HttpStatus.OK).body(giftService.updateGift(gift));
	} 
	
	@PostMapping("/giftList")
	public ResponseEntity<Gift> createGift(@RequestBody Gift gift){
		return ResponseEntity.status(HttpStatus.CREATED).body(giftService.saveGift(gift));
	}
	
	@DeleteMapping("/giftList/{_id}")
	public ResponseEntity<?> deleteGift(@PathVariable String _id){
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(giftService.deleteGift(_id));
	}
}
