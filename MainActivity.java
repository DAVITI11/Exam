package com.example.gunexam;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button SB;

    RadioGroup RG1,RG2,RG3,RG4,RG5,RG6,RG7,RG8,RG9,RG10,RG11,RG12,RG13,RG14,RG15;

    int OID1,OID2,OID3,OID4,OID5,OID6,OID7,OID8,OID9,OID10,OID11,OID12,OID13,OID14,OID15;
    public void CheckAnswer() {
        int score = 0;

        if (RG1.getCheckedRadioButtonId() == R.id.q1op2) {
            score++;
        }
        if (RG2.getCheckedRadioButtonId() == R.id.q2op1) {
            score++;
        }
        if (RG3.getCheckedRadioButtonId() == R.id.q3op2) {
            score++;
        }
        if (RG4.getCheckedRadioButtonId() == R.id.q4op3) {
            score++;
        }
        if (RG5.getCheckedRadioButtonId() == R.id.q5op2) {
            score++;
        }
        if (RG6.getCheckedRadioButtonId() == R.id.q6op1) {
            score++;
        }
        if (RG7.getCheckedRadioButtonId() == R.id.q7op4) {
            score++;
        }
        if (RG8.getCheckedRadioButtonId() == R.id.q8op1) {
            score++;
        }
        if (RG9.getCheckedRadioButtonId() == R.id.q9op1) {
            score++;
        }
        if (RG10.getCheckedRadioButtonId() == R.id.q10op1){
            score++;
        }
        if (RG11.getCheckedRadioButtonId() == R.id.q11op2){
            score++;
        }
        if (RG12.getCheckedRadioButtonId() == R.id.q12op2){
            score++;
        }
        if (RG13.getCheckedRadioButtonId() == R.id.q13op1){
            score++;
        }
        if (RG14.getCheckedRadioButtonId() == R.id.q14op2){
            score++;
        }
        if (RG15.getCheckedRadioButtonId() == R.id.q15op4){
            score++;
        }

        new AlertDialog.Builder(this)
                .setTitle("Result")
                .setMessage("Your score is: " + score + " / 15")
                .setPositiveButton("OK", (dialog, which) -> {
                    finish();
                })
                .setNegativeButton("Reset", (dialog, which) -> {
                    ResetQuiz();
                    dialog.dismiss();
                })
                .show();

    }
    public void showresult(){

    }
    public void slv(){

        OID1 = RG1.getCheckedRadioButtonId();
        OID2 = RG2.getCheckedRadioButtonId();
        OID3 = RG3.getCheckedRadioButtonId();
        OID4 = RG4.getCheckedRadioButtonId();
        OID5 = RG5.getCheckedRadioButtonId();
        OID6 = RG6.getCheckedRadioButtonId();
        OID7 = RG7.getCheckedRadioButtonId();
        OID8 = RG8.getCheckedRadioButtonId();
        OID9 = RG9.getCheckedRadioButtonId();
        OID10 = RG10.getCheckedRadioButtonId();
        OID11 = RG11.getCheckedRadioButtonId();
        OID12 = RG12.getCheckedRadioButtonId();
        OID13 = RG13.getCheckedRadioButtonId();
        OID14 = RG14.getCheckedRadioButtonId();
        OID15 = RG15.getCheckedRadioButtonId();

        if(OID1 != -1 && OID2 != -1 && OID3 != -1 && OID4 != -1 && OID5 != -1 && OID6 != -1 && OID7 != -1 && OID8 != -1 && OID9 != -1 && OID10 != -1 && OID11 != -1 && OID12 != -1 && OID13 != -1 && OID14 != -1 && OID15 != -1){
            CheckAnswer();
        }else{
            new AlertDialog.Builder(this)
                    .setTitle("⚠️ Warning")
                    .setMessage("შეავსე ყველა ველი")
                    .setPositiveButton("ok", (dialog, which) -> {
                        dialog.dismiss();
                    })
                    .setNegativeButton("close app", (dialog, which) -> finish())
                    .show();

        }
    }

    public void ResetQuiz(){
        RG1.clearCheck();
        RG2.clearCheck();
        RG3.clearCheck();
        RG4.clearCheck();
        RG5.clearCheck();
        RG6.clearCheck();
        RG7.clearCheck();
        RG8.clearCheck();
        RG9.clearCheck();
        RG10.clearCheck();
        RG11.clearCheck();
        RG12.clearCheck();
        RG13.clearCheck();
        RG14.clearCheck();
        RG15.clearCheck();
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        RG1 = findViewById(R.id.question1);
        RG2 = findViewById(R.id.question2);
        RG3 = findViewById(R.id.question3);
        RG4 = findViewById(R.id.question4);
        RG5 = findViewById(R.id.question5);
        RG6 = findViewById(R.id.question6);
        RG7 = findViewById(R.id.question7);
        RG8 = findViewById(R.id.question8);
        RG9 = findViewById(R.id.question9);
        RG10 = findViewById(R.id.question10);
        RG11 = findViewById(R.id.question11);
        RG12 = findViewById(R.id.question12);
        RG13 = findViewById(R.id.question13);
        RG14 = findViewById(R.id.question14);
        RG15 = findViewById(R.id.question15);


        SB = findViewById(R.id.SubmitButton);
        SB.setOnClickListener(v->{
            slv();
        });

    }
}