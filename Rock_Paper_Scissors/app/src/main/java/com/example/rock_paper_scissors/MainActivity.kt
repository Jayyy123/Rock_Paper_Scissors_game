package com.example.rock_paper_scissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private  lateinit var player_score:TextView
    private  lateinit var computer_score:TextView
    private  lateinit var player_choice:TextView
    private  lateinit var computer_choice:TextView
    private  lateinit var result:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        player_score = findViewById(R.id.player)
        computer_score = findViewById(R.id.computer)
        player_choice = findViewById(R.id.pla)
        computer_choice = findViewById(R.id.comp)
        result = findViewById(R.id.comment)

        //buttons
        val rock:Button = findViewById(R.id.rock)
        val paper:Button = findViewById(R.id.paper)
        val scis:Button = findViewById(R.id.scis)

        //function
        result.text = ""
        player_choice.text = ""
        computer_score.text = ""
        computer_choice.text = ""
        player_score.text = ""
        var b = 0
        var c = 0

        fun comp_choice(): String {
            var computerChoice = ""
            var c_choice = Random.nextInt(3)
            if (c_choice == 1){
                computerChoice = "Rock"
            }else if(c_choice == 2){
                computerChoice = "Paper"
            }else{
                computerChoice = "Scissors"
            }
            return computerChoice
        }

        fun play(comp_choice:String,player_choicee:String){
            if((player_choicee == "Rock")&&(comp_choice == "Rock")|| ((player_choicee == "Paper")&&(comp_choice == "Paper"))||((player_choicee == "Scissors")&&(comp_choice == "Scissors"))){
                result.text = "It is a tie!!"
                b += 1
                c += 1

                player_choice.text = "$player_choicee"
                computer_choice.text = "$comp_choice"

                player_score.text = "$b"
                computer_score.text = "$c"
            }else if (((player_choicee == "Rock")&&(comp_choice == "Scissors"))|| ((player_choicee == "Paper")&&(comp_choice == "Rock"))||((player_choicee == "Scissors")&&(comp_choice == "Paper"))){
                result.text = "You won!!!\nWay to go!!"
                b += 1

                player_choice.text = "$player_choicee"
                computer_choice.text = "$comp_choice"

                player_score.text = "$b"
                computer_score.text = "$c"


            }else{
                result.text = "You lost!!"
                c += 1
                computer_score.text = "$c"
                player_score.text = "$b"
                player_choice.text = "$player_choicee"
                computer_choice.text = "$comp_choice"
            }
        }

        val k = View.OnClickListener { v ->

            result.text = ""
            player_choice.text = ""
            player_score.text = ""
            computer_choice.text = ""
            computer_score.text = ""

            val kk = (v as Button).text.toString()
            play(comp_choice(),kk)
        }

        rock.setOnClickListener(k)
        paper.setOnClickListener(k)
        scis.setOnClickListener(k)




    }


}