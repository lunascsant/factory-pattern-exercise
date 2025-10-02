package org.factoryexercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeradorDocumentoTest {

    @Test
    void geraDocumentoPdf() {
        GeradorDocumento g = new GeradorPdf();
        assertEquals("PDF", g.processar());
    }

    @Test
    void geraDocumentoWord() {
        GeradorDocumento g = new GeradorWord();
        assertEquals("WORD", g.processar());
    }

    @Test
    void verificaExtensibilidadeDocumento() {
        GeradorDocumento g = new GeradorDocumento() {
            protected Documento criar() { return () -> "CSV"; }
        };
        assertEquals("CSV", g.processar());
    }

    @Test
    void verificaInstanciasIndependentes() {
        GeradorDocumento g1 = new GeradorPdf();
        GeradorDocumento g2 = new GeradorPdf();
        assertNotSame(g1, g2);
        assertEquals("PDF", g1.processar());
        assertEquals("PDF", g2.processar());
    }
}

