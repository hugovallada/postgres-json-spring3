package com.github.hugovallada.pocjsob.infra.service

import com.github.hugovallada.pocjsob.infra.db.model.Pokemon
import com.github.hugovallada.pocjsob.infra.db.repository.PokemonRepository
import org.springframework.stereotype.Service

@Service
class CadastrarPokemon(private val repository: PokemonRepository) {
    fun execute(pokemon: Pokemon) {
        repository.save(pokemon)
    }
}