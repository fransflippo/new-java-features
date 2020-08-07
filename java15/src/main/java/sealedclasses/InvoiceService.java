package sealedclasses;

public class InvoiceService {

    public Invoice getInvoice(String id) {
        return new PaperInvoice();
    }
}
