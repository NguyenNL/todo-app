package lenguyen.com.todo.dto;

import org.springframework.http.HttpStatus;

public class ApiErrorDto {
    private HttpStatus status;
    private boolean success;
    private String reason;

    public ApiErrorDto(HttpStatus status, boolean success, String reason) {
        this.status = status;
        this.success = success;
        this.reason = reason;
    }

    public ApiErrorDto() {
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
