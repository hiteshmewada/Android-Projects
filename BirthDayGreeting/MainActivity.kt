package com.example.birthdaygreet
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createBirthdayCard(view: View) {
        val intent = Intent(this,ActivityBirthdayGreeting::class.java)

        val name=findViewById<EditText>(R.id.nameInput)
        intent.putExtra(ActivityBirthdayGreeting.NAME_EXTRA,name)
        Toast.makeText(this,"name is ${name.text}",Toast.LENGTH_LONG).show()
        startActivity(intent)
    }
}

private fun Intent.putExtra(s: String, name: EditText?) {

}
