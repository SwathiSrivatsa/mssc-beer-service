package com.swa.microservices.msscbeerservice.bootstrap;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.swa.microservices.msscbeerservice.domain.Beer;
import com.swa.microservices.msscbeerservice.repository.BeerRepository;

@Component
public class BeerLoader implements CommandLineRunner{

	private final BeerRepository beerRepository;
	
	public BeerLoader(BeerRepository beerRepository) {
		this.beerRepository = beerRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		loadBeerObjects();
		
	}

	private void loadBeerObjects() {
		
		if(beerRepository.count()==0) {
			
			beerRepository.save(Beer.builder()
					.beerName("Mango Bobs")
					.beerStyle("IPA")
					.quantityToBrew(200)
					.minOnHand(12)
					.upc(33701524655L)
					.price(new BigDecimal("12.95"))
					.build());
			
			beerRepository.save(Beer.builder()
					.beerName("Galaxy Cats")
					.beerStyle("PALE_ALE")
					.quantityToBrew(200)
					.minOnHand(12)
					.upc(337015255L)
					.price(new BigDecimal("12.95"))
					.build());
		}
		
		System.out.println("Loaded Beers:"+beerRepository.count());
	}

}
