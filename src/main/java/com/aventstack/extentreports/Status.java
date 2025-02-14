package com.aventstack.extentreports;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * List of allowed status for {@link com.aventstack.extentreports.model.Log}
 */
public enum Status implements Serializable {
    RETRY_FAIL,
    RETRY_PASS,
    RETRY,
    PASS,
    FAIL,
    FATAL,
    ERROR,
    WARNING,
    INFO,
    DEBUG,
    SKIP;

    private static List<Status> statusHierarchy = Arrays.asList(
            Status.RETRY_FAIL,
            Status.RETRY_PASS,
            Status.RETRY,
            Status.FATAL,
            Status.FAIL,
            Status.ERROR,
            Status.WARNING,
            Status.SKIP,
            Status.PASS,
            Status.INFO,
            Status.DEBUG
    );
    
    /**
     * Returns the hierarchical list of status, in the below order:
     * 
     * <ul>
     *  <li>RETRY_PASS</li>
     *  <li>RETRY</li>
     * 	<li>FATAL</li>
     * 	<li>FAIL</li>
     * 	<li>ERROR</li>
     * 	<li>WARNING</li>
     * 	<li>SKIP</li>
     * 	<li>PASS</li>
     *  <li>DEBUG</li>
     * 	<li>INFO</li>
     * </ul>
     * 
     * @return Hierarchical list of status
     */
    public static List<Status> getStatusHierarchy() {
        return statusHierarchy;
    }
    
    static void setStatusHierarchy(List<Status> statusHierarchy) {
        Status.statusHierarchy = statusHierarchy;
    }
    
    static void resetStatusHierarchy() {
        List<Status> statusHierarchy = Arrays.asList(
                Status.RETRY_FAIL,
                Status.RETRY_PASS,
                Status.RETRY,
                Status.FATAL,
                Status.FAIL,
                Status.ERROR,
                Status.WARNING,
                Status.SKIP,
                Status.PASS,
                Status.INFO,
                Status.DEBUG
        );
        
        setStatusHierarchy(statusHierarchy);
    }
    
    @Override
    public String toString() {
        switch (this) {
            case RETRY_FAIL: return "fail";
            case RETRY_PASS: return "pass";
            case PASS: return "pass";
            case FAIL: return "fail";
            case FATAL: return "fatal";
            case ERROR: return "error";
            case WARNING: return "warning";
            case INFO: return "info";
            case DEBUG: return "debug";
            case SKIP: return "skip";
            case RETRY: return "retry";
            default: return "unknown";
        }
    }
}