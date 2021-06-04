package Advance.dev;

public class Student {
	private String ten, diachi, sdt;
	private int tuoi;
	private double dtb;
	public Student(String ten, int tuoi, String diachi, String sdt, double dtb) {
		this.ten = ten;
		this.diachi = diachi;
		this.tuoi = tuoi;
		this.sdt = sdt;
		this.dtb = dtb;
	}
	@Override
	public String toString() {
		return "Student Ten: " + ten + "\t diachi: " + diachi + "\t sdt: " + sdt + "\t tuoi: " + tuoi + "\t dtb: " + dtb;
	}
	
}
