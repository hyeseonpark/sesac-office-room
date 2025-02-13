package com.sesac.officeroom.presentation.common

object Strings {
    const val ERROR_MESSAGE = "잘못된 값입니다. 다시 입력해주세요."
    const val MAIN_MESSAGE = "[1]회의실 관리 [2]매출 관리 [0]종료"
  
    const val NEW_LINE = "\n"
    const val YES = "있음"
    const val NO = "없음"
  
    const val EMPTY_OFFICE_FILE = "회의실 목록이 없어 빈 목록이 반환되었습니다."
    const val EMPTY_RESERVATIONS_FILE = "예약 목록이 없어 빈 목록이 반환되었습니다."

    // 회의실 관리
    const val STEP_1_MENU_MESSAGE = "[1]회의실 예약하기 [2]회의실 정보 확인 [3]회의실 예약 내역 조회\n[0]메인 메뉴로 돌아가기"

    const val STEP_1_1_HEADER_MESSAGE = "회의실 예약을 진행합니다."
    const val STEP_1_1_MESSAGE_1 = "이용 인원: "
    const val STEP_1_1_MESSAGE_2 = "창문이 필요하신가요? ([예]: 1, [아니오]: 2) "
    const val STEP_1_1_MESSAGE_3 = "촬영 부스가 필요하신가요? ([예]: 1, [아니오]: 2) "
    const val STEP_1_1_ROOM_INFO = "%d. [%s]: 기준 인원 %d명, 최대 인원 %d명, 기본 요금 %d원, 인당 추가 요금 %d원, 창문 %s, 포토부스 %s"
    const val STEP_1_1_NO_ROOM_FOUND = "해당하는 회의실이 없습니다."
    const val STEP_1_1_ROOM_CHOOSE = "예약을 원하는 회의실 번호를 입력해주세요."
    const val STEP_1_1_USAGE_DATE_CHOOSE = "예약을 원하는 날짜를 입력해주세요."
    const val STEP_1_1_USAGE_TIME_CHOOSE = "희망 이용 시간을 입력해주세요."
    const val STEP_1_1_AVAILABLE_TIMES_MESSAGE = "예약 가능한 시간대: %s"
    const val STEP_1_1_START_TIME_CHOOSE = "이용 시작 시간을 입력해주세요"

    const val STEP_1_2_MESSAGE = "[1]회의실 목록 조회 [2]회의실 별 예약현황 조회 [0]메뉴로 돌아가기"

    const val STEP_1_2_2_TITLE_MESSAGE = "예약현황을 확인할 회의실 번호를 입력해주세요\n"
    const val STEP_1_2_2_NO_RESERVATION_MESSAGE = "예약 내역이 존재하지 않습니다."

    const val STEP_1_3_MESSAGE = "하이픈(-)을 포함한 예약자의 휴대폰번호를 입력해주세요."
    const val STEP_1_3_NO_NUMBER_FOUND = "해당 전화번호로 예약된 내역이 없습니다."
    const val STEP_1_3_NUMBER_FOUND = "해당 전화번호로 예약된 내역"
    const val STEP_1_3_RESERVATION_INFO_FORMAT = "%d번 회의실, 예약 날짜: %s, 예약 시간: %s, 이용 시간: %d시간, 인원: %d"

    const val STEP_1_3_MENU_MESSAGE = "[1]예약취소 [0]메뉴로 돌아가기"
    const val STEP_1_3_CANCEL_RESERVATION = "예약이 성공적으로 취소되었습니다."

    // 매출 관리
    const val STEP_2_MENU_MESSAGE = "[1]총 매출 조회 [2]회의실 별 매출조회 [3]날짜별 매출조회 [4]총 이용자 수 조회\n[0]메인 메뉴로 돌아가기"
    const val STEP_2_1_MESSAGE = "현재까지의 총 매출은 %d원 입니다."
    const val STEP_2_2_MESSAGE = "%s의 매출은 %d원 입니다."
    const val STEP_2_3_MESSAGE_1 = "조회하실 날짜를 입력하세요. (예: 2024-11-01)"
    const val STEP_2_3_MESSAGE_2 = "%tY년 %tm월 %td일의 매출은 %d원 입니다."
    const val STEP_2_3_MESSAGE_3 = "%tY년 %tm월 %td일에는 예약이 없습니다."
    const val STEP_2_3_ERROR = "잘못된 날짜 형식입니다."
    const val STEP_2_4_MESSAGE = "현재까지의 총 이용자 수는 %d명 입니다."
    const val ROOMS_INDEX = "회의실 목록:\n"
    const val ROOMS_NAME = "%d. %s"
}
