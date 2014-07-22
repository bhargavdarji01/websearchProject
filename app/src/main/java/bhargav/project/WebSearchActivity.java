package bhargav.project;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class WebSearchActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //attach an instance of HandleClick to the Button
        findViewById(R.id.imageView1).setOnClickListener(new HandleClick());
    }
    private class HandleClick implements OnClickListener{
      public void onClick(View arg0) {
    	  String searchFor=((EditText) findViewById(R.id.editText1)).getText().toString();
    	  Intent viewSearch = new Intent(Intent.ACTION_WEB_SEARCH);
    	  viewSearch.putExtra(SearchManager.QUERY, searchFor);
    	  startActivity(viewSearch);
      }
    }
}