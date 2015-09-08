package com.example.test1;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
	AutoCompleteTextView mAutoCompleteTextView;
	ArrayList <IrregularVerb> verbs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 AutoCompleteTextView ACTextView = (AutoCompleteTextView)findViewById(R.id.autocomplete);
	        //получаем и строим массив verbs
		 	setVerbs();
	        //Адаптер привяжет массив глаголов к выпадающему списку подсказки
	        ArrayAdapter<IrregularVerb> adapter = new ArrayAdapter<IrregularVerb>(this, R.layout.list_item, verbs);
	        //отображаем массив
	        ACTextView.setAdapter(adapter);
	}

	private void setVerbs() {
		// TODO Auto-generated method stub
        //Извлечение массива с описанием глаголов из ресурсов приложения
        String[] resStrings = getResources().getStringArray(R.array.verbs);
        verbs = new ArrayList<IrregularVerb>();
        
        for (String string : resStrings) {
              verbs.add(new IrregularVerb(string));
        }
	}

	
}
