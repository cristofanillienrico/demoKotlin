package com.example.demokotlin.controller

import com.example.demokotlin.dto.DipendenteDTO
import com.example.demokotlin.dto.DipendenteDTO.Companion.toDTO
import com.example.demokotlin.dto.DipendenteDTO.Companion.toEntity
import com.example.demokotlin.service.DipendenteService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/dipendente")
class DipendenteController(
    val dipendenteService: DipendenteService,
) {

    @GetMapping("")
    @ResponseBody
    fun findAll(): List<DipendenteDTO> {
        var view = dipendenteService.findAll().map { it.toDTO() }
        return view
    }

    @GetMapping("/saveGino")
    @ResponseBody
    fun saveGino() {
        var gino = DipendenteDTO("Gino Rossi");
        dipendenteService.save(gino.toEntity())
    }


}
