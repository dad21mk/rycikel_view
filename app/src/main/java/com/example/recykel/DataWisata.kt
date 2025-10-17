package com.example.recykel

object DataWisata {
    private val wisataNames = arrayOf(
        "Wisata Pagubugan",
        "The Village Purwokerto",
        "Lorem Ipsum 1",
        "Gembira Loka Zoo Yogyakarta",
        "Candi Prambanan",
        "Malioboro",
        "Tugu Jogja",
        "Candi Borobudur",
        "Pantai Drini",
        "Kraton Yogyakarta",
        "Benteng Vredeburg",
        "Lereng Gunung Merapi",
        "Museum Pusat TNI AU Dirgantara Mandala"
    )


    private val wisataDescriptions = arrayOf(
        "Berada di lereng Gunung Slamet, wisata Pagubugan akan membawa Anda merasakan betapa tenang dan nyamannya berada di tengah persawahan dan bermain air di sungai. Eduwisata yang berada di Desa Melung ini memiliki berbagai spot wisata menarik yang akan memanjakan Anda. Mulai dari trek jogging, outbond, camping ground, sawah pelangi, taman kelinci, berbagai spot foto keren dan juga Grujugan Bengkok.Di Grujugan Bengkok ini Anda bisa mandi sepuasnya dan airnya sangat jernih, lho! Selain itu lintasan grujugan ini juga panjang, melewati persawahan dan tidak dalam, sehingga aman buat si kecil. Selain itu ada juga wisata bercocok tanam bagi anak paud, TK maupun SD yang berkunjung. Dan yang terbaru ada kolam renang di tengah persawahan yang aman untuk anak-anak.",
        "Berlokasi tak terlalu jauh dengan pusat kota Purwokerto, The Village hadir dengan gaya unik khas perkampungan Eropa. Bangunan tinggi besar menyerupai kastil dengan dinding bata langsung mencuri perhatian begitu melangkahkan kaki ke sini. Ada beragam aktivitas yang bisa Anda lakukan di sini: naik perahu mengitari kanal buatan di sekitar taman rekreasi, memberi makan aneka binatang (burung, kelinci, sapi, domba), menunggang kuda, foto-foto dengan kostum Belanda, dan masih banyak lagi!",
        "Berlokasi tak terlalu jauh dengan pusat kota Purwokerto, The Village hadir dengan gaya unik khas perkampungan Eropa. Bangunan tinggi besar menyerupai kastil dengan dinding bata langsung mencuri perhatian begitu melangkahkan kaki ke sini. Ada beragam aktivitas yang bisa Anda lakukan di sini: naik perahu mengitari kanal buatan di sekitar taman rekreasi, memberi makan aneka binatang (burung, kelinci, sapi, domba), menunggang kuda, foto-foto dengan kostum Belanda, dan masih banyak lagi!",
        "Kebun binatang Gembira Loka berisi berbagai macam spesies dari belahan dunia, seperti orang utan, gajah asia, simpanse, harimau, dan lain sebagainya.",
        "Candi Prambanan terletak 17 km ke arah timur dari pusat Kota Jogja dan bisa dijangkau dengan bus Trans Jogja",
        "Malioboro adalah jantung Kota Jogja. Tak heran bila banyak penginapan murah dekat Malioboro, meskipun sekarang banyak hotel berbintang.",
        "Tugu Jogja memendam makna filosofis tentang semangat perlawanan atas penjajahan dan kini menjadi landmark yang sangat lekat dengan Kota Jogja.",
        "Dibangun pada abad ke-9, Candi Borobudur sekarang menjadi magnet yang mampu menarik jutaan wisatawan setiap tahun.",
        "Sebuah pulau karang di bibir pantai membelah Pantai Drini menjadi dua bagian dengan karakter bertolak belakang. Sisi Timur yang tenang dan bagian Barat yang garang, membuat Pantai Drini menjadi sebuah pantai berkarakter ganda.",
        "Kraton Yogyakarta adalah istana kesultanan yang menyimpan banyak sejarah dan budaya Jawa. Di sini, kamu bisa melihat bangunan megah dengan arsitektur Jawa klasik, taman yang indah, dan berbagai koleksi benda pusaka. Kamu juga bisa menyaksikan pertunjukan budaya dan berbelanja oleh-oleh khas Yogyakarta.",
        "Benteng Vredeburg merupakan salah satu saksi bisu sejarah perjuangan bangsa Indonesia. Bangunan bersejarah ini menyimpan banyak cerita dan peristiwa penting yang pernah terjadi di Yogyakarta.",
        "Ada dua pilihan yang bisa kamu pilih untuk mengunjungi Gunung Merapi: mendakinya ataupun mengikuti  ke area Kaliadem di lereng Gunung Merapi.",
        "Museum Pusat TNI AU Dirgantara Mandala adalah destinasi wisata edukatif yang menarik bagi pecinta sejarah penerbangan dan militer. Terletak di kompleks Pangkalan Udara Adi Sutjipto, Yogyakarta, museum ini menyimpan berbagai koleksi pesawat terbang, senjata, dan memorabilia yang menceritakan perjalanan sejarah Angkatan Udara Republik Indonesia"
    )


    private val wisataImages = arrayOf(
        "https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2020/03/11-1-Bukit-Banda-by-lukman_banda-@-aldi_maulana_assegaf-740x411.jpg",
        "https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2020/03/18-1-by-@miftakhulmukhasin-@hengki_pamungkas-740x294.jpg",
        "https://indonesia.tripcanvas.co/id/wp-content/uploads/sites/2/2020/03/18-2-by-@ojiensarif-@donny_rahadian-@donny_rahadian-740x403.jpg",
        "https://lh3.googleusercontent.com/gps-cs-s/AC9h4npIvyJlq0XCWfpInGN1wx2yjR6CGk1LrptUlfWDB6X_fJL6J-jrrAStI-skwEAbdvZ-UgcZqOKbd3Y3fRU3KQDv-xLQUgc7gYROnlNwUo94lXTI5pvLoLywqmtJBr1wEu4Iynti3g=w270-h312-n-k-no",
        "https://www.yogyes.com/id/yogyakarta-tourism-object/candi/prambanan/1.jpg",
        "https://www.yogyes.com/id/yogyakarta-tourism-object/other/malioboro/1.jpg",
        "https://www.yogyes.com/id/yogyakarta-tourism-object/other/tugu-jogja/1.jpg",
        "https://www.yogyes.com/id/yogyakarta-tourism-object/candi/borobudur/1.jpg",
        "https://www.yogyes.com/id/yogyakarta-tourism-object/beach/drini/1.jpg",
        "https://raminten.com/wp-content/uploads/2023/11/kraton-jogja.jpg",
        "https://raminten.com/wp-content/uploads/2023/11/vedeburg.jpg",
        "https://res.klook.com/image/upload/fl_lossy.progressive,q_85/c_fill,w_1000/Gunung_Merapi_Jogja_-_Eugenia_Clara_on_Unsplash_dooqqi.webp",
        "https://raminten.com/wp-content/uploads/2023/11/museum-dirgantara.jpg"
    )


    val listData: ArrayList<Wisata>
        get() {
            val list = arrayListOf<Wisata>()
            for (position in wisataNames.indices) {
                val wisata = Wisata(
                    wisataNames[position],
                    wisataDescriptions[position],
                    wisataImages[position]
                )
                list.add(wisata)
            }
            return list
        }
}



