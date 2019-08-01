package com.ivan.polovyi.test;

public enum TipoCadastroUsuario {
    INTERNO(1),

    EXTERNO(2),

    CSV(3);
    private Integer codigo;

    TipoCadastroUsuario(Integer codigo){
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
