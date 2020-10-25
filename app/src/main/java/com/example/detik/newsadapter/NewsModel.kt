package com.example.detikapp.newsadapter

import com.example.detik.R

data class news(var title: String, var desc:String, var photo:Int)

object NewsModel {
    val newsList = listOf<news>(
        news("Khabib Mau Bertarung, Conor McGregor Ikut Manas-manasin Kayak Gini.",
            "detik.com | 2 jam yang lalu", R.drawable.news1),
        news("MU Vs Chelsea: Duel Sesama Tim 'Ganjil'.",
            "detik.com | 3 jam yang lalu", R.drawable.news2),
        news("Kirim Pesan WhatsApp Sebelum Ajax Vs Liverpool, Van Dijk Bilang Begini.",
            "detik.com | 2 jam yang lalu", R.drawable.news3),
        news("Oezil Soal Situasi Dirinya di Arsenal, Begini Jawaban Arteta.",
            "detik.com | 2 jam yang lalu", R.drawable.news4),
        news("Klasemen Liga Champions Usai Matchday Pertama.",
            "detik.com | 2 jam yang lalu", R.drawable.news5)

    )
}