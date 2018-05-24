package com.example.lenovo.assign_4;

import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link long_course.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link long_course#newInstance} factory method to
 * create an instance of this fragment.
 */
public class long_course extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    Button btn_1,btn_2,btn_3,btn_4;
FragmentTransaction fragmentTransaction;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public long_course() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment long_course.
     */
    // TODO: Rename and change types and number of parameters
    public static long_course newInstance(String param1, String param2) {
        long_course fragment = new long_course();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.fragment_long_course, container, false);

  btn_1=(Button)view.findViewById(R.id.btn_accounting);
  btn_1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          PopupMenu popupMenu=new PopupMenu(getContext(),btn_1);
          popupMenu.getMenuInflater().inflate(R.menu.accounting,popupMenu.getMenu());

          popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
              @Override
              public boolean onMenuItemClick(MenuItem item) {
                  int i=item.getItemId();
                  switch (i){
                      case R.id.accounting_bsc:
                          fragmentTransaction=getFragmentManager().beginTransaction();
                          fragmentTransaction.replace(R.id.fcontent,new account_Bsc()).addToBackStack(null);
                          fragmentTransaction.commit();

                          item.setChecked(true);
                          break;
                      case R.id.accounting_diploma:
                          fragmentTransaction=getFragmentManager().beginTransaction();
                          fragmentTransaction.replace(R.id.fcontent,new account_diploma()).addToBackStack(null);
                          fragmentTransaction.commit();

                          item.setChecked(true);
                          break;

                  }
                  return true;
              }
          });
          popupMenu.show();
      }
  });

  btn_2=(Button)view.findViewById(R.id.btn_IT);
  btn_2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          PopupMenu popupMenu_2=new PopupMenu(getContext(),btn_2);
          popupMenu_2.getMenuInflater().inflate(R.menu.infocomm,popupMenu_2.getMenu());

          popupMenu_2.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
              @Override
              public boolean onMenuItemClick(MenuItem item) {
                  int i=item.getItemId();
                  switch (i){
                      case R.id.IT_higher:
                          fragmentTransaction=getFragmentManager().beginTransaction();
                          fragmentTransaction.replace(R.id.fcontent,new IT_higher()).addToBackStack(null);
                          fragmentTransaction.commit();

                          item.setChecked(true);
                          break;
                      case R.id.IT_bsc:
                          fragmentTransaction=getFragmentManager().beginTransaction();
                          fragmentTransaction.replace(R.id.fcontent,new IT_bachelor()).addToBackStack(null);
                          fragmentTransaction.commit();

                          item.setChecked(true);
                          break;

                  }
                  return true;
              }
          });
          popupMenu_2.show();
      }
  });

  btn_3=(Button)view.findViewById(R.id.btn_business);
  btn_3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          PopupMenu popupMenu_3=new PopupMenu(getContext(),btn_3);
          popupMenu_3.getMenuInflater().inflate(R.menu.business,popupMenu_3.getMenu());

          popupMenu_3.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
              @Override
              public boolean onMenuItemClick(MenuItem item) {
                  int i=item.getItemId();
                  switch (i){
                      case R.id.business_business:
                          fragmentTransaction=getFragmentManager().beginTransaction();
                          fragmentTransaction.replace(R.id.fcontent,new Business_business()).addToBackStack(null);
                          fragmentTransaction.commit();

                          item.setChecked(true);
                          break;
                      case R.id.business_marketing:
                          fragmentTransaction=getFragmentManager().beginTransaction();
                          fragmentTransaction.replace(R.id.fcontent,new Business_marketing()).addToBackStack(null);
                          fragmentTransaction.commit();

                          item.setChecked(true);
                          break;

                  }
                  return true;
              }
          });
          popupMenu_3.show();
      }
  });

btn_4=(Button)view.findViewById(R.id.btn_tourism);
btn_4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        PopupMenu popupMenu_4=new PopupMenu(getContext(),btn_4);
        popupMenu_4.getMenuInflater().inflate(R.menu.tourism,popupMenu_4.getMenu());

        popupMenu_4.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int i=item.getItemId();
                switch (i){
                    case R.id.tourism_hospitality:
                        fragmentTransaction=getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fcontent,new Tourism_hospitality()).addToBackStack(null);
                        fragmentTransaction.commit();

                        item.setChecked(true);
                        break;
                    case R.id.tourism_tourism:
                        fragmentTransaction=getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fcontent,new Tourism_tourism()).addToBackStack(null);
                        fragmentTransaction.commit();

                        item.setChecked(true);
                        break;

                }
                return true;
            }
        });
        popupMenu_4.show();
    }
});
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);

    }
}
