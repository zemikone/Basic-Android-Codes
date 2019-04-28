
private static final int TIME_INTERVAL = 2000; // # milliseconds, desired time passed between two back presses.
private long mBackPressed;

//Replace the exsisting one
@Override
public void onBackPressed()
{
    if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) 
    { 
        super.onBackPressed(); 
        return;
    }
    else { Toast.makeText(getBaseContext(), "Tap BACK again to exit", Toast.LENGTH_SHORT).show(); }

    mBackPressed = System.currentTimeMillis();
}

