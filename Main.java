package com.main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);


        Ogretmen ogretmen1 = new Ogretmen(123, "ahmet123", "Ahmet", "İngilizce");
        Ogretmen ogretmen2 = new Ogretmen(234, "kamber123", "Kamber", "Matematik");
        Ogretmen ogretmen3 = new Ogretmen(345, "emel123", "Emel", "Fizik");
        Ogretmen ogretmen4 = new Ogretmen(456, "apo123", "Abdurrahman", "Matematik");


        Ogrenci ogrenci1 = new Ogrenci(874, "kaan123", "Kaan", "C", 470,3,450);
        Ogrenci ogrenci2 = new Ogrenci(986, "cem123", "Cem", "B", 450,4,460);
        Ogrenci ogrenci3 = new Ogrenci(921, "emin123", "Emin", "A", 356,0,340);
        Ogrenci ogrenci4 = new Ogrenci(643, "metin123", "Metin", "B", 354,6,370);


        Yonetici yonetici1=new Yonetici("Teyfik","teyfik123",3131,"Müdür");
        Yonetici yonetici2=new Yonetici("Mehmet","mehmet123",5252,"Patron");
        Yonetici yonetici3=new Yonetici("Doğanay","dodo123",5656,"Muhasebe");
        Yonetici yonetici4=new Yonetici("Zeynep","zeynep123",4545,"Müdür Yardımcısı");


        Ogretmen[] ogretmens = new Ogretmen[]{ogretmen1, ogretmen2, ogretmen3, ogretmen4};
        Ogrenci[] ogrencis = new Ogrenci[]{ogrenci1, ogrenci2, ogrenci3, ogrenci4};
        Yonetici []yoneticis=new Yonetici[]{yonetici1,yonetici2,yonetici3,yonetici4};
        double[] sinavSonucu = new double[]{ogrenci1.sinavNotu, ogrenci2.sinavNotu, ogrenci3.sinavNotu, ogrenci4.sinavNotu};


            System.out.println("\n****Giriş Türleri****\n");
            System.out.println("1. Öğretmen ");
            System.out.println("2. Öğrenci ");
            System.out.println("3. Yönetici ");
            System.out.println("\n Tür Seçiniz");
            int tur = klavye.nextInt();

            switch (tur) {
                case 1:
                    System.out.println("Tc Giriniz");
                    int Tc = klavye.nextInt();
                    System.out.println("Şifre Giriniz");
                    String sifre = klavye.next();
                    if (Tc == ogretmen1.TC && ogretmen1.sifre.equals(sifre)) {
                        System.out.println("Sisteme Hoşgeldin " + ogretmen1.isim);
                    } else if (Tc == ogretmen2.TC && ogretmen2.sifre.equals(sifre)) {
                        System.out.println("Sisteme Hoşgeldin " + ogretmen2.isim);
                    } else if (Tc == ogretmen3.TC && ogretmen3.sifre.equals(sifre)) {
                        System.out.println("Sisteme Hoşgeldin " + ogretmen3.isim);
                    } else if (Tc == ogretmen4.TC && ogretmen4.sifre.equals(sifre)) {
                        System.out.println("Sisteme Hoşgeldin " + ogretmen4.isim);
                    } else {
                        System.out.println("Giriş Bilgileri Hatalı");
                        break;
                    }
                    System.out.println("\n****İşlemler****\n");
                    System.out.println("1. Deneme Sınav Sonucunu Sırala");
                    System.out.println("2. Ders Programını Görüntüle");
                    System.out.println("3. Yoklama Almak");
                    System.out.println("4. Mesaj Göndermek");
                    System.out.println("\nSeçim Yapınız");
                    int Secim = klavye.nextInt();
                    switch (Secim) {
                        case 1:
                            SınavSonucuSırala sinavSonucuSirala = new SınavSonucuSırala();
                            sinavSonucuSirala.sirala(sinavSonucu);
                            break;
                        case 2:
                            System.out.println("                        Ders Programı");
                            System.out.println("            9.15/11.00     11.30/13.00     15.00/17.00     17.00/19.00");
                            System.out.println("Pazartesi=> Matematik         Fizik         İngilizce        Geometri");
                            System.out.println("     Salı=>   Fizik         Matematik        Geometri        İngilizce");
                            System.out.println(" Çarşamba=> İngilizce        Geometri       Matematik          Fizik");
                            System.out.println(" Perşembe=>  Geometri       Matematik       İngilizce          Fizik");
                            System.out.println("     Cuma=> Matematik       İngilizce         Fizik          İngilizce");
                            break;
                        case 3:
                            for (Ogrenci ogrenci : ogrencis) {
                                System.out.println(ogrenci.isim);
                                System.out.println("1. Burda/2. Yok");
                                int yoklama = klavye.nextInt();
                                if (yoklama == 1) {
                                    System.out.println(ogrenci.isim + " burda" + " Devamsızlık:" + ogrenci.devamsizlik);
                                } else if (yoklama == 2) {
                                    ogrenci.devamsizlik = ogrenci.devamsizlik + 1;
                                    System.out.println(ogrenci.isim + " Yok" + " Devamsızlık:" + ogrenci.devamsizlik);
                                } else {
                                    System.out.println("Hatalı Tuşlama Yaptınız");
                                    break;
                                }
                            }
                            break;
                        case 4:
                            for (Ogrenci ogrenci : ogrencis) {
                                System.out.println("\n \n" + ogrenci.isim);
                            }
                            System.out.println("\n Öğrenci Seçin");
                            int ogrenci = klavye.nextInt();
                            System.out.println("Mesajınızı Giriniz");
                            String MESAJ = klavye.next();
                            System.out.println("Mesajınız Gönderildi");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Tc Giriniz");
                    int TTC = klavye.nextInt();
                    System.out.println("Şifre Giriniz");
                    String sifre3 = klavye.next();
                    if (ogrenci1.TC == TTC && ogrenci1.sifre.equals(sifre3)) {
                        System.out.println("Sisteme Hoşgeldin " + ogrenci1.isim);
                    } else if (ogrenci2.TC == TTC && ogrenci2.sifre.equals(sifre3)) {
                        System.out.println("Sisteme Hoşgeldin " + ogrenci2.isim);
                    } else if (ogrenci3.TC == TTC && ogrenci3.sifre.equals(sifre3)) {
                        System.out.println("Sisteme Hoşgeldin " + ogrenci3.isim);
                    } else if (ogrenci4.TC == TTC && ogrenci4.sifre.equals(sifre3)) {
                        System.out.println("Sisteme Hoşgeldin " + ogrenci4.isim);
                    } else {
                        System.out.println("Giriş Bilgileriniz Hatalı");
                        break;
                    }
                    System.out.println("\n****İşlemler****\n");
                    System.out.println("1. Sınav Sonuçlarınız Görüntüle");
                    System.out.println("2. Ders Programını Görüntüle");
                    System.out.println("3. Mesaj Gönder");
                    System.out.println("4. Devamsızlık Sayısını Gör");
                    System.out.println("\n****İşlem Seçiniz");
                    int islemler = klavye.nextInt();
                    switch (islemler) {
                        case 1:
                            SınavSonucuSırala x = new SınavSonucuSırala();
                            x.sirala(sinavSonucu);
                            break;
                        case 2:
                            System.out.println("                        Ders Programı");
                            System.out.println("            9.15/11.00     11.30/13.00     15.00/17.00     17.00/19.00");
                            System.out.println("Pazartesi=> Matematik         Fizik         İngilizce        Geometri");
                            System.out.println("     Salı=>   Fizik         Matematik        Geometri        İngilizce");
                            System.out.println(" Çarşamba=> İngilizce        Geometri       Matematik          Fizik");
                            System.out.println(" Perşembe=>  Geometri       Matematik       İngilizce          Fizik");
                            System.out.println("     Cuma=> Matematik       İngilizce         Fizik          İngilizce");
                            break;
                        case 3:
                            for (Ogretmen ogretmen : ogretmens) {
                                System.out.println("\n \n" + ogretmen.isim);
                            }
                            System.out.println("\n Öğretmen Seçiniz");
                            int ogretmen = klavye.nextInt();
                            System.out.println("Mesajınızı Giriniz");
                            String mesaj = klavye.next();
                            System.out.println("Mesajın Gönderildi");
                            break;
                        case 4:
                            System.out.println("Şifreni Gir");
                            String sifrek = klavye.next();
                            if (ogrenci1.sifre.equals(sifrek)) {
                                System.out.println(ogrenci1.isim + " Devamsızlığı: " + ogrenci1.devamsizlik);
                            } else if (ogrenci2.sifre.equals(sifrek)) {
                                System.out.println(ogrenci2.isim + " Devamsızlık : " + ogrenci2.devamsizlik);
                            } else if (ogrenci3.sifre.equals(sifrek)) {
                                System.out.println(ogrenci3.isim + " Devamsızlık : " + ogrenci3.devamsizlik);
                            } else if (ogrenci4.sifre.equals(sifrek)) {
                                System.out.println(ogrenci4.isim + " Devamsızlık : " + ogrenci4.devamsizlik);
                            } else {
                                System.out.println("Hatal Şifre Girdiniz");
                            }
                            break;
                    }
            break;
                case 3:
                    System.out.println("TC giriniz");
                    int Tck=klavye.nextInt();
                    System.out.println("Şifre Giriniz");
                    String sifrek=klavye.next();
                    if (yonetici1.TC==Tck&&yonetici1.sifre.equals(sifrek)){
                        System.out.println("Sisteme Hoşgeldin "+yonetici1.isim);
                    }else if (yonetici2.TC==Tck&&yonetici2.sifre.equals(sifrek)){
                        System.out.println("Sisteme Hoşgeldin "+yonetici2.isim);
                    }else if (yonetici3.TC==Tck&&yonetici3.sifre.equals(sifrek)){
                        System.out.println("Sisteme Hoşgeldin "+yonetici3.isim);
                    }else if (yonetici4.TC==Tck&&yonetici4.sifre.equals(sifrek)){
                        System.out.println("Sisteme Hoşgeldin "+yonetici4.isim);
                    }else{
                        System.out.println("Giriş Bilgileri Hatalı");
                        break;
                    }
                    System.out.println("\n*****İşlemler*****\n");
                    System.out.println("1. Maddi Detaylar");
                    System.out.println("2. Kursun Başarı Oranı=%");
                    System.out.println("3. Başarılı Öğrenciler");
                    System.out.println("4. Yeni Kayıt");
                    System.out.println("\n Seçim Yap");
                    int seckim=klavye.nextInt();
                    switch (seckim){
                        case 1:
                             System.out.println("Sınıf Sayısı Giriniz");
                             int sinif=klavye.nextInt();
                             System.out.println("Sınıflar Kaç Kişilik");
                             int kisi=klavye.nextInt();
                             System.out.println("Her Öğrenci Kaç Para");
                             int para=klavye.nextInt();
                             int gelir=sinif*kisi*para;
                             int gider=sinif*2000;
                             System.out.println("\nGelir="+gelir);
                             System.out.println("\nGider="+gider);
                             double vergi=gelir*0.14;
                             System.out.println("\nGelir Vergisi="+vergi);
                             gider+=vergi;
                             int kar=gelir-gider;
                             double yuzdeKar=kar*100/gelir;
                             System.out.println("\nYıllık Yuzde Büyüme=%"+yuzdeKar);
                                 break;
                        case 2:
                             double toplam=0;
                             for (Ogrenci ogrenci:ogrencis){
                                toplam=toplam+ogrenci.sinavNotu;
                             }
                             System.out.println("1. Sınav Sonuclar Toplamı="+toplam);
                             double toplam2=0;
                             for (Ogrenci ogrenci:ogrencis){
                                toplam2=toplam2+ogrenci.sinavsonucu2;
                             }
                             System.out.println("2. Sınav Sonuçları Toplamı="+toplam2);
                             double yuzdek=(toplam2-toplam)*100/toplam2;
                             System.out.println("Kurumun Başarı Oranı=%"+yuzdek);
                             if (yuzdek>0){
                                System.out.println("Kurum Başarılı");
                             }else{
                                System.out.println("Kurum Başarısız");
                             }
                             break;
                        case 3:
                            for (Ogrenci ogrenci:ogrencis){
                                if (ogrenci.sinavsonucu2>ogrenci.sinavNotu){
                                    System.out.println(ogrenci.isim+" Başarılı");
                                }else{
                                    System.out.println(ogrenci.isim+" Başarısız");
                                }
                            }
                            break;
                        case 4:
                            System.out.println("\n****Eklenebilecekler****\n");
                            System.out.println("1. Öğrenci");
                            System.out.println("2. Öğretmen");
                            System.out.println("3. Yönetici");
                            System.out.println("\n Eklenecek Türü Seçin");
                            int ekle=klavye.nextInt();
                            switch (ekle){
                                case 1:
                                    System.out.println("İsim Giriniz");
                                    String isim=klavye.next();
                                    System.out.println("TC giriniz");
                                    int tcc=klavye.nextInt();
                                    String str=isim+"123";
                                    System.out.println("Sınıfı Giriniz");
                                    String sinif3=klavye.next();
                                    Ogrenci ogrenciYeni=new Ogrenci(tcc,str,isim,sinif3,0,0,0);
                                    System.out.println(ogrenciYeni.isim+" isminde "+ogrenciYeni.TC+" TC numaralı "+ogrenciYeni.sifre+" şifreye sahip "+ogrenciYeni.sinif+" sınıfında yeni kayıt alındı.");
                                    break;
                                    case 2:
                                    System.out.println("İsim Giriniz");
                                    String isim2=klavye.next();
                                    System.out.println("TC giriniz");
                                    int tcc2=klavye.nextInt();
                                    String str2=isim2+"123";
                                    System.out.println("Dersini Giriniz");
                                    String ders=klavye.next();
                                    Ogretmen ogretmenYeni=new Ogretmen(tcc2,str2,isim2,ders);
                                    System.out.println(ogretmenYeni.isim+" isminde "+ogretmenYeni.TC+" TC numaralı "+ogretmenYeni.sifre+" Şifreye Sahip "+ogretmenYeni.ders+" dersinden yeni kayıt alındı.");
                                    break;
                                case 3:
                                    System.out.println("İsim Giriniz");
                                    String isim3=klavye.next();
                                    System.out.println("TC giriniz");
                                    int tcc3=klavye.nextInt();
                                    String str3=isim3+"123";
                                    System.out.println("Çalışma Alanını Giriniz");
                                    String calismaAlani=klavye.next();
                                    Yonetici yoneticiYeni=new Yonetici(isim3,str3,tcc3,calismaAlani);
                                    System.out.println(yoneticiYeni.isim+" isminde "+yoneticiYeni.TC+" TC numaralı "+yoneticiYeni.sifre+" Şifreye sahip "+yoneticiYeni.calismaAlani+" alanına yeni kayıt yapıldı.");
                                    break;


                            }
                    }
            }
        }
    }






