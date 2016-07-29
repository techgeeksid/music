package wiki.sid.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.icu.text.RelativeDateTimeFormatter.Direction.THIS;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button2(View view){
        Intent i = new Intent(this, tags.class );
        startActivity(i);
    }
    public void button3(View view){
        Intent a = new Intent(this, songs.class);
        startActivity(a);
    }
    public void button4(View view){
        Intent b = new Intent(this, artists.class);
        startActivity(b);
    }
    public void  button5(View view){
        Intent c = new Intent(this, albums.class);
        startActivity(c);
    }
}
