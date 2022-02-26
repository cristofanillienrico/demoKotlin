package com.example.demokotlin.model

import com.example.demokotlin.dto.DipendenteDTO
import com.sun.istack.NotNull
import javax.persistence.*

@Entity
class Dipendente(

    @Column
    @NotNull
    var nome: String,

    @Column
    @NotNull
    var cognome: String,

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null,
) {

    fun toDTO() = DipendenteDTO(
        nomeCompleto = "$nome $cognome"
    )

}
