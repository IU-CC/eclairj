package org.eclairj.core;

class Result <R> {
    private R result;
    private String id;
    private Error error;

    public Result() {}
    public Result(String id, R result) {
        this.id = id;
        this.result = result;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public R getResult() {
        return result;
    }

    public void setResult(R result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "result=" + result +
                ", id='" + id + '\'' +
                ", error=" + error +
                '}';
    }
}
