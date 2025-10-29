package com.example.clase5.domain.repository

import com.example.clase5.data.Mensaje
import com.example.clase5.domain.model.Message

//MANEJA LAS CLASES QUE INTERACTUAN CON LOS DATOS
interface MensajeRepository {
     fun getMensajes(): List<Message>
     fun getMensajeById(id: Int): List<Message>
}