
//in the 1st Activity            

   String flg="1";



        Intent inte=new Intent(this,Browse.class);
        Bundle bund=new Bundle();
        bund.putString("FLG",flg);
        inte.putExtras(bund);
        startActivity(inte);

//In the second Activity(Browse)

        Bundle bund = getIntent().getExtras();
        String getFlg=bund.getString("FLG");

//Then use getFlag variable
