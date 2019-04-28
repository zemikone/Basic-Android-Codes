
   Button btn_dialc;
    View rootView;

 @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        


//(Only) This rootView will added instead of return
        rootView = inflater.inflate(R.layout.fragment_menu, container, false);

//Here add rootView
        btn_dialc = (Button) rootView.findViewById(R.id.btn_dialcom);


        btn_dialc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flg="1";
                Toast.makeText(getActivity(), "Your toast message.", Toast.LENGTH_SHORT).show();
            }
        });

//Here return the rootView
        return rootView;
    }
    
    
