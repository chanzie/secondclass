/** COPYRIGHT (C) 2018 Amy Wilson . All Rights Reserved.
 * This is the classwork to demonstrate comments for Lamda Intro to Android module 2.0
 *
 * @author Amy Wilson
 * @version 1.0
 */

package com.lambdaschool.secondclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class java1 extends AppCompatActivity {

    TextView nameText;
    TextView hobbiesText;
    TextView whyText;
    TextView psText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java1);

        //display the first part of the class activity
        nameText = findViewById(R.id.name_text);
        nameText.setText("Name: Amy Wilson");

        //display the second part of the class activity
        hobbiesText = findViewById(R.id.hobbies_text);
        hobbiesText.setText("Hobbies: Yoga, Photography, Video Game Streamer, Graphic Design, Swimming" );

        //display the third part of the class activity
        whyText=findViewById(R.id.why_text);
        whyText.setText("I started programming back when Commadore 64 was out and took to it like a duck to water. As I grew older and the systems changed as well as the coding my brain became a sponge always wanting to learn more... I have social problems with anxiety which so far has lead me to have great issues in a normal college enviroment so am hoping that this way I can learn to do more with the skillset that I have and put it to good use serving people with disabilities using the technology today to make there lives more normal insted of the continous uphill battle they face in ever other aspect of their lives.");

        //display a ps that explains why I did this activity in the android enviroment instead of the java one
        psText = findViewById(R.id.ps_text);
        psText.setText("P.S. I really dislike the java complier that we were sent to because I loathe Serif fonts in any aspect, yes I know that is the usual font used in programming compliers but compliers like the android one you can set them custom to be non serif fonts as you program them and that allows me to read the code better. So for other than the assignment the class work that was done in class as you can see I performed in the android enviroment.");
    }
}
