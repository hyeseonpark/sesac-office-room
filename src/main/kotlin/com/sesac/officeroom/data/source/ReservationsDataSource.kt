package com.sesac.officeroom.data.source

import com.sesac.officeroom.data.dto.ReservationDTO
import java.io.File

interface ReservationsDataSource {
    suspend fun readReservationsTxt(): File
    suspend fun saveReservationsTxt(reservationDTO: ReservationDTO): Boolean
}