package sg.edu.rp.c346.id20014518.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    ArrayList<String> fruits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("ArrayList");

        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add(3,"durian"); //2b

        tv = findViewById(R.id.textView);

        String text = "Fruits\n";
        text += "=====\n";

        String theFruit = fruits.get(1); //2c
        fruits.remove(0); //2d
        fruits.set(fruits.size()-1,"dragon fruit"); //2e

        for (int i = 0; i < fruits.size(); i++){
            text += fruits.get(i) + "\n";
        }
        tv.setText(text);
    }
}