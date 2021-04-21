package intro;

public class Main {

	public static void main(String[] args) {
		// camelCase (ilk k���k di�erleri b�y�kle ba�la)
				// don't repeat yourself
				String internetSubeButonu = "�nternet �ubesi";
				double dolarDun = 8.20;
				double dolarBugun = 8.20;
				int vade = 36;
				boolean dustuMu = false;

				System.out.println(internetSubeButonu);

				if (dolarBugun < dolarDun) {
					System.out.println("Dolar d��t� resmi");
				} 
				else if (dolarBugun > dolarDun) {
					System.out.println("Dolar y�kseldi resmi");
				} 
				else {
					System.out.println("Dolar e�ittir resmi");
				}

				System.out.println("------------------");
				
				String[] krediler = 
					{ 
						"h�zl� kredi", 
						"mutlu emekli kredisi", 
						"konut kredisi", 
						"�ift�i kredisi", 
						"msb kredisi",
						"meb kredisi",
						"k�lt�r kredisi"
					};
				
				//foreach kullan�m�
				for(String kredi: krediler) {
					System.out.println(kredi);
				}
				
				System.out.println("------------------");
				
				for(int i = 0; i<krediler.length; i++) {
					System.out.println(krediler[i]);
				}
				
				System.out.println("------------------");
				
				//de�ertip - stack
				int sayi1 = 10;
				int sayi2 = 20;
				sayi1 = sayi2;
				sayi2 = 100;
				System.out.println(sayi1);
				
				System.out.println("------------------");
				
				//referanstip - heap
				int[] sayilar1 = {1,2,3,4,5};
				int[] sayilar2 = {10,20,30,40,50};
				
				sayilar1 = sayilar2;
				sayilar2[0] = 100;
				System.out.println(sayilar1[0]);
				
				System.out.println("------------------");
				
				String sehir1 = "ankara";
				String sehir2 = "istanbul";
				sehir1 = sehir2;
				sehir2 = "izmir";
				System.out.println(sehir1);
				
				System.out.println("------------------");

	}

}
