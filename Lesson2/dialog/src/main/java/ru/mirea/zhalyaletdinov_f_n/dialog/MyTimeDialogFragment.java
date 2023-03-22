package ru.mirea.zhalyaletdinov_f_n.dialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyTimeDialogFragment extends DialogFragment {
//    @NonNull
//    @Override
//    public TimePickerDialog onCreateDialog(Bundle savedInstanceState) {
//        final Calendar c = Calendar.getInstance();
//        int mHour = c.get(Calendar.HOUR_OF_DAY);
//        int mMinute = c.get(Calendar.MINUTE);
//
//        // Launch Time Picker Dialog
//        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
//                new TimePickerDialog.OnTimeSetListener() {
//                    @Override
//                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
//                        txtTime.setText(hourOfDay + ":" + minute);
//                    }
//                }, mHour, mMinute, true);
//        return timePickerDialog;
//    }
}
