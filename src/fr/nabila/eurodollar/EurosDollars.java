package fr.nabila.eurodollar;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EurosDollars extends Activity  implements OnClickListener{
	private TextView textViewDollar;
	private Button buttonValider;
	private EditText editTextEuro;
	private EditText editTextCours;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.euros_dollars);
		
		textViewDollar=(TextView) findViewById(R.id.textViewDollar);
		buttonValider=(Button) findViewById(R.id.buttonValider);
		editTextEuro=(EditText) findViewById(R.id.editTextEuro);
		editTextCours=(EditText) findViewById(R.id.editTextCours);

		
		buttonValider.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.euros_dollars, menu);
		return true;
	}

	@Override
	public void onClick(View vue) {
		// TODO Auto-generated method stub
		
		if(vue==buttonValider){
			double euro=Double.parseDouble(editTextEuro.getText().toString());
			double taux=Double.parseDouble(editTextCours.getText().toString());
			String rst=String.valueOf((euro*taux));
			textViewDollar.setText(rst);

		}
		
		
		
	}

}
