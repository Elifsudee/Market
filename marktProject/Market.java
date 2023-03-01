package miniproject.marktProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market {
	
	
	static List <String> gunler=new ArrayList <String>(Arrays.asList("PAZARTESI","SALI","CARSAMBA","PERSEMBE","CUMA","CUMARTESI","PAZAR"));
	static List <Double> gunlukKazanc=new ArrayList <>();
    static double getOrtalama=0;
    static List <String> ortalamaUstuGunler=new ArrayList <>();
    static List <String> ortalamaAltiGunler=new ArrayList <>();
    
    

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		* Bir bakkalin 7 gunluk tam kazanalarini gunluk olarak gosteren bir program yaziniz.
     * Ayrica bakkalin bu hafta ortalama kazandigi miktari gosteren bir method yaziniz.
     * Ayrica bakkalin hangi gunler ortalamanin ustune kazandigini gosteren bir method yaziniz.
     * Ayrica bakkalin hangi gunler ortalamanin altinda kazandigini gosteren bir method yaziniz.
     *
     * 1. Adim : Gunleri iceren bir tane ArrayList olusturun. (gunler)     ****
     * 2. Adim : Gunluk kazanclari ekleyecegimiz bir tane ArrayList olusturun. (gunlukKazanclar)**********
     * 3. Adim : While dongusu ile kullanicidan 7 gunluk kazanclari tekek teker alip gunlukKazanclar ArrayList'e ekle.*******
     * 4. Adim : getOrtalamaKazanc() adli method ile ortalama kazanci alin.  ******
     * 5. Adim : getOrtalamaninUstundeKazancGunleri() adli method olusturun.
     * 			 for dongusu ile tum gunleri ortalama kazanc ile karsilastir
     * 			 ortalama kazanctan yuksekse o gunleri return yap.
     * 6. Adim : getOrtalamaninAltindaKazancGunleri() adli method olusturun.
     * 			 for dongusu ile tum gunleri ortalama kazanc ile karsilastir
     * 			 ortalama kazanctan asagiysa o gunleri return yap.
		 * */
		

		
    System.out.println(        "     ********************GUNLUK KAZANC PROGRAMINA HOSGELDINIZ********************     "   );
		
		   System.out.println("                 **********ISLEMLERINIZ ARTIK DAHA KOLAY!************             ");
		
		System.out.println("\n    //// KAZANC GIRISI ////\n                         ");
		
		
		
		
		Scanner scan=new Scanner(System.in);
		
		double kazanc=0;       // gUnlUk kazanc alacam
		int gunIndex=0;     // gUnleri getirmek iCin, gUnlerin indexini bulacam
		
        do {
			
        	System.out.println("LUtfen " + gunler.get(gunIndex) + " gunu icin elde edilen kazancc giriniz: "  );
        	kazanc=scan.nextDouble();
			
			gunlukKazanc.add(kazanc);  // her dungude sirasi ile ayni indexe atacak
        	
			System.out.println("" + gunler.get(gunIndex)+" gunu icin elde edilen kazanc: " + kazanc+"$\n" );
			
			
			gunIndex++;
			
		} while (gunIndex<7);
		
        
        
		getOrtalamaKazanc();
		getOrtalamaninUstundeKazancGunleri();
		getOrtalamaninAltindaKazancGunleri();
	

		
	}

	private static List<String> getOrtalamaninAltindaKazancGunleri() {
		
		
        for (int i = 0; i < gunlukKazanc.size(); i++) {
			
			if (gunlukKazanc.get(i)<getOrtalama) {
			 
			ortalamaAltiGunler.add(gunler.get(i));	
		}
		
        }
        System.out.println("Ortalama kazancin altinda olan gunler: " + ortalamaAltiGunler);
        
        return ortalamaAltiGunler;
	}

	
	
	private static List<String> getOrtalamaninUstundeKazancGunleri() {
		

		
		for (int i = 0; i < gunlukKazanc.size(); i++) {
			
			if (gunlukKazanc.get(i)>getOrtalama) {
			 
			ortalamaUstuGunler.add(gunler.get(i));
			}
			
		}
		
		System.out.println("Ortalama kazancin uzerinde olan gunler: " + ortalamaUstuGunler);
		
		return ortalamaUstuGunler;
		
	}

	
	
	public static double getOrtalamaKazanc() {
	
		double toplam=0;
	
	
		for (int i = 0; i < gunlukKazanc.size(); i++) {
		
			toplam+=gunlukKazanc.get(i);
			
		}
		
		getOrtalama=toplam/7;
		
		System.out.println("\nBir haftalik ortalama kazanc: \n" + getOrtalama + "\n");
		
		return getOrtalama;
		
	}

}
