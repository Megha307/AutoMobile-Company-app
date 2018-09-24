package gew.sanjeevkumar.gautamew

import android.app.Activity
import android.content.Context
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.nostra13.universalimageloader.core.ImageLoader
import java.util.*

class ViewPagerAdapter: PagerAdapter {

    var activity:Activity?=null
    var images:Array<String>?=null
    var imageLoader:ImageLoader?=null
    var inflater:LayoutInflater?=null

    constructor(activity: Activity?, images: Array<String>, imageLoader: ImageLoader?) : super() {
        this.activity = activity
        this.images = images
        this.imageLoader = imageLoader
       
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
       return view==`object`
    }

    override fun getCount(): Int {
       return images!!.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        inflater= activity!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var itemView=inflater!!.inflate(R.layout.viewpager_layout,container,false)
       var imageview=itemView.findViewById<ImageView>(R.id.imageView)
        imageLoader!!.displayImage(images!![position],imageview)
        container.addView(itemView)
        return itemView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(View(`object` as Context?))
    }
}




