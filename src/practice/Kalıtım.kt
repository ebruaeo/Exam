package practice

open class Calisan {
    var SicilNo: Int
    var Ad: String
    var Soyad: String

    constructor(sicilNo: Int, ad: String, soyad: String) {
        SicilNo = sicilNo
        Ad = ad
        Soyad = soyad
    }
}

class Yazilimci(sicilNo: Int, ad: String, soyad: String) : Calisan(sicilNo, ad, soyad) {
    var ProjeninAdi: String? = null

}

class TemizlikGorevlisi(sicilNo: Int, ad: String, soyad: String) : Calisan(sicilNo, ad, soyad) {
    var GorevAlani: String? = null
}

open class Yonetici(sicilNo: Int, ad: String, soyad: String) : Calisan(sicilNo, ad, soyad) {
    var ekipListesi = arrayListOf<Calisan>()
}

class MudurYardimcisi(sicilNo: Int, ad: String, soyad: String, departman: String) : Yonetici(sicilNo, ad, soyad) {
    var sorumlulukAlani: String

    init {
        sorumlulukAlani = departman
    }
}

class Mudur(sicilNo: Int, ad: String, soyad: String, mudurluk: String) : Yonetici(sicilNo, ad, soyad) {
    var Mudurluk: String

    init {
        Mudurluk = mudurluk
    }
}