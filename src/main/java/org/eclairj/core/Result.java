package org.eclairj.core;

public class Result<T> {
    private T result;
    private String id;

    public Result() {

    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
