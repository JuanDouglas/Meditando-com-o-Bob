package android.industrias.bob.meditando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int quemChamou;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void obj1Click(View view) {
        Intent intent = new Intent(this, FicarSussa.class);
        startActivity(intent);
    }

    public void backClickMain(View view) {
        Intent intent = new Intent(this,Tutorial.class);
        startActivity(intent);
    }
}
