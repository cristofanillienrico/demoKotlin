package com.example.demokotlin.dto

import com.example.demokotlin.model.Dipendente

data class DipendenteDTO(
    var nomeCompleto: String,
) {
    companion object{
        fun Dipendente.toDTO() = DipendenteDTO(
            nomeCompleto = "$nome $cognome"
        )
    }
}


