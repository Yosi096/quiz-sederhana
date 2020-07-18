package coba.kuis

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_questions.*
import java.awt.font.TextAttribute

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPosition: Int=1
    private var mQuestionsList: ArrayList<Questions>? =null
    private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mQuestionsList = Constants.getQuestions()

        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)

    }

    private  fun setQuestion(){
        mCurrentPosition = 1
        val questions = mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        pg.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + pg.max
        tv_questions.text = questions!!.question
        iv_img.setImageResource(questions.image)
        tv_option_one.text = questions.optionOne
        tv_option_two.text = questions.optionTwo
        tv_option_three.text = questions.optionThree
        tv_option_four.text = questions.optionFour
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(0, tv_option_two)
        options.add(0, tv_option_three)
        options.add(0, tv_option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this, R.drawable.bg_choose
            )
        }


    }

    override fun onClick(v: View?) {

        
    }

    private fun selectedOptionView (tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this, R.drawable.bg_selected
        )
    }

}
