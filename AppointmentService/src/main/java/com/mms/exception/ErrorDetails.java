package com.mms.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	private LocalDateTime timeStampTime;
	private int status;
	private String error;
	private String message;
	private String path;
	public ErrorDetails(LocalDateTime timeStampTime, int status, String error, String message, String path) {
		super();
		this.timeStampTime = timeStampTime;
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
	}
	public LocalDateTime getTimeStampTime() {
		return timeStampTime;
	}
	public void setTimeStampTime(LocalDateTime timeStampTime) {
		this.timeStampTime = timeStampTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	@Override
	public String toString() {
		return "ErrorDetails [timeStampTime=" + timeStampTime + ", status=" + status + ", error=" + error + ", message="
				+ message + ", path=" + path + "]";
	}

}
