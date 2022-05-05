import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Bus[] bs = new Bus[n];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sc.nextLine();
			String c = sc.nextLine();
			String d = sc.nextLine();
			bs[i] = new Bus(a, b, c, d);
		}

		String ci = sc.nextLine();

		Bus ans1 = findBusWiCi(bs, ci);
		Bus ans2 = findBuWiMaxSea(bs);

		if (ans2 != null) {
			System.out.println("id-" + ans2.getId());
			System.out.println("seat-" + ans2.getSeats());
			System.out.println("colour-" + ans2.getColr());
			System.out.println("city-" + ans2.getCity());
		}

		if (ans1 != null) {
			System.out.println("id-" + ans1.getId());
			System.out.println("seat-" + ans1.getSeats());
			System.out.println("colour-" + ans1.getColr());
			System.out.println("city-" + ans1.getCity());
		} else {
			System.out.println("No Bus found with mentioned city.");
		}

		/*
		 * if(ans2!=null) { System.out.println("id-"+ans2.getId());
		 * System.out.println("seat-"+ans2.getSeats());
		 * System.out.println("colour-"+ans2.getColr());
		 * System.out.println("city-"+ans2.getCity()); }
		 * 
		 * else { System.out.println("No Bus found with mentioned city."); }
		 */

	}

	public static Bus findBusWiCi(Bus[] bs, String ci) {
		Bus ans = null;
		for (int i = 0; i < bs.length; i++) {
			if (bs[i].getCity().equalsIgnoreCase(ci)) {
				ans = bs[i];
			}
		}

		return ans;
	}

	public static Bus findBuWiMaxSea(Bus[] bs) {
		int max = -1;
		Bus ans = null;
		for (int i = 0; i < bs.length; i++) {
			if (bs[i].getSeats() > max) {
				max = bs[i].getSeats();
				ans = bs[i];
			}
		}

		return ans;
	}

}

class Bus {
	int id;
	int seats;
	String colr;
	String city;

	public Bus(int id, int seats, String colr, String city) {
		super();
		this.id = id;
		this.seats = seats;
		this.colr = colr;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getColr() {
		return colr;
	}

	public void setColr(String colr) {
		this.colr = colr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
