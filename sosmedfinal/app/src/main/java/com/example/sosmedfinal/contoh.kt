import org.w3c.dom.Comment

data class contoh(
    val username: String,
    val profil: String,
    val like : Int,
    val favorite: Int,
    val post : String

)

object AppObject {

     val profil1 = contoh(
             "Billie Ellish Nganjuk",
            "https://pict.sindonews.net/dyn/850/pena/news/2021/11/15/187/599625/heboh-billie-eilish-lahir-di-nganjuk-jawa-timur-ini-faktanya-fep.jpg",
            12,
            20,
         "https://cdns.klimg.com/resized/1200x600/p/photonews/9-potret-editan-billie-eilish-jadi-oran-273cf0.jpg"
        )

        val profil2 = contoh(
            "DeonKT",
            "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQ6ZRX_uoF1w0RrryJ5uOcVbcyH--EdHElNfRiZESFP04SxsWWV4kXN_-_oXmkLzzdVNP8DkwOcZusq5f_LqahCtQ",
            800,
            100,
            "https://i.ytimg.com/vi/q0a_Wi6gR9I/sddefault.jpg"
        )
       val profil3 =  contoh(
            "Azriell",
            "https://i.ytimg.com/vi/q0a_Wi6gR9I/sddefault.jpg",
            300,
            250,
           "https://i.guim.co.uk/img/media/90ff1698442d87eca82543940f9955845085c9ff/0_448_6720_4032/master/6720.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=ea9cdf9043142da71cc92b698e071f18"
        )

    val profil4 =  contoh(
        "Nourmann",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSx9H6WSAhZHDQaHJqhZ_YVS0m7WLsc75U_hA&s",
        20,
        220,
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwYnYgyD9xNFmS23cDZdrPJGJAi4A4Y5UBnw&s"
    )

}

