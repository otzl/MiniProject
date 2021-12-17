package Exam01;

public class LandDTO {

	// �����ͺ��̽��� ǥ���ϱ����� ����� ������ VO Ŭ�����̴�
	// VO Ŭ���� -> Value Object(����� ������ Ŭ����)
	private String landName;
	private int price;
	private int building;
	private int hotel;
	private int pass;
	private int passBuiliding;
	private int passHotel;
	private int interceptPrice;
	private int interceptPrice2;
	private int interceptPrice3;
	private int landNumber;

	public LandDTO(int landNumber, String landName, int price, int building, int hotel, int pass, int passBuiliding, int passHotel,
			int interceptPrice, int interceptPrice2, int interceptPrice3 ) {
		this.landName = landName;
		this.price = price;
		this.building = building;
		this.hotel = hotel;
		this.pass = pass;
		this.passBuiliding = passBuiliding;
		this.passHotel = passHotel;
		this.interceptPrice = interceptPrice;
		this.interceptPrice2 = interceptPrice2;
		this.interceptPrice3 = interceptPrice3;
		this.landNumber = landNumber;
	}

	public int getLandNumber() {
		return landNumber;
	}

	public void setLandNumber(int landNumber) {
		this.landNumber = landNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLandName() {
		return landName;
	}

	public int getBuilding() {
		return building;
	}

	public int getHotel() {
		return hotel;
	}

	public int getPass() {
		return pass;
	}

	public int getPassBuiliding() {
		return passBuiliding;
	}

	public int getPassHotel() {
		return passHotel;
	}

	public int getInterceptPrice() {
		return interceptPrice;
	}

	public int getInterceptPrice2() {
		return interceptPrice2;
	}

	public int getInterceptPrice3() {
		return interceptPrice3;
	}

	public String toString() {
		return landName + "\t" + price + "��\t" + building + "��\t" + hotel + "��\t" + pass + "��\t" + passBuiliding
				+ "��\t" + passHotel + "��\t" + interceptPrice + "��\t" +
				 interceptPrice2 + "��\t" + interceptPrice3+"��" ;
	}

}
