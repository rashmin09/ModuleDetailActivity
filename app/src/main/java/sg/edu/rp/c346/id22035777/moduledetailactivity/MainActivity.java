package sg.edu.rp.c346.id22035777.moduledetailactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2;

        ArrayList<Module> modules = new ArrayList<>();
        Module module1 = new Module("C203", "Web App Development", 2023, 1, 3.69, "W65D");
        Module module2 = new Module("C346", "Mobile App Development", 2023, 1, 3.69, "E63A");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        modules.add(module1);
        modules.add(module2);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("name",module1);
                startActivity(intent);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("name", module2);
                startActivity(intent);
            }
        });
    }
}