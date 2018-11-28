package fall2018.csc2017.games.Ttt;

import android.content.Intent;
import android.os.Bundle;

import fall2018.csc2017.games.GameScreenActivity;
public class TttScreenActivity extends GameScreenActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        game = new TttManager("double");
        String username = getIntent().getStringExtra("USERNAME");
        SAVE_FILENAME = username + "_" + game.getGameId() + "_save_file.ser";
        super.onCreate(savedInstanceState);
    }

    /**
     * Start a new Tic Tac toe game
     */
    protected void switchToNewGame() {
        Intent tmp = new Intent(this, TttComplexityActivity.class);
        startActivity(tmp);
    }

    /**
     * Start a loaded Tic Tac toe game
     */
    protected void switchToGame() {
        Intent tmp = new Intent(this, TttActivity.class);
        saveToFile(SAVE_FILENAME);
        startActivity(tmp);
    }
}