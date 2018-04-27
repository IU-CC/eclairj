package com.iu.projectx;

import com.iu.lightning.eclair.domain.Response;

import static com.iu.Config.LN_NODE_1;

public class InvoiceGenerator
{
    public static String getInvoice(long amount, String btcWallet)
    {
        String description = "BTC[" + btcWallet + "]-AMOUNT[" + amount + "]";
        long serviceFee = 200;

        Response<String> response = LN_NODE_1.receive(amount + serviceFee, description);
        System.out.println("Created Invoice: " + response.getResult());

        try
        {
            Thread.sleep(2000);
        } catch (Exception e)
        {
        }

        return response.getResult();
    }
}
