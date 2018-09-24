package gew.sanjeevkumar.gautamew

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class customAdapter(ProductActivity:productactivity,var imagesArray:IntArray, var namearray: Array<String> ): BaseAdapter() {
    var context : Context = ProductActivity

    var layoutInflater : LayoutInflater
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view = layoutInflater.inflate(R.layout.activity_grid_view, p2, false)
        var customImageView = view!!.findViewById<ImageView>(R.id.customImageView)
        var customtextview=view!!.findViewById<TextView>(R.id.customtextview)
        customImageView.setImageResource(imagesArray[p0])
        customtextview.text=namearray[p0]

        return view
    }

    override fun getItem(p0: Int): Any {
return imagesArray[p0]
    }

    override fun getItemId(p0: Int): Long {
return imagesArray[p0].toLong()
    }

    override fun getCount(): Int {
return imagesArray.size
    }
    init {
        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }
}