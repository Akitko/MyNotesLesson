package ru.ak1t0.mynotes.database

import androidx.lifecycle.LiveData
import ru.ak1t0.mynotes.model.Note

interface DatabaseRepository {
    val readAll: LiveData<List<Note>>

    suspend fun  create(note: Note, onSuccess: () -> Unit)
    suspend fun  update(note: Note, onSuccess: () -> Unit)
    suspend fun  delete(note: Note, onSuccess: () -> Unit)

}