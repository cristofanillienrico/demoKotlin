package com.example.demokotlin

import com.example.demokotlin.model.Dipendente
import com.example.demokotlin.repository.DipendenteRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class Runner(val dipendenteRepository: DipendenteRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {
        //creo dipendenti nel db
        var dip1 = Dipendente("Carlo", "Levi");
        var dip2 = Dipendente("Tina", "Bucoli");
        var dip3 = Dipendente("Savio", "Mussi");

        var list = listOf(dip1, dip2, dip3)

        list.forEach() {
            dipendenteRepository.save(it)
        }

    }
}
