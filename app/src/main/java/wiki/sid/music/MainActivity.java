package wiki.sid.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tagsButton = (Button)findViewById(R.id.tagss);
        tagsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Tags.class );
                startActivity(i);
            }
        });
    }

    public void song(View view){
        Intent a = new Intent(this, Songs.class);
        startActivity(a);
    }
    public void artist(View view){
        Intent b = new Intent(this, Artists.class);
        startActivity(b);
    }
    public void  album(View view){
        Intent c = new Intent(this, Albums.class);
        startActivity(c);
    }
}
