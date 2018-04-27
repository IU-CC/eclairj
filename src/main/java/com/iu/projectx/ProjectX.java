package com.iu.projectx;

public class ProjectX
{

    public static void main(String... args)
    {

        long requestAmount = 1234;
        String btc_destination = "BTCAW87FDT8SDTF8GWQGS78GS87DTG08JKDHFSJ";

        String invoice = InvoiceGenerator.getInvoice(requestAmount, btc_destination);

        String paidInvoice = PaymentListener.returnInvoiceOnBeingPaid(invoice);
        System.out.println("Sending invoice over to the BTC Payment Manager: " + paidInvoice);

        BtcPaymentManager.prepareAndSendBTCPaymentFor(paidInvoice);
    }
}
