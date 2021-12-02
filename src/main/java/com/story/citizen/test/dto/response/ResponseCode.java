package com.story.citizen.test.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ResponseCode {
    RP000("000000", "정상적으로 처리되었습니다."),
    RP999("999999", "처리에 실패하였습니다");

    private final String resultCode;
    private ResultData resultData;

    ResponseCode(final String resultCode, final String resultMessage) {
        resultData = new ResultData();

        this.resultCode = resultCode;
        this.resultData.message = resultMessage;
    }

    public ResultData getResultData() {
        return this.resultData;
    }

    public String getResultCode() {
        return this.resultCode;
    }
}
