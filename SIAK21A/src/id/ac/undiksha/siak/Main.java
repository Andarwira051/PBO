package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.Mahasiswa;

public class Main {

	public static void main(String[] args) {
		
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.setNama("Andar");
		mhs1.setNim("2115101051");
		mhs1.setAlamat("Seririt");
		mhs1.setJenisKelamin(true);
		mhs1.setProdi("Ilmu Komputer");
		mhs1.setJurusan("Teknik Informatika");
		mhs1.setFakultas("Teknik dan Kejuruan");
		
		mhs1.printAllInfo();
		
		Mahasiswa mhs2 = new Mahasiswa(
			"Budi",
			"21",
			"Singaraja",
			true,
			"Ilmu Komputer",
			"Teknik Informatika",
			"Fakultas Teknik dan Kejuruan"
		);
		
		mhs2.printAllInfo();
		
	}

}