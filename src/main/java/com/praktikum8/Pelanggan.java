package com.praktikum8;

public class Pelanggan {
    private String tanggal;
    private String jam;
    private String noTransaksi;

    public Pelanggan(String tanggal, String jam, String noTransaksi) {
        this.tanggal = tanggal;
        this.jam = jam;
        this.noTransaksi = noTransaksi;
    }

    /**
     * Get the date of the member.
     *
     * @return the date of the member
     */
    public String getTanggal() {
        return tanggal;
    }

    /**
     * Get the time of the member.
     *
     * @return the time of the member
     */
    public String getJam() {
        return jam;
    }

    /**
     * Get the number of the transaction of the member.
     *
     * @return the number of the transaction of the member
     */
    public String getNoTransaksi() {
        return noTransaksi;
    }

    /**
     * Set the date of the member.
     *
     * @param date the new value of the date of the member
     */
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * Set the time of the member.
     *
     * @param time the new value of the time of the member
     */
    public void setJam(String jam) {
        this.jam = jam;
    }

    /**
     * Set the number of the transaction of the member.
     *
     * @param number of the transaction the new value of the number of the
     *               transaction of the member
     */
    public void setNoTransaksi(String noTransaksi) {
        this.noTransaksi = noTransaksi;
    }

    /**
     * Returns the all datas of the member.
     *
     * @return the data of the member as a string
     */
    public String getData() {
        return ("Data Pelanggan : " +
                "\n" + "Tanggal : " +
                this.tanggal +
                "\n" +
                "Jam : " +
                this.jam +
                "\n" +
                "No Transaksi : " +
                this.noTransaksi);
    }
}
