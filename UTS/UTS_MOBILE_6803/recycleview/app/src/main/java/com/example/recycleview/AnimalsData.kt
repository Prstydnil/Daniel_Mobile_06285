package com.example.recycleview

object AnimalsData {
    private val animNames = arrayOf("anjing",
        "ayam",
        "hantu",
        "kelinci",
        "koala",
        "kura",
        "monyet",
        "musang",
        "musang_ekor9",
        "tupai",
        "zebra")

    private val animalDetails = arrayOf("anjing putih berumur 2 bulan.",
        "ayam begal membawa pisau untuk membantai orang",
        "Burung hantu yang kesakitan",
        "Kelinci imut yang ketemu di halaman belakang",
        "Koala hewan yang  sering tidur",
        "kura-kura kecil dan imut yang ditinggal ibunya",
        "Ekpresi monyet yang kegirangan setelah mandi",
        "Musang biasa",
        "Ini baru musang luar biasa",
        "Sandi si Tupai",
        "Zebra nyengir")

    private val animalsImages = intArrayOf(R.drawable.anjing,
        R.drawable.ayam,
        R.drawable.hantu,
        R.drawable.kelinci,
        R.drawable.koala,
        R.drawable.kura,
        R.drawable.monyet,
        R.drawable.musang,
        R.drawable.musang_ekor9,
        R.drawable.tupai,
        R.drawable.zebra)

    val listData: ArrayList<Animals>
        get() {
            val list = arrayListOf<Animals>()
            for (position in animNames.indices) {
                val animals = Animals()
                animals.name = animNames[position]
                animals.detail = animalDetails[position]
                animals.photo = animalsImages[position]
                list.add(animals)
            }
            return list
        }
}