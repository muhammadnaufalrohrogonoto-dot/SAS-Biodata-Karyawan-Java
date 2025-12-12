interface Kinerja {
    void deskripsiKerja();
}

class Pegawai {
    private final String nama;
    private final int usia;
    private final String jabatan;

    public Pegawai(String nama, int usia, String jabatan) {
        this.nama = nama;
        this.usia = usia;
        this.jabatan = jabatan;
    }

    public String getNama() { return nama; }
    public int getUsia() { return usia; }
    public String getJabatan() { return jabatan; }
}

class PegawaiTetap extends Pegawai implements Kinerja {
    public PegawaiTetap(String nama, int usia, String jabatan) {
        super(nama, usia, jabatan);
    }

    @Override
    public void deskripsiKerja() {
        System.out.println("Pegawai tetap bekerja full-time dan memiliki tunjangan.");
    }
}

class PegawaiKontrak extends Pegawai implements Kinerja {
    public PegawaiKontrak(String nama, int usia, String jabatan) {
        super(nama, usia, jabatan);
    }

    @Override
    public void deskripsiKerja() {
        System.out.println("Pegawai kontrak bekerja sesuai durasi perjanjian.");
    }
}

public class Main {
    public static void main(String[] args) {

        PegawaiTetap p1 = new PegawaiTetap("Cristiano Ronaldo", 40, "CEO");
        PegawaiKontrak p2 = new PegawaiKontrak("Lionel Messi", 38, "Staff Admin");

        System.out.println("=== Biodata Pegawai Tetap ===");
        System.out.println("Nama    : " + p1.getNama());
        System.out.println("Usia    : " + p1.getUsia());
        System.out.println("Jabatan : " + p1.getJabatan());
        p1.deskripsiKerja();

        System.out.println();

        System.out.println("=== Biodata Pegawai Kontrak ===");
        System.out.println("Nama    : " + p2.getNama());
        System.out.println("Usia    : " + p2.getUsia());
        System.out.println("Jabatan : " + p2.getJabatan());
        p2.deskripsiKerja();
    }
}
