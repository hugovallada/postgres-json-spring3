package com.github.hugovallada.pocjsob.infra.db.repository

import com.github.hugovallada.pocjsob.infra.db.model.Pokemon
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PokemonRepository : JpaRepository<Pokemon, Long>