package com.tenco.blog_v3.common;

import com.tenco.blog_v3.common.errors.*;
import com.tenco.blog_v3.common.utils.ApiUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// 데이터 반환
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 400 Bad Request 예외 처리
     * @return json
     */
    @ExceptionHandler(Exception400.class)
    public ResponseEntity<?> handleException400(Exception400 e) {
        ApiUtil<?> apiUtil = new ApiUtil<>(400, e.getMessage());
        // return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiUtil);
        return new ResponseEntity<>(apiUtil, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception401.class)
    public ResponseEntity<?> handleException401(Exception401 e) {
        ApiUtil<?> apiUtil = new ApiUtil<>(401, e.getMessage());
        // return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(apiUtil);
        return new ResponseEntity<>(apiUtil, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(Exception403.class)
    public ResponseEntity<?> handleException403(Exception403 e) {
        ApiUtil<?> apiUtil = new ApiUtil<>(403, e.getMessage());
        // return ResponseEntity.status(HttpStatus.FORBIDDEN).body(apiUtil);
        return new ResponseEntity<>(apiUtil, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(Exception404.class)
    public ResponseEntity<?> handleException404(Exception404 e) {
        ApiUtil<?> apiUtil = new ApiUtil<>(404, e.getMessage());
        // return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiUtil);
        return new ResponseEntity<>(apiUtil, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception500.class)
    public ResponseEntity<?> handleException500(Exception500 e) {
        ApiUtil<?> apiUtil = new ApiUtil<>(500, e.getMessage());
        // return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(apiUtil);
        return new ResponseEntity<>(apiUtil, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
