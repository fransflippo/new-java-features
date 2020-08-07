package sealedclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class PaperInvoice extends Invoice {

    public InputStream getInvoiceImage() throws FileNotFoundException {
        return new FileInputStream(new File("..."));
    }
}
