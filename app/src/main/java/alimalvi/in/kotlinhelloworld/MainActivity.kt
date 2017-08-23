package alimalvi.`in`.kotlinhelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Steps for Install & Configure Kotlin


      /*1. Goto File-> Settings -> in Plugin section write Kotlin in search bar -> click install -> after installation restart Android Studio -> Done.
        2. For Configure Kotlin :
        First Create Project ->  in MainActivity press Ctrl+Shift+A -> in search bar write "Convert java file to Kotlin" ->
        Select Convert java file to kotlin file -> Goto Tools-> Kotlin -> Configure Kotlin in Project -> Select latest version
        of Kotlin Compiler and Runtime version and click ok -> Sync Now -> Done.*/


        //You can directly write layout id here to set data using "apply plugin: 'kotlin-android-extensions'" plugin

        textView.text="Hey there this is Kotlin"
    }
}
