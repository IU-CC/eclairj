package org.eclairj.core;

import feign.*;
import feign.auth.BasicAuthRequestInterceptor;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;

import java.util.List;

public interface Eclair {
    String BODY_PREFIX = "{\"jsonrpc\": \"2.0\", \"method\": \"";
    String PARAM_BODY_PREFIX = "%7B\"jsonrpc\": \"2.0\", \"method\": \"";
    String ARGS_PREFIX = "\", \"params\": [";
    String ARGS_SUFFIX = "]}";
    String PARAM_ARGS_SUFFIX = "]}";

    Eclair api = Feign.builder()
            .decoder(new JacksonDecoder())
            .encoder(new JacksonEncoder())
            .requestInterceptor(new BasicAuthRequestInterceptor("", "qazwsxedc"))
            .target(Eclair.class, "http://54.202.231.72:8080");

    /**
     * Returns basic node information (id, chain hash, current block height)
     *
     * @return basic node information (id, chain hash, current block height)
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(BODY_PREFIX + "getinfo" + ARGS_PREFIX + ARGS_SUFFIX)
    Response<NodeInfo> getInfo();

    /**
     * Opens a secure connection to a lightning node.
     *
     * @param nodeId
     * @param host
     * @param port
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "connect" + ARGS_PREFIX + "\"{nodeId}\", \"{host}\", \"{port}\"" + PARAM_ARGS_SUFFIX)
    void connect(@Param("nodeId") String nodeId, @Param("host") String host, @Param("port") int port);

    /**
     * Opens a secure connection to a lightning node.
     *
     * @param uri
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "connect" + ARGS_PREFIX + "\"{uri}\"" + PARAM_ARGS_SUFFIX)
    void connect(@Param("uri") String uri);

    /**
     * Opens a channel with another lightning node, by default push = 0 and channel is announced.
     *
     * @param nodeId
     * @param fundingSatoshis
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "open" + ARGS_PREFIX + "\"{nodeId}\", \"{fundingSatoshis}\"" + PARAM_ARGS_SUFFIX)
    void open(@Param("nodeId") String nodeId, @Param("fundingSatoshis") int fundingSatoshis);

    /**
     * Opens a channel with another lightning node, by default channel is announced.
     *
     * @param nodeId
     * @param fundingSatoshis
     * @param pushMsat
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "open" + ARGS_PREFIX + "\"{nodeId}\", \"{fundingSatoshis}\", \"{pushMsat}\"" + PARAM_ARGS_SUFFIX)
    void open(@Param("nodeId") String nodeId, @Param("fundingSatoshis") int fundingSatoshis, @Param("pushMsat") int pushMsat);

    /**
     * Opens a channel with another lightning node, by default push = 0.
     *
     * @param nodeId
     * @param fundingSatoshis
     * @param channelFlags
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "open" + ARGS_PREFIX + "\"{nodeId}\", \"{fundingSatoshis}\", \"{channelFlags}\"" + PARAM_ARGS_SUFFIX)
    void open(@Param("nodeId") String nodeId, @Param("fundingSatoshis") int fundingSatoshis, @Param("channelFlags") String channelFlags);

    /**
     * Lists the existing local peers.
     *
     * @return a list of existing local peers
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(BODY_PREFIX + "peers" + ARGS_PREFIX + ARGS_SUFFIX)
    Response<List<Peer>> peers();

    /**
     * Lists the existing local channels.
     *
     * @return a list of existing local channels
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(BODY_PREFIX + "channels" + ARGS_PREFIX + ARGS_SUFFIX)
    Response<List<Channel>> channels();

    /**
     * Lists the existing local channels opened with a particular nodeId.
     *
     * @param nodeId
     * @return
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "channels" + ARGS_PREFIX + "\"{nodeId}\"" + PARAM_ARGS_SUFFIX)
    Response<List<Channel>> channels(@Param("nodeId") String nodeId);

    /**
     * Returns the content of a lightning payment request.
     *
     * @param paymentRequest
     * @return the content of a lightning payment request
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "checkinvoice" + ARGS_PREFIX + "\"{paymentRequest}\"" + PARAM_ARGS_SUFFIX)
    Response<?> checkinvoice(@Param("paymentRequest") String paymentRequest);

    /**
     * Generates a payment request without a required amount (can be useful for donations).
     *
     * @param description
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "receive" + ARGS_PREFIX + "\"{description}\"" + PARAM_ARGS_SUFFIX)
    void receive(@Param("description") String description);

    /**
     * Generates a payment request for a given amount.
     *
     * @param amountMsat
     * @param description
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "receive" + ARGS_PREFIX + "\"{amountMsat}\", \"{description}\"" + PARAM_ARGS_SUFFIX)
    void receive(@Param("amountMsat") int amountMsat, @Param("description") String description);

    /**
     * Returns true if the payment has been received, false otherwise.
     *
     * @param payment the payment hash or the payment request
     * @return true if the payment has been received, false otherwise
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "receive" + ARGS_PREFIX + "\"{payment}\"" + PARAM_ARGS_SUFFIX)
    Response<Boolean> checkpayment(@Param("payment") String payment);
}
