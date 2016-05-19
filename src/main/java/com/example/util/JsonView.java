package com.example.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ptmind on 2016/5/20.
 */
public class JsonView {
    private static final Logger logger = LoggerFactory.getLogger(JsonView.class);

    private String status;

    private Object content;

    private String errorCode;

    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void success(Object object) {
        this.content = object;
        this.status = Constant.STATUS_SUCCESS;
    }

    public void error(String errorMsg, Exception e) {
        this.status = Constant.STATUS_ERROR;
        this.message = errorMsg;
        logger.error(errorMsg + " | " + e.getMessage());
        e.printStackTrace();
    }
}
