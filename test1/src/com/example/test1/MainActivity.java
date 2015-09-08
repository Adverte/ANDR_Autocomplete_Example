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
	        //�������� � ������ ������ verbs
		 	setVerbs();
	        //������� �������� ������ �������� � ����������� ������ ���������
	        ArrayAdapter<IrregularVerb> adapter = new ArrayAdapter<IrregularVerb>(this, R.layout.list_item, verbs);
	        //���������� ������
	        ACTextView.setAdapter(adapter);
	}

	private void setVerbs() {
		// TODO Auto-generated method stub
        //���������� ������� � ��������� �������� �� �������� ����������
        String[] resStrings = getResources().getStringArray(R.array.verbs);
        verbs = new ArrayList<IrregularVerb>();
        
        for (String string : resStrings) {
              verbs.add(new IrregularVerb(string));
        }
	}

	
}
