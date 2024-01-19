package org.example;
/*
 *synchronized kelimesi, aynı anda birden fazla iş parçacığı tarafından erişilen bir bloğu veya bir metodu
 * koruma amaçlı kullanılır. İş parçacıklarının eş zamanlı olarak bir kaynağa erişmesini kontrol etmek ve
 * bu kaynağın tutarlılığını sağlamak amacıyla kullanılır. Bu, çoklu iş parçacıklı (multithreaded)
 *  programlarda eş zamanlılık sorunlarını önlemek için kullanılır.
 *
 * synchronized anahtar kelimesi, bir metot veya blok tanımlanırken kullanılabilir.
 * senkronize edilmiş bir metot, aynı anda sadece bir iş parçacığı tarafından çalıştırılabilir.
 * senkronize edilmemiş bir metot, aynı anda birden fazla iş parçacığı tarafından çalıştırılabilir olduğu için bu örnekte
 * bakiye hesabını yanlış hesaplayıp, eksi bakiye gösterebilir.
 *
 * Synchronized kullanmak, aynı anda sadece bir iş parçacığının belirli bir kaynağa erişmesini sağlamak için
 * etkili bir yol olsa da, yanlış kullanımı performans sorunlarına ve beklemelere neden olabilir. Bu nedenle,
 *  modern Java uygulamalarında genellikle daha sofistike senkronizasyon mekanizmaları veya
 * java.util.concurrent kütüphanesindeki araçlar tercih edilir.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}