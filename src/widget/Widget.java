package widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.RemoteViews;

import com.emon.nirapodthdhaka.R;

public class Widget extends  AppWidgetProvider{
	
	Button imagePolice;
	
	

	@Override
	 public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
	 //   Log.d(LOG_TAG, "onUpdate(): ");
		
	
	    for (int appWidgetId : appWidgetIds) {

	        Intent callIntent = new Intent(Intent.ACTION_CALL);
	        callIntent.setData(Uri.parse("tel:999"));
	        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, callIntent, 0);

	        // Get the layout for the App Widget and attach an on-click listener to the button
	        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget);
	        views.setOnClickPendingIntent(R.id.imageButtonWidget, pendingIntent);
	        
	        
	        

	        // Tell the AppWidgetManager to perform an update on the current App Widget
	        appWidgetManager.updateAppWidget(appWidgetId, views);
	    }
	}
}