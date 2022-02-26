package com.example.demokotlin.repository

import com.example.demokotlin.model.Dipendente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface DipendenteRepository : JpaRepository<Dipendente, Int> {




}
