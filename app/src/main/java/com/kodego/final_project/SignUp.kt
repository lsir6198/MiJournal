package com.kodego.final_project

import androidx.fragment.app.Fragment

class SignUp: Fragment() {

       lateinit var binding : FragmentSignUpBinding

        private lateinit var auth : FirebaseAuth
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = FragmentSignUpBinding.inflate(layoutInflater)
            // Inflate the layout for this fragment
            auth = FirebaseAuth.getInstance()
            auth.signOut()

            auth.currentUser?.let {

            }
            binding.btnSignup.setOnClickListener(){
                signupUser()
            }
            return binding.root
        }
        private fun signupUser() {
            val email = binding.etEmailSignup.text.toString()
            val password = binding.etPasswordSignup.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()){
                CoroutineScope(Dispatchers.IO).launch {
                    try {
                        auth.createUserWithEmailAndPassword(email, password).await()
                        withContext(Dispatchers.Main){
                        }
                    }catch (e: Exception){
                        withContext(Dispatchers.Main){
                            Toast.makeText(context,e.message, Toast.LENGTH_LONG).show()
                        }
                    }
                }
            }
        }
    }
}