package com.clinica.robles

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var cardSpecialties: CardView
    private lateinit var cardAboutUs: CardView
    private lateinit var cardComplaints: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        cardSpecialties = findViewById(R.id.cardSpecialties)
        cardAboutUs = findViewById(R.id.cardAboutUs)
        cardComplaints = findViewById(R.id.cardComplaints)
    }

    private fun setupClickListeners() {
        cardSpecialties.setOnClickListener {
            val intent = Intent(this, SpecialtiesActivity::class.java)
            startActivity(intent)
        }

        cardAboutUs.setOnClickListener {
            // TODO: Implementar About Us
        }

        cardComplaints.setOnClickListener {
            // TODO: Implementar Libro de Reclamaciones
        }
    }
}
