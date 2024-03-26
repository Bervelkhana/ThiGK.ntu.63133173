package thigk.demo.Models;

public class SinhVien {
	private String maSoSV;
	private String hoVaTen;
    private String diemSo;
	public String getMaSoSV() {
		return maSoSV;
	}
	public void setMaSoSV(String maSoSV) {
		this.maSoSV = maSoSV;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getDiemSo() {
		return diemSo;
	}
	public void setDiemSo(String diemSo) {
		this.diemSo = diemSo;
	}

	public SinhVien() {
		super();
	}
	
	public SinhVien(String maSoSV, String hoVaTen, String diemSo) {
		this.maSoSV = maSoSV;
		this.hoVaTen = hoVaTen;
		this.diemSo = diemSo;
	}
	
	
}
