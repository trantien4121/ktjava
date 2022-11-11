package bo;

import java.util.ArrayList;

import bean.Hangbean;
import dao.Hangdao;

public class Hangbo {
	Hangdao hdao = new Hangdao();
	ArrayList<Hangbean> ds;
	
	public ArrayList<Hangbean> getHang(){
		ds = hdao.getHang();
		return ds;
	}
	public ArrayList<Hangbean> Tim(String key){
		   ArrayList<Hangbean> tam= new ArrayList<Hangbean>();
		   for(Hangbean s: ds)
			   if(s.getTenhang().toLowerCase().contains(
			   key.toLowerCase()))
				   tam.add(s);
		   return tam;
	   }
	public ArrayList<Hangbean> TimTheoGia(long gia){
		ArrayList<Hangbean> tam= new ArrayList<Hangbean>();
		   for(Hangbean s: ds)
			   if(s.getGia()>=gia)
				   tam.add(s);
		   return tam;
	}
	public int getSoLuongTimTheoTen(String key){
		int num =0;
		for(Hangbean s: ds)
			if(s.getTenhang().toLowerCase().contains(key.toLowerCase()))
				 num +=1;
		return num;
	}
	public int getSoLuongTimTheoGia(long gia){
		int num =0;
		for(Hangbean s: ds)
			if(s.getGia()>=gia)
				 num +=1;
		return num;
	}

}
