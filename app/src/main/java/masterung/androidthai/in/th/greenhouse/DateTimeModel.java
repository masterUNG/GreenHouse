package masterung.androidthai.in.th.greenhouse;

import android.os.Parcel;
import android.os.Parcelable;

public class DateTimeModel implements Parcelable {

    private String DataTime;
    private int numberAnInt;

    public DateTimeModel() {
    }

    public DateTimeModel(String dataTime, int numberAnInt) {
        DataTime = dataTime;
        this.numberAnInt = numberAnInt;
    }

    protected DateTimeModel(Parcel in) {
        DataTime = in.readString();
        numberAnInt = in.readInt();
    }

    public static final Creator<DateTimeModel> CREATOR = new Creator<DateTimeModel>() {
        @Override
        public DateTimeModel createFromParcel(Parcel in) {
            return new DateTimeModel(in);
        }

        @Override
        public DateTimeModel[] newArray(int size) {
            return new DateTimeModel[size];
        }
    };

    public String getDataTime() {
        return DataTime;
    }

    public void setDataTime(String dataTime) {
        DataTime = dataTime;
    }

    public int getNumberAnInt() {
        return numberAnInt;
    }

    public void setNumberAnInt(int numberAnInt) {
        this.numberAnInt = numberAnInt;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(DataTime);
        dest.writeInt(numberAnInt);
    }
}
