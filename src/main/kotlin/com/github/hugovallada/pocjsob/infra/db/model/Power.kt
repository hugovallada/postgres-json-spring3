package com.github.hugovallada.pocjsob.infra.db.model


@NoArg
class Power(
    val name: String,
    val level: Int,
    val element: String
)

annotation class NoArg