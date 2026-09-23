package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
//After commiting and merging as was done in lab, I deleted the branches locally,
// and it is not showing the 3 branches on GitHub.
//The branching can still be viewed if you click where it says
// "This branch is 2 commits ahead of karlmorris/LabActivity3:master."
//It will show the branches commits there
class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)

        
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
           if (findViewById<EditText>(R.id.nameEditText).text.isNotBlank()){
               displayTextView.text = "Hello, ${findViewById<EditText>(R.id.nameEditText).text}"
           } else{
               displayTextView.text = "Please enter your name."
           }
        }


    }
}