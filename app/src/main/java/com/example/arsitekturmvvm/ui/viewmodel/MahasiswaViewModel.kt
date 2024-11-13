package com.example.arsitekturmvvm.ui.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.arsitekturmvvm.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel: ViewModel() {
    private val _uistate = MutableStateFlow(Mahasiswa())

    val uistate: StateFlow<Mahasiswa> = _uistate.asStateFlow()

    fun saveDataMahasiswa(
        ls : MutableList<String>
    ){
        _uistate.update { data ->
            data.copy(
                nama = ls[0],
                gender = ls[1],
                alamat = ls[2],
                NIM = ls[3],
                email = ls[4],
                noHp = ls[5]
            )
        }
    }
}