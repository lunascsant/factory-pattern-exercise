package org.factoryexercicio;

public class GeradorWord extends GeradorDocumento {
    protected Documento criar() {
        return new WordDocumento();
    }
}
