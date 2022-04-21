package uz.texnopos.capitalsquiz

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.texnopos.capitalsquiz.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val correctAnswersCount = intent.getIntExtra("score", 0)
        intent.getStringExtra("name")?.let {
            binding.tvName.text = it
        }

        binding.tvResult.text = getString(R.string.score_text, correctAnswersCount)
    }
}
