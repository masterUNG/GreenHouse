package masterung.androidthai.in.th.greenhouse;

import android.os.Parcel;
import android.os.Parcelable;

public class SinalModel implements Parcelable {

    private int Sinal;

    public SinalModel() {
    }

    public SinalModel(int sinal) {
        Sinal = sinal;
    }

    protected SinalModel(Parcel in) {
        Sinal = in.readInt();
    }

    public static final Creator<SinalModel> CREATOR = new Creator<SinalModel>() {
        @Override
        public SinalModel createFromParcel(Parcel in) {
            return new SinalModel(in);
        }

        @Override
        public SinalModel[] newArray(int size) {
            return new SinalModel[size];
        }
    };

    public int getSinal() {
        return Sinal;
    }

    public void setSinal(int sinal) {
        Sinal = sinal;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(Sinal);
    }
}
