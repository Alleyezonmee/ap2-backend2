package com.soulinc.ap2backend.model;

public class BaseResponse {
    private int code;
    private Object data;
    private BaseErrorResponse error;

    public BaseResponse(int code, Object data, BaseErrorResponse error) {
        this.code = code;
        this.data = data;
        this.error = error;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BaseErrorResponse getError() {
        return error;
    }

    public void setError(BaseErrorResponse error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "code='" + code + '\'' +
                ", data=" + data +
                ", error=" + error +
                '}';
    }
}
