package com.clinica.robles

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class RegisterActivity : AppCompatActivity() {
    private var etName: TextInputEditText? = null
    private var etEmail: TextInputEditText? = null
    private var etPhone: TextInputEditText? = null
    private var etPassword: TextInputEditText? = null
    private var etConfirmPassword: TextInputEditText? = null
    private var btnRegister: Button? = null
    private var tvLogin: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        etName = findViewById(R.id.etName)
        etEmail = findViewById(R.id.etEmail)
        etPhone = findViewById(R.id.etPhone)
        etPassword = findViewById(R.id.etPassword)
        etConfirmPassword = findViewById(R.id.etConfirmPassword)
        btnRegister = findViewById(R.id.btnRegister)
        tvLogin = findViewById(R.id.tvLogin)
    }

    private fun setupClickListeners() {
        btnRegister!!.setOnClickListener { v: View? ->
            if (validateForm()) {
                // Simular registro exitoso
                Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

        tvLogin!!.setOnClickListener { v: View? -> finish() }
    }

    private fun validateForm(): Boolean {
        val name = etName!!.text.toString().trim { it <= ' ' }
        val email = etEmail!!.text.toString().trim { it <= ' ' }
        val phone = etPhone!!.text.toString().trim { it <= ' ' }
        val password = etPassword!!.text.toString().trim { it <= ' ' }
        val confirmPassword = etConfirmPassword!!.text.toString().trim { it <= ' ' }

        if (name.isEmpty()) {
            etName!!.error = "Ingrese su nombre"
            return false
        }

        if (email.isEmpty()) {
            etEmail!!.error = "Ingrese su email"
            return false
        }

        if (phone.isEmpty()) {
            etPhone!!.error = "Ingrese su teléfono"
            return false
        }

        if (password.isEmpty()) {
            etPassword!!.error = "Ingrese su contraseña"
            return false
        }

        if (confirmPassword.isEmpty()) {
            etConfirmPassword!!.error = "Confirme su contraseña"
            return false
        }

        if (password != confirmPassword) {
            etConfirmPassword!!.error = "Las contraseñas no coinciden"
            return false
        }

        return true
    }
}