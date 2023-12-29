package ahudon.cs395f22.com.tictactoe;
/*
 * Application Title:TicTacToe
 * Author: Aaron Hudon
 * Keene State College Computer Science
 * Date: September 2022
 * Purpose:  holds the methods of onCreate playButtonClick to start activity .
 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playButtonClick(View view) {
        Intent intent = new Intent(this, PlayerSetup.class);
        startActivity(intent);
    }
}