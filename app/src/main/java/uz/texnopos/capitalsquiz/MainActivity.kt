package uz.texnopos.capitalsquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import uz.texnopos.capitalsquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {
            etName.addTextChangedListener {
                tilName.isErrorEnabled = false
            }

            btnStart.setOnClickListener {
                val name = etName.text.toString()
                if (name.isEmpty()) {
                    tilName.error = getString(R.string.name_error)
                } else {
                    val intent = Intent(this@MainActivity, GameActivity::class.java)
                    intent.putExtra("name", name)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }
}
