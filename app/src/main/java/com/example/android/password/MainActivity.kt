package com.example.android.password

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

 abstract class MainActivity : AppCompatActivity(), View.OnClickListener {

     var txtUsername:EditText =null!!
     var txtpassword:EditText=null!!
     private fun registerUser():Unit{
       var Username:String?=txtUsername.text.toString().trim()
         var Password:String?=txtpassword.text.toString().trim()
         if(Username==null)
         {
             Username="Admission number is required"
             txtUsername.setError(Username)
             txtUsername.requestFocus()
         }

     }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        txtUsername=findViewById(R.id.txtUsername)
        txtpassword=findViewById(R.id.txtpassword)
        setContentView(R.layout.activity_main)
        var t: TextView =findViewById(R.id.signUp)
        t.setOnClickListener(){
           registerUser()
        }
        mbu1.setOnClickListener(){
            var intent2:Intent=Intent(this,MainActivity::class.java)
            startActivity(intent2)
        }
    }

}
