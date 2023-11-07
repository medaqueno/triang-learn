package com.triangulant.demo;

public record ApiResponseOk<T>(String status, String message, T data) {
}