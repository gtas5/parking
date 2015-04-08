package com.example.parking.data;

import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.List;  

public class Info implements Serializable {

	  private static final long serialVersionUID = -758459502806858414L;  
	    /** 
	     * ���� 
	     */  
	    private double latitude;  
	    /** 
	     * γ�� 
	     */  
	    private double longitude;  
	    /** 
	     * ͼƬID����ʵ��Ŀ�п�����ͼƬ·�� 
	     */  
	    private int imgId;  
	    /** 
	     * �̼����� 
	     */  
	    private String name;  
	    /** 
	     * ���� 
	     */  
	    private String distance;  
	    /** 
	     * ������ 
	     */  
	    private int zan;  
	  
	    public static List<Info> infos = new ArrayList<Info>();  
	  
	    static  
	    {  
	        infos.add(new Info(30.681604, 104.106925, "���ӿƼ���ѧ",  
	                "����209��", 1456));  
	        infos.add(new Info(34.242952, 108.972171, "ɳ������ϴԡ����",  
	                "����897��", 456));  
	        infos.add(new Info(34.242852, 108.973171, "�廷��װ��",  
	                "����249��", 1456));  
	        infos.add(new Info(34.242152, 108.971971, "���׼�����С��",  
	                "����679��", 1456));  
	    }  
	  
	    public Info()  
	    {  
	    }  
	  
	    public Info(double latitude, double longitude, String name,  
	            String distance, int zan)  
	    {  
	        super();  
	        this.latitude = latitude;  
	        this.longitude = longitude;  
	    //    this.imgId = imgId;  
	        this.name = name;  
	        this.distance = distance;  
	        this.zan = zan;  
	    }  
	  
	    public double getLatitude()  
	    {  
	        return latitude;  
	    }  
	  
	    public void setLatitude(double latitude)  
	    {  
	        this.latitude = latitude;  
	    }  
	  
	    public double getLongitude()  
	    {  
	        return longitude;  
	    }  
	  
	    public void setLongitude(double longitude)  
	    {  
	        this.longitude = longitude;  
	    }  
	  
	    public String getName()  
	    {  
	        return name;  
	    }  
	  
	    public int getImgId()  
	    {  
	        return imgId;  
	    }  
	  
	    public void setImgId(int imgId)  
	    {  
	        this.imgId = imgId;  
	    }  
	  
	    public void setName(String name)  
	    {  
	        this.name = name;  
	    }  
	  
	    public String getDistance()  
	    {  
	        return distance;  
	    }  
	  
	    public void setDistance(String distance)  
	    {  
	        this.distance = distance;  
	    }  
	  
	    public int getZan()  
	    {  
	        return zan;  
	    }  
	  
	    public void setZan(int zan)  
	    {  
	        this.zan = zan;  
	    }  
}
