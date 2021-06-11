package priya.jk.spinner;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    Spinner cmbspinner;
    ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cmbspinner= findViewById(R.id.cmb_img);
        photo= findViewById(R.id.img1);

        cmbspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String str=String.valueOf(cmbspinner.getSelectedItem());
                if (str.equals("Carnation"))
                {
                    photo.setImageResource(R.drawable.carnation);
                }

                else if (str.equals("White Rose"))
                {
                    photo.setImageResource(R.drawable.whiterose);
                }
                else if (str.equals("Orchid"))
                {
                    photo.setImageResource(R.drawable.orchid);
                }
                else if (str.equals("Lilies"))
                {
                    photo.setImageResource(R.drawable.lily);
                }
                else if (str.equals("Sunflower"))
                {
                    photo.setImageResource(R.drawable.sunflower);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

