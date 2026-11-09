package com.example.kostku

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kostku.databinding.ActivityRoleSelectionBinding

class RoleSelectionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRoleSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoleSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardAdmin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        binding.cardResident.setOnClickListener {
            startActivity(Intent(this, ResidentLoginActivity::class.java))
        }
    }
}
