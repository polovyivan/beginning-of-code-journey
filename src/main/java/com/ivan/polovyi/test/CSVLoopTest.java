package com.ivan.polovyi.test;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.function.Predicate;

public class CSVLoopTest {


    public static void main(String[] args) {

        String[] linhas = {"20.210.409/0001-90;CR Transportadora;Camila e Renan ME;" +
                "4,37035E+11;1235;SP;São Paulo;01042-904;Rua Barão de Itapetininga 120;44;República;            "};


        String msgDeErro = null;

        String[] columns = linhas[0].split(";", -1);

        Arrays.stream(columns).filter(c-> StringUtils.isEmpty(c));


        for (int i = 0; i < columns.length; i++) {

            if (i != 9 && i != 11 && StringUtils.isEmpty(columns[i])) {

                switch (i) {
                    case 0:
                        msgDeErro = "CNPJ Transportadora";
                        break;
                    case 1:
                        msgDeErro = "Nome Fantasia";
                        break;
                    case 2:
                        msgDeErro = "Razão Social";
                        break;
                    case 3:
                        msgDeErro = "Inscrição Estadual";
                        break;
                    case 4:
                        msgDeErro = "Inscrição Municipio";
                        break;
                    case 5:
                        msgDeErro = "Sigla Estado";
                        break;
                    case 6:
                        msgDeErro = "Nome Município";
                        break;
                    case 7:
                        msgDeErro = "CEP";
                        break;
                    case 8:
                        msgDeErro = "Logradouro";
                        break;
                    case 10:
                        msgDeErro = "Bairro";
                        break;

                }

                throw new IllegalStateException(msgDeErro);
            }


        }


    }
}
