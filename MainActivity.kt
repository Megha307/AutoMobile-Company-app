package gew.sanjeevkumar.gautamew

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import gew.sanjeevkumar.gautamew.R.id.home
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
