package ru.mirea.zhalyaletdinov_f_n.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Message;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {

    ProgressDialog progressDialog;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setTitle("ProgressDialog");
        progressDialog.setMessage("In progress...");
        progressDialog.setIndeterminate(false);
        progressDialog.setIcon(R.mipmap.ic_launcher_round);
        progressDialog.setMax(30);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setButton(Dialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                ((MainActivity)getActivity()).onProgressOkClicked();
            }
        });
        progressDialog.setButton(Dialog.BUTTON_NEGATIVE, "Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int id) {
                ((MainActivity)getActivity()).onProgressCloseClicked();
            }
        });
        return progressDialog;
    }
}
