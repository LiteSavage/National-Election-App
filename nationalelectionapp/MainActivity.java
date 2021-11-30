package com.example.nationalelectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.MediaRouteButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public String Stringvar1="";
    public String Stringvar2="";
    public int intvar = 0;


    public ArrayList<candidates> mcandidatesName;
    public candidatesAdapter mAdapter;
    public Button submit;

    Spinner spinner1, spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.btnsubmit);













        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);

        String positions[]={"President","Vice President"};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,positions);
        spinner1.setAdapter(adapter);


        // For changing spinner area

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String ItemSelect = positions[position];

                if (position == 0) {
                    Pres();
                    Spinner spinnercandidates = findViewById(R.id.spinner2);
                    mAdapter = new candidatesAdapter(MainActivity.this, mcandidatesName);
                    spinnercandidates.setAdapter(mAdapter);
                    spinnercandidates.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            candidates clickedItem = (candidates) parent.getItemAtPosition(position);
                            String clickedCandidatesName = clickedItem.getcandidatesName();
                            Toast.makeText(MainActivity.this, clickedCandidatesName + " selected", Toast.LENGTH_SHORT).show();




                            //BUTTON SAD DIRI NA AREA
                            submit.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (position == 0){
                                        String data = "Christopher Lawrence \"Bong\" Tesoro Go is a Filipino politician\n" +
                                                "serving as a Senator since 2019. He previously served in President Rodrigo Duterte's Cabinet\n" + 
                                                "as Special Assistant to the President and Head of the\n" + 
                                                "Presidential Management Staff from June 2016 to October 2018.";
                                        Intent intent = new Intent( MainActivity.this, Presidentz.class);
                                        intent.putExtra("key", data);
                                        startActivity(intent);
                                        finish();
                                    }
                                    if(position == 1){
                                        String data = "Ferdinand \"Bongbong\" Romualdez Marcos Jr.  \n  (born September 13, 1957) is a Filipino \n" +
                                                "politician who served as a senator from 2010 to 2016. \n" + "He is the second child and only son of the president and dictator Ferdinand Marcos Sr.\n " +
                                                "and former First Lady Imelda Romualdez Marcos.";
                                        Intent intent = new Intent( MainActivity.this, Presidentz.class);
                                        intent.putExtra("key", data);
                                        startActivity(intent);
                                        finish();
                                    }
                                    if(position == 2){
                                        String data = "Rastaman, also known as Rolando Plaza, was an icon during the 2019 senatorial elections. With his facial tattoos and animated personality, he quickly went viral and became a living meme—not just because of his ideals and plans, but because he had the most hilarious answer to a question reserved for candidates. ";
                                        Intent intent = new Intent( MainActivity.this, Presidentz.class);
                                        intent.putExtra("key", data);
                                        startActivity(intent);
                                        finish();
                                    }
                                    if(position == 3){
                                        String data = "Maria Leonor \"Leni\" Gerona Robredo (born Maria Leonor Santo Tomas Gerona; April 23, 1965) is a Filipina lawyer, politician, and social activist who is the 14th and incumbent vice president of the Philippines. Robredo was the wife of the late Interior Secretary Jesse Robredo.";
                                        Intent intent = new Intent( MainActivity.this, Presidentz.class);
                                        intent.putExtra("key", data);
                                        startActivity(intent);
                                        finish();
                                    }
                                    if(position == 4){
                                        String data = "Lacson is one of the authors and the sponsor in the Senate of what is now Republic Act 11479, the Anti-Terrorism Act of 2020, signed into law by President Rodrigo Duterte on July 3, 2020.";
                                        Intent intent = new Intent( MainActivity.this, Presidentz.class);
                                        intent.putExtra("key", data);
                                        startActivity(intent);
                                        finish();
                                    }
                                    if(position == 5){
                                        String data = "Francisco Moreno Domagoso (born October 24, 1974), also known by his stage name Isko Moreno, is a Filipino politician & actor currently serving as the 22nd mayor of Manila since 2019. ... He entered politics in 1998 and ran for councilor & was elected for three consecutive terms as a member of the Manila City Council.";
                                        Intent intent = new Intent( MainActivity.this, Presidentz.class);
                                        intent.putExtra("key", data);
                                        startActivity(intent);
                                        finish();
                                    }
                                    if(position == 6){
                                        String data = "Manny Pacquiao is a Filipino professional boxer, media celebrity, and politician who became world-famous for winning boxing titles in more weight classes than any other boxer in history. He rose from abject poverty to the pinnacle of his sport, and he also eventually became a senator in the Philippines.";
                                        Intent intent = new Intent( MainActivity.this, Presidentz.class);
                                        intent.putExtra("key", data);
                                        startActivity(intent);
                                        finish();
                                    }

                                }
                            });


                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }
                if (position == 1){
                    initList();
                    Spinner spinnercandidates = findViewById(R.id.spinner2);
                    mAdapter = new candidatesAdapter(MainActivity.this, mcandidatesName);
                    spinnercandidates.setAdapter(mAdapter);
                    spinnercandidates.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            candidates clickedItem = (candidates) parent.getItemAtPosition(position);
                            String clickedCandidatesName = clickedItem.getcandidatesName();
                            Toast.makeText(MainActivity.this, clickedCandidatesName + " selected", Toast.LENGTH_SHORT).show();

                        //BUTTON PARA SA VICE PRESIDENT
                            submit.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    if (position == 0){
                                        String data = "Sara Zimmerman Duterte-Carpio, commonly known as Inday Sara, is a Filipina lawyer and politician serving as the mayor of Davao City since 2016, and previously from 2010 to 2013. Prior to her mayoral term, she served as vice mayor of Davao City from 2007 to 2010.";
                                        Intent intent = new Intent( MainActivity.this, Presidentz.class);
                                        intent.putExtra("key", data);
                                        startActivity(intent);
                                        finish();
                                    }
                                    if(position == 1){
                                        String data = "Francis Pancratius \"Kiko\" Nepomuceno Pangilinan is a Filipino lawyer, politician, and farmer serving as a Senator of the Philippines since 2016, and previously from 2001 to 2013";
                                        Intent intent = new Intent( MainActivity.this, Presidentz.class);
                                        intent.putExtra("key", data);
                                        startActivity(intent);
                                        finish();
                                    }
                                    if(position == 2){
                                        String data = "Jose \"Lito\" Livioko Atienza Jr. is a Filipino politician serving as the Party-list Representative for Buhay since 2013, and as a House Deputy Speaker since November 2020.";
                                        Intent intent = new Intent( MainActivity.this, Presidentz.class);
                                        intent.putExtra("key", data);
                                        startActivity(intent);
                                        finish();
                                    }
                                    if(position == 3){
                                        String data = "Willie Tan Ong is a Filipino cardiologist, media personality and politician who rose to prominence for giving medical advice through his Facebook page with large following and his YouTube channel. Ong was also a candidate for the 2019 Philippine Senate election, largely capitalizing on his social media following.";
                                        Intent intent = new Intent( MainActivity.this, Presidentz.class);
                                        intent.putExtra("key", data);
                                        startActivity(intent);
                                        finish();
                                    }
                                    if(position == 4){
                                        String data = "Vicente \"Tito\" Castelo Sotto III is a Filipino politician and television presenter serving as the Senate President of the Philippines since 2018.";
                                        Intent intent = new Intent( MainActivity.this, Presidentz.class);
                                        intent.putExtra("key", data);
                                        startActivity(intent);
                                        finish();
                                    }


                                }
                            });

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        // BUTTON NI DIRI NA AREA














    }
    private void Pres() {
        mcandidatesName = new ArrayList<>();
        mcandidatesName.add(new candidates("Bong Go", R.drawable.bonggo));
        mcandidatesName.add(new candidates("BongBong Marcos", R.drawable.bongbong));
        mcandidatesName.add(new candidates("RastaMan Yo", R.drawable.rastaman));
        mcandidatesName.add(new candidates("Leni Robredo", R.drawable.leni));
        mcandidatesName.add(new candidates("Panfilo Lacson", R.drawable.pammy));
        mcandidatesName.add(new candidates("Isko Moreno", R.drawable.isko));
        mcandidatesName.add(new candidates("Manny Pacquiao", R.drawable.manny));
    }

    private void initList() {
        mcandidatesName = new ArrayList<>();
        mcandidatesName.add(new candidates("Sara Duterte", R.drawable.inday));
        mcandidatesName.add(new candidates("Francis Pangilinan", R.drawable.monkey));
        mcandidatesName.add(new candidates("Lito Atienza", R.drawable.robert));
        mcandidatesName.add(new candidates("Willie Ong", R.drawable.willie));
        mcandidatesName.add(new candidates("Tito Sotto", R.drawable.tito));
    }


}