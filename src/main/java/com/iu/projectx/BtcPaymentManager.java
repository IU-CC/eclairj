package com.iu.projectx;

import com.iu.lightning.eclair.domain.InvoiceDetails;

import static com.iu.Config.LN_NODE_1;

public class BtcPaymentManager
{
    public static void prepareAndSendBTCPaymentFor(String invoice)
    {
        InvoiceDetails invoiceDetails = LN_NODE_1.checkinvoice(invoice).getResult();
        System.out.println("Invoice Details: " + invoiceDetails);

        String description = invoiceDetails.getTags()[1].getValue();
        System.out.println("Description: " + description);

        String[] values = description.split("]");

        String btcAddress = description.substring(values[0].indexOf("["));
        String btcAmount = description.substring(values[1].indexOf("["));

        System.out.println("Sending BTC Payment of: " + btcAmount + " to " + btcAddress);
    }
}
