package com.example.parcial.domain.repository

import com.example.parcial.domain.model.Message

//MANEJA LAS CLASES QUE INTERACTUAN CON LOS DATOS
interface MensajeRepository {
     fun getMensajes(): List<Message>
     fun getMensajeById(id: Int): List<Message>
}