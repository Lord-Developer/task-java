package org.example;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(countZeros(5));
    }

    // nol hosil bulishi uchun oxirida
    //2 va 5 ni ko'paytmasi bo'lishi kerak
    // yoki 0 bilan tugagan son bulishi kerak
    //shuning uchun 5 dan katta sonlarda 2 va 5 bor faqat bundan boshqa 2 va 5 ga bo'linadigan sonni o'zi yo'q
    // bo'lsa u tub son bo'lmaydi va 0 bilan tugaydigan sonni uzi yo'q
    // 5 dan kichik sonlarda esa faqat 2 va 3 bor bularni ko'paytmasi nol bilan tugamaydi shunga 0 ta nol bo'ladi
    public static int countZeros(int n){
        if(n >= 5)return 1;
        else return 0;
    }
}
