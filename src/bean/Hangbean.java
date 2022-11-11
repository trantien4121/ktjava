package bean;

public class Hangbean {
	private String Mahang;
	private String tenhang;
	private String nhacungcap;
	private long gia;
	private long soluong;
	private String anh;
	public String getMahang() {
		return Mahang;
	}
	public void setMahang(String mahang) {
		Mahang = mahang;
	}
	public String getTenhang() {
		return tenhang;
	}
	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}
	public String getNhacungcap() {
		return nhacungcap;
	}
	public void setNhacungcap(String nhacungcap) {
		this.nhacungcap = nhacungcap;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public long getSoluong() {
		return soluong;
	}
	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public Hangbean(String mahang, String tenhang, String nhacungcap, long gia, long soluong, String anh) {
		super();
		Mahang = mahang;
		this.tenhang = tenhang;
		this.nhacungcap = nhacungcap;
		this.gia = gia;
		this.soluong = soluong;
		this.anh = anh;
	}
	
}
