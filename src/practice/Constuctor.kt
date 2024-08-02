package practice


fun main() {
    var personelListesi = arrayListOf<Personel>()
    var personel = Personel("ali", null,"Can", "3456789",34567)
    personelListesi.add(personel)
    personel = Personel("ahmet", "sdr","Can", "3456789",34567)
    personelListesi.add(personel)

    for (p in personelListesi){
        p.bilgileriYazdir()
    }

}

class Personel {
    var ad: String
    var ikinciAd: String?
    var soyad: String
    var kimlikNo: String
    var sicilNo: Int

    constructor(ad: String, ikinciAd: String?, soyad: String, kimlikNo: String, sicilNo: Int) {
        this.ad = ad
        this.ikinciAd = ikinciAd
        this.soyad = soyad
        this.kimlikNo =kimlikNo
        this.sicilNo=sicilNo
    }

    fun bilgileriYazdir (){
        println("Ad: ${ad}")

        if (ikinciAd!= null) {
            println("ikinci ad: ${ikinciAd}")

        }
        println("Soyad: ${soyad}\nkimlik no: ${kimlikNo}\n sicil no ${sicilNo}\n")
    }


}