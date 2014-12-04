package edu.np.ece.mapg.mp1.s10146925;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	int mynumber = 5;
	EditText etnumber;
	TextView textView1;
	Button btGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnumber = (EditText) this.findViewById(R.id.etnumber);
        textView1 = (TextView) this.findViewById(R.id.textView1);
        btGuess = (Button) this.findViewById(R.id.btGuess);
        btGuess.setOnClickListener(listener);
    }
    
    private View.OnClickListener listener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			try {
				String message;
				String str = etnumber.getText().toString();
				float num = Float.parseFloat(str);
				if (num == 5)
				{
					message = "Bingo! Correct number.";
					Toast.makeText(getBaseContext(), message, Toast.LENGTH_LONG).show();
				}
				else
				{
					message = "Try again!";
					Toast.makeText(getBaseContext(), message, Toast.LENGTH_LONG).show();
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				String message = "enter a number";
				Toast.makeText(getBaseContext(), message, Toast.LENGTH_LONG).show();
				e.printStackTrace();
			}
			
			
			// TODO Auto-generated method stub
			
		}
	};


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
