package UygulamaOdev;

import java.util.Random;
import java.util.Scanner;

public class Odev {

	public static void main(String[] args)
	{	
		Scanner scan= new Scanner(System.in);
        System.out.print("Kaç adet kolon girmek istersiniz?:");
        int kolonSayisi= scan.nextInt();       
        System.out.print("Girilen Kuponlar");

        for (int c = 0; c < kolonSayisi; c++)
        {  	/* Bu döngüde yapmak istediğim döngü içindeki kodları benim klavyeden girdiğim kolon sayısına uyumlu çalıştırsın */
           
            Random rnd = new Random(); /* Random metodu rastgele sayılar oluşturması için ürettim */
        	int[] sayilar= new int[6]; /* sayilar adında 6 elemanlı bir dizi oluşturdum */
            int gecici=0; /* Buradaki geçici sayı mantığı tek kolondaki sayıların birbirinden farklı olmasını kontrol ederken kullanmak için başlangıcı 0 vedim */
            int i =0;
            while(true) { /* While kullanma sebebim random sayıların üst üste aynı gelebilme ihtimali var ve kaç kerede bir sonrakı elemana geçeceğimi bilmiyorum
            döngü tamamlama sürem belirsiz olduğu için while yaptım */
            	
                gecici=rnd.nextInt(50);
                int j=0; 
                for (j = 0; j < sayilar.length; j++) 
                {
                    if(gecici==sayilar[j]) /* Önceki sayı bu diziye atanmış yani o sayıdan zaten var demek */ 
                        break;  /* Burada eğer önceki sayıyla çakışırsa aynı sayıyı yazdırmamak için döngüden çıkar */ 
                }         
                if(j==sayilar.length) 
                {
                    sayilar[i]=gecici;
                    i++;
                }
                if(i==sayilar.length)
                    break; /* Buradaki komut ile de komple döngüden çıkarız */ 
            }
            System.out.println( "  ");
            
            for(int kupondakiSayilar : sayilar)
            {
                System.out.print(kupondakiSayilar+"\t");
            }
             
        }
}
}




