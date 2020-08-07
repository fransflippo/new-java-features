package sealedclasses.repository;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class InvoiceEntity {

    private String id;

    private LocalDate invoiceDate;

    private String currencyCode;

    private BigDecimal amount;
}
