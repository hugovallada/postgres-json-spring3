package com.github.hugovallada.pocjsob.infra.controller

import com.github.hugovallada.pocjsob.infra.db.model.Pokemon
import com.github.hugovallada.pocjsob.infra.db.model.Power
import com.github.hugovallada.pocjsob.infra.service.CadastrarPokemon
import com.github.hugovallada.pocjsob.infra.service.GetPokemon
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pokemon")
class PokemonController(private val cadastrarPokemon: CadastrarPokemon, private val getPokemon: GetPokemon) {

    @PostMapping
    fun salvar() {
        val p = Pokemon(
            name = "Charizard",
            type = "Fire",
            powers = listOf(
                Power("flame breath", level = 1, element = "fire"),
                Power("flame punch", level = 2, element = "fire")
            )
        )
        cadastrarPokemon.execute(p)
    }

    @GetMapping
    fun listar(){
        getPokemon.execute()
    }
}