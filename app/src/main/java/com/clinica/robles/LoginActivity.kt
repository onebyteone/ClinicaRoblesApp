package com.clinica.robles

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {

    private lateinit var etEmail: TextInputEditText
    private lateinit var etPassword: TextInputEditText
    private lateinit var btnLogin: Button
    private lateinit var tvForgotPassword: TextView
    private lateinit var tvRegister: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        tvForgotPassword = findViewById(R.id.tvForgotPassword)
        tvRegister = findViewById(R.id.tvRegister)
    }

    private fun setupClickListeners() {
        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (validateLogin(email, password)) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        tvForgotPassword.setOnClickListener {
            Toast.makeText(this, "Función próximamente", Toast.LENGTH_SHORT).show()
        }

        tvRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun validateLogin(email: String, password: String): Boolean {
        if (email.isEmpty()) {
            etEmail.error = "Ingrese su email"
            return false
        }

        if (password.isEmpty()) {
            etPassword.error = "Ingrese su contraseña"
            return false
        }

        return if (email == "admin@clinica.com" && password == "123456") {
            true
        } else {
            Toast.makeText(this, "Credenciales inválidas", Toast.LENGTH_SHORT).show()
            false
        }
    }
}
