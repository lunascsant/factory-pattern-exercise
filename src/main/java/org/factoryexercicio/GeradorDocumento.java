package org.factoryexercicio;

public abstract class GeradorDocumento {
    public String processar() {
        return criar().conteudo();
    }
    protected abstract Documento criar();
}
