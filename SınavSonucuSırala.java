package com.main;
class  SınavSonucuSırala {
    Ogrenci ogrenci1=new Ogrenci(874,"kaan123","Kaan","C",470,4,4);
    Ogrenci ogrenci2=new Ogrenci(986,"cem123","Cem","B",450,2,6);
    Ogrenci ogrenci3=new Ogrenci(921,"emin123","Emin","A",356,0,2);
    Ogrenci ogrenci4=new Ogrenci(643,"metin123","Metin","B",354,5,1);
    String[]isim=new String[]{ogrenci1.isim,ogrenci2.isim,ogrenci3.isim,ogrenci4.isim};

    public  void sirala(double[]dizi){
        double gecici;
        for (int i=0;i<dizi.length-1;i++){
            for (int j=i+1;j<dizi.length;j++){
                if (dizi[j]>dizi[i]){
                    gecici=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=gecici;

                }
            }
        }
        for (int i=0;i< dizi.length;i++){
            System.out.println(isim[i]+" "+dizi[i]);
        }
    }
}