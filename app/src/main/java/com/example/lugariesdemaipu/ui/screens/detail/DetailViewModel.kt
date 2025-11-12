package com.example.lugariesdemaipu.ui.screens.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lugariesdemaipu.data.DatosMaipu
import com.example.lugariesdemaipu.data.model.DetailState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class DetailViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(DetailState())
    val uiState: StateFlow<DetailState> = _uiState.asStateFlow()

    fun getLugar(id: String) {
        viewModelScope.launch {
            val lugar = DatosMaipu.listaDeLugares.find { it.id == id }
            _uiState.value = DetailState(lugar = lugar)
        }
    }
}