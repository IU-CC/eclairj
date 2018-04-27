package com.iu;

import com.iu.lightning.eclair.Eclair;

public class Config
{
    public static final String LN_NODE_1_PUB = "03c20a3921b38a78f96477d92fe244b034ee2d2657d8825ec7452daee0395ea2f9";
    public static final String LN_NODE_2_PUB = "024fc11b24f670aebc2a3c76d3a59cc01f0364e5e194fb98cbc203746d43c578df";
    public static final String LN_NODE_1_ADDRESS = LN_NODE_1_PUB + "@54.202.231.72:9735";
    public static final String LN_NODE_2_ADDRESS = LN_NODE_2_PUB + "@52.25.9.37:9735";
    public static final String LN_TEST_CHANNEL = "1e666222e57c9420e1ee975e6bfcca91ad4a65c3604de312513b56d829d744fc";

    public static final Eclair LN_NODE_1 = Eclair.api;
    //TODO: Set up a 2nd Eclair node to replace the LND node for testing.
//    public static final Eclair LN_NODE_1 = Eclair.api;
}
