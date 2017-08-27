package com.epam.main.java.task02;

public class Result {
    private String firstStr = "";
    private String secondStr = "";
    private String thirdStr = "";
    private String fourthStr = "";
    private String fifthStr = "";

    public Result(double result) {
        String res = Double.toString(result);

        //Forming result in pseudographics
        for (char i : res.toCharArray()) {
            switch (i) {
                case '0':
                    firstStr +=  "***** ";
                    secondStr += "*   * ";
                    thirdStr +=  "*   * ";
                    fourthStr += "*   * ";
                    fifthStr +=  "***** ";
                    break;
                case '1':
                    firstStr +=  "   * ";
                    secondStr += " * * ";
                    thirdStr +=  "*  * ";
                    fourthStr += "   * ";
                    fifthStr +=  "   * ";
                    break;
                case '2':
                    firstStr +=  "***** ";
                    secondStr += "    * ";
                    thirdStr +=  "***** ";
                    fourthStr += "*     ";
                    fifthStr +=  "***** ";
                    break;
                case '3':
                    firstStr +=  "***** ";
                    secondStr += "    * ";
                    thirdStr +=  "***** ";
                    fourthStr += "    * ";
                    fifthStr +=  "***** ";
                    break;
                case '4':
                    firstStr +=  "*   * ";
                    secondStr += "*   * ";
                    thirdStr +=  "***** ";
                    fourthStr += "    * ";
                    fifthStr +=  "    * ";
                    break;
                case '5':
                    firstStr +=  "***** ";
                    secondStr += "*     ";
                    thirdStr +=  "***** ";
                    fourthStr += "    * ";
                    fifthStr +=  "***** ";
                    break;
                case '6':
                    firstStr +=  "***** ";
                    secondStr += "*     ";
                    thirdStr +=  "***** ";
                    fourthStr += "*   * ";
                    fifthStr +=  "***** ";
                    break;
                case '7':
                    firstStr +=  "***** ";
                    secondStr += "   *  ";
                    thirdStr +=  "  *   ";
                    fourthStr += " *    ";
                    fifthStr +=  "*     ";
                    break;
                case '8':
                    firstStr +=  "***** ";
                    secondStr += "*   * ";
                    thirdStr +=  "***** ";
                    fourthStr += "*   * ";
                    fifthStr +=  "***** ";
                    break;
                case '9':
                    firstStr +=  "***** ";
                    secondStr += "*   * ";
                    thirdStr +=  "***** ";
                    fourthStr += "    * ";
                    fifthStr +=  "***** ";
                    break;
                case '.':
                    firstStr +=  "  ";
                    secondStr += "  ";
                    thirdStr +=  "  ";
                    fourthStr += "  ";
                    fifthStr +=  "* ";
                    break;
                case '-':
                    firstStr +=  "      ";
                    secondStr += "      ";
                    thirdStr +=  "****  ";
                    fourthStr += "      ";
                    fifthStr +=  "      ";
            }
        }
    }

    public String getFirstStr() {
        return firstStr;
    }

    public String getSecondStr() {
        return secondStr;
    }

    public String getThirdStr() {
        return thirdStr;
    }

    public String getFourthStr() {
        return fourthStr;
    }

    public String getFifthStr() {
        return fifthStr;
    }
}
