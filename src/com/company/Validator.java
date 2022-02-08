package com.company;

public class Validator {
    public static boolean checkPassword (String password){
        char[] pass = password.toCharArray();
        String symbols = "@,$,!,^";
        int l = 0;
        int u = 0;
        int d = 0;
        int s = 0;
        if (password.length()>=8) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    l++;
                }
                if (Character.isLowerCase(password.charAt(i))) {
                    u++;
                }
                String schar = Character.toString(password.charAt(i));
                if (symbols.contains(schar)) {
                    s++;
                }
            }
            for (char c : pass) {
                if (Character.isDigit(c)) {
                    d++;
                }
            }
        }
        else return false;
        if (l>=1 && u>=1 && d>=1)
        {
            return true;
        }
        else return false;
    }
    public static boolean checkAge(int age){
        if (age>18)
        {
            return true;
        }
        else return false;
    }

    public static boolean checkDate(String dateOfBirth) {
        int date = Integer.parseInt(dateOfBirth);
        int c=0;
        int day=0, month=0, year=0;

        day = (int) (date/Math.pow(10, 6));
        month = (int) ((date - day * Math.pow(10, 6)) / 10000);
        year = (int) (date - day * Math.pow(10, 6) - month * Math.pow(10, 4));
        if ((day>=1 && day<=31) && (month>=1 && month<=12) && (year<=2022))
        {
            return true;
        }
        else return false;
    }
}
