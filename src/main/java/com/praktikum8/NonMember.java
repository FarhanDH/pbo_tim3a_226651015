package com.praktikum8;

public class NonMember extends Pelanggan {
    private String tempId;

    public NonMember(
            String tanggal,
            String jam,
            String noTransaksi,
            String tempId) {
        super(tanggal, jam, noTransaksi);
        this.tempId = tempId;
    }

    /**
     * Get the temp id of the member.
     *
     * @return the temp id of the member
     */
    public String getTempId() {
        return tempId;
    }

    /**
     * Set the temp Id of the member.
     *
     * @param temp Id the new value of the temp Id of the member
     */
    public void setTempId(String tempId) {
        this.tempId = tempId;
    }

    /**
     * Override the getData method from super class (Pelanggan class).
     * 
     * Returns the all datas of the member.
     *
     * @return the data of the member as a string
     */
    @Override
    public String getData() {
        return (super.getData() + "\nTemp ID : " + this.tempId);
    }
}
