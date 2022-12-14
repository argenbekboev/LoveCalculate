package com.example.lessonnumder.lovemodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lessonnumder.databinding.ActivityMainBinding
import com.example.lessonnumder.lovemodel.App
import com.example.lessonnumder.lovemodel.ResultActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            btnCalculate.setOnClickListener {
                App.api.calculateLove(etFname.text.toString(), etSname.text.toString()).enqueue(object : Callback<LoveModel>{
                    override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                        if (response.isSuccessful){
                            val intent = Intent(this@MainActivity,ResultActivity::class.java)
                            intent.putExtra("data",response.body())
                            startActivity(intent)
                            Log.e("ololo","onResponse: ${response.body()?.persentage}",)
                        }
                    }

                    override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                        Log.e("ololo","onFailure: ${t.message}")
                    }

                })
            }
        }

    }

}