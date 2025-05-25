package com.clinica.robles.adapters

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.clinica.robles.DoctorDetailActivity
import com.clinica.robles.R
import com.clinica.robles.models.Doctor

class DoctorAdapter(
    private val context: Context,
    private val doctors: List<Doctor>
) : RecyclerView.Adapter<DoctorAdapter.DoctorViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_doctor, parent, false)
        return DoctorViewHolder(view)
    }

    override fun onBindViewHolder(holder: DoctorViewHolder, position: Int) {
        val doctor = doctors[position]

        holder.tvDoctorName.text = doctor.name
        holder.tvSpecialty.text = doctor.specialty
        holder.ivDoctorPhoto.setImageResource(doctor.imageResource)

        holder.btnWhatsApp.setOnClickListener {
            val phoneNumber = doctor.phone
            val message = "Hola Dr. ${doctor.name}, quisiera solicitar una cita."
            val url = "https://wa.me/502$phoneNumber?text=${Uri.encode(message)}"

            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(url)
            }
            context.startActivity(intent)
        }

        holder.btnSchedule.setOnClickListener {
            val intent = Intent(context, DoctorDetailActivity::class.java).apply {
                putExtra("doctor_name", doctor.name)
                putExtra("doctor_specialty", doctor.specialty)
                putExtra("doctor_schedule", doctor.schedule)
                putExtra("doctor_phone", doctor.phone)
                putExtra("doctor_image", doctor.imageResource)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = doctors.size

    class DoctorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivDoctorPhoto: ImageView = itemView.findViewById(R.id.ivDoctorPhoto)
        val tvDoctorName: TextView = itemView.findViewById(R.id.tvDoctorName)
        val tvSpecialty: TextView = itemView.findViewById(R.id.tvSpecialty)
        val btnWhatsApp: ImageButton = itemView.findViewById(R.id.btnWhatsApp)
        val btnSchedule: Button = itemView.findViewById(R.id.btnSchedule)
    }
}
