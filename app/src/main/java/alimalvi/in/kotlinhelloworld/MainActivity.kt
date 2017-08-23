package alimalvi.`in`.kotlinhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //You can directly write layout id here to set data using "apply plugin: 'kotlin-android-extensions'" plugin

        textView.text="Hey there this is Kotlin"
    }
}
