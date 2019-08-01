package com.lincros.ivan.polovyi.test;

import org.apache.commons.lang3.StringUtils;

public class SwitchStatement {


    public static void main(String[] args) {

//        String cnpj = "3914-108";
//
//
//        System.out.println(Double.valueOf("9.18E+09").longValue());
//
//
//
//        if (cnpj.matches("[0-9]{5}-[\\d]{3}")){
//            System.out.println("certo");
//        }




       StringBuilder sb = new StringBuilder();
        String result = null;
        String[] test = {"1", "2", "", "", "5"};

        for (int i = 0; i < test.length; i++) {

            if (StringUtils.isEmpty(test[i])) {

               if(i==5) i=6;

               switch (i) {

                    case 0:
                        result = "number 0";
                        break;
                    case 1:
                        result = "number 1";
                        break;
                    case 3:
                        result = "number 2";
                        break;
                    case 4:
                        result = "number 3";
                        break;
                    case 5:
                        result = "number 4";
                        break;

                }

                throw new IllegalStateException(result);
            }

        }


    }
}
