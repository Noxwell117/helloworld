package edu.itsco.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun click(view: View)
    {
        Toast.makeText(this, "Hola Mundo", Toast.LENGTH_SHORT).show()
    }
}
