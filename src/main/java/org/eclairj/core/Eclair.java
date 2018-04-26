package org.eclairj.core;

import feign.Feign;
import feign.Headers;
import feign.RequestLine;
import feign.auth.BasicAuthRequestInterceptor;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

import java.util.List;

public interface Eclair {
    Eclair api = Feign.builder()
            .decoder(new JacksonDecoder())
            .encoder(new JacksonEncoder())
            .requestInterceptor(new BasicAuthRequestInterceptor("", "qazwsxedc"))
            .target(Eclair.class, "http://54.202.231.72:8080");

    /**
     * returns basic node information (id, chain hash, current block height).
     * params: none
     *
     * @param requestBody the request body information
     * @return basic node information (id, chain hash, current block height)
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    Result<NodeInfo> getInfo(RequestBody requestBody);

    /**
     * Opens a secure connection to a lightning node.
     * params: [uri] or [nodeId, host, port]
     *
     * @param requestBody the request body information
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    void connect(RequestBody requestBody);

    /**
     * Opens a channel with another lightning node, by default push = 0 and channel is announced.
     * params: [nodeId, fundingSatoshis, pushMsat = 0, channelFlags = 0x01]
     *
     * @param requestBody the request body information
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    void open(RequestBody requestBody);

    /**
     * Lists existing local peers.
     * params: none
     *
     * @param requestBody
     * @return a list of existing local peers
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    Result<List<?>> peers(RequestBody requestBody);

    /**
     * generate a payment request with or without a required amount. Requests without an amount
     * can be useful for donations.
     * params: [description] or [amountMsat, description]
     *
     * @param requestBody the request body information
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    void receive(RequestBody requestBody);

    /**
     * returns content of a lightning payment request.
     * params: [paymentRequest]
     *
     * @param requestBody the request body information
     * @return content of a lightning payment request
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    Result<?> checkinvoice(RequestBody requestBody);

    /**
     * returns true if the payment has been received, false otherwise.
     * params: [paymentHash] or [paymentRequest]
     *
     * @param requestBody the request body information
     * @return true if the payment has been received, false otherwise
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    Result<?> checkpayment(RequestBody requestBody);
}
