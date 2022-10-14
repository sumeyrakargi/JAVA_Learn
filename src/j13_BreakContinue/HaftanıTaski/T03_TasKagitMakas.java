package j13_BreakContinue.HaftanıTaski;

import java.util.Scanner;

public class T03_TasKagitMakas {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int computerChoice;
		int playerChoice;
		int numberOfComputerWin = 0;
		int numberOfPlayerWin = 0;

		do {
			computerChoice = (int) (Math.random() * 3 + 1);
			System.out.print("\nTaş >Makas & Makas >Kağıt & Kağıt >Taş   Taş(1)-Kağıt(2)-Makas(3)-Çıkış(0)  \nPlease enter your choice (1/2/3/0) : ");
			playerChoice = sc.nextInt();
			System.out.print("Computer Choice = " + computerChoice);
			System.out.println(" && Player Choice = " + playerChoice);
			if(playerChoice!=0) {
				if (computerChoice == playerChoice) {
					System.out.println("Draw");
				} else if ((computerChoice == 1 && playerChoice == 3) || (computerChoice == 2 && playerChoice == 1)
						|| (computerChoice == 3 && playerChoice == 2)) {
					numberOfComputerWin++;
					System.out.println("Computer Won");
					System.out.println("Score : Computer = " + numberOfComputerWin + " - Player = " + numberOfPlayerWin);
				}
				else if(playerChoice!=0&&playerChoice!=1&&playerChoice!=2&&playerChoice!=3){
					System.out.println("You entered incorrectly. You must choose one of the numbers 0,1,2 or 3.");
				} else {
					numberOfPlayerWin++;
					System.out.println("Player Won");
					System.out.println("Score : Computer = " + numberOfComputerWin + " - Player = " + numberOfPlayerWin);
				}
			}
		}while (playerChoice != 0);
		if(numberOfComputerWin==numberOfPlayerWin) System.out.println("Draw");
		else if (numberOfComputerWin>numberOfPlayerWin) System.out.println("Computer Won");
		else System.out.println("Player Won");
		System.out.println("Last Score : Computer = "+numberOfComputerWin+" Player = "+ numberOfPlayerWin);

	}}



