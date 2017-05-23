package com.company;

import java.util.Scanner;

/**
 * Created by PauliusJ on 2017.05.23.
 */
public class Uzduotis15 {

    private double skaicius;
    private double skaicius2;

    // konstruktorius metodu paleidimui
    public Uzduotis15(){
        uzklausimas();
        rezultatuAtspausdinimas();
    }

    // paprasom vartotojo ivesti 2 krastines
    // kvadrato, staciakampio, trikampio plotu skaiciavimui
    // ir issaugom i kintamuosius
    public void uzklausimas(){
        Scanner skeneris = new Scanner(System.in);
        System.out.println("Iveskite 1a krastine");
        skaicius = skeneris.nextDouble();
        System.out.println("Iveskite 2a krastine");
        skaicius2 = skeneris.nextDouble();

    }
    // atliekame kvadrato skaiciavima metode su return
    public double kvadratoSkaiciavimas(double a){
        double rezultatas = Math.pow(a, 2);
        return rezultatas;
    }
    // atliekame staciakampio skaiciavima metode su return
    public double staciakampioSkaiciavimas(double a, double b){
        double rezultatas = a * b;
        return rezultatas;
    }
    // atliekame trikampio skaiciavima metode su return
    public double trikampioSkaiciavimas(double a, double b){
        double rezultatas = (a * b)/2;
        return rezultatas;
    }


    public void rezultatuAtspausdinimas(){
        System.out.printf("Kvadrato plotas = %.2f", kvadratoSkaiciavimas(skaicius));
        System.out.println();
        System.out.printf("Staciakampio plotas = %.2f", staciakampioSkaiciavimas(skaicius, skaicius2));
        System.out.println();
        System.out.printf("Trikampio plotas = %.2f", trikampioSkaiciavimas(skaicius, skaicius2));
    }
}