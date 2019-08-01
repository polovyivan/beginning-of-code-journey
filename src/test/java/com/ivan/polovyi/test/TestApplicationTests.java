package com.ivan.polovyi.test;

import com.sun.xml.internal.ws.util.StreamUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Test
    public void contextIf() {
        String[] linhas = {";CR Transportadora;Camila e Renan ME;4,37035E+11;1235;SP;São Paulo;01042-904;Rua Barão de Itapetininga 120;nnnn;República;1235\n"};
        String msgDeErro = null;
        String[] columns = linhas[0].split(";", -1);
        Predicate<String> empty = str -> StringUtils.isEmpty(str);
        Predicate<String> cnpj = str -> str.matches("[0-9]{2,3}\\.[0-9]{3}\\.[0-9]{3}\\/[0-9]{4}-[0-9]{2}$");
        Predicate<String> ciglaEstado = str -> str.length() != 2;
        Predicate<String> cep = str -> str.matches("[0-9]{5}-[\\d]{3}");

        Arrays.stream(columns)
                .filter(empty.and(cep).and(cep))

                .forEach(str -> System.out.printf(str));
    }


    public void testString(int i) {
        String msgDeErro = null;
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
        System.out.println(msgDeErro);

        //throw new IllegalStateException(msgDeErro);

    }

    @Test
    public void testPredicate() {
        String[] linhas = {";CR Transportadora;Camila e Renan ME;4,37035E+11;1235;SP;São Paulo;01042-904;Rua Barão de Itapetininga 120;nnnn;República;1235\n"};
        String[] columns = linhas[0].split(";", -1);
        List<Predicate<String>> allPredicates = new ArrayList<Predicate<String>>();
        allPredicates.add(StringUtils::isEmpty);
        allPredicates.add(str -> str.matches("[0-9]{2,3}\\.[0-9]{3}\\.[0-9]{3}\\/[0-9]{4}-[0-9]{2}$"));
//        allPredicates.add(str -> str.matches("[0-9]{5}-[\\d]{3}"));
//        allPredicates.add(str -> str.length() != 2);

        Arrays.stream(columns)
                .filter(allPredicates.stream().reduce(c -> true, Predicate::and))
                .collect(Collectors.toList())
                .forEach(c -> System.out.printf(c));


    }

    @Test
    public void testStreams() {

        String option = "";
        String[] linhas = {";CR Transportadora;Camila e Renan ME;4,37035E+11;1235;SP;São Paulo;01042-904;Rua Barão de Itapetininga 120;nnnn;República;\n"};

        String[] columns = linhas[0].split(";", -1);
        IntPredicate out = i -> i != 9 && i != 11;
        IntPredicate in = i -> i == 0 && i == 5;
        IntStream.range(0, columns.length)
                .filter(out)
                .mapToObj(i -> {
                    if (StringUtils.isEmpty(columns[i])) {
                        testString(i);
                    }
                    return null;
                })
                .collect(Collectors.toList());

    }


    @Test
    public void testCompareTwoArrays() {
        String errorMSG = null;
        String header = "CNPJ Transportadora*;Nome Fantasia*;Razão Social*;Inscrição Estadual*;Inscrição Municipio*;Sigla Estado*;Nome Município*;CEP*;Logradouro;Complemento*;Bairro*;Número";
        String[] linhas = {"29.210.589/7005-03;kjfhg;ghdfhgdghdf;4,37035E+11;1235;SP;São Paulo;01042-904;Rua Barão de Itapetininga 120;;;\n"};
        String[] headerColums = header.split(";", -1);
        String[] columns = linhas[0].split(";", -1);

        if (headerColums.length != columns.length) {
            System.out.printf("Numero de campos incompleto");
            //throw new IllegalStateException(msgDeErro);
        }

        for (int i = 0; i < headerColums.length; i++) {
            if (headerColums[i].contains("*") && StringUtils.isEmpty(columns[i])) {
                errorMSG = "Campo " + headerColums[i] + " esta vazio";
                }
        }
//        if (columns[0].matches("[0-9]{2,3}\\.[0-9]{3}\\.[0-9]{3}\\/[0-9]{4}-[0-9]{2}$")) {
//            errorMSG = "CNPJ Errado";
//        }
////        if (columns[0].matches("[0-9]{5}-[\\d]{3}")) {
//            errorMSG = "Campo  esta vazio";
//        }
//        if (columns[0].length() != 2) {
//            errorMSG = "Campo  esta vazio";
//        }
        System.out.printf(errorMSG);
        //throw new IllegalStateException(msgDeErro);
    }


    @Test
    public void testPasword (){
        UUID.randomUUID().toString();
        System.out.printf( UUID.randomUUID().toString());

    }

}
