package com.example.pablopicasso

import android.app.DownloadManager
import android.app.VoiceInteractor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_list.*
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class MainActivity : AppCompatActivity() {
    var users: ArrayList<String> = ArrayList()
    private var client = OkHttpClient()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getUserList()


    }
    private fun getUserList(){
        _imageRecyclerView.visibility = View.VISIBLE
        _imageRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val versions = ArrayList<ItemOfList>()
        versions.addAll(ItemOfList.getAndroidVersionList())
        val Adap = ItemAdapter(versions)
        _imageRecyclerView.adapter = Adap
    }
}
