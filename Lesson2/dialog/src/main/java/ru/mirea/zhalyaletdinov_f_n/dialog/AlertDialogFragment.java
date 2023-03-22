package ru.mirea.zhalyaletdinov_f_n.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class AlertDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Здравствуй МИРЭА!")
                .setMessage("Успех близок?")
                .setIcon(R.mipmap.ic_launcher_round)
                .setPositiveButton("Иду дальше", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ((MainActivity)getActivity()).onOkClicked();
                    }
                })
                .setNeutralButton("На паузе", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                ((MainActivity)getActivity()).onNeutralClicked();
                            }
                        })
                .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                ((MainActivity)getActivity()).onCancelClicked();
                            }
                        });
        return builder.create();
    }
}
