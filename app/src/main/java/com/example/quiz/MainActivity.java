package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.quiz.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private int mScore = 0;
    private int mQuestionNumber = 0;
    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private int totalQues = mQuestionLibrary.getSize();
    private String mAns = mQuestionLibrary.getmAns(mQuestionNumber);
    private boolean isCorrect = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        updateLeft();
        updateQuestion();
        binding.imageView3.setImageResource(mQuestionLibrary.getmImage(mQuestionNumber));

        //Starting with listeners
        binding.optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                binding.optionA.setBackgroundResource(R.drawable.border);
                if(binding.optionA.getText().equals(mAns)) {
                    isCorrect = true;
                }
            }
        });
        binding.optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.optionB.setBackgroundResource(R.drawable.border);
                if(binding.optionB.getText().equals(mAns)) {
                    isCorrect = true;
                }
            }
        });
        binding.optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.optionC.setBackgroundResource(R.drawable.border);
                if(binding.optionC.getText().equals(mAns)) {
                    isCorrect = true;
                }
            }
        });
        binding.optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.optionD.setBackgroundResource(R.drawable.border);
                if(binding.optionD.getText().equals(mAns)) {
                    isCorrect = true;
                }
            }
        });
        binding.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //updating score
                if(isCorrect) {
                    mScore++;
                }
                binding.optionA.setBackgroundResource(R.drawable.default_border);
                binding.optionB.setBackgroundResource(R.drawable.default_border);
                binding.optionC.setBackgroundResource(R.drawable.default_border);
                binding.optionD.setBackgroundResource(R.drawable.default_border);
                if(mQuestionNumber < totalQues -1) {
                    mQuestionNumber++;
                    mAns = mQuestionLibrary.getmAns(mQuestionNumber);
                    updateLeft();
                    updateQuestion();
                    binding.imageView3.setImageResource(mQuestionLibrary.getmImage(mQuestionNumber));
                } else {
                    Toast.makeText(MainActivity.this, "Your score is: " + mScore + "/" + totalQues, Toast.LENGTH_SHORT).show();
                }
                isCorrect = false;
            }
        });
    }
    public void updateQuestion() {
        if(mQuestionNumber < totalQues) {
            binding.question.setText(mQuestionLibrary.getmQues(mQuestionNumber));
            binding.optionA.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            binding.optionB.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            binding.optionC.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            binding.optionD.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
        }
    }
    public void updateLeft() {
        if(mQuestionNumber < totalQues)
            binding.questionLeft.setText(mQuestionNumber+1 +"/"+totalQues);
    }
}