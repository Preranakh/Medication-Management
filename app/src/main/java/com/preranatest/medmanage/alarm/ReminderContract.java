package com.preranatest.medmanage.alarm;

import com.preranatest.medmanage.BasePresenter;
import com.preranatest.medmanage.BaseView;
import com.preranatest.medmanage.data.source.History;
import com.preranatest.medmanage.data.source.MedicineAlarm;

/**
 * Created by gautam on 13/07/17.
 */

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
