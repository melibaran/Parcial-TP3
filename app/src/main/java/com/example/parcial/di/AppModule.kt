package com.example.parcial.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import android.content.Context
import androidx.room.Room
import com.example.parcial.infrastructure.AppDatabase
import com.example.parcial.data.dao.MensajeDao
import dagger.hilt.android.qualifiers.ApplicationContext // Necesario para obtener el Context


@Module
@InstallIn(SingletonComponent::class)
    class AppModule {

        //va a tener sus providers:
        //1. PROVEE LA BASE DE DATOS
        @Provides
        @Singleton
        fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "afile-db-name" // Nombre de tu base de datos
            ).build()
        }

    // 2. PROVEE EL DAO
    @Provides
    fun provideMensajeDao(database: AppDatabase): MensajeDao {
        return database.mensajeDao()
    }


}

