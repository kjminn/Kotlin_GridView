package kr.ac.yeonsung.kjminn.kotlin_gridview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import kr.ac.yeonsung.kjminn.kotlin_gridview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }

    class GridAdapter : BaseAdapter(){
        val imgIds = arrayOf(R.drawable.poster0, R.drawable.poster1, R.drawable.poster2, R.drawable.poster3, R.drawable.poster4,
            R.drawable.poster5, R.drawable.poster6, R.drawable.poster7, R.drawable.poster8, R.drawable.poster9)

        class GridAdapter constructor(con: Context){

        }

        override fun getCount(): Int {
            return imgIds.size;
        }

        override fun getItem(p0: Int): Any? {
            return null;
        }

        override fun getItemId(p0: Int): Long {
            return 0;
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View? {
//            val imgv = ImageView()
            return  null;
        }


    }
}