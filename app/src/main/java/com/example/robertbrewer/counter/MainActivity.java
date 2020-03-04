package com.example.robertbrewer.counter;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.graphics.Color.red;

public class MainActivity extends AppCompatActivity {

	Button resetBtn;
	Button incrementBtn;
	int offTrailNumber;
	int walkUpNumber;
	int departersNumber;
	int forbiddenNumber;
	int animalNumber;
	int feltLakeNumber;


	TextView numberWalkUpTextView, numberDepartersTextView, numberFeltLakeTextView;
	TextView numberOffTrailTextView, numberForbiddenItemsTextView, numberAnimalsTextView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		numberWalkUpTextView = findViewById(R.id.numberWalkUpTextView);
		numberOffTrailTextView = findViewById(R.id.numberOffTrailTextView);
		numberForbiddenItemsTextView = findViewById(R.id.numberForbiddenItemsTextView);
		numberDepartersTextView = findViewById(R.id.numberDepartersTextView);
		numberFeltLakeTextView = findViewById(R.id.numberFeltLakeTextView);
		numberAnimalsTextView = findViewById(R.id.numberAnimalsTextView);
		resetBtn = findViewById(R.id.resetBtn);



	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.v("Info: ", "On Pause");
		numberOffTrailTextView.setText(String.valueOf(offTrailNumber));
		numberForbiddenItemsTextView.setText(String.valueOf(forbiddenNumber));
		numberWalkUpTextView.setText(String.valueOf(walkUpNumber));
		numberDepartersTextView.setText(String.valueOf(departersNumber));
		numberAnimalsTextView.setText(String.valueOf(animalNumber));
		numberFeltLakeTextView.setText(String.valueOf(feltLakeNumber));
	}

	@Override
	protected void onResume() {
		super.onResume();
		numberOffTrailTextView.setText(String.valueOf(offTrailNumber));
		numberForbiddenItemsTextView.setText(String.valueOf(forbiddenNumber));
		numberWalkUpTextView.setText(String.valueOf(walkUpNumber));
		numberDepartersTextView.setText(String.valueOf(departersNumber));
		numberAnimalsTextView.setText(String.valueOf(animalNumber));
		numberFeltLakeTextView.setText(String.valueOf(feltLakeNumber));

	}


	@Override
	protected void onRestart() {
		super.onRestart();

		numberOffTrailTextView.setText(String.valueOf(offTrailNumber));
		numberForbiddenItemsTextView.setText(String.valueOf(forbiddenNumber));
		numberWalkUpTextView.setText(String.valueOf(walkUpNumber));
		numberDepartersTextView.setText(String.valueOf(departersNumber));
		numberAnimalsTextView.setText(String.valueOf(animalNumber));
		numberFeltLakeTextView.setText(String.valueOf(feltLakeNumber));
	}

	public void reset(View view){


			numberWalkUpTextView.setText("0");
			walkUpNumber = 0;

			numberDepartersTextView.setText("0");
			departersNumber = 0;

			numberOffTrailTextView.setText("0");
			offTrailNumber = 0;

			numberForbiddenItemsTextView.setText("0");
			forbiddenNumber = 0;

			numberAnimalsTextView.setText("0");
			animalNumber = 0;

			numberFeltLakeTextView.setText("0");
			feltLakeNumber = 0;

			playSpecificSound(R.raw.resetbeep);
			//The counter app is also used as a broadcast sender. The broadcast receiver
			// is the app Broadcast Receiver
			//noinspection deprecation
			Intent intent = new Intent ("The counters have been resetted");
			intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
			this.sendBroadcast(intent);







	}

	/*********************************************************************************
	 *  playSpecificSound() plays an audio sound when the pressing the various buttons
	 *  in the app
	 *
	 * @pre none
	 * @parameter none
	 * @post none
	 **********************************************************************************/
	private void playSpecificSound(int resource){
		MediaPlayer mPlayer = MediaPlayer.create(this, resource);
		mPlayer .start();;

	}



	public void incrementAnimal(View view){
		animalNumber =  Integer.parseInt((String) numberAnimalsTextView.getText());
		animalNumber++;
		numberAnimalsTextView.setText(String.valueOf(animalNumber));
		playSpecificSound(R.raw.incrementbeep);
		playSpecificSound(R.raw.decrementbeep);

	}

	public void decrementAnimals(View view){
		animalNumber =  Integer.parseInt((String) numberAnimalsTextView.getText());
		animalNumber--;
		if(animalNumber < 0){//prevents displaying a negative number
			numberAnimalsTextView.setText("0");
			animalNumber = 0;
		}else {
			numberAnimalsTextView.setText(String.valueOf(animalNumber));
		}
		playSpecificSound(R.raw.decrementbeep);
	}

    public void incrementFeltLake(View view){
		feltLakeNumber =  Integer.parseInt((String) numberFeltLakeTextView.getText());
		feltLakeNumber++;
	    numberFeltLakeTextView.setText(String.valueOf(feltLakeNumber));
	    playSpecificSound(R.raw.incrementbeep);

	}

	public void decrementFeltLake(View view){

		feltLakeNumber =  Integer.parseInt((String) numberFeltLakeTextView.getText());
		feltLakeNumber--;
		if(feltLakeNumber < 0){//prevents displaying a negative number
			numberFeltLakeTextView.setText("0");
			feltLakeNumber = 0;
		}else {
			numberFeltLakeTextView.setText(String.valueOf(feltLakeNumber));
		}
		playSpecificSound(R.raw.decrementbeep);
	}

	public void incrementOffTrail(View view){

		//numberOffTrailTextView = findViewById(R.id.numberOffTrailTextView);
		 offTrailNumber =  Integer.parseInt((String) numberOffTrailTextView.getText());
		offTrailNumber++;
		numberOffTrailTextView.setText(String.valueOf(offTrailNumber));
		playSpecificSound(R.raw.incrementbeep);
	}


	public void decrementOffTrail(View view){

		//numberOffTrailTextView = findViewById(R.id.numberOffTrailTextView);
		offTrailNumber =  Integer.parseInt((String) numberOffTrailTextView.getText());
		offTrailNumber--;
		if(offTrailNumber < 0){//prevents displaying a negative number
			numberOffTrailTextView.setText("0");
			offTrailNumber = 0;
		}else {
			numberOffTrailTextView.setText(String.valueOf(offTrailNumber));
		}
		playSpecificSound(R.raw.decrementbeep);
	}


	public void incrementForbiddenItems(View view){

		//numberForbiddenItemsTextView = findViewById(R.id.numberForbiddenItemsTextView);
		forbiddenNumber =  Integer.parseInt((String) numberForbiddenItemsTextView.getText());
		forbiddenNumber++;
		numberForbiddenItemsTextView.setText(String.valueOf(forbiddenNumber));
		playSpecificSound(R.raw.incrementbeep);
	}


	public void decrementForbiddenItems(View view){

		//numberForbiddenItemsTextView = findViewById(R.id.numberForbiddenItemsTextView);
		forbiddenNumber =  Integer.parseInt((String) numberForbiddenItemsTextView.getText());
		forbiddenNumber--;
		if(forbiddenNumber < 0){//prevents displaying a negative number
			numberForbiddenItemsTextView.setText("0");
			forbiddenNumber = 0;
		}else {
			numberForbiddenItemsTextView.setText(String.valueOf(forbiddenNumber));
		}
		playSpecificSound(R.raw.decrementbeep);
	}



	public void incrementWalkUps(View view){

		//numberWalkUpTextView = findViewById(R.id.numberWalkUpTextView);
		walkUpNumber =  Integer.parseInt((String) numberWalkUpTextView.getText());
		walkUpNumber++;
		numberWalkUpTextView.setText(String.valueOf(walkUpNumber));
		playSpecificSound(R.raw.incrementbeep);
	}

	public void decrementWalkUps(View view){

		//numberWalkUpTextView = findViewById(R.id.numberWalkUpTextView);
		walkUpNumber =  Integer.parseInt((String) numberWalkUpTextView.getText());
		walkUpNumber--;
		if(walkUpNumber < 0){//prevents displaying a negative number
			numberWalkUpTextView.setText("0");
			walkUpNumber = 0;
		}else {
			numberWalkUpTextView.setText(String.valueOf(walkUpNumber));
		}
		playSpecificSound(R.raw.decrementbeep);
	}

	public void incrementDeparters(View view){
		//numberDepartersTextView = findViewById(R.id.numberDepartersTextView);
		departersNumber =  Integer.parseInt((String) numberDepartersTextView.getText());
		departersNumber++;
		numberDepartersTextView.setText(String.valueOf(departersNumber));
		playSpecificSound(R.raw.incrementbeep);
	}

	public void decrementDeparters(View view){
		//numberDepartersTextView = findViewById(R.id.numberDepartersTextView);
		departersNumber =  Integer.parseInt((String) numberDepartersTextView.getText());
		departersNumber--;
		if(departersNumber < 0){//prevents displaying a negative number
			numberDepartersTextView.setText("0");
			departersNumber = 0;
		}else {
			numberDepartersTextView.setText(String.valueOf(departersNumber));
		}
		playSpecificSound(R.raw.decrementbeep);
	}

}
