package com.example.parcial.ui.presentation.screen

import androidx.lifecycle.ViewModel
import com.example.parcial.data.dao.MensajeDao
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(private val repo: MensajeDao): ViewModel(){
    //YA PUEDO USAR EL OBJETO DAO QUE INYECTE

//EJEMPLO:
/*    private val_insertBookState = MutableStateFlow<Insert BookResponse>(value = Response. Idle)
    val insert BookState: StateFlow<Insert BookResponse> = _insertBookState.asStateFlow()

    private val_updateBookState = MutableStateFlow<UpdateBookResponse>(value = Response. Idle)
    val updateBookState: StateFlow<UpdateBookResponse> = _updateBookState.asStateFlow()

    private val_deleteBookState = MutableStateFlow<DeleteBookResponse>(value = Response. Idle)
    val deleteBookState: StateFlowsDeleteBookResponse> = deleteBookState.asStateFlow()*/

}