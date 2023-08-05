package com.github.hugovallada.pocjsob.infra.service

import com.github.hugovallada.pocjsob.infra.db.repository.PokemonRepository
import org.springframework.stereotype.Service

@Service
class GetPokemon(private val repository: PokemonRepository) {
    fun execute() {
        val pokemons = repository.findAll()
        val pokemon = pokemons[0]
        println(pokemon.powers[0].name)
    }
}