package com.story.citizen.util.code;

import lombok.Getter;

@Getter
public enum FileStatusCode {
    SUCCESS("S", "정상적으로 처리되었습니다."),
    FILE_UPLOAD_FAIL("F", "파일 업로드 중 실패했습니다."),
    FILE_TABLE_SAVING_FAIL("F", "파일 테이블 저장 중 실패했습니다."),
    FILE_DELETE_FAIL("F", "파일 삭제에 실패했습니다."),
    FILE_TABLE_DELETE_FAIL("F", "파일 테이블 삭제에 실패했습니다.");
    //fail 추가 예정

    private final String resultCode;
    private final String message;

    FileStatusCode(final String resultCode, final String message) {
        this.resultCode = resultCode;
        this.message = message;
    }
}
