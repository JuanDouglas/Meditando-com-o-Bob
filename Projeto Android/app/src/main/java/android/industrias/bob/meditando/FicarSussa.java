package android.industrias.bob.meditando;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class FicarSussa extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private boolean Playing;
    private int Duration;
    private SeekBar bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficar_sussa);
        Update();
    }

    public void backClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        intent.putExtra("quemChamou", "tutorial1");
    }

    public void onPlayAndPause(View view) {
        if(Playing){
            mediaPlayer.pause();
        }else{
            if(mediaPlayer!=null){
                if(mediaPlayer.isPlaying()==false){
                    mediaPlayer.start();
                }
            }else{
                mediaPlayer = MediaPlayer.create(this,R.raw.meditacao);
                mediaPlayer.start();
            }
        }
        updateBar();
    }
    private void Update(){
        bar=(SeekBar)findViewById(R.id.musicBar);
        bar.setClickable(false);
        if(mediaPlayer==null){
            TextView textView = findViewById(R.id.txtDuracao);
            mediaPlayer = MediaPlayer.create(this,R.raw.meditacao);
            textView.setText("2:61");
        }else{
            if(mediaPlayer.isPlaying()==false){
                TextView textView = findViewById(R.id.txtDuracao);
                mediaPlayer = MediaPlayer.create(this,R.raw.meditacao);
                textView.setText("2:61");
            }

        }

    }

    private void updateBar(){

        Playing = mediaPlayer.isPlaying();
        Duration=mediaPlayer.getDuration();
    bar.setMax(Duration);
    bar.setProgress(mediaPlayer.getCurrentPosition());
    }
}
