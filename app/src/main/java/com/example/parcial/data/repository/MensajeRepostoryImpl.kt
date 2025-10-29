package com.example.parcial.data.repository

import com.example.parcial.data.dao.MensajeDao
import com.example.parcial.domain.repository.MensajeRepository

class MensajeRepostoryImpl (private val messageDao: MensajeDao): MensajeRepository {

        override  fun getMensajes() = messageDao.getAll()
        override  fun getMensajeById(id: Int) = messageDao.loadAllByIds(id)


}