package sg.edu.rp.c346.facilitatorname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import sg.edu.rp.c346.facilitatorname.R;

public class MainActivity extends AppCompatActivity {
    //Step 1 Import the
    ListView lvName;
    ArrayList<String> alNameList;
    ArrayAdapter<String> aaName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvName = (ListView) findViewById(R.id.faciName);
        alNameList = new ArrayList<String>();
        aaName = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alNameList);
        lvName.setAdapter(aaName);
        alNameList.add("Yow Hon Kong");
        alNameList.add("Wong Wai Ling");
    }
}
