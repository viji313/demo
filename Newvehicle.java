package day1;

public class Newvehicle {
	public static void main(String[]args) {
		vehicle v=new vehicle();
		v.price=20000;
		v.disPercentage=10;
		v.discount=v.price*v.disPercentage/100;
		v.taxPercentage=10;
		v.taxAmt=v.price*v.taxPercentage/100;
		v.netPrice=v.price+v.taxAmt-v.discount;
		
		
		System.out.println("DISCOUNT="+v.discount+" "+"PRICE="+v.price+" "+"NETPRICE="+v.netPrice+"TAX AMOUNT"+v.taxAmt);
		}

}
