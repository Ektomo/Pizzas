package com.example.pizza;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class PizzaFragment extends Fragment {

    public PizzaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                inflater.getContext(),
//                R.layout.list_theme, getResources().getStringArray(R.array.pizzas));
//        setListAdapter(adapter);
//
//       return super.onCreateView(inflater, container, savedInstanceState);
        View layout = inflater.inflate(R.layout.fragment_pizza, container, false);



        return layout;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String[] data = getResources().getStringArray(R.array.pizzas);
        initRecycleView(data);
    }

    private void initRecycleView(String[] data){
        RecyclerView recyclerView = getActivity().findViewById(R.id.fragment_pizza);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(llm);

        SocnetAdapter adapter = new SocnetAdapter(data);
        recyclerView.setAdapter(adapter);
    }
}
