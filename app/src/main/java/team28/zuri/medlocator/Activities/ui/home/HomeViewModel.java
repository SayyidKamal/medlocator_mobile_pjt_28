package team28.zuri.medlocator.Activities.ui.home;

import android.content.ClipData;
import android.text.NoCopySpan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import team28.zuri.medlocator.R;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private final MutableLiveData<ClipData.Item> selected = new MutableLiveData<ClipData.Item>();

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public void select(ClipData.Item item) {
        selected.setValue(item);
    }

    public LiveData<ClipData.Item> getSelected() {
        return selected;
    }
}