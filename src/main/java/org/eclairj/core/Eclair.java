package org.eclairj.core;

import feign.*;
import feign.auth.BasicAuthRequestInterceptor;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

public interface Eclair {
    Eclair api = Feign.builder()
            .decoder(new JacksonDecoder())
            .encoder(new JacksonEncoder())
            .requestInterceptor(new BasicAuthRequestInterceptor("", "qazwsxedc"))
            .target(Eclair.class, "http://54.202.231.72:8080");

    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    NodeInfo getInfo(RequestBody requestBody);
}
