package id.ac.undiksha.siak.entities;

public class Pegawai {

	private String nama;
	private String alamat;
	private boolean jeniskelamin;// 0 perempuan, 1 laki-laki
	private String nip;
	private String unit;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public boolean isJeniskelamin() {
		return jeniskelamin;
	}
	public void setJeniskelamin(boolean jeniskelamin) {
		this.jeniskelamin = jeniskelamin;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

	
	
}
