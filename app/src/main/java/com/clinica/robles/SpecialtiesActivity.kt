package com.clinica.robles

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.clinica.robles.adapters.DoctorAdapter
import com.clinica.robles.models.Doctor

class SpecialtiesActivity : AppCompatActivity() {
    private var recyclerViewDoctors: RecyclerView? = null
    private var doctorAdapter: DoctorAdapter? = null
    private var doctorsList: MutableList<Doctor>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_specialties)

        setupToolbar()
        initViews()
        loadDoctorsData()
        setupRecyclerView()
    }

    private fun setupToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { v: View? -> onBackPressed() }
    }

    private fun initViews() {
        recyclerViewDoctors = findViewById(R.id.recyclerViewDoctors)
    }

    private fun loadDoctorsData() {
        doctorsList = ArrayList()


        // Traumatología
        (doctorsList as ArrayList<Doctor>).add(
            Doctor(
                "Dr. Alberto García Cerna", "Traumatología",
                "Lun - Vier 8 AM - 1 PM\nSab 9 AM - 3 PM", "992745310", R.drawable.default_doctor
            )
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor(
                "Dr. Cruz Medina M.", "Traumatología",
                "Lun - Vier 2 PM - 7 PM\nSab 8 AM - 12 PM", "992745311", R.drawable.default_doctor
            )
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor(
                "Dr. Edison Abanto A.", "Traumatología",
                "Lun - Vier 8 AM - 2 PM\nSab 9 AM - 1 PM", "992745312", R.drawable.default_doctor
            )
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dra. Sandra Robles Zanelli", "Traumatología",
                "Lun - Vier 9 AM - 2 PM\nSab 10 AM - 1 PM", "992745321", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dra. Yessenia Zapata Delgado", "Traumatología",
                "Lun - Vier 3 PM - 8 PM\nSab 8 AM - 11 AM", "992745322", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Ciro Madrid Flores", "Traumatología",
                "Lun - Vier 7 AM - 12 PM\nSab 9 AM - 1 PM", "992745323", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Pablo Mego", "Traumatología",
                "Lun - Vier 1 PM - 6 PM\nSab 8 AM - 12 PM", "992745324", R.drawable.default_doctor)
        )


        // Cardiología
        (doctorsList as ArrayList<Doctor>).add(
            Doctor(
                "Dr. Roberto Chavesta", "Cardiología",
                "Lun - Vier 9 AM - 3 PM\nSab 8 AM - 12 PM", "992745313", R.drawable.default_doctor
            )
        )

        // Cirugía Cardiovascular
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Romel Zamudio Silva", "Cirugía Cardiovascular",
                "Lun - Vier 10 AM - 4 PM\nSab 9 AM - 12 PM", "992745325", R.drawable.default_doctor)
        )

        // Cirugía General
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Beto Miranda Sevillano", "Cirugía General",
                "Lun - Vier 1 PM - 6 PM\nSab 9 AM - 1 PM", "99274509", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Pool Jara Pesantes", "Cirugía General",
                "Lun - Vier 10 AM - 3 PM\nSab 8 AM - 12 PM", "99274510", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Jonnatan Uribe", "Cirugía General",
                "Lun - Vier 2 PM - 7 PM\nSab 9 AM - 1 PM", "99274511", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Beltrany Lavado", "Cirugía General",
                "Lun - Vier 3 PM - 8 PM\nSab 9 AM - 1 PM", "99274512", R.drawable.default_doctor)
        )

        // Dermatología
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Jaime Vega Chavez", "Dermatología",
                "Lun - Vier 3 PM - 8 PM\nSab 9 AM - 1 PM", "99274513", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Italo Vegas Jaramillo", "Dermatología",
                "Lun - Vier 3 PM - 8 PM\nSab 8 AM - 12 PM", "99274514", R.drawable.default_doctor)
        )

        // Endocrinología
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Juan Pinto Sanchez", "Endocrinología",
                "Lun - Vier 1 PM - 6 PM\nSab 10 AM - 1 PM", "99274515", R.drawable.default_doctor)
        )

        // Gastroenterología
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dra. Kelly Casanova Lau", "Gastroenterología",
                "Lun - Vier 8 AM - 1 PM\nSab 8 AM - 12 PM", "99274516", R.drawable.default_doctor)
        )

        // Ginecología
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Jose Luis Espinoza Decena", "Ginecología",
                "Lun - Vier 9 AM - 2 PM\nSab 10 AM - 1 PM", "99274517", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dra. Yulissa Paredes Padilla", "Ginecología",
                "Lun - Vier 1 PM - 6 PM\nSab 9 AM - 1 PM", "99274518", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Julio SistoLoza Rodriguez", "Ginecología",
                "Lun - Vier 9 AM - 2 PM\nSab 9 AM - 1 PM", "99274519", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dra. Leslie Sosa de la Cruz", "Ginecología",
                "Lun - Vier 9 AM - 2 PM\nSab 9 AM - 1 PM", "99274520", R.drawable.default_doctor)
        )

        // Medicina Física
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Luis Vasquez", "Medicina Física",
                "Lun - Vier 1 PM - 6 PM\nSab 9 AM - 1 PM", "99274521", R.drawable.default_doctor)
        )

        // Medicina General
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Elwis Laveriano Hoyos", "Medicina General",
                "Lun - Vier 2 PM - 7 PM\nSab 10 AM - 1 PM", "99274522", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dra. Maria Cristina Saavedra", "Medicina General",
                "Lun - Vier 1 PM - 6 PM\nSab 9 AM - 1 PM", "99274523", R.drawable.default_doctor)
        )

        // Medicina Interna
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Luis Cabrera Ciprian", "Medicina Interna",
                "Lun - Vier 10 AM - 3 PM\nSab 8 AM - 12 PM", "99274524", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dra. Rosa Casimiro Lau", "Medicina Interna",
                "Lun - Vier 8 AM - 1 PM\nSab 10 AM - 1 PM", "99274525", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dra. Yuriko Zúñiga Lavado", "Medicina Interna",
                "Lun - Vier 9 AM - 2 PM\nSab 8 AM - 12 PM", "99274526", R.drawable.default_doctor)
        )

        // Neumología
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dra. Yessica Montoya Caldas", "Neumología",
                "Lun - Vier 1 PM - 6 PM\nSab 9 AM - 1 PM", "99274527", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Walter Centurion Jaramillo", "Neumología",
                "Lun - Vier 3 PM - 8 PM\nSab 9 AM - 1 PM", "99274528", R.drawable.default_doctor)
        )

        // Neurocirugía
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Willy Caballero Grados", "Neurocirugía",
                "Lun - Vier 1 PM - 6 PM\nSab 8 AM - 12 PM", "99274529", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Rosnel Valdivieso Velarde", "Neurología",
                "Lun - Vier 3 PM - 8 PM\nSab 10 AM - 1 PM", "99274530", R.drawable.default_doctor)
        )

        // Nutrición
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Lic. Carmela Carbajal", "Nutrición",
                "Lun - Vier 10 AM - 3 PM\nSab 8 AM - 12 PM", "99274531", R.drawable.default_doctor)
        )

        // Odontología
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Pedro Cipriano Alegre", "Odontología",
                "Lun - Vier 2 PM - 7 PM\nSab 10 AM - 1 PM", "99274532", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dra. Carolina Acuña Calderon", "Odontología",
                "Lun - Vier 2 PM - 7 PM\nSab 9 AM - 1 PM", "99274533", R.drawable.default_doctor)
        )

        // Cirugía Maxilofacial
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Julio Robles Zanelli", "Cirugía Maxilofacial",
                "Lun - Vier 1 PM - 6 PM\nSab 9 AM - 1 PM", "99274534", R.drawable.default_doctor)
        )

        // Otorrino
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Jorge Bonilla Vargas", "Otorrino",
                "Lun - Vier 8 AM - 1 PM\nSab 10 AM - 1 PM", "99274535", R.drawable.default_doctor)
        )

        // Oftalmología
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dra. Anita Vigo Arroyo", "Oftalmología",
                "Lun - Vier 1 PM - 6 PM\nSab 9 AM - 1 PM", "99274536", R.drawable.default_doctor)
        )

        // Pediatría
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Marcos Vasquez Tantas", "Pediatría",
                "Lun - Vier 3 PM - 8 PM\nSab 10 AM - 1 PM", "99274537", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Jaime Cabrera Pereda", "Pediatría",
                "Lun - Vier 9 AM - 2 PM\nSab 10 AM - 1 PM", "99274538", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Hugo Melendez Cuentas", "Pediatría",
                "Lun - Vier 3 PM - 8 PM\nSab 9 AM - 1 PM", "99274539", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Juan Solis Angeles", "Pediatría",
                "Lun - Vier 9 AM - 2 PM\nSab 9 AM - 1 PM", "99274540", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dra. Rosa Angelondonis Hurtado", "Pediatría",
                "Lun - Vier 3 PM - 8 PM\nSab 9 AM - 1 PM", "99274541", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Edward Ramirez Alvear", "Pediatría",
                "Lun - Vier 10 AM - 3 PM\nSab 9 AM - 1 PM", "99274542", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Fernando Samame", "Pediatría",
                "Lun - Vier 10 AM - 3 PM\nSab 10 AM - 1 PM", "99274543", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dra. Ana Lopez", "Pediatría",
                "Lun - Vier 2 PM - 7 PM\nSab 10 AM - 1 PM", "99274544", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Jose Lozano", "Pediatría",
                "Lun - Vier 3 PM - 8 PM\nSab 9 AM - 1 PM", "99274545", R.drawable.default_doctor)
        )

        // Psicología
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Lic. Astrid Manrique Marron", "Psicología",
                "Lun - Vier 1 PM - 6 PM\nSab 9 AM - 1 PM", "99274546", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Lic. Luz Vasquez Burgos", "Psicología",
                "Lun - Vier 3 PM - 8 PM\nSab 9 AM - 1 PM", "99274547", R.drawable.default_doctor)
        )

        // Psiquiatría
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dra. Celmira Lazaro Loyola", "Psiquiatría",
                "Lun - Vier 10 AM - 3 PM\nSab 8 AM - 12 PM", "99274548", R.drawable.default_doctor)
        )

        // Reumatología
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Frank Ocaña Vasquez", "Reumatología",
                "Lun - Vier 1 PM - 6 PM\nSab 10 AM - 1 PM", "99274549", R.drawable.default_doctor)
        )

        // Urología
        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Carlos Morales Flores", "Urología",
                "Lun - Vier 3 PM - 8 PM\nSab 9 AM - 1 PM", "99274550", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Luis Pascual Plasencia", "Urología",
                "Lun - Vier 2 PM - 7 PM\nSab 8 AM - 12 PM", "99274551", R.drawable.default_doctor)
        )

        (doctorsList as ArrayList<Doctor>).add(
            Doctor("Dr. Jose Acosta Fuentes", "Urología",
                "Lun - Vier 10 AM - 3 PM\nSab 8 AM - 12 PM", "99274552", R.drawable.default_doctor)
        )


    }

    private fun setupRecyclerView() {
        doctorAdapter = DoctorAdapter(this, doctorsList!!)
        recyclerViewDoctors!!.layoutManager = LinearLayoutManager(this)
        recyclerViewDoctors!!.adapter = doctorAdapter
    }
}