package com.story.citizen.dto.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.json.simple.JSONObject;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Response {
    String resultCode;
    ResultData resultData;

    /**
     * 생성자
     *
     * @param responseCode
     */
    private Response(final ResponseCode responseCode) {
        this.resultCode = responseCode.getResultCode();
        this.resultData = responseCode.getResultData();
    }

    /**
     * 인스턴스 생성
     *
     * @param responseCode
     * @return
     */
    public static Response of(final ResponseCode responseCode) {
        return new Response(responseCode);
    }

    /**
     * json 응답 반환
     * @return
     */
    public String getResponseResult() {
        JSONObject jsonResultCode = new JSONObject();
        JSONObject jsonResultData = new JSONObject();

        jsonResultData.put("message", this.resultData.getMessage());

        jsonResultCode.put("resultCode", this.resultCode);
        jsonResultCode.put("resultData", jsonResultData);

        return jsonResultCode.toString();
    }
}
