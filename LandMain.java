package Exam01;

import java.util.ArrayList;
import java.util.Scanner;

public class LandMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LandDAO dao = new LandDAO();
//		ArrayList<LandDTO> list = new ArrayList<LandDTO>();

		ArrayList<LandDTO> list = dao.selectAll();

		for (int i = 0; i < list.size(); i++) {
			if (i % 8 == 0 || list.get(i).getLandNumber() == 4 || list.get(i).getLandNumber() == 13 || list.get(i).getLandNumber() == 22 || list.get(i).getLandNumber() == 27) {
				i++;
			}

			LandDTO m = list.get(i);
			System.out.println(i + ". " + m.getLandName());
		}
		int cnt = 1;
		System.out.print("�� ��ȣ �Է� : ");
		int input = sc.nextInt();
		for (int i= 0; i < list.size();i++){
			System.out.println(list.get(i).getLandName()+list.get(i).getLandNumber());
		}
		for (int i = 0; i < list.size(); i++) {

			if (i % 8 == 0 || list.get(i).getLandNumber() == 4 ||list.get(i).getLandNumber() == 13 ||list.get(i).getLandNumber() == 22 ||list.get(i).getLandNumber() == 27) {
				i++;
			}
			if (input == i) {

				LandDTO m = list.get(i);
				System.out.println("<< ���� ���� >>");
				System.out.println("����\t���װ���\t��������\tȣ�ڰ���\t�����\t��������\tȣ�ں�\t�μ����\t�����μ�\tȣ���μ�");
				System.out.println(m.toString());
			}

		}

	}
}
