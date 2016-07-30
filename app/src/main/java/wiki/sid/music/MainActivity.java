package wiki.sid.music;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.icu.text.RelativeDateTimeFormatter.Direction.THIS;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public class MyActivity extends Activity {
        protected void onCreate(Bundle icicle) {
            super.onCreate(icicle);

            setContentView(R.layout.content_layout_id);

            final Button button = (Button) findViewById(R.id.tagss);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Perform action on click
                    Intent i = new Intent(this, tags.class);
                    startActivity(i);
                }
            });
        }
    }


        public void song(View view){
        Intent a = new Intent(this, songs.class);
        startActivity(a);
    }
    public void artist(View view){
        Intent b = new Intent(this, artists.class);
        startActivity(b);
    }
    public void  album(View view){
        Intent c = new Intent(this, albums.class);
        startActivity(c);
    }
}
