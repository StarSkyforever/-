package android.coolweather.a55044.campus_agency.db;

import org.litepal.crud.DataSupport;

import java.util.Date;

public class Categories{

    private int id;

    private int account;

    private Date add_time;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Date add_time) {
        this.add_time = add_time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    private String extra;

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }
}
