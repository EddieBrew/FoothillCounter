package com.example.robertbrewer.counter;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by Robert Brewer on 3/5/2018.
 */
public class MainActivityTest {
	@Rule
	public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    int counter = 0;
	@Before
	public void setUp() throws Exception {

	}


	@Test
	public void testButtonNTextFunctions(){

		// close softkey, if open
		Espresso.closeSoftKeyboard();

		counter =0;
		for( int i = 0; i < 7; i++){
			Espresso.onView(withId(R.id.incrementFeltLakebtn)).perform(click());
			counter++;
		}
		for (int j = 0; j < 3; j++) {
			Espresso.onView(withId(R.id.numberFeltLakeTextView)).perform(click());
			counter--;
		}
		Espresso.onView(withId(R.id.numberFeltLakeTextView)).check(matches(withText(Integer.toString(counter))));


		counter =0;
		for( int i = 0; i < 7; i++){
			Espresso.onView(withId(R.id.incrementAnimalsbtn)).perform(click());
			counter++;
		}
		for (int j = 0; j < 3; j++) {
			Espresso.onView(withId(R.id.numberAnimalsTextView)).perform(click());
			counter--;
		}
		Espresso.onView(withId(R.id.numberAnimalsTextView)).check(matches(withText(Integer.toString(counter))));
		//increment wlkup text vie vale


		counter =0;
		for( int i = 0; i < 7; i++){
			Espresso.onView(withId(R.id.incrementOffTrailbtn)).perform(click());
			counter++;
		}
		for (int j = 0; j < 3; j++) {
			Espresso.onView(withId(R.id.numberOffTrailTextView)).perform(click());
			counter--;
		}
		Espresso.onView(withId(R.id.numberOffTrailTextView)).check(matches(withText(Integer.toString(counter))));


		counter =0;
		for( int i = 0; i < 8; i++) {
			Espresso.onView(withId(R.id.incrementForbiddenItemsbtn)).perform(click());
			counter++;
		}
		for (int j = 0; j < 3; j++) {
			Espresso.onView(withId(R.id.numberForbiddenItemsTextView)).perform(click());
			counter--;
		}
		Espresso.onView(withId(R.id.numberForbiddenItemsTextView)).check(matches(withText(Integer.toString(counter))));


		counter =0;
		for( int i = 0; i < 10; i++) {
			Espresso.onView(withId(R.id.incrementWalkUpsbtn)).perform(click());
			counter++;
		}
		for (int j = 0; j < 3; j++) {
			Espresso.onView(withId(R.id.numberWalkUpTextView)).perform(click());
			counter--;
		}
		Espresso.onView(withId(R.id.numberWalkUpTextView)).check(matches(withText(Integer.toString(counter))));

        counter =0;
		for( int i = 0; i < 9; i++) {
			Espresso.onView(withId(R.id.incrementDepartersbtn)).perform(click());
			counter++;
		}
		for (int j = 0; j < 3; j++) {
			Espresso.onView(withId(R.id.numberDepartersTextView)).perform(click());
			counter--;
		}
		Espresso.onView(withId(R.id.numberDepartersTextView)).check(matches(withText(Integer.toString(counter))));


		counter = 0;
        Espresso.onView(withId(R.id.resetBtn)).perform(click());
		Espresso.onView(withId(R.id.numberFeltLakeTextView)).check(matches(withText(Integer.toString(counter))));
		Espresso.onView(withId(R.id.numberAnimalsTextView)).check(matches(withText(Integer.toString(counter))));
		Espresso.onView(withId(R.id.numberOffTrailTextView)).check(matches(withText(Integer.toString(counter))));
		Espresso.onView(withId(R.id.numberForbiddenItemsTextView)).check(matches(withText(Integer.toString(counter))));
		Espresso.onView(withId(R.id.numberWalkUpTextView)).check(matches(withText(Integer.toString(counter))));
		Espresso.onView(withId(R.id.numberDepartersTextView)).check(matches(withText(Integer.toString(counter))));
	}

	@After
	public void tearDown() throws Exception {
	}

}