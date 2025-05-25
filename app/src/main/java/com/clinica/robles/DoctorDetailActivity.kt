package com.clinica.robles

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import de.hdodenhof.circleimageview.CircleImageView

class DoctorDetailActivity : AppCompatActivity() {
    private var ivDoctorPhoto: CircleImageView? = null
    private var tvDoctorName: TextView? = null
    private var tvSpecialty: TextView? = null
    private var tvSchedule: TextView? = null
    private var tvPhone: TextView? = null
    private var btnSendMessage: Button? = null
    private var btnBack: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_detail)

        setupToolbar()
        initViews()
        loadDoctorData()
        setupClickListeners()
    }

    private fun setupToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { v: View? -> onBackPressed() }
    }

    private fun initViews() {
        ivDoctorPhoto = findViewById(R.id.ivDoctorPhoto)
        tvDoctorName = findViewById(R.id.tvDoctorName)
        tvSpecialty = findViewById(R.id.tvSpecialty)
        tvSchedule = findViewById(R.id.tvSchedule)
        tvPhone = findViewById(R.id.tvPhone)
        btnSendMessage = findViewById(R.id.btnSendMessage)
        btnBack = findViewById(R.id.btnBack)
    }

    private fun loadDoctorData() {
        val intent = intent
        val doctorName = intent.getStringExtra("doctor_name")
        val specialty = intent.getStringExtra("doctor_specialty")
        val schedule = intent.getStringExtra("doctor_schedule")
        val phone = intent.getStringExtra("doctor_phone")
        val imageResource = intent.getIntExtra("doctor_image", R.drawable.default_doctor)

        tvDoctorName!!.text = doctorName
        tvSpecialty!!.text = specialty
        tvSchedule!!.text = schedule
        tvPhone!!.text = phone
        ivDoctorPhoto!!.setImageResource(imageResource)
    }

    private fun setupClickListeners() {
        btnSendMessage!!.setOnClickListener { v: View? ->
            val phoneNumber = intent.getStringExtra("doctor_phone")
            val doctorName = intent.getStringExtra("doctor_name")
            val message = "Hola $doctorName, quisiera solicitar una cita médica."
            val url = "https://wa.me/51" + phoneNumber + "?text=" + Uri.encode(message)

            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }

        btnBack!!.setOnClickListener { v: View? -> onBackPressed() }
    }
}