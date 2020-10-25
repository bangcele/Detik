package com.example.detik

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.detik.newsadapter.NewsAdapter
import com.example.detikapp.newsadapter.NewsModel
import com.example.detikapp.newsadapter.news
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var headlinenews: news?
        if (NewsModel.newsList.size >0){
            headlinenews = NewsModel.newsList[NewsModel.newsList.size -1]
            tv_head_line.setText(headlinenews.title)
            tv_line_desc.setText(headlinenews.desc)
            img_news.setImageResource(headlinenews.photo)

            cdv_head_line.setOnClickListener {
                val intent_detail = Intent(this, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, headlinenews.title)
                        putExtra(DetailActivity.cont_PhotoNews, headlinenews.photo.toString())
                    }
                startActivity(intent_detail)
                finish()
            }
        }
        val layManager = LinearLayoutManager (this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_daftar_berita.layoutManager = layManager

        newsAdapter = NewsAdapter(this, NewsModel.newsList)
        rcv_daftar_berita.adapter = newsAdapter

        newsAdapter.setOnClickCallback(object : NewsAdapter.OnItemClickCallback{
            override fun onItemClick(data: news) {
                val intent= Intent (this@MainActivity, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, data.title.toString())
                        putExtra(DetailActivity.cont_PhotoNews, data.photo.toString())
                    }
                startActivity(intent)
                finish()
            }
        })
    }
}