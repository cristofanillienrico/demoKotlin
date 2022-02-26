package com.example.demokotlin.controller

import com.example.demokotlin.dto.DipendenteDTO
import com.example.demokotlin.service.DipendenteService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/dipendente")
class DipendenteController(
    val dipendenteService: DipendenteService,
) {

    @GetMapping("")
    fun findAll(): List<DipendenteDTO> {
        return dipendenteService.findAll().map { it.toDTO() }
    }
}
