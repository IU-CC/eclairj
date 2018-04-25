package org.eclairj.core;

import java.util.ArrayList;
import java.util.List;

public class RequestBody {
    private String jsonrpc = "2.0";
    private String method;
    private List<String> params = new ArrayList<String>();

    public RequestBody(String method) {
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }
}
