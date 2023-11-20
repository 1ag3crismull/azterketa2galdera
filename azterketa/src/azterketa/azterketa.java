package azterketa;

import java.util.*; //Java liburutegia inportatzen

public class azterketa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int zenbakia;
		int zenbakiBatura = 0;
		int zenbakiKopurua = 0;
		
		do {	
			System.out.println("Sartu zenbaki bat (0 sartzerakoan prozesua amaitu eta bataz-bestekoa egingo du): ");
			zenbakia=sc.nextInt();
			
			if (zenbakia != 0) {
				zenbakiBatura += zenbakia;
				zenbakiKopurua++;
			}
			else {
				break;
			}
		} while (zenbakia != 0);
		
		int batazBestekoa = zenbakiBatura / zenbakiKopurua;
		
		System.out.println("Sartutako zenbakien bataz bestekoa: " + batazBestekoa);
		
		sc.close();

	}

}
