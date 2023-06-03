package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.net.HttpCookie;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private Map<String, Button> buttonsMap = new HashMap<>();

    private Button button1;  private Button button2; private Button button3; private Button button4;
    private Button button5;  private Button button6; private Button button7; private Button button8;


    private FirebaseDatabase reff;



    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("  Home");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.home);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


       button1 = findViewById(R.id.b1); button2 = findViewById(R.id.b2); button3 = findViewById(R.id.b3); button4 = findViewById(R.id.b4);
       button5 = findViewById(R.id.b5); button6 = findViewById(R.id.b6); button7 = findViewById(R.id.b7); button8 = findViewById(R.id.b8);


       button1.setEnabled(false); button2.setEnabled(false); button3.setEnabled(false); button4.setEnabled(false);
       button5.setEnabled(false); button6.setEnabled(false); button7.setEnabled(false); button8.setEnabled(false);


            buttonsMap.put("button1", findViewById(R.id.b1));
            buttonsMap.put("button2", findViewById(R.id.b2));
            buttonsMap.put("button3", findViewById(R.id.b3));
            buttonsMap.put("button4", findViewById(R.id.b4));
            buttonsMap.put("button5", findViewById(R.id.b5));
            buttonsMap.put("button6", findViewById(R.id.b6));
            buttonsMap.put("button7", findViewById(R.id.b7));
            buttonsMap.put("button8", findViewById(R.id.b8));




        reff= FirebaseDatabase.getInstance("https://esp8-e5405-default-rtdb.europe-west1.firebasedatabase.app/");

       // reff= FirebaseDatabase.getInstance("https://aman-parking-913bd-default-rtdb.europe-west1.firebasedatabase.app/");


        reff.getReference("PLACE_1").addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                    int x1 = datasnapshot.getValue(Integer.class);
                    updateButtonColor("button1", x1);

                    /*
                    if (x == 1){
                        butn.setBackgroundColor(getResources().getColor(R.color.red));

                    } else {
                        butn.setBackgroundColor(getResources().getColor(R.color.green));

                    }

                     */

                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

        reff.getReference("PLACE_2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                int x2 = datasnapshot.getValue(Integer.class);
                updateButtonColor("button2", x2);

                /*
                if (y == 1){
                    butn2.setBackgroundColor(getResources().getColor(R.color.red));
                } else {
                    butn2.setBackgroundColor(getResources().getColor(R.color.green));
                }*/

            }            

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff.getReference("PLACE_3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                int x3 = datasnapshot.getValue(Integer.class);
                updateButtonColor("button3", x3);

                /*
                if (z == 1){
                    butn3.setBackgroundColor(getResources().getColor(R.color.red));
                } else {
                    butn3.setBackgroundColor(getResources().getColor(R.color.green));
                }*/

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff.getReference("PLACE_4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                int x4 = datasnapshot.getValue(Integer.class);
                updateButtonColor("button4", x4);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff.getReference("PLACE_5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                int x5 = datasnapshot.getValue(Integer.class);
                updateButtonColor("button5", x5);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff.getReference("PLACE_6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                int x6 = datasnapshot.getValue(Integer.class);
                updateButtonColor("button6", x6);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff.getReference("PLACE_7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                int x7 = datasnapshot.getValue(Integer.class);
                updateButtonColor("button7", x7);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        reff.getReference("PLACE_8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                int x8 = datasnapshot.getValue(Integer.class);
                updateButtonColor("button8", x8);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



        }

    private void updateButtonColor(String buttonId, int value) {
        Button button = buttonsMap.get(buttonId);
        if (button != null) {
            if (value == 1) {
                button.setBackgroundColor(getResources().getColor(R.color.red));
            } else {
                button.setBackgroundColor(getResources().getColor(R.color.green));
            }
        }
    }








    private boolean isRed = true;

    public void toggle(View v) {
        /* // here you specified the button that you're working with
        View myView = findViewById(R.id.button3);
        myView.setEnabled(false);
        Button b = (Button) myView;
        b.setText("new disabled");
        */
        /* // but here this instruction will be applied to any button .. when you clic on it
        v.setEnabled(false);
        Button b = (Button) v;
        b.setText("disabled");*/
    }


    public void launchAbout(View v){
        Intent a = new Intent(this, About.class);
        startActivity(a);
    }

    public void launchSettings(View v) {
        Intent i = new Intent(this, settingsActivity.class);
        startActivity(i);

       /* TextView t = findViewById(R.id.source); // source : the area when we enter the data
        String input = t.getText().toString();
        ((TextView) findViewById(R.id.output)).setText(input); // output : the textView that we will change
        Toast.makeText(this,input, Toast.LENGTH_LONG).show();//like an alert */
    }







    /*
    public int learnn(Button button) {
        Drawable buttonDrawable = button.getBackground();
        int buttonColor = Color.TRANSPARENT;
        if (buttonDrawable instanceof ColorDrawable) {
            buttonColor = ((ColorDrawable) buttonDrawable).getColor();
        }
        return buttonColor;
    }*/

    /*
    public String colorStr(Button button) {
        int buttonColor = learnn(button);
        return String.format("#%06X", (0xFFFFFF & buttonColor));
    }

    public void learn(View v){
            if (isRed) {
                v.setBackgroundColor(getResources().getColor(R.color.green));
                isRed = false;
            } else {
                v.setBackgroundColor(getResources().getColor(R.color.red));
                isRed = true;
            }
    //v.setBackgroundColor(getResources().getColor(R.color.red));
    }
*/






}