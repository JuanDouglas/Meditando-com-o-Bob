package android.industrias.bob.meditando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tutorial3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial3);
    }
    public void proxClick2(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
