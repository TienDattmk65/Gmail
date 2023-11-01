package com.example.gmail

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var customAdapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = mutableListOf<OutData>()
        list.add(OutData(R.mipmap.image_c_round, "Edurila.com","12:34 PM","$19 Only (First 10 spots)...", "Are you looking to Learn Web Designin..."))
        list.add(OutData(R.mipmap.image_c_round, "Chris Abad","11:22 AM","Help make Cmapaign Monitor better...","Let us know your throughts! No Images..."))
        list.add(OutData(R.mipmap.image_m_round, "Matt from Ionic","11:04 AM","The New Ionic Creator Is Here...","Announcing the all-new Creator build..."))
        list.add(OutData(R.mipmap.image_q_round, "Query","10:26 AM","8h de formation gratuite et les nouvea...","SAS OVH -http://www.ovh.com.2 rue K..."))
        list.add(OutData(R.mipmap.image_y_round, "Ysela","10:05 AM","Societe Ovh: suivi de vos services-hp...", "Photoshop, SEO, Blender, CSS, World..."))
        list.add(OutData(R.mipmap.image_a_round, "Alicia","9:30 AM","Photoshop, SEO, Blender, CSS, World...","The New Ionic Creator Is Here..."))
        list.add(OutData(R.mipmap.image_c_round, "Edurila.com","9:02 AM","$19 Only (First 10 spots)...", "Are you looking to Learn Web Designin..."))
        list.add(OutData(R.mipmap.image_c_round, "Chris Abad","5:00 AM","Help make Cmapaign Monitor better...","Let us know your throughts! No Images..."))
        list.add(OutData(R.mipmap.image_m_round, "Matt from Ionic","12:00 PM","The New Ionic Creator Is Here...","Announcing the all-new Creator build..."))
        list.add(OutData(R.mipmap.image_q_round, "Query","10:30 PM","8h de formation gratuite et les nouvea...","SAS OVH -http://www.ovh.com.2 rue K..."))
        list.add(OutData(R.mipmap.image_y_round, "Ysela","8:35 PM","Societe Ovh: suivi de vos services-hp...", "Photoshop, SEO, Blender, CSS, World..."))
        list.add(OutData(R.mipmap.image_a_round, "Alicia","7:00 AM","Photoshop, SEO, Blender, CSS, World...","The New Ionic Creator Is Here..."))
        customAdapter = CustomAdapter(this, list)

        val listView = findViewById<ListView>(R.id.lView)
        listView.adapter = customAdapter




    }
}