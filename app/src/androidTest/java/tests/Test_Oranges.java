package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.awt002.fukversions.MainActivity;

/**
 * Created by Aaron on 4/19/2016.
 */
public class Test_Oranges extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public Test_Oranges()
    {
        super(MainActivity.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();

        int x,y;
        x = 150;
        y = 100;

        assertEquals(50, mainActivity.sum(x,y));
    }
}
