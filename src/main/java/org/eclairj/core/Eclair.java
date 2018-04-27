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
    String PARAM_ARGS_SUFFIX = "]%7D";

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
     * @param nodeId the node identifier
     * @param host   the host to which to connect
     * @param port   the port on which to connect
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "connect" + ARGS_PREFIX + "\"{nodeId}\", \"{host}\", \"{port}\"" + PARAM_ARGS_SUFFIX)
    void connect(@Param("nodeId") String nodeId, @Param("host") String host, @Param("port") int port);

    /**
     * Opens a secure connection to a lightning node.
     *
     * @param uri the uniform resource identifier to which to connect
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "connect" + ARGS_PREFIX + "\"{uri}\"" + PARAM_ARGS_SUFFIX)
    void connect(@Param("uri") String uri);

    /**
     * Opens a channel with another lightning node, by default push = 0 and channel is announced.
     *
     * @param nodeId          the node identifier
     * @param fundingSatoshis
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "open" + ARGS_PREFIX + "\"{nodeId}\", \"{fundingSatoshis}\"" + PARAM_ARGS_SUFFIX)
    void open(@Param("nodeId") String nodeId, @Param("fundingSatoshis") long fundingSatoshis);

    /**
     * Opens a channel with another lightning node, by default channel is announced.
     *
     * @param nodeId          the node identifier
     * @param fundingSatoshis
     * @param pushMsat
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "open" + ARGS_PREFIX + "\"{nodeId}\", \"{fundingSatoshis}\", \"{pushMsat}\"" + PARAM_ARGS_SUFFIX)
    void open(@Param("nodeId") String nodeId, @Param("fundingSatoshis") long fundingSatoshis, @Param("pushMsat") long pushMsat);

    /**
     * Opens a channel with another lightning node, by default push = 0.
     *
     * @param nodeId          the node identifier
     * @param fundingSatoshis
     * @param channelFlags
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "open" + ARGS_PREFIX + "\"{nodeId}\", \"{fundingSatoshis}\", \"{channelFlags}\"" + PARAM_ARGS_SUFFIX)
    void open(@Param("nodeId") String nodeId, @Param("fundingSatoshis") long fundingSatoshis, @Param("channelFlags") String channelFlags);

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
     * @param nodeId the node identifier
     * @return
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "channels" + ARGS_PREFIX + "\"{nodeId}\"" + PARAM_ARGS_SUFFIX)
    Response<List<Channel>> channels(@Param("nodeId") String nodeId);

    /**
     * Retrieve detailed information about a given channel.
     *
     * @param channelId the id of the channel
     * @return detailed information about a given channel
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "channel" + ARGS_PREFIX + "\"{channelId}\"" + PARAM_ARGS_SUFFIX)
    Response<Channel> channel(@Param("channelId") String channelId);

    /**
     * Checks if there is a valid payment route for the payment request or node id, and returns the route.
     *
     * @param destination the payment request or node id
     * @return route
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "findroute" + ARGS_PREFIX + "\"{destination}\"" + PARAM_ARGS_SUFFIX)
    Response<List<String>> findroute(@Param("destination") String destination);

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
    void receive(@Param("amountMsat") long amountMsat, @Param("description") String description);

    /**
     * Send a payment to a lightning node.
     *
     * @param amountMsat  the amount to send
     * @param paymentHash the payment hash
     * @param nodeId      the node to which to send
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "send" + ARGS_PREFIX + "\"{amountMsat}\", \"{paymentHash}\", \"{nodeId}\"" + PARAM_ARGS_SUFFIX)
    void send(@Param("amountMsat") long amountMsat, @Param("paymentHash") String paymentHash, @Param("nodeId") String nodeId);

    /**
     * Send a payment to a lightning node using a BOLT11 payment request.
     *
     * @param paymentRequest the payment request
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "send" + ARGS_PREFIX + "\"{paymentRequest}\"" + PARAM_ARGS_SUFFIX)
    void send(@Param("paymentRequest") String paymentRequest);

    /**
     * Send a payment to a lightning node using a BOLT11 payment request and a custom amount.
     *
     * @param paymentRequest the payment request
     * @param amountMsat     the amount to send
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "send" + ARGS_PREFIX + "\"{paymentRequest}\", \"{amountMsat}\"" + PARAM_ARGS_SUFFIX)
    void send(@Param("paymentRequest") String paymentRequest, @Param("amountMsat") long amountMsat);

    /**
     * Returns true if the payment has been received, false otherwise.
     *
     * @param payment the payment hash or the payment request
     * @return true if the payment has been received, false otherwise
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "checkpayment" + ARGS_PREFIX + "\"{payment}\"" + PARAM_ARGS_SUFFIX)
    Response<Boolean> checkpayment(@Param("payment") String payment);

    /**
     * Close a channel.
     *
     * @param channelId the id of the channel on which to close
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "close" + ARGS_PREFIX + "\"{channelId}\"" + PARAM_ARGS_SUFFIX)
    void close(@Param("channelId") String channelId);

    /**
     * Close a channel and send the funds to the given scriptPubKey.
     *
     * @param channelId    the id of the channel on which to close
     * @param scriptPubKey the public key script for which to send funds
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(PARAM_BODY_PREFIX + "close" + ARGS_PREFIX + "\"{channelId}\", \"{scriptPubKey}\"" + PARAM_ARGS_SUFFIX)
    void close(@Param("channelId") String channelId, @Param("scriptPubKey") String scriptPubKey);

    /**
     * display available methods
     *
     * @return a list of available methods and their dexcriptions
     */
    @RequestLine("POST /")
    @Headers("Content-Type: application/json")
    @Body(BODY_PREFIX + "help" + ARGS_PREFIX + ARGS_SUFFIX)
    Response<List<String>> help();
}
