
// * Add a new Fragmnet (Name - frg_Dialcom)

//Before OnCreate Method
    	frg_Dialcom frag_dialcom;


//Inside OnCreate Method
        frag_dialcom = new frg_Dialcom();

// * Create a FrameLayout in Design (Name - fragmentHolder)

//In a Method or anywhere

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentHolder, frag_dialcom);
            fragmentTransaction.commit();

//If navigate with passing a value

 	Bundle bund=new Bundle();
        bund.putString("FLG",flg);

        FragmentManager fragmentManager=getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        frgBrowse.setArguments(bund);
        fragmentTransaction.replace(R.id.fragmentHolder,frgBrowse);
        fragmentTransaction.commit();
        
        
