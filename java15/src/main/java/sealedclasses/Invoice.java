package sealedclasses;

sealed abstract class Invoice permits PaperInvoice, DigitalInvoice {
}
