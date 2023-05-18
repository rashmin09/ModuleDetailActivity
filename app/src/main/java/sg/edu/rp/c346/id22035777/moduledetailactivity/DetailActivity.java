package sg.edu.rp.c346.id22035777.moduledetailactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView tvCode, tvName, tvYear, tvSemester, tvCredit, tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvCode = findViewById(R.id.tvCode);
        tvName = findViewById(R.id.tvName);
        tvYear = findViewById(R.id.tvYear);
        tvSemester = findViewById(R.id.tvSemester);
        tvCredit = findViewById(R.id.tvCredit);
        tvVenue = findViewById(R.id.tvVenue);

        Intent intentReceived = getIntent();
        Module module = (Module) intentReceived.getSerializableExtra("name");
        String code = module.getModuleCode();
        String name = module.getModuleName();
        int year = module.getAcademicYear();
        int semester = module.getSemester();
        double credit = module.getModuleCredit();
        String venue = module.getVenue();

        tvCode.setText("Module Code: " + code);
        tvName.setText("Module Name: " + name);
        tvYear.setText("Academic Year: " + year);
        tvSemester.setText("Semester: " + semester);
        tvCredit.setText("Module Credit: " + credit);
        tvVenue.setText("Venue: " + venue);
    }
}