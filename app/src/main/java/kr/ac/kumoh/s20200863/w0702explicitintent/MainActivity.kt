package kr.ac.kumoh.s20200863.w0702explicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20200863.w0702explicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnExplicitIntent.setOnClickListener {
            val intent = Intent(
                this,
                ImageActivity::class.java
            )
            startActivity(intent)
        }

        binding.btnImplicitIntent.setOnClickListener {
            val uri =
                Uri.parse("https://www.youtube.com/watch?v=OYuOTUs3ugA&list=PLSzKNfmKNC7b5eK0FBIXKUzTumBzdKrWf&index=58")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.btnImplicitIntent.setOnClickListener {
            val uri = Uri.parse(
                "https://www.youtube.com/results?search_query="
                        + binding.editText.text
            )
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}