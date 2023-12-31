package day07stringmanipulations;

public class Stringmanipulations {
    public static void main(String[] args) {


        //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        String newTv = tv.replace("$", "");
        String newLaptop = laptop.replace("$", "");

        Double totalPrice = Double.valueOf(newTv) + Double.valueOf(newLaptop);
        System.out.println(totalPrice);//1332.98

        //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "    ali cAN   " ==> AC
        //trim() methodu bir string in bas ve sonundaki space characterlerini siler, aradaki space leri silmez
        //split() methodu bir string i istedigimiz characterden parcalamaya yarar.

        String name = "    ali cAN   ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);

        System.out.println("" + first + last);


        //Ornek : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum
        // karakterleri dynamic olarak aliniz
        //abc@gmail.com ===> gmail
        //indexOf("@") methodu parantez icine yazilan characterin ilk gorunumunun indexini verir

        String a = "abce@gmail.com";

        System.out.println(a.substring(4, 9));//gmail

        int startingIndex = a.indexOf("@") + 1;
        int endingIndex = a.indexOf(".");

        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println("companyName = " + companyName);//gmail


    }
}