package mx.edu.itson.chatbot.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.edu.itson.chatbot.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private lateinit var adapter: MessangingAdapter
    private val botList = listOf("Peter" , "Francesca" , "Luigi", "Igor")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView()
        clickEvents()

        val random = (0..3).random()
        customBotMessage("Hello! Today you're speaking with ${botList[random]}, how may I help?")
    }

    private fun clickEvents(){

        btn_send.setOnClickListener{
            sendMessage()
        }

        et_message.setOnClickListener{
            GlobalScope.launch{
                delay(100)
            }
        }
    }
}