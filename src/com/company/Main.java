package com.company;
public class Main {
        public static void main(String[] args) {
            Flower flower1 = new Flower("Ambrella");
            Flower flower2 = new Flower("Anemon");

            flower1.blossom();
            flower2.wither();

            System.out.println(flower1.equals(flower2));
            System.out.println(flower1);
            System.out.println(flower2);
        }
    }
