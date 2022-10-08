package j12_Lopps.L02_WhileLoop.WhileLoopTask;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
		int i=999; int adet=0;
		while (i>=100){
			if (i%4==0&&i%6==0){
				adet++;
			System.out.print(i+" ");}
			i--;

		}
		System.out.println("\n"+adet+"adet sayı 4 ve 6 ya tam bölünebilmektedir.");


		
		

		
		
			
	}

}
