package currency_convo;

import java.util.Scanner;
public class calculation {
    private Scanner scanner;
    public calculation(Scanner scanner) {
        this.scanner = scanner;
    }
    public double Other_to_India(String shortForm,double number){
        double i = 0.0;
        if(shortForm.equals("USD")){
             i = number * currencyRate.Usd_Ind;
        }
        if(shortForm.equals("JPY")){
             i = number * currencyRate.Jpy_Inr;
        }
        if(shortForm.equals("EUR")){
            i = number * currencyRate.Eur_Inr;
        }
        if(shortForm.equals("RUB")){
             i = number * currencyRate.Rub_Inr;
        }

        return i;
    }
    public double Other_to_America(String shortForm,double number){
        double j = 0.0;
        if(shortForm.equals("INR")){
             j = number/currencyRate.Ind_Usd;
        }
        if(shortForm.equals("JPY")){
             j = number * currencyRate.Jpy_Usd;
        }
        if(shortForm.equals("EUR")){
             j = number * currencyRate.Eur_Usd;
        }
        if(shortForm.equals("RUB")){
             j = number/currencyRate.Rub_Usd;
        }
        return j;
    }
    public double Other_to_japan(String shortForm,double number){
        double k = 0.0;
        if(shortForm.equals("INR")){
             k =  number *currencyRate.Ind_Jpy;
        }
        if(shortForm.equals("USD")){
            k = number * currencyRate.Usd_Jpy;
        }
        if(shortForm.equals("EUR")){
            k = number * currencyRate.Eur_Jpy;
        }
        if(shortForm.equals("RUB")){
            k = number * currencyRate.Rub_Jpy;
        }
        return k;
    }
    public double Other_to_Europe(String shortForm,double number){
        double l = 0.0;
        if(shortForm.equals("INR")){
            l = number *currencyRate.Ind_Eur;
        }
        if(shortForm.equals("USD")){
            l = number * currencyRate.Usd_Eur;
        }
        if(shortForm.equals("JPY")){
            l = number * currencyRate.Jpy_Eur;
        }
        if(shortForm.equals("RUB")){
            l = number * currencyRate.Rub_Eur;
        }

        return l;
    }
    public double Other_to_Russia(String shortForm,double number){
        double m = 0.0;
        if(shortForm.equals("INR")){
            m = number * currencyRate.Ind_Rub;
        }
        if(shortForm.equals("USD")){
            m = number * currencyRate.Usd_Rub;
        }
        if(shortForm.equals("JPY")){
            m = number * currencyRate.Jpy_Rub;
        }
        if(shortForm.equals("EUR")){
            m = number * currencyRate.Eur_Rub;
        }
        return m;
    }






//    public double Indian_to_Other(String choice, double number) {
//        double i = 0.0;
//        if (choice.equals("USD")) {
//             i = number/currencyRate.Ind_Usd;
//        }
//        if (choice.equals("JPY")) {
//             i = currencyRate.Ind_Jpy * number;
//        }
//        if (choice.equals("EUR")) {
//            i  = currencyRate.Ind_Eur * number;
//        }
//        if(choice.equals("RUB")){
//             i = currencyRate.Ind_Rub * number;
//        }
//        return i;
//    }
//    public double USD(String choice, double number) {
//        double j=0.0;
//        if (choice.equals("USD")) {
//             j = currencyRate.Usd_Ind * number;
//        } else if (choice.equals("JPY")) {
//             j = currencyRate.Usd_Jpy * number;
//        } else if (choice.equals("EUR")) {
//             j = currencyRate.Usd_Eur * number;
//        } else {
//             j = currencyRate.Usd_Rub * number;
//        }
//        return j;
//    }
//    public double JPY(String choice, double number) {
//        double k=0.0;
//        if (choice.equals("INR")) {
//             k = currencyRate.Jpy_Inr * number;
//        } else if (choice.equals("USD")) {
//             k = currencyRate.Jpy_Usd * number;
//        } else if (choice.equals("EUR")) {
//             k = currencyRate.Jpy_Eur * number;
//        } else {
//             k = currencyRate.Jpy_Rub * number;
//        }
//        return k;
//    }
//    public double EUR(String choice, double number) {
//        double l = 0.0;
//        if (choice.equals("INR")) {
//             l = currencyRate.Eur_Inr * number;
//        } else if (choice.equals("USD")) {
//             l = currencyRate.Eur_Usd * number;
//        } else if (choice.equals("JPY")) {
//             l = currencyRate.Eur_Jpy * number;
//        } else {
//             l = currencyRate.Eur_Rub * number;
//        }
//        return l;
//    }
//    public double RUB(String choice, double number) {
//        if (choice.equals("INR")) {
//            double i = currencyRate.Rub_Inr * number;
//            return i;
//        } else if (choice.equals("USD")) {
//            double j = currencyRate.Rub_Usd * number;
//            return j;
//        } else if (choice.equals("JPY")) {
//            double k = currencyRate.Rub_Jpy * number;
//            return k;
//        } else {
//            double l = currencyRate.Rub_Eur * number;
//            return l;
//        }
//    }
}

