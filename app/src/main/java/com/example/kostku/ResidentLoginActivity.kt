package com.example.kostku

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kostku.databinding.ActivityResidentLoginBinding

class ResidentLoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResidentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResidentLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnResidentLogin.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
            finishAffinity()
        }

        binding.tvContactAbbas.setOnClickListener {
            // Contact action placeholder
        }
    }
}
