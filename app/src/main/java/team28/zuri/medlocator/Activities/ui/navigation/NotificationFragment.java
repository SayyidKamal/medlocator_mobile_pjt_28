package team28.zuri.medlocator.Activities.ui.navigation;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import team28.zuri.medlocator.Activities.ui.home.HomeViewModel;
import team28.zuri.medlocator.R;

public class NotificationFragment extends Fragment {

    private NotificationViewModel notificationViewModel;

    public static NotificationFragment newInstance() {
        return new NotificationFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        notificationViewModel =
                new ViewModelProvider(this).get(NotificationViewModel.class);
        View root = inflater.inflate(R.layout.notification_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        notificationViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }


}