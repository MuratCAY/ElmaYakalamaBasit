package com.example.elmayakalamaprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.visibility = View.INVISIBLE
        button2.visibility = View.INVISIBLE
        button3.visibility = View.INVISIBLE
        button4.visibility = View.INVISIBLE
        button5.visibility = View.INVISIBLE
        button6.visibility = View.INVISIBLE
        button7.visibility = View.INVISIBLE
        button8.visibility = View.INVISIBLE
        button9.visibility = View.INVISIBLE

        object : CountDownTimer(1000000000, 2000) {
            override fun onFinish() {

            }

            override fun onTick(millisUntilFinished: Long) {

                var ran = (1..9).random()
                if (ran == 1) {

                    button.visibility = View.VISIBLE
                } else if (ran == 2) {
                    button2.visibility = View.VISIBLE
                } else if (ran == 3) {
                    button3.visibility = View.VISIBLE
                } else if (ran == 4) {
                    button4.visibility = View.VISIBLE
                } else if (ran == 5) {
                    button5.visibility = View.VISIBLE
                } else if (ran == 6) {
                    button6.visibility = View.VISIBLE
                } else if (ran == 7) {
                    button7.visibility = View.VISIBLE
                } else if (ran == 8) {
                    button8.visibility = View.VISIBLE
                } else if (ran == 9) {
                    button9.visibility = View.VISIBLE
                }
                GlobalScope.launch(context = Dispatchers.Main) {
                    delay(650)
                    button.visibility = View.INVISIBLE
                    button2.visibility = View.INVISIBLE
                    button3.visibility = View.INVISIBLE
                    button4.visibility = View.INVISIBLE
                    button5.visibility = View.INVISIBLE
                    button6.visibility = View.INVISIBLE
                    button7.visibility = View.INVISIBLE
                    button8.visibility = View.INVISIBLE
                    button9.visibility = View.INVISIBLE

                }
            }
        }.start()

    }


    fun button(view: View) {
        if (button.visibility == View.VISIBLE) {
            score++
            textView.text = "Puanınız : ${score}"
        }
    }

    fun button2(view: View) {
        if (button2.visibility == View.VISIBLE) {
            score++
            textView.text = "Puanınız : ${score}"
        }
    }

    fun button3(view: View) {
        if (button3.visibility == View.VISIBLE) {
            score++
            textView.text = "Puanınız : ${score}"
        }
    }

    fun button4(view: View) {
        if (button4.visibility == View.VISIBLE) {
            score++
            textView.text = "Puanınız : ${score}"
        }
    }

    fun button5(view: View) {
        if (button5.visibility == View.VISIBLE) {
            score++
            textView.text = "Puanınız : ${score}"
        }
    }

    fun button6(view: View) {
        if (button6.visibility == View.VISIBLE) {
            score++
            textView.text = "Puanınız : ${score}"
        }
    }

    fun button7(view: View) {
        if (button7.visibility == View.VISIBLE) {
            score++
            textView.text = "Puanınız : ${score}"
        }
    }

    fun button8(view: View) {
        if (button8.visibility == View.VISIBLE) {
            score++
            textView.text = "Puanınız : ${score}"
        }
    }

    fun button9(view: View) {
        if (button9.visibility == View.VISIBLE) {
            score++
            textView.text = "Puanınız : ${score}"
        }
    }


}