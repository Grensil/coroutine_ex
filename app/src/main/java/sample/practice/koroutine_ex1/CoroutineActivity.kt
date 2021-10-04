package sample.practice.koroutine_ex1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class CoroutineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        coroutine()
    }
    fun coroutine()
    {

        CoroutineScope(Dispatchers.Main).launch {

            val html = CoroutineScope(Dispatchers.Default).async {

            }.await()

            val mTextMain = findViewById<TextView>(R.id.mTextMain)
            mTextMain.text = html.toString()

        }


    }
    fun getHtml() {

    }

    fun getHtmlStr() : String {

    }
}