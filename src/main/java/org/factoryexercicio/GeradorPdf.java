package org.factoryexercicio;

public class GeradorPdf extends GeradorDocumento {
    protected Documento criar() {
        return new PdfDocumento();
    }
}
