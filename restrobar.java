package com;

import java.util.Scanner;

public class restrobar {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		do {
			System.out.println("\t\t\tWELCOME TO THE  RESTROBAR");
			System.out.println("\t\t\tWHAT DO YOU PREFARE \n1.LIQUORS \nOR \n2.FOOD ");
			int items = sc.nextInt();

			switch (items) {
			case 1: {
				System.out.println("1.BEER\n2.WHISKY\n3.BRANDY\n4.RUM");
				int liquors = sc.nextInt();
				switch (liquors) {
				case 1: {
					System.out.println("SELECT THE BRAND\n1.BUDWISER\n2.KINGFISHER\n3.BRITHISHEMPIRE");
					int beer = sc.nextInt();
					double per_beer = 400;
					Thread.sleep(2000);
					System.out.println("SELECT THE QUANTITY");
					int qty = sc.nextInt();
					double payment = per_beer * qty;
					System.out.println(payment);
					System.out.print("1.Place the order\n2.Cancel");
					int user_wish = sc.nextInt();

					if (user_wish == 1) {
						System.out.println("PAYMENT MODE\n1.GPAY\n2.PHONEPE\n3.PAYTM");
						int pay = sc.nextInt();
						Thread.sleep(1000);
						System.out.println("YOUR ONE TIME PSW");
						int otp = (int) (Math.random() * 9999 + 9999);
						System.out.println(otp);
						System.out.println("ENTER YOUR OTP...");
						int onetp = sc.nextInt();
						Thread.sleep(2000);
						if (otp == onetp) {
							System.out.println("YOUR OTP IS CORRECT");
						} else {
							System.out.println("YOUR OTP IS WORNG PLEASE ENTER CORRECT OTP");
							onetp = sc.nextInt();
						}

						Thread.sleep(2000);
						System.out.println("YOU ORDER IS PREPARING");
						Thread.sleep(2000);
						System.out.println("THANKS FOR WAITING YOUR ORDER IS PLACED HAVE A NICE DAY!");
					} else {
						System.out.println("YOUR ORDER HAS CANCELED");
						System.out.println("THANKYOU FOR VISITING ");
					}
					break;
				}
				case 2: {
					System.out.println("SELECT THE BRAND\n1.AFTERDARK\n2.ROYAL_CHALLENAGE\n3.BLACK_DOG");
					int whisky = sc.nextInt();
					double per_whisky = 1200;
					Thread.sleep(2000);
					System.out.println("SELECT THE QUANTITY");
					int qty = sc.nextInt();
					double payment = per_whisky * qty;
					System.out.println(payment);
					System.out.print("1.Place the order\n2.Cancel");
					int user_wish = sc.nextInt();

					if (user_wish == 1) {
						System.out.println("PAYMENT MODE\n1.GPAY\n2.PHONEPE\n3.PAYTM");
						int pay = sc.nextInt();
						Thread.sleep(1000);
						System.out.println("YOUR ONE TIME PSW");
						int otp = (int) (Math.random() * 9999 + 9999);
						System.out.println(otp);
						System.out.println("ENTER YOUR OTP...");
						int onetp = sc.nextInt();
						Thread.sleep(2000);
						if (otp == onetp) {
							System.out.println("YOUR OTP IS CORRECT");
						} else {
							System.out.println("YOUR OTP IS WORNG PLEASE ENTER CORRECT OTP");
							onetp = sc.nextInt();
						}

						Thread.sleep(2000);
						System.out.println("YOU ORDER IS PREPARING");
						Thread.sleep(2000);
						System.out.println("THANKS FOR WAITING YOUR ORDER IS PLACED HAVE A NICE DAY!");
					} else {
						System.out.println("YOUR ORDER HAS CANCELED");
						System.out.println("THANKYOU FOR VISITING ");
					}
					break;
				}
				case 3: {
					System.out.println("SELECT THE BRAND\n1.1848\n2.KING_LOIUS\n3.HONNEY_DAY");
					int brandy = sc.nextInt();
					double per_brandy = 800;
					Thread.sleep(2000);
					System.out.println("SELECT THE QUANTITY");
					int qty = sc.nextInt();
					double payment = per_brandy * qty;
					System.out.println(payment);
					System.out.print("1.Place the order\n2.Cancel");
					int user_wish = sc.nextInt();

					if (user_wish == 1) {
						System.out.println("PAYMENT MODE\n1.GPAY\n2.PHONEPE\n3.PAYTM");
						int pay = sc.nextInt();
						Thread.sleep(1000);
						System.out.println("YOUR ONE TIME PSW");
						int otp = (int) (Math.random() * 9999 + 9999);
						System.out.println(otp);
						System.out.println("ENTER YOUR OTP...");
						int onetp = sc.nextInt();
						Thread.sleep(2000);
						if (otp == onetp) {
							System.out.println("YOUR OTP IS CORRECT");
						} else {
							System.out.println("YOUR OTP IS WORNG PLEASE ENTER CORRECT OTP");
							onetp = sc.nextInt();
						}

						Thread.sleep(2000);
						System.out.println("YOU ORDER IS PREPARING");
						Thread.sleep(2000);
						System.out.println("THANKS FOR WAITING YOUR ORDER IS PLACED HAVE A NICE DAY!");
					} else {
						System.out.println("YOUR ORDER HAS CANCELED");
						System.out.println("THANKYOU FOR VISITING ");
					}
					break;
				}
				case 4: {
					System.out.println("SELECT THE RUM\n1.OLD_MONK\n2.BACARDI\n3.COCO_RUM");
					int rum = sc.nextInt();
					double per_rum = 900;
					Thread.sleep(2000);
					System.out.println("SELECT THE QUANTITY");
					int qty = sc.nextInt();
					double payment = per_rum * qty;
					System.out.println(payment);
					System.out.print("1.Place the order\n2.Cancel");
					int user_wish = sc.nextInt();

					if (user_wish == 1) {
						System.out.println("PAYMENT MODE\n1.GPAY\n2.PHONEPE\n3.PAYTM");
						int pay = sc.nextInt();
						Thread.sleep(1000);
						System.out.println("YOUR ONE TIME PSW");
						int otp = (int) (Math.random() * 9999 + 9999);
						System.out.println(otp);
						System.out.println("ENTER YOUR OTP...");
						int onetp = sc.nextInt();
						Thread.sleep(2000);
						if (otp == onetp) {
							System.out.println("YOUR OTP IS CORRECT");
						} else {
							System.out.println("YOUR OTP IS WORNG PLEASE ENTER CORRECT OTP");
							onetp = sc.nextInt();
						}

						Thread.sleep(2000);
						System.out.println("YOU ORDER IS PREPARING");
						Thread.sleep(2000);
						System.out.println("THANKS FOR WAITING YOUR ORDER IS PLACED HAVE A NICE DAY!");
					} else {
						System.out.println("YOUR ORDER HAS CANCELED");
						System.out.println("THANKYOU FOR VISITING ");
					}
				}
				default:
					System.out.println("ITEMS IS NOT AVALIABLE SORRY AND THANKS FOR COMING");
				}
				break;
			}
			case 2: {
				System.out.println("1.VEG\n2.NON-VEG");
				int food = sc.nextInt();

				switch (food) {
				case 1: {
					System.out.println("ONLY VEG_MEALS IS AVALIABLE");
					double per_food = 160;
					Thread.sleep(2000);
					System.out.println("SELECT THE QUANTITY");
					int qty = sc.nextInt();
					double payment = per_food * qty;
					System.out.println(payment);
					System.out.print("1.Place the order\n2.Cancel");
					int user_wish = sc.nextInt();

					if (user_wish == 1) {
						System.out.println("PAYMENT MODE\n1.GPAY\n2.PHONEPE\n3.PAYTM");
						int pay = sc.nextInt();
						Thread.sleep(1000);
						System.out.println("YOUR ONE TIME PSW");
						int otp = (int) (Math.random() * 9999 + 9999);
						System.out.println(otp);
						System.out.println("ENTER YOUR OTP...");
						int onetp = sc.nextInt();
						Thread.sleep(2000);
						if (otp == onetp) {
							System.out.println("YOUR OTP IS CORRECT");
						} else {
							System.out.println("YOUR OTP IS WORNG PLEASE ENTER CORRECT OTP");
							onetp = sc.nextInt();
						}

						Thread.sleep(2000);
						System.out.println("YOU ORDER IS PREPARING");
						Thread.sleep(2000);
						System.out.println("THANKS FOR WAITING YOUR ORDER IS PLACED HAVE A NICE DAY!");
					} else {
						System.out.println("YOUR ORDER HAS CANCELED");
						System.out.println("THANKYOU FOR VISITING ");
					}
					break;
				}
				case 2: {
					System.out.println("ONLY NON VEG_MEALS IS AVALIABLE");
					double per_food = 160;
					Thread.sleep(2000);
					System.out.println("SELECT THE QUANTITY");
					int qty = sc.nextInt();
					double payment = per_food * qty;
					System.out.println(payment);
					System.out.print("1.Place the order\n2.Cancel");
					int user_wish = sc.nextInt();

					if (user_wish == 1) {
						System.out.println("PAYMENT MODE\n1.GPAY\n2.PHONEPE\n3.PAYTM");
						int pay = sc.nextInt();
						Thread.sleep(1000);
						System.out.println("YOUR ONE TIME PSW");
						int otp = (int) (Math.random() * 9999 + 9999);
						System.out.println(otp);
						System.out.println("ENTER YOUR OTP...");
						int onetp = sc.nextInt();
						Thread.sleep(2000);
						if (otp == onetp) {
							System.out.println("YOUR OTP IS CORRECT");
						} else {
							System.out.println("YOUR OTP IS WORNG PLEASE ENTER CORRECT OTP");
							onetp = sc.nextInt();
						}

						Thread.sleep(2000);
						System.out.println("YOU ORDER IS PREPARING");
						Thread.sleep(2000);
						System.out.println("THANKS FOR WAITING YOUR ORDER IS PLACED HAVE A NICE DAY!");
					} else {
						System.out.println("YOUR ORDER HAS CANCELED");
						System.out.println("THANKYOU FOR VISITING ");
					}
					break;
				}
				default:
					System.out.println("SORRY ONLY GIVEN ITEMS IS AVAILABLE");
				}
			}

			}
			Thread.sleep(5000);
		} while (true);
	}
}
