package gew.sanjeevkumar.gautamew

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.nostra13.universalimageloader.core.ImageLoader
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration
import kotlinx.android.synthetic.main.activity_grid_view.*
import kotlinx.android.synthetic.main.activity_productactivity.*

class productactivity : AppCompatActivity() {
//    var arr=arrayOf("Fuse Box Acc Swaraj Mazda","Fuse Box Ape","Fuse Box Ashok Leyland","Fuse Box Bajaj CNG Model")
//    var imagesArray = intArrayOf(R.drawable.fuseboxape,R.drawable.fuseboxashokleyland,R.drawable.fuseboxaccswarajmazda,
//            R.drawable.fuseboxbajajcngmodel)
    var images= arrayOf("https://3.imimg.com/data3/BD/QT/MY-10779336/fb407-500x500.jpg"
        ,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_vT8kLt_RP6T51GfgautgbV66MS9o94g-zo_EvKflFkWwpUUI")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productactivity)
        var ImageLoaderConfiguration=ImageLoaderConfiguration.Builder(this).build()
        ImageLoader.getInstance().init(ImageLoaderConfiguration)
      var  adapter=ViewPagerAdapter(this@productactivity,images,ImageLoader.getInstance())
        viewPager.adapter=adapter
//        var customAdapter=customAdapter(this,imagesArray,arr)
//        grid.adapter=customAdapter
//
//        grid.setOnItemClickListener { adapterView, view, position, id ->
//            var intent = Intent(this, FullScreenActivity :: class.java)
//            intent.putExtra("position", position)
//            //intent.putExtra("position", imagesArray[position])
//            startActivity(intent)
//        }

        home.setOnClickListener{
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        products.setOnClickListener{
            var intent=Intent(this,productactivity::class.java)
            startActivity(intent)
            finish()
        }
        contact.setOnClickListener{
            var intent=Intent(this,ContactActivity::class.java)
            startActivity(intent)
            finish()
        }
        about.setOnClickListener{
            var intent=Intent(this,AboutActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
