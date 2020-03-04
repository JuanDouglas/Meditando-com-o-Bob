package android.industrias.bob.meditando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
    }
    public void backClickT1(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("quemChamou", "tutorial1");
        startActivity(intent);
    }
    public void proxClick1(View view) {
        Intent intent = new Intent(this,Tutorial2.class);
        startActivity(intent);
    }
}
