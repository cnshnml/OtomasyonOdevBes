package otomasyon;

public class PersonelGetir {
    public static void main(String[] args) {
        Personel personel1= new Personel();
        Personel personel2= new Personel();



        personel1.ad="Cansu";
        personel1.soyad="Sahin Namli";

        personel2.ad="Naim";
        personel2.soyad="Namli";



        personel1.personelgetir();
        personel2.personelgetir();

    }

}
