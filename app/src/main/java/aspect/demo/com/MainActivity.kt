package aspect.demo.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        test()

        mTvClick.setOnClickListener {
//            App.debug = false
//
//            test()
        }


    }


    @Debug
    fun test() {
        Toast.makeText(this, "no debug", Toast.LENGTH_LONG).show()
    }
}
