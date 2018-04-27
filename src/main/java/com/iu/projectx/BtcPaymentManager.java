package com.iu.projectx;

import com.iu.lightning.eclair.domain.InvoiceDetails;

import static com.iu.Config.LN_NODE_1;

public class BtcPaymentManager
{
    public static void prepareAndSendBTCPaymentFor(String invoice)
    {
        InvoiceDetails invoiceDetails = LN_NODE_1.checkinvoice(invoice).getResult();
        String description = invoiceDetails.getTags()[1].getValue().toString();
        String[] values = description.split("]");


        String btcAddress = values[0].substring(values[0].indexOf("[") + 1, values[0].length());
        String btcAmount = values[1].substring(values[1].indexOf("[") + 1, values[1].length());

        System.out.println("Sending BTC Payment of: " + btcAmount + " to " + btcAddress);
    }
}
