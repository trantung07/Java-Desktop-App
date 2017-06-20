package com.qlbh.bean;

public class Items
{
    private int id;
    private String description;
    public Items(){
    	
    }
    public Items(int id, String description)
    {
        this.id = id;
        this.description = description;
    }
    
    public void setId(int id) {
		this.id = id;
	}
	public int getId()
    {
        return id;
    }

	public void setDescription(String description) {
		this.description = description;
	}
    public String getDescription()
    {
        return description;
    }

    public String toString()
    {
        return description;
    }
}
