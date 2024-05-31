package com.hr;
/*
 * This is a more HR-oriented, higher-level exception type
 * than this other lower-level transportation-oriented Des
 */

public class WorkException extends Exception{

    public WorkException() {
    }

    public WorkException(String message) {
        super(message);
    }

    public WorkException(String message, Throwable cause) {
        super(message, cause);
    }

    public WorkException(Throwable cause) {
        super(cause);
    }

}
