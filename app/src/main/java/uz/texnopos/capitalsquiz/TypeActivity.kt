package uz.texnopos.capitalsquiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.texnopos.capitalsquiz.databinding.ActivityTypeBinding

class TypeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTypeBinding
    private lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTypeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        intent.getStringExtra("name")?.let {
            name = it
        }

        binding.btnCapitals.setOnClickListener {
            startActivity(
                Intent(this, GameActivity::class.java)
                    .putExtra("name", name)
            )
        }

        binding.btnFlags.setOnClickListener {
            startActivity(
                Intent(this, FlagsActivity::class.java)
                    .putExtra("name", name)
            )
        }
    }
}
