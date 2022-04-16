package uz.texnopos.capitalsquiz

import android.content.Intent
import android.content.res.ColorStateList
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import uz.texnopos.capitalsquiz.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameBinding
    private lateinit var questions: MutableList<Question>
    private lateinit var currentQuestion: Question
    private var selectedOptionId = 0
    private var step = 0
    private var correctAnswersCounter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        questions = Constants.getQuestions().toMutableList()
        questions.shuffle()

        setQuestion(step)


        binding.apply {
            btnOptionOne.setOnClickListener {
                setSelectedOption(1)
                selectedOptionId = 1
            }
            btnOptionTwo.setOnClickListener {
                setSelectedOption(2)
                selectedOptionId = 2
            }
            btnOptionThree.setOnClickListener {
                setSelectedOption(3)
                selectedOptionId = 3
            }
            btnOptionFour.setOnClickListener {
                setSelectedOption(4)
                selectedOptionId = 4
            }

            btnSubmit.setOnClickListener {
                if (btnSubmit.text == getString(R.string.submit)) {
                    if (selectedOptionId != 0) {
                        checkAnswer()
                        step++
                        if (step == questions.size) {
                            btnSubmit.text = getString(R.string.finish_text)
                        }
                    } else {
                        step++
                        if (step == questions.size) {
                            btnSubmit.text = getString(R.string.finish_text)
                        } else {
                            setQuestion(step)
                        }
                    }
                } else if (btnSubmit.text == getString(R.string.finish_text)) {
                    Toast.makeText(this@GameActivity, "Game over", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@GameActivity, ResultActivity::class.java)
                    intent.putExtra("score", correctAnswersCounter)
                    startActivity(intent)
                    finish()
                } else {
                    setQuestion(step)
                    btnSubmit.text = getString(R.string.submit)
                }
            }
        }
    }

    private fun setQuestion(index: Int) {
        currentQuestion = questions[index]

        binding.apply {
            btnOptionOne.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            btnOptionTwo.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            btnOptionThree.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            btnOptionFour.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))

            tvQuestion.text = currentQuestion.question
            btnOptionOne.text = currentQuestion.options[0]
            btnOptionTwo.text = currentQuestion.options[1]
            btnOptionThree.text = currentQuestion.options[2]
            btnOptionFour.text = currentQuestion.options[3]
        }

        changeOptionsBehavior(true)
        selectedOptionId = 0
    }

    private fun setSelectedOption(selectedOptionId: Int) {
        binding.apply {
            btnOptionOne.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            btnOptionTwo.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            btnOptionThree.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))
            btnOptionFour.backgroundTintList =
                ColorStateList.valueOf(resources.getColor(R.color.white))

            when (selectedOptionId) {
                1 -> btnOptionOne.backgroundTintList =
                    ColorStateList.valueOf(resources.getColor(R.color.selected_color))
                2 -> btnOptionTwo.backgroundTintList =
                    ColorStateList.valueOf(resources.getColor(R.color.selected_color))
                3 -> btnOptionThree.backgroundTintList =
                    ColorStateList.valueOf(resources.getColor(R.color.selected_color))
                4 -> btnOptionFour.backgroundTintList =
                    ColorStateList.valueOf(resources.getColor(R.color.selected_color))
            }
        }
    }

    private fun checkAnswer() {
        binding.apply {
            when (selectedOptionId) {
                1 -> btnOptionOne.backgroundTintList =
                    ColorStateList.valueOf(resources.getColor(R.color.wrong_color))
                2 -> btnOptionTwo.backgroundTintList =
                    ColorStateList.valueOf(resources.getColor(R.color.wrong_color))
                3 -> btnOptionThree.backgroundTintList =
                    ColorStateList.valueOf(resources.getColor(R.color.wrong_color))
                4 -> btnOptionFour.backgroundTintList =
                    ColorStateList.valueOf(resources.getColor(R.color.wrong_color))
            }

            when (currentQuestion.correctAnswerId + 1) {
                1 -> btnOptionOne.backgroundTintList =
                    ColorStateList.valueOf(resources.getColor(R.color.correct_color))
                2 -> btnOptionTwo.backgroundTintList =
                    ColorStateList.valueOf(resources.getColor(R.color.correct_color))
                3 -> btnOptionThree.backgroundTintList =
                    ColorStateList.valueOf(resources.getColor(R.color.correct_color))
                4 -> btnOptionFour.backgroundTintList =
                    ColorStateList.valueOf(resources.getColor(R.color.correct_color))
            }

            if (selectedOptionId == currentQuestion.correctAnswerId + 1) {
                correctAnswersCounter++
            }

            changeOptionsBehavior(false)
            btnSubmit.text = getString(R.string.continue_text)
        }
    }

    private fun changeOptionsBehavior(enabled: Boolean) {
        binding.apply {
            btnOptionOne.isEnabled = enabled
            btnOptionTwo.isEnabled = enabled
            btnOptionThree.isEnabled = enabled
            btnOptionFour.isEnabled = enabled
        }
    }
}
