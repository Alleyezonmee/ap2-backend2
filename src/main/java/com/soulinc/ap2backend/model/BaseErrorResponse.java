package com.soulinc.ap2backend.model;

public class BaseErrorResponse {
    private String error_code;
    private String error_message;
    private String error_detail;

    public BaseErrorResponse(String error_code, String error_message, String error_detail) {
        this.error_code = error_code;
        this.error_message = error_message;
        this.error_detail = error_detail;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public String getError_detail() {
        return error_detail;
    }

    public void setError_detail(String error_detail) {
        this.error_detail = error_detail;
    }

    @Override
    public String toString() {
        return "BaseErrorResponse{" +
                "error_code='" + error_code + '\'' +
                ", error_message='" + error_message + '\'' +
                ", error_detail='" + error_detail + '\'' +
                '}';
    }
}
