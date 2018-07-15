package com.devcognitio.pokemon.devopsdevco.webservice.impl;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devcognitio.pokemon.devopsdevco.modelo.Pokemon;

@RestController
public class PokemonRestServiceImpl {
	
	
	@RequestMapping(method = RequestMethod.GET, value="/pokemon/consultar/{id}")
	public Pokemon consultarPokemonPorId(@PathVariable("id") String id){
		Pokemon pokemon = new Pokemon();
		pokemon.setId(id);
		pokemon.setNombre("Pikachu");
		pokemon.setRegion("Pueblo paleta");	
		pokemon.setTipo("Electrico");
		
		return pokemon;
	}


}
