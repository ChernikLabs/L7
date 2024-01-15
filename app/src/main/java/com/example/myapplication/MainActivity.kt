import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R


class MainActivity : AppCompatActivity() {
        private var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView1)
        val textViewc: TextView = findViewById(R.id.textView4)

        val button: Button = findViewById(R.id.button3)
        button.setOnClickListener {
            textView.text = "Hello world!"
        }

        val buttoncount: Button = findViewById(R.id.button4)
        buttoncount.setOnClickListener {
            textViewc.text = "Я нажал на кнопку ${++counter} раз!"
        }
    }
}