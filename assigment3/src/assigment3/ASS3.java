package assigment3;

import java.util.Scanner;

public class ASS3 {

	public static void main(String[] args) {
		
		printInfo();
		printShop();
		printQuestionandReceipt();
		
	}
		
		public static void printInfo() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Lets me know you more!");
			System.out.println("What is your name? ");
			String name = sc.next();
			System.out.println("How old are you? ");
			int age = sc.nextInt();
			System.out.println("What is your ic number? ");
			int ic = sc.nextInt();
			System.out.println("What is your gender? ");
			char gender = sc.next().charAt(0);
			System.out.println("What is your phone number? ");
			int phone = sc.nextInt();
			System.out.println(" ");
			
			System.out.println("\nName: " + name);
			System.out.println("Age: " + age);
			System.out.println("Ic number: " + ic);
			System.out.println("Gender: " + gender);
			System.out.println("HP: " + phone);
			
						
		}
		
		public static void printShop() {
			
			System.out.println("\nWELCOME TO CUTIE SHOP!!");
			System.out.println("Do you interested in our shop?");
			System.out.println("What product provided in our shop you may ask?");
			String product = "PURFUME";
			System.out.println("\nOur shop sells " + product + " products");
			
			String sell[] = {"CITRUS","GOURMAND","FLORAL","FRUITY","SPICY","AQUATIC"};
			
			System.out.println("What "+ product +"?");
			System.out.println("\nWe sell "+ sell[0] +" for $170");
			System.out.println("We sell " + sell[1] +" for  $122");
			System.out.println("We sell "+ sell[2] +" for   $385");
			System.out.println("We sell "+ sell[3] +" for   $136");
			System.out.println("We sell "+ sell[4] +" for   $148");
			System.out.println("We sell "+ sell[5] +" for   $126");
			
		}
		
		public static void printQuestionandReceipt() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nThere would be some discounts that you will get if you buy our product.");
			System.out.println("\nWould you like to buy our products? (Y for yes / N for no)");
			char ans = sc.next().charAt(0);
			
			int q1=0, q2=0, q3=0, q4=0, q5=0, q6=0, q7=0, q8=0;
			double total = 0, price1=0, price2=0, price3=0, price4=0, price5=0, price6=0, price7=0, price8=0;
			String sell[] = {"CITRUS","GOURMAND","FLORAL","FRUITY","SPICY","AQUATIC"};
			
			if(ans == 'Y' || ans == 'y') {
				System.out.println("How much would you buy "+ sell[0] +"?");
				q1 = sc.nextInt();
				price1 = q1 * 170;
				System.out.println("How much would you buy "+ sell[1] +"?");
				q2 = sc.nextInt();
				price2 = q2 * 122;
				System.out.println("How much would you buy "+ sell[2] +"?");
				q3 = sc.nextInt();
				price3 = q3 * 385;
				System.out.println("How much would you buy "+ sell[3] +"?");
				q4 = sc.nextInt();
				price4 = q4 * 136;
				System.out.println("How much would you buy "+ sell[4] +"?");
				q5 = sc.nextInt();
				price5 = q5 * 148;
				System.out.println("How much would you buy "+ sell[5] +"?");
				q6 = sc.nextInt();
				price6 = q6 * 126;
				total = price1 + price2 + price3 + price4 + price5 + price6;
			}
			
			else if(ans == 'N' || ans == 'n') {
				System.out.println("\nThank you for visiting our shop ;)");
			}
					
			double discount = 0, dprice = 0;
			
			
			if ( total >= 200 ) {
				discount = total*25/100;
				dprice = total - discount;
			}	
			else if ( total > 100 || total < 200 ) {
				discount = total*15/100;
				dprice = total - discount;
			}
			else {
				discount = total*10/100;
				dprice = total - discount;
			}
			
			System.out.println(" ");
			
			int t=1;
			do {
				if (t>0)
					System.out.print("!");
				t++;
			} while(t<50);
			
			System.out.println("\nCUTIE SHOP!");
			System.out.println("\t\t\t\s\s\s\sQuantity\tprice");
			System.out.println("1.\t"+ sell[0] +":\t\t"+q1+"\t" + price1);
			System.out.println("2.\t"+ sell[1] +":\t\t"+q2+"\t" + price2);
			System.out.println("3.\t"+ sell[2] +":\t\t"+q3+"\t" + price3);
			System.out.println("4.\t"+ sell[3] +":\t\t"+q4+"\t" + price4);
			System.out.println("5.\t"+ sell[4] +":\t\t"+q5+"\t" + price5);
			System.out.println("6.\t"+ sell[5] +":\t\t"+q6+"\t" + price6);
			
		
			
			System.out.println(" ");
			int i=1, line=0;
			while (i <50) {
				i = line++;
				System.out.print("=");
			}
			System.out.println(" ");
			
			System.out.println("\nThe total price is:\t"+ total);
			System.out.println("Your discount will be:\t"+ discount);		
			System.out.println("Your price to be paid:\t"+ dprice);		
			
			System.out.println(" ");

			for(int e=1; e <50; e++) {
				System.out.print("=");
			}
			System.out.println(" ");
			
						
	}



	}


