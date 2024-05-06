package Ders3;

import java.util.Iterator;
import java.util.Scanner;

public class DortVeBesinKatlari {

	public static void main(String[] args) {
		/*Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
		 */
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Sınır değerini giriniz: ");
		n=scan.nextInt();
		
		for (int i = 1; i <=n; i++) {
			if ((i%4==0)&&(i%5==0)) {
				System.out.println(i);
				
			}
			
			
		}
		

	}

}
