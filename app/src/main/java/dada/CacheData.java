package dada;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Ezio on 2016/5/12.
 */
public class CacheData implements Serializable {
    int page;
    ArrayList<Entity> data;

    public CacheData(int page, ArrayList<Entity> data) {
        this.page = page;
        this.data = data;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public ArrayList<Entity> getData() {
        return data;
    }

    public void setData(ArrayList<Entity> data) {
        this.data = data;
    }
}
