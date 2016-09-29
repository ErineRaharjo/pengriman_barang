package id.sch.smktelkom_mlg.tugas01.xiirpl3014.pengriman_barang;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText et_name,et_name_tuj;
    Spinner spinner_country;
    RadioGroup paket;
    CheckBox dokumen,barang;
    RadioButton yes,reguler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = (Button)findViewById(R.id.button);
        et_name=(EditText)findViewById(R.id.txt_name);
        et_name_tuj=(EditText)findViewById(R.id.txt_nametuj);
        spinner_country = (Spinner)findViewById(R.id.spinner);
        paket = (RadioGroup)findViewById(R.id.radiogroup);
        dokumen=(CheckBox)findViewById(R.id.ck_dokumen);
        barang=(CheckBox)findViewById(R.id.barang_lain);
        yes = (RadioButton)findViewById(R.id.rd_yes);
        reguler=(RadioButton)findViewById(R.id.rd_reguler);




        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_name.getText().toString();
                String name_tuj = et_name_tuj.getText().toString();

                if(name_tuj.isEmpty()){
                    et_name.setError("tidak boleh kosong");
                }else if (name.isEmpty()){
                    et_name_tuj.setError("tidak boleh kosong");
                }else if(!reguler.isChecked()&&!yes.isChecked()){
                    Toast.makeText(MainActivity.this,"pilih salah satu paket",Toast.LENGTH_LONG).show();
                }else if(!dokumen.isChecked()&&!barang.isChecked()){
                    Toast.makeText(MainActivity.this,"pilih salah satu jenis",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this,"nama : "+et_name.getText()+"nama tjuan : "+et_name_tuj.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void initview() {
        submit = (Button)findViewById(R.id.button);
        et_name=(EditText)findViewById(R.id.txt_name);
        et_name_tuj=(EditText)findViewById(R.id.txt_nametuj);

    }
}
