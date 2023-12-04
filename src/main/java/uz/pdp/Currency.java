package uz.pdp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Currency {

    @Expose
    private String title;

    @Expose
    private String code;

    @Expose
    @SerializedName("cb_price")
    private double cbPrice;

    @Expose
    @SerializedName("nbu_buy_price")
    private double nbuBuyPrice;

    @Expose
    @SerializedName("nbu_cell_price")
    private double nbuCellPrice;

    @Expose
    private Date date;

    @Override
    public String toString() {
        return
                "title =" + title + " ,\n" +
                "code = " + code + " ,\n" +
                "cbPrice = " + cbPrice + " ,\n" +
                "nbuBuyPrice=" + nbuBuyPrice + " ,\n" +
                "nbuCellPrice=" + nbuCellPrice + " ,\n" +
                "date=" + date;
    }
}
