package com.example.demokotlin.dto

import com.example.demokotlin.model.Dipendente

data class DipendenteDTO(
    var nomeCompleto: String,
) {
    companion object {
        fun Dipendente.toDTO() = DipendenteDTO(
            nomeCompleto = "$nome $cognome"
        )

        fun DipendenteDTO.toEntity(): Dipendente {
           var list  = this.nomeCompleto.split(' ')
            return Dipendente(list[0],list[1])
        }
    }
}


