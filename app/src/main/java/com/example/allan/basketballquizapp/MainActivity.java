package com.example.allan.basketballquizapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Other options
    RadioButton option1Q1;
    RadioButton option3Q1;
    RadioButton option2Q4;
    RadioButton option3Q4;
    RadioButton option1Q5;
    RadioButton option3Q5;
    RadioButton option4Q5;
    RadioButton option2Q9;
    RadioButton option3Q9;
    RadioButton option4Q9;
    CheckBox option2Q2;
    CheckBox option2Q6;

    //Answers
    RadioButton option2Q1;
    RadioButton option1Q4;
    RadioButton option2Q5;
    RadioButton option1Q9;
    CheckBox option1Q2;
    CheckBox option3Q2;
    CheckBox option1Q6;
    CheckBox option3Q6;
    CheckBox option1Q8;
    CheckBox option2Q8;
    CheckBox option3Q8;
    EditText Q3;
    EditText Q7;
    EditText Q10;

    Button submit;
    View progress1;
    View progress2;
    View progress3;
    View progress4;
    View progress5;
    View progress6;
    View progress7;
    View progress8;
    View progress9;
    View progress10;

    RadioGroup question1RadioGroup;
    RadioGroup question4RadioGroup;
    RadioGroup question5RadioGroup;
    RadioGroup question9RadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Other options
        option1Q1 = (RadioButton) findViewById(R.id.option1Q1);
        option3Q1 = (RadioButton) findViewById(R.id.option3Q1);
        option2Q4 = (RadioButton) findViewById(R.id.option2Q4);
        option3Q4 = (RadioButton) findViewById(R.id.option3Q4);
        option1Q5 = (RadioButton) findViewById(R.id.option1Q5);
        option3Q5 = (RadioButton) findViewById(R.id.option3Q5);
        option4Q5 = (RadioButton) findViewById(R.id.option4Q5);
        option2Q9 = (RadioButton) findViewById(R.id.option2Q9);
        option3Q9 = (RadioButton) findViewById(R.id.option3Q9);
        option4Q9 = (RadioButton) findViewById(R.id.option4Q9);
        option2Q2 = (CheckBox) findViewById(R.id.option2Q2);
        option2Q6 = (CheckBox) findViewById(R.id.option2Q6);

        //Answers
        option2Q1 = (RadioButton) findViewById(R.id.option2Q1);
        option1Q4 = (RadioButton) findViewById(R.id.option1Q4);
        option2Q5 = (RadioButton) findViewById(R.id.option2Q5);
        option1Q9 = (RadioButton) findViewById(R.id.option1Q9);
        option1Q2 = (CheckBox) findViewById(R.id.option1Q2);
        option3Q2 = (CheckBox) findViewById(R.id.option3Q2);
        option1Q6 = (CheckBox) findViewById(R.id.option1Q6);
        option3Q6 = (CheckBox) findViewById(R.id.option3Q6);
        option1Q8 = (CheckBox) findViewById(R.id.option1Q8);
        option2Q8 = (CheckBox) findViewById(R.id.option2Q8);
        option3Q8 = (CheckBox) findViewById(R.id.option3Q8);
        Q3 = (EditText) findViewById(R.id.Q3);
        Q7 = (EditText) findViewById(R.id.Q7);
        Q10 = (EditText) findViewById(R.id.Q10);
        submit = (Button) findViewById(R.id.submit);

        question1RadioGroup = (RadioGroup) findViewById(R.id.question1RadioGroup);
        question4RadioGroup = (RadioGroup) findViewById(R.id.question4RadioGroup);
        question5RadioGroup = (RadioGroup) findViewById(R.id.question5RadioGroup);
        question9RadioGroup = (RadioGroup) findViewById(R.id.question9RadioGroup);

        progress1 = findViewById(R.id.progress1);
        progress2 = findViewById(R.id.progress2);
        progress3 = findViewById(R.id.progress3);
        progress4 = findViewById(R.id.progress4);
        progress5 = findViewById(R.id.progress5);
        progress6 = findViewById(R.id.progress6);
        progress7 = findViewById(R.id.progress7);
        progress8 = findViewById(R.id.progress8);
        progress9 = findViewById(R.id.progress9);
        progress10 = findViewById(R.id.progress10);

        progress1.setVisibility(View.INVISIBLE);
        progress2.setVisibility(View.INVISIBLE);
        progress3.setVisibility(View.INVISIBLE);
        progress4.setVisibility(View.INVISIBLE);
        progress5.setVisibility(View.INVISIBLE);
        progress6.setVisibility(View.INVISIBLE);
        progress7.setVisibility(View.INVISIBLE);
        progress8.setVisibility(View.INVISIBLE);
        progress9.setVisibility(View.INVISIBLE);
        progress10.setVisibility(View.INVISIBLE);

        option1Q1.setOnCheckedChangeListener(checkedChangeListener);
        option3Q1.setOnCheckedChangeListener(checkedChangeListener);
        option2Q4.setOnCheckedChangeListener(checkedChangeListener);
        option3Q4.setOnCheckedChangeListener(checkedChangeListener);
        option1Q5.setOnCheckedChangeListener(checkedChangeListener);
        option3Q5.setOnCheckedChangeListener(checkedChangeListener);
        option4Q5.setOnCheckedChangeListener(checkedChangeListener);
        option2Q9.setOnCheckedChangeListener(checkedChangeListener);
        option3Q9.setOnCheckedChangeListener(checkedChangeListener);
        option4Q9.setOnCheckedChangeListener(checkedChangeListener);
        option2Q2.setOnCheckedChangeListener(checkedChangeListener);
        option2Q6.setOnCheckedChangeListener(checkedChangeListener);
        option2Q1.setOnCheckedChangeListener(checkedChangeListener);
        option1Q4.setOnCheckedChangeListener(checkedChangeListener);
        option2Q5.setOnCheckedChangeListener(checkedChangeListener);
        option1Q9.setOnCheckedChangeListener(checkedChangeListener);
        option1Q2.setOnCheckedChangeListener(checkedChangeListener);
        option3Q2.setOnCheckedChangeListener(checkedChangeListener);
        option1Q6.setOnCheckedChangeListener(checkedChangeListener);
        option3Q6.setOnCheckedChangeListener(checkedChangeListener);
        option1Q8.setOnCheckedChangeListener(checkedChangeListener);
        option2Q8.setOnCheckedChangeListener(checkedChangeListener);
        option3Q8.setOnCheckedChangeListener(checkedChangeListener);

        Q3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                progress3.setVisibility(View.VISIBLE);
                progress3.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
            }
        });

        Q7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                progress7.setVisibility(View.VISIBLE);
                progress7.setBackgroundColor(Color.parseColor(getString(R.string.progressColor)));
            }
        });

        Q10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                progress10.setVisibility(View.VISIBLE);
                progress10.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int score = 0;

                if (checkRadioButtons(question1RadioGroup) && checkRadioButtons(question4RadioGroup) && checkRadioButtons(question5RadioGroup) && checkRadioButtons(question9RadioGroup) &&
                        checkCheckBoxes(option1Q2, option2Q2, option3Q2) && checkCheckBoxes(option1Q6, option2Q6, option3Q6) && checkCheckBoxes(option1Q8, option2Q8, option3Q8) &&
                        stringCheck(Q3) && stringCheck(Q7) && stringCheck(Q10)) {

                    if (option2Q1.isChecked()) {
                        score++;
                        progress1.setVisibility(View.VISIBLE);
                        progress1.setBackgroundColor(Color.parseColor((getString(R.string.progressCorrectColor))));
                    } else {
                        progress1.setVisibility(View.VISIBLE);
                        progress1.setBackgroundColor(Color.parseColor((getString(R.string.progressIncorrectColor))));
                    }

                    if (option1Q2.isChecked() && option3Q2.isChecked() && !option2Q2.isChecked()) {
                        progress2.setVisibility(View.VISIBLE);
                        progress2.setBackgroundColor(Color.parseColor((getString(R.string.progressCorrectColor))));
                        score++;
                    } else {
                        progress2.setVisibility(View.VISIBLE);
                        progress2.setBackgroundColor(Color.parseColor((getString(R.string.progressIncorrectColor))));
                    }

                    if (String.valueOf(Q3.getText()).trim().equalsIgnoreCase("Magic Johnson")) {
                        progress3.setVisibility(View.VISIBLE);
                        progress3.setBackgroundColor(Color.parseColor((getString(R.string.progressCorrectColor))));
                        score++;
                    } else {
                        progress3.setVisibility(View.VISIBLE);
                        progress3.setBackgroundColor(Color.parseColor((getString(R.string.progressIncorrectColor))));
                    }

                    if (option1Q4.isChecked()) {
                        progress4.setVisibility(View.VISIBLE);
                        progress4.setBackgroundColor(Color.parseColor((getString(R.string.progressCorrectColor))));
                        score++;
                    } else {
                        progress4.setVisibility(View.VISIBLE);
                        progress4.setBackgroundColor(Color.parseColor((getString(R.string.progressIncorrectColor))));
                    }

                    if (option2Q5.isChecked()) {
                        progress5.setVisibility(View.VISIBLE);
                        progress5.setBackgroundColor(Color.parseColor((getString(R.string.progressCorrectColor))));
                        score++;
                    } else {
                        progress5.setVisibility(View.VISIBLE);
                        progress5.setBackgroundColor(Color.parseColor((getString(R.string.progressIncorrectColor))));
                    }

                    if (option1Q6.isChecked() && option3Q6.isChecked() && !option2Q6.isChecked()) {
                        progress6.setVisibility(View.VISIBLE);
                        progress6.setBackgroundColor(Color.parseColor((getString(R.string.progressCorrectColor))));
                        score++;
                    } else {
                        progress6.setVisibility(View.VISIBLE);
                        progress6.setBackgroundColor(Color.parseColor((getString(R.string.progressIncorrectColor))));
                    }

                    if (String.valueOf(Q7.getText()).trim().equalsIgnoreCase("Michael Jordan")) {
                        progress7.setVisibility(View.VISIBLE);
                        progress7.setBackgroundColor(Color.parseColor((getString(R.string.progressCorrectColor))));
                        score++;
                    } else {
                        progress7.setVisibility(View.VISIBLE);
                        progress7.setBackgroundColor(Color.parseColor((getString(R.string.progressIncorrectColor))));
                    }

                    if (option1Q8.isChecked() && option2Q8.isChecked() && option3Q8.isChecked()) {
                        progress8.setVisibility(View.VISIBLE);
                        progress8.setBackgroundColor(Color.parseColor((getString(R.string.progressCorrectColor))));
                        score++;
                    } else {
                        progress8.setVisibility(View.VISIBLE);
                        progress8.setBackgroundColor(Color.parseColor((getString(R.string.progressIncorrectColor))));
                    }

                    if (option1Q9.isChecked()) {
                        progress9.setVisibility(View.VISIBLE);
                        progress9.setBackgroundColor(Color.parseColor((getString(R.string.progressCorrectColor))));
                        score++;
                    } else {
                        progress9.setVisibility(View.VISIBLE);
                        progress9.setBackgroundColor(Color.parseColor((getString(R.string.progressIncorrectColor))));
                    }

                    if (String.valueOf(Q10.getText()).trim().equalsIgnoreCase("The Detroit Pistons")) {
                        progress10.setVisibility(View.VISIBLE);
                        progress10.setBackgroundColor(Color.parseColor((getString(R.string.progressCorrectColor))));
                        score++;
                    } else {
                        progress10.setVisibility(View.VISIBLE);
                        progress10.setBackgroundColor(Color.parseColor(getString(R.string.progressIncorrectColor)));
                    }

                    if (score == 10)
                        Toast.makeText(MainActivity.this, "You Scored " + score + "/10\nYou really are a Basketball Fan.", Toast.LENGTH_LONG).show();
                    else if (score > 5)
                        Toast.makeText(MainActivity.this, "You Scored " + score + "/10\nNot bad. Not bad at all.", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(MainActivity.this, "You Scored " + score + "/10\nI guess you overestimated yourself.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Please answer all of the questions.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public Boolean checkRadioButtons(RadioGroup rGroup) {
        return rGroup.getCheckedRadioButtonId() != -1;
    }

    private Boolean checkCheckBoxes(CheckBox... checkBoxes) {
        for (CheckBox checkBox : checkBoxes) {
            if (checkBox.isChecked())
                return true;
        }
        return false;
    }

    public Boolean stringCheck(EditText answer) {
        return !answer.getText().toString().isEmpty();
    }

    CompoundButton.OnCheckedChangeListener checkedChangeListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            switch (compoundButton.getId()) {
                case R.id.option1Q1:
                    if (b) {
                        progress1.setVisibility(View.VISIBLE);
                        progress1.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress1.setVisibility(View.VISIBLE);
                        progress1.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;

                case R.id.option2Q1:
                    if (b) {
                        progress1.setVisibility(View.VISIBLE);
                        progress1.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress1.setVisibility(View.VISIBLE);
                        progress1.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;

                case R.id.option3Q1:
                    if (b) {
                        progress1.setVisibility(View.VISIBLE);
                        progress1.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress1.setVisibility(View.VISIBLE);
                        progress1.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;

                case R.id.option1Q2: {
                    if (b) {
                        progress2.setVisibility(View.VISIBLE);
                        progress2.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress2.setVisibility(View.VISIBLE);
                        progress2.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option2Q2: {
                    if (b) {
                        progress2.setVisibility(View.VISIBLE);
                        progress2.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress2.setVisibility(View.VISIBLE);
                        progress2.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option3Q2: {
                    if (b) {
                        progress2.setVisibility(View.VISIBLE);
                        progress2.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress2.setVisibility(View.VISIBLE);
                        progress2.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option1Q4: {
                    if (b) {
                        progress4.setVisibility(View.VISIBLE);
                        progress4.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress4.setVisibility(View.VISIBLE);
                        progress4.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option2Q4: {
                    if (b) {
                        progress4.setVisibility(View.VISIBLE);
                        progress4.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress4.setVisibility(View.VISIBLE);
                        progress4.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option3Q4: {
                    if (b) {
                        progress4.setVisibility(View.VISIBLE);
                        progress4.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress4.setVisibility(View.VISIBLE);
                        progress4.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option1Q5: {
                    if (b) {
                        progress5.setVisibility(View.VISIBLE);
                        progress5.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress5.setVisibility(View.VISIBLE);
                        progress5.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option2Q5: {
                    if (b) {
                        progress5.setVisibility(View.VISIBLE);
                        progress5.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress5.setVisibility(View.VISIBLE);
                        progress5.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option3Q5: {
                    if (b) {
                        progress5.setVisibility(View.VISIBLE);
                        progress5.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress5.setVisibility(View.VISIBLE);
                        progress5.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option4Q5: {
                    if (b) {
                        progress5.setVisibility(View.VISIBLE);
                        progress5.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress5.setVisibility(View.VISIBLE);
                        progress5.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option1Q6: {
                    if (b) {
                        progress6.setVisibility(View.VISIBLE);
                        progress6.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress6.setVisibility(View.VISIBLE);
                        progress6.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option2Q6: {
                    if (b) {
                        progress6.setVisibility(View.VISIBLE);
                        progress6.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress6.setVisibility(View.VISIBLE);
                        progress6.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option3Q6: {
                    if (b) {
                        progress6.setVisibility(View.VISIBLE);
                        progress6.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress6.setVisibility(View.VISIBLE);
                        progress6.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option1Q8: {
                    if (b) {
                        progress8.setVisibility(View.VISIBLE);
                        progress8.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress8.setVisibility(View.VISIBLE);
                        progress8.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option2Q8: {
                    if (b) {
                        progress8.setVisibility(View.VISIBLE);
                        progress8.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress8.setVisibility(View.VISIBLE);
                        progress8.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option3Q8: {
                    if (b) {
                        progress8.setVisibility(View.VISIBLE);
                        progress8.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress8.setVisibility(View.VISIBLE);
                        progress8.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option1Q9: {
                    if (b) {
                        progress9.setVisibility(View.VISIBLE);
                        progress9.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress9.setVisibility(View.VISIBLE);
                        progress9.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option2Q9: {
                    if (b) {
                        progress9.setVisibility(View.VISIBLE);
                        progress9.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress9.setVisibility(View.VISIBLE);
                        progress9.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option3Q9: {
                    if (b) {
                        progress9.setVisibility(View.VISIBLE);
                        progress9.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress9.setVisibility(View.VISIBLE);
                        progress9.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
                case R.id.option4Q9: {
                    if (b) {
                        progress9.setVisibility(View.VISIBLE);
                        progress9.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    } else {
                        progress9.setVisibility(View.VISIBLE);
                        progress9.setBackgroundColor(Color.parseColor((getString(R.string.progressColor))));
                    }
                    break;
                }
            }
        }
    };
}