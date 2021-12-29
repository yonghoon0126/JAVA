package jang_4;

import java.util.Scanner;

public class GoodsArray {

	public static void main(String[] args) {

		Goods2[] goodsArray;
		goodsArray = new Goods2[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("[제품 가격 제고량 판매량] 입력 : ");

		for (int i = 0; i < goodsArray.length; i++) {
			String name = sc.next();
			int price = sc.nextInt();
			int numberOfStock = sc.nextInt();
			int sold = sc.nextInt();
			goodsArray[i] = new Goods2(name, price, numberOfStock, sold);
		}
		System.out.println();
		for (int i = 0; i < goodsArray.length; i++) {
			System.out.print(goodsArray[i].getName() + " ");
			System.out.print(goodsArray[i].getPrice() + " ");
			System.out.print(goodsArray[i].getNumberOfStock() + " ");
			System.out.print(goodsArray[i].getSold() + " ");
		}

	}

};

class Goods2 {

	private String name;
	private int price;
	private int numberOfStock;
	private int sold;

	public Goods2(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;

	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	int getNumberOfStock() {
		return numberOfStock;
	}

	int getSold() {
		return sold;
	}

}