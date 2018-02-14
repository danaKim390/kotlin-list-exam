package dana.com.kotlinlistexam

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val readOnlyMap = mapOf<String, Int>("A" to 1, "B" to 2, "C" to 3)

        Log.d(TAG, readOnlyMap.toString())
        Log.d(TAG, readOnlyMap.get("A").toString())
        Log.d(TAG, readOnlyMap["A"].toString())
    }
}
