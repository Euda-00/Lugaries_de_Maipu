
package com.example.lugariesdemaipu

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class DetailViewModel(private val lugarRepository: LugarRepository) : ViewModel() {

    private val _uiState = MutableStateFlow(DetailState())
    val uiState: StateFlow<DetailState> = _uiState.asStateFlow()

    fun getLugar(id: Int) {
        viewModelScope.launch {
            val lugar = lugarRepository.getLugares().find { it.id == id }
            _uiState.value = DetailState(lugar = lugar)
        }
    }
}
