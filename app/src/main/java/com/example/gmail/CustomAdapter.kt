package com.example.gmail

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(val activity: Activity, val list:List<OutData>): ArrayAdapter<OutData>(activity, R.layout.list_item_view) {
    override fun getCount(): Int {
        return list.size //vẽ tất cả các dòng của list
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val context = activity.layoutInflater// layouInflater là component giúp chuyển đổi layout xml thành view
        val rowView = context.inflate(R.layout.list_item_view, parent, false)

        val images = rowView.findViewById<ImageView>(R.id.images)
        val title = rowView.findViewById<TextView>(R.id.title)
        val thoigian = rowView.findViewById<TextView>(R.id.thoigian)
        val desc = rowView.findViewById<TextView>(R.id.desc)
        val desc2 = rowView.findViewById<TextView>(R.id.desc2)

        title.text = list[position].title
        thoigian.text = list[position].thoigian
        desc.text = list[position].desc
        desc2.text = list[position].desc2
        images.setImageResource(list[position].image)

        return rowView
    }
}