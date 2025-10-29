package com.example.clase5.data.repository

import com.example.clase5.data.dao.MensajeDao
import com.example.clase5.domain.repository.MensajeRepository

//es la implementacion del repositorio
class MensajeRepostoryImpl (private val messageDao: MensajeDao): MensajeRepository {

        override  fun getMensajes() = messageDao.getAll()
        override  fun getMensajeById(id: Int) = messageDao.loadAllByIds(id)


}