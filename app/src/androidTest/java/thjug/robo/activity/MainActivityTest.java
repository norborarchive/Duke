package thjug.robo.activity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import thjug.robo.R;

/**
 *
 * Test method must start with test....
 * http://developer.android.com/tools/testing/activity_test.html
 *
 * @author nuboat
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mActivity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(false);

        mActivity = getActivity();
    }

    public void testPreConditions() {
        final TextView textView = (TextView) mActivity.findViewById(R.id.hello);

        assertThat(textView.getText().toString(), equalTo("Hello world!"));
    }
}