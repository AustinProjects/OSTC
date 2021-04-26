package Invoice;

import static java.lang.System.out;


public class Tester {
    public static void main(String[] args) {
        InvoiceItem invoice = new InvoiceItem("Banana", "Fruit for eating", 3, 3.75);
        out.println(invoice.getID());
        out.println(invoice.getDesc());
        out.println(invoice.getQty());
        out.println(invoice.setQty(31));
        out.println(invoice.getUnitPrice());
        out.println(invoice.setUnitPrice(31));
        out.println(invoice.getTotal());
        out.println(invoice.toString());


    }

}
