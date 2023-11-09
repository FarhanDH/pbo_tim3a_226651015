package com.praktikum10;

public class StringOperasi {
    public static void main(String[] args) {
        StringBuilder str3 = new StringBuilder("Prodi D4 TIM");
        String str1 = "Politeknik Negeri Samarinda";
        String str2 = "Jurusan Teknologi Informasi";

        // method equals
        System.out.println("Str1 dan Str2 apakah memiliki karakter yang sama? " + str1.equals(str2));

        // mehtod length
        System.out.println("Jumlah karakter dari str1 adalah: " + str1.length());
        System.out.println("Jumlah karakter dari str2 adalah: " + str2.length());

        // method chatAt()
        System.out.println("Karakter ke 7 dari str1 adalah: " + str1.charAt(6));

        // method compareTo()
        System.out.println("Membandingkan str1 dengan str2: " + str1.compareTo(str2));

        // method indexOf()
        System.out.println("str1 ada di dalam str2? " + str1.indexOf(str2));

        // method substring()
        System.out.println("mengambil string dari index 3 sampai 10: " + str1.substring(3, 10));

        // method concat()
        System.out.println("gabungkan str1 dan str2: \n " + str1.concat("\n" + str2));

        // method replace()
        System.out.println("mengganti karakter a dengan i : " + str1.replace("a", "i"));

        // method toUpperCase()
        System.out.println("merubsh menjadi huruf besar : " + str1.toUpperCase());

        // method toLowerCase()
        System.out.println("merubah menjadi huruf kecil : " + str1.toLowerCase());

        // method trim()
        System.out.println("menghilangkan spasi kosong : " + str1.trim());

        // method append()
        System.out.println("menambahkan string ke string buffer : " + str3.append(" " + str1));

        // method setLength()
        str3.setLength(5);
        System.out.println(("sesudah di ubah ukuran menjadi 5 maka stringnya adalah : " + str3));

        // method insert()
        str3.insert(5, " Satu Keluarga");
        System.out.println("sesudah sisipkan string maka stringnya adalah : " + str3);

        // method setChart()
        str3.setCharAt(1, 'y');
        System.out.println("sesudah karakter index 1 di ganti dengan 'r' maka stringnya adalah: " + str3);

        // method delCharAt()
        str3.deleteCharAt(1);
        System.out.println("sesudah karakter index 1 di hapus maka stringnya adalah: " + str3);
    }
}
