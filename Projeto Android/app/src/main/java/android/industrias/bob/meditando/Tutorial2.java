package android.industrias.bob.meditando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tutorial2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial2);
    }

    public void backClickT2(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("quemChamou", "tutorial1");
        startActivity(intent);
    }
    public void proxClick2(View view) {
        Intent intent = new Intent(this,Tutorial3.class);
        startActivity(intent);
    }
}
