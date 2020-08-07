package sealedclasses;

import sealedclasses.repository.InvoiceEntity;
import sealedclasses.repository.InvoiceRepository;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InvoiceService {

    private InvoiceRepository invoiceRepository = new InvoiceRepository();

    public void createInvoice(String id, LocalDate invoiceDate, String currencyCode, BigDecimal amount) {
        invoiceRepository.save(new InvoiceEntity(id, invoiceDate, currencyCode, amount));
        // Do some other stuff like publish messages that a new invoice was created...
    }
}
