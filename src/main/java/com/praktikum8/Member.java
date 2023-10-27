package com.praktikum8;

public class Member extends Pelanggan {
    private String memberId;
    private String namaMember;
    private String alamatMember;

    public Member(
            String tanggal,
            String jam,
            String noTransaksi,
            String memberId,
            String namaMember,
            String alamatMember) {
        super(tanggal, jam, noTransaksi);
        this.memberId = memberId;
        this.namaMember = namaMember;
        this.alamatMember = alamatMember;
    }

    /**
     * Get the Id of the member.
     *
     * @return the Id of the member
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * Get the name of the member.
     *
     * @return the name of the member
     */
    public String getNamaMember() {
        return namaMember;
    }

    /**
     * Get the alamat of the member.
     *
     * @return the alamat of the member
     */
    public String get_alamatMember() {
        return alamatMember;
    }

    /**
     * Set the Id of the member.
     *
     * @param Id the new value of the Id of the member
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * Set the name of the member.
     *
     * @param name the new value of the name of the member
     */
    public void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    /**
     * Set the address of the member.
     *
     * @param address the new value of the address of the member
     */
    public void set_alamatMember(String alamatMember) {
        this.alamatMember = alamatMember;
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
        return (super.getData() + "\nMember ID : " +
                this.memberId +
                "\n" +
                "Nama Member : " +
                this.namaMember +
                "\n" +
                "Alamat Member : " +
                this.alamatMember);
    }
}
