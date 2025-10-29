package com.example.parcial.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.parcial.core.MESSAGE_NAME
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = MESSAGE_NAME)
data class Message(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "created_at") val fecha_hora: String?
)