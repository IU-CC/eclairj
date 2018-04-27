package com.iu.projectx;

import static com.iu.Config.LN_NODE_1;

public class PaymentListener
{
    public static String returnInvoiceOnBeingPaid(String invoice)
    {
        while (!LN_NODE_1.checkpayment(invoice).getResult())
        {
            try
            {
                System.out.println("Not paid.  Tell the deadbeat to hurry up!");
                Thread.sleep(10000);
            }
            catch (Exception e)
            { }
        }

        return invoice;
    }
}
