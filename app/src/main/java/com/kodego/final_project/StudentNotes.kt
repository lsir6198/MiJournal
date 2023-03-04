package com.kodego.final_project


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.kodego.final_project.databinding.ActivityMainBinding
import com.kodego.final_project.databinding.CreateNewNotesBinding
import com.kodego.final_project.databinding.FragmentStudentNotesBinding
import com.kodego.final_project.databinding.NotesListBinding
import androidx.recyclerview.widget.RecyclerView as RecyclerView

class StudentNotes : Fragment() {

        lateinit var binding: FragmentStudentNotesBinding

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = FragmentStudentNotesBinding.inflate(layoutInflater)
            // Inflate the layout for this fragment
            return binding.root

        }
}
