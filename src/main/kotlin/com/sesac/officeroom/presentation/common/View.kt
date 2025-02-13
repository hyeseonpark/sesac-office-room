package com.sesac.officeroom.presentation.common

import com.sesac.officeroom.data.dto.ReservationDTO
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.TextStyle
import java.util.*

object View {

    /**
     * pretty print console
     *
     * @param message
     */
    fun prettyPrintConsole(message: String) {
        val width = 80 // 너비 설정

        val lines = message.lines()

        // 상단 테두리 출력
        print("┌")
        for (i in 0 until width) {
            print("─")
        }
        println("┐")

        // 각 줄을 가운데 정렬하여 출력
        for (line in lines) {
            if (line.length > width) {

                // 줄의 길이가 설정한 너비보다 길면 그대로 출력 (혹은 필요에 따라 자를 수 있음)
                println(line.substring(0, width))
            } else {
                // 줄의 길이가 너비보다 작으면 가운데 정렬

                // 각 줄의 앞뒤로 들어갈 공백 계산
                val paddingSize = (width - line.length) / 2

                // 앞쪽 공백 추가
                var paddedLine = " ".repeat(paddingSize.coerceAtLeast(0)) + line

                // 뒤쪽 공백 추가
                paddedLine += " ".repeat(width - paddedLine.length)

                // 가운데 정렬된 줄을 출력
                print(String.format("%-${width}s%n", paddedLine))
            }
        }

        // 하단 테두리 출력
        print("└")
        for (i in 0 until width) {
            print("─")
        }
        println("┘")
    }

    /**
     * 예약 데이터를 시간표 형태로 변환
     */
    fun createSchedule(reservations: List<ReservationDTO>) {

        // 날짜별 시간표를 저장할 맵 (날짜 -> 시간대별 상태)
        val scheduleMap = mutableMapOf<LocalDate, MutableMap<Int, String>>()

        // 시간대 초기화 (9시 ~ 18시)
        val hours = (9..18).associateWith { "□" }  // 예약 없음을 "□"로 표시

        // 각 예약 데이터를 시간표에 반영
        reservations.forEach { reservation ->
            val date = reservation.date
            val startHour = reservation.reservationTime.hour
            val endHour = startHour + reservation.usageTime - 1

            // 해당 날짜의 시간대를 복사하여 가져오기 (없으면 새로 생성)
            val dailySchedule = scheduleMap.getOrPut(date) { hours.toMutableMap() }

            // 예약 시간대에 "▣"로 표시
            for (hour in startHour..endHour) {
                dailySchedule[hour] = "▣"
            }
        }

        // 시간표 출력
        println("┌───────────────────────────────────────────┐")
        println("   날짜 \\ 시간  " + (9..18).joinToString(" ") { it.toString().padStart(2) })

        scheduleMap.iterator().forEach { (date, dailySchedule) ->
            val row = (9..18).joinToString("  ") { hour -> dailySchedule[hour] ?: "□" }
            println("  $date   $row")
        }
        println("└───────────────────────────────────────────┘")
    }

    /**
     * showDates()함수: 현재 날짜를 포함하여 7일을 보여주는 함수
     * writer: 전지환
     * modifier: 정지영 (dates를 반환)
     */
    fun showDates(): MutableList<LocalDate> {

        //today 는 24-10-30 형식
        val today = LocalDate.now()
        val dates = mutableListOf<LocalDate>()

        //i는 0부터 6까지
        for (i in 0 until 7){

            //오늘을 포함해야 하므로 i가 0부터 시작해야 함
            val date = today.plusDays(i.toLong())

            //요일을 가져와서 '수요일' 처럼 만듦
            val dayKor = date.dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN)

            //1. 10/30 수요일 형식으로 출력
            println("${i+1}. ${date.format(DateTimeFormatter.ofPattern("MM/dd"))} $dayKor")

            //날짜를 리스트에 추가
            dates.add(date)
        }
        return dates
    }
}