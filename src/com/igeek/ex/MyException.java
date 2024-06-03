package com.igeek.ex;

public class MyException extends Exception {
    private String message;
    private String code;
    public MyException() {
    }

    public MyException(String message) {
        this.message = message;
    }


}
