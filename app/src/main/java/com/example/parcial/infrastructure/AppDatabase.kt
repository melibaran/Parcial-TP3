package com.example.parcial.infrastructure

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.parcial.data.dao.MensajeDao
import com.example.parcial.domain.model.Message

@Database(
    entities = [Message::class],
    version = 1)

abstract class AppDatabase : RoomDatabase(){
    abstract fun mensajeDao(): MensajeDao
}