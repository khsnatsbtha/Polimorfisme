/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Thinkpad
 */
public class Main {
    public static void main(String[] argv) {
        Pegawai p = new Pegawai();

        p = new Programmer();
        p = new Manajer();

        Manajer m = new Manajer();

        m.gajiPokok = 5000000;
        m.nama = "Bitha";
        m.tunjangan = 5000;

        p = m;
        p.tampilData();

        m.tampilData();

        Pegawai[] arrPeg = new Pegawai[3];

        Programmer pr = new Programmer();
        pr.nama = "Rona";
        pr.gajiPokok = 5000000;
        pr.bonus = 150000;

        arrPeg[0] = pr;
        arrPeg[1] = m;
        arrPeg[2] = new Programmer();

        arrPeg[0].tampilData();
        arrPeg[1].tampilData();

        hitungGajiTotal(m);
        hitungGajiTotal(pr);
    }

    public static void hitungGajiTotal(Pegawai p) {
        if (p instanceof Programmer) {
            Programmer prog = (Programmer) p;
            int gajiTot = prog.bonus + prog.gajiPokok;
            System.out.println("Gaji Total Programmer = " + gajiTot);
        } else if (p instanceof Manajer) {
            Manajer man = (Manajer) p;
            int gajiTot = man.tunjangan + man.gajiPokok;
            System.out.println("Gaji Total Manajer = " + gajiTot);
        }
    }
}