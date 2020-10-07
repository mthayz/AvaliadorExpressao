package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern identifier = Pattern.compile("[A-z]([A-z|0-9])*");
        Pattern constant = Pattern.compile("(\\+|\\-)?[0-9]+\\.?[0-9]*");
        Pattern relop = Pattern.compile("([<][>])|([<][=])|([>][=])|[=]|[<]|[>]");
        Pattern addop = Pattern.compile("");
    }
}
