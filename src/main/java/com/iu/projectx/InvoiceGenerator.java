package com.iu.projectx;

import com.iu.lightning.eclair.domain.Response;

import static com.iu.Config.*;

public class InvoiceGenerator {

    public static String getInvoice(long amount, String btcWallet)
    {
        System.out.println("Getting invoice for: " + amount + " - " + btcWallet);
        String description = "BTC[" + btcWallet + "]-AMOUNT[" + amount + "]";
        long serviceFee = 200;

        Response<String> response = LN_NODE_1.receive(amount + serviceFee, description);

        System.out.println("The response from getInvoice: " + response.getResult());

        try {
            Thread.sleep(2000);
        }
        catch (Exception e)
        { }

        return response.getResult();
    }
}
