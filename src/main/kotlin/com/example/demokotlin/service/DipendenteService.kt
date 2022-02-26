package com.example.demokotlin.service

import com.example.demokotlin.model.Dipendente
import com.example.demokotlin.repository.DipendenteRepository
import org.springframework.stereotype.Service

@Service
class DipendenteService(private val dipendenteRepository: DipendenteRepository) {

    fun findAll(): MutableList<Dipendente> {
        return dipendenteRepository.findAll()
    }

    fun save(dipendente: Dipendente): Dipendente {
        return dipendenteRepository.save(dipendente)
    }
}
